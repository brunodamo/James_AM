package br.com.fiap.am.james.beans;

public class TipoQuartoBean {
	private int codigoTipoQuarto;
	private String observaçao;
	/**
	 * @param codigoTipoQuarto
	 * @param observaçao
	 */
	public TipoQuartoBean(int codigoTipoQuarto, String observaçao) {
		super();
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.observaçao = observaçao;
	}
	/**
	 * 
	 */
	public TipoQuartoBean() {
		super();
	}
	/**
	 * @return the codigoTipoQuarto
	 */
	public int getCodigoTipoQuarto() {
		return codigoTipoQuarto;
	}
	/**
	 * @param codigoTipoQuarto the codigoTipoQuarto to set
	 */
	public void setCodigoTipoQuarto(int codigoTipoQuarto) {
		this.codigoTipoQuarto = codigoTipoQuarto;
	}
	/**
	 * @return the observaçao
	 */
	public String getObservaçao() {
		return observaçao;
	}
	/**
	 * @param observaçao the observaçao to set
	 */
	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}
	
	
}
