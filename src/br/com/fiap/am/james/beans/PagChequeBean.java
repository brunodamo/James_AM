package br.com.fiap.am.james.beans;

public class PagChequeBean {
	private int codigoPagCheque;
	private HospedagemBean hospedagem;
	private int nroBanco;
	/**
	 * @param codigoPagCheque
	 * @param hospedagem
	 * @param nroBanco
	 */
	public PagChequeBean(int codigoPagCheque, HospedagemBean hospedagem,
			int nroBanco) {
		super();
		this.codigoPagCheque = codigoPagCheque;
		this.hospedagem = hospedagem;
		this.nroBanco = nroBanco;
	}
	/**
	 * 
	 */
	public PagChequeBean() {
		super();
	}
	/**
	 * @return the codigoPagCheque
	 */
	public int getCodigoPagCheque() {
		return codigoPagCheque;
	}
	/**
	 * @param codigoPagCheque the codigoPagCheque to set
	 */
	public void setCodigoPagCheque(int codigoPagCheque) {
		this.codigoPagCheque = codigoPagCheque;
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
	 * @return the nroBanco
	 */
	public int getNroBanco() {
		return nroBanco;
	}
	/**
	 * @param nroBanco the nroBanco to set
	 */
	public void setNroBanco(int nroBanco) {
		this.nroBanco = nroBanco;
	}
	
	
}
