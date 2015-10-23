package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class HistValorBean {
	private int codigoHistorico;
	private TipoQuartoBean tipoQuarto;
	private Calendar dataValidade;
	private double precoQuarto;
	
	/**
	 * @param codigoHistorico
	 * @param tipoQuarto
	 * @param dataValidade
	 * @param precoQuarto
	 */
	public HistValorBean(int codigoHistorico, TipoQuartoBean tipoQuarto,
			Calendar dataValidade, double precoQuarto) {
		super();
		this.codigoHistorico = codigoHistorico;
		this.tipoQuarto = tipoQuarto;
		this.dataValidade = dataValidade;
		this.precoQuarto = precoQuarto;
	}

	/**
	 * 
	 */
	public HistValorBean() {
		super();
	}

	/**
	 * @return the codigoHistorico
	 */
	public int getCodigoHistorico() {
		return codigoHistorico;
	}

	/**
	 * @param codigoHistorico the codigoHistorico to set
	 */
	public void setCodigoHistorico(int codigoHistorico) {
		this.codigoHistorico = codigoHistorico;
	}

	/**
	 * @return the tipoQuarto
	 */
	public TipoQuartoBean getTipoQuarto() {
		return tipoQuarto;
	}

	/**
	 * @param tipoQuarto the tipoQuarto to set
	 */
	public void setTipoQuarto(TipoQuartoBean tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
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
	 * @return the precoQuarto
	 */
	public double getPrecoQuarto() {
		return precoQuarto;
	}

	/**
	 * @param precoQuarto the precoQuarto to set
	 */
	public void setPrecoQuarto(double precoQuarto) {
		this.precoQuarto = precoQuarto;
	}
	
	
}
