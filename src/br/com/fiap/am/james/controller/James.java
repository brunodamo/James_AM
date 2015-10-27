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

	private Connection conexao = null;


	public void validarHospede (HttpServletRequest request, HttpServletResponse response) throws Exception{
		try{
			conexao = ConnectionFactory.controlarInstancia().getConnection("","");
			int codHosp = Integer.parseInt(request.getParameter("codHosp"));
			if (HospedagemBO.validaCodigo(codHosp, conexao)){
				request.setAttribute("hospedagem", HospedagemBO.retornaHospedagem(codHosp, conexao));
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
			request.setAttribute("msg", "Código de Hospedagem Inválido!");
			request.getRequestDispatcher("cd_hosp.jsp").forward(request, response);
		}
	}

	public void registrarConsumo(HttpServletRequest request, HttpServletResponse response) throws Exception{
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
		ConsumoBO.inserir(c, ConnectionFactory.controlarInstancia().getConnection("", ""));
	}

	public void carregarItens(HttpServletRequest request, HttpServletResponse response, int tipo) throws Exception{
		if(tipo == 1){
			request.setAttribute("produtos", HistPrecoBO.selecionar(ConnectionFactory.controlarInstancia().getConnection("", ""), 1));
			request.getRequestDispatcher("produto.jsp").forward(request, response);			
		}else{
			request.setAttribute("servicos", HistPrecoBO.selecionar(ConnectionFactory.controlarInstancia().getConnection("", ""), 2));
			request.getRequestDispatcher("servico.jsp").forward(request, response);
		}
	}

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
