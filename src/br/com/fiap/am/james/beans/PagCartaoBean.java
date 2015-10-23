package br.com.fiap.am.james.beans;

public class PagCartaoBean {
	private int codigoPagCartao;
	private HospedagemBean hospedagem;
	private double valorParcela;
	/**
	 * @param codigoPagCartao
	 * @param hospedagem
	 * @param valorParcela
	 */
	public PagCartaoBean(int codigoPagCartao, HospedagemBean hospedagem,
			double valorParcela) {
		super();
		this.codigoPagCartao = codigoPagCartao;
		this.hospedagem = hospedagem;
		this.valorParcela = valorParcela;
	}
	/**
	 * 
	 */
	public PagCartaoBean() {
		super();
	}
	/**
	 * @return the codigoPagCartao
	 */
	public int getCodigoPagCartao() {
		return codigoPagCartao;
	}
	/**
	 * @param codigoPagCartao the codigoPagCartao to set
	 */
	public void setCodigoPagCartao(int codigoPagCartao) {
		this.codigoPagCartao = codigoPagCartao;
	}
	/**
	 * @return the hospedagem
	 */
	public HospedagemBean getHospedagem() {
		return hospedagem;
	}
	/**
	 * @param hospedagem the hospedagem to set
	 */
	public void setHospedagem(HospedagemBean hospedagem) {
		this.hospedagem = hospedagem;
	}
	/**
	 * @return the valorParcela
	 */
	public double getValorParcela() {
		return valorParcela;
	}
	/**
	 * @param valorParcela the valorParcela to set
	 */
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	
}
