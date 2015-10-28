package br.com.fiap.am.james.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.Calendar;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.am.james.beans.ConsumoBean;
import br.com.fiap.am.james.beans.FuncionarioBean;
import br.com.fiap.am.james.beans.HospedagemBean;
import br.com.fiap.am.james.beans.ProdutoServicoBean;
import br.com.fiap.am.james.bo.ConsumoBO;
import br.com.fiap.am.james.bo.HistPrecoBO;
import br.com.fiap.am.james.bo.HospedagemBO;
import br.com.fiap.am.james.conexao.ConnectionFactory;

/**
 * Servlet implementation class James
 */
//@WebServlet("/James")
public class James extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public James() {
		super();
	}

	/**
	 * Atributo de conexao
	 */
	private Connection conexao = null;


	/**
	 * Metodo que valida se o codigo da hospedagem existe
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void validarHospede (HttpServletRequest request, HttpServletResponse response) throws Exception{
		try{
			conexao = ConnectionFactory.controlarInstancia().getConnection("OPS$RM73871","171192");
			int codHosp = Integer.parseInt(request.getParameter("codHosp"));
			if (HospedagemBO.validaCodigo(codHosp, conexao)){
				request.setAttribute("hospedagem", HospedagemBO.retornaHospedagem(codHosp, conexao));
				request.setAttribute("erro", false);
				request.setAttribute("msg", "Código da Hospedagem Validado!");
			}
			int onde = Integer.parseInt(request.getParameter("redirecionar"));
			if(onde == 1){
				carregarItens(request, response, 1);
			}else{
				carregarItens(request, response, 2);
			}
		}catch (Exception e){
			e.printStackTrace();
			request.setAttribute("erro", true);
			request.setAttribute("msg", "Código de Hospedagem Inválido!");
			if (request.getParameter("modulo").equals("irProduto")){
				response.sendRedirect("midlet?modulo=irProduto");
			}else{
				response.sendRedirect("midlet?modulo=irServico");
			}
		}
	}


	/**
	 * Metodo que registra o consumo
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void registrarConsumo(HttpServletRequest request, HttpServletResponse response) throws Exception{
		conexao = ConnectionFactory.controlarInstancia().getConnection("OPS$RM73871","171192");
		ConsumoBean c = new ConsumoBean();
		HospedagemBean h = new HospedagemBean();
		c.setHospedagem(h);
		c.getHospedagem().setCodigoHospedagem(Integer.parseInt(request.getParameter("codigo")));
		String data = request.getParameter("data");
		int dia = Integer.parseInt(data.substring(0,2));
		int mes = Integer.parseInt(data.substring(3,5));
		int ano = Integer.parseInt(data.substring(6,10));
		Calendar cal = Calendar.getInstance();
		cal.set(ano, (mes-1), dia);
		c.setDataConsumo(cal);    	
		ProdutoServicoBean p = new ProdutoServicoBean();
		c.setTipoSevico(p);
		c.getTipoSevico().setCodigoTipoServico(Integer.parseInt(request.getParameter("produto_servico")));
		c.setQtdConsumo(Integer.parseInt(request.getParameter("quant")));
		FuncionarioBean f = new FuncionarioBean();
		c.setFuncionario(f);
		c.getFuncionario().setCodigoPessoa(Integer.parseInt(request.getParameter("cd_func")));
		ConsumoBO.inserir(c, conexao);
		request.setAttribute("registrado", true);
		request.setAttribute("msg", "Consumo registrado com sucesso!");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * Metodo que carrega produtos ou servicos dependendo do tipo de consumo
	 * @param request
	 * @param response
	 * @param tipo
	 * @throws Exception
	 */
	public void carregarItens(HttpServletRequest request, HttpServletResponse response, int tipo) throws Exception{
		conexao = ConnectionFactory.controlarInstancia().getConnection("OPS$RM73871","171192");
		if(tipo == 1){
			request.setAttribute("produtos", HistPrecoBO.selecionar(conexao, 1));
			request.getRequestDispatcher("produto.jsp").forward(request, response);			
		}else{
			request.setAttribute("servicos", HistPrecoBO.selecionar(conexao, 2));
			request.getRequestDispatcher("servico.jsp").forward(request, response);
		}
	}

	/**
	 * Metodo que verifica se o consumo sera de produto ou servico
	 * @param request
	 * @param response
	 * @param onde
	 * @throws Exception
	 */
	public void redirecionar(HttpServletRequest request, HttpServletResponse response, int onde) throws Exception{
		if(onde == 1){
			request.setAttribute("redirect", 1);
			request.setAttribute("titulo", "PRODUTO");
			request.getRequestDispatcher("cd_hosp.jsp").forward(request, response);			
		}else{
			request.setAttribute("titulo", "SERVIÇO");
			request.setAttribute("redirect", 2);
			request.getRequestDispatcher("cd_hosp.jsp").forward(request, response);
		}
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			if(request.getParameter("modulo").equals("irServico")){
				redirecionar(request, response, 2);
			}else if(request.getParameter("modulo").equals("irProduto")){
				redirecionar(request, response, 1);
			}
		}catch(Exception e){
			e.printStackTrace();
			response.sendRedirect("404.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			if(request.getParameter("modulo").equals("registrar_consumo")){
				registrarConsumo(request, response);
			}else if (request.getParameter("modulo").equals("hosp")){
				validarHospede(request, response);
			}else{
				response.sendRedirect("404.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
			response.sendRedirect("404.jsp");
		}
	}

}
