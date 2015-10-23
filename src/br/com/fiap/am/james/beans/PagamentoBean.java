package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class PagamentoBean {
	private HospedagemBean hospedagem;
	private TipoFormaPagBean tipoFormaPag;
	private Calendar dataPagamento;
	private double valor;
	/**
	 * 
	 */
	public PagamentoBean() {
		super();
	}
	/**
	 * @param hospedagem
	 * @param tipoFormaPag
	 * @param dataPagamento
	 * @param valor
	 */
	public PagamentoBean(HospedagemBean hospedagem,
			TipoFormaPagBean tipoFormaPag, Calendar dataPagamento, double valor) {
		super();
		this.hospedagem = hospedagem;
		this.tipoFormaPag = tipoFormaPag;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
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
	 * @return the tipoFormaPag
	 */
	public TipoFormaPagBean getTipoFormaPag() {
		return tipoFormaPag;
	}
	/**
	 * @param tipoFormaPag the tipoFormaPag to set
	 */
	public void setTipoFormaPag(TipoFormaPagBean tipoFormaPag) {
		this.tipoFormaPag = tipoFormaPag;
	}
	/**
	 * @return the dataPagamento
	 */
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	/**
	 * @param dataPagamento the dataPagamento to set
	 */
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
