package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class HistPrecoBean {
	private int codigoHistPreco;
	private ProdutoServicoBean produtoServico;
	private Calendar dataValidade;
	private double preco;
	/**
	 * @param codigoHistPreco
	 * @param produtoServico
	 * @param dataValidade
	 * @param preco
	 */
	public HistPrecoBean(int codigoHistPreco,
			ProdutoServicoBean produtoServico, Calendar dataValidade,
			double preco) {
		super();
		this.codigoHistPreco = codigoHistPreco;
		this.produtoServico = produtoServico;
		this.dataValidade = dataValidade;
		this.preco = preco;
	}
	/**
	 * 
	 */
	public HistPrecoBean() {
		super();
	}
	/**
	 * @return the codigoHistPreco
	 */
	public int getCodigoHistPreco() {
		return codigoHistPreco;
	}
	/**
	 * @param codigoHistPreco the codigoHistPreco to set
	 */
	public void setCodigoHistPreco(int codigoHistPreco) {
		this.codigoHistPreco = codigoHistPreco;
	}
	/**
	 * @return the produtoServico
	 */
	public ProdutoServicoBean getProdutoServico() {
		return produtoServico;
	}
	/**
	 * @param produtoServico the produtoServico to set
	 */
	public void setProdutoServico(ProdutoServicoBean produtoServico) {
		this.produtoServico = produtoServico;
	}
	/**
	 * @return the dataValidade
	 */
	public Calendar getDataValidade() {
		return dataValidade;
	}
	/**
	 * @param dataValidade the dataValidade to set
	 */
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
