package br.com.fiap.am.james.beans;

public class RelChequeBean {
	private PagChequeBean pagCheque;
	private HospedagemBean hospedagem;
	private int numeroCheque;
	private double valorParcela;
	
	/**
	 * 
	 */
	public RelChequeBean() {
		super();
	}
	/**
	 * @param pagCheque
	 * @param hospedagem
	 * @param numeroCheque
	 * @param valorParcela
	 */
	public RelChequeBean(PagChequeBean pagCheque, HospedagemBean hospedagem,
			int numeroCheque, double valorParcela) {
		super();
		this.pagCheque = pagCheque;
		this.hospedagem = hospedagem;
		this.numeroCheque = numeroCheque;
		this.valorParcela = valorParcela;
	}
	/**
	 * @return the pagCheque
	 */
	public PagChequeBean getPagCheque() {
		return pagCheque;
	}
	/**
	 * @param pagCheque the pagCheque to set
	 */
	public void setPagCheque(PagChequeBean pagCheque) {
		this.pagCheque = pagCheque;
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
	 * @return the numeroCheque
	 */
	public int getNumeroCheque() {
		return numeroCheque;
	}
	/**
	 * @param numeroCheque the numeroCheque to set
	 */
	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
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
