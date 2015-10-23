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
import br.com.fiap.am.james.bo.ConsumoBO;
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
				request.getRequestDispatcher("servico.jsp").forward(request, response);
			}
		}catch (Exception e){
			request.setAttribute("msg", "Código de Hospedagem Inválido!");
			request.getRequestDispatcher("cd_hosp_servico.jsp").forward(request, response);
			e.printStackTrace();
		}
	}

	public void registrarConsumo(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ConsumoBean c = new ConsumoBean();
		c.setCodigoConsumo(Integer.parseInt(request.getParameter("codigo")));
		String data = request.getParameter("data");
		int dia = Integer.parseInt(data.substring(0,2));
		int mes = Integer.parseInt(data.substring(3,5));
		int ano = Integer.parseInt(data.substring(6,10));
		Calendar cal = Calendar.getInstance();
		cal.set(ano, (mes-1), dia);
		c.setDataConsumo(cal);    	
		c.getTipoSevico().setCodigoTipoServico(Integer.parseInt(request.getParameter("servico_produto")));
		c.setQtdConsumo(Integer.parseInt(request.getParameter("quant")));

		ConsumoBO.inserir(c, ConnectionFactory.controlarInstancia().getConnection("", ""));
	}

	public void carregarProdutos(HttpServletRequest request, HttpServletResponse response){

		request.setAttribute("", "produtos");
	}

	public void carregarServicos(HttpServletRequest request, HttpServletResponse response){

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			if(request.getParameter("modulo") == "registrar_consumo"){
				registrarConsumo(request, response);
			}else if (request.getParameter("modulo").equals("hosp")){
				validarHospede(request, response);
			}
		}catch(Exception e){
			e.printStackTrace();
			response.sendRedirect("404.jsp");
		}
	}

}
