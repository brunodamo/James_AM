package br.com.fiap.am.james.beans;

public class TipoQuartoBean {
	private int codigoTipoQuarto;
	private String observašao;
	/**
	 * @param codigoTipoQuarto
	 * @param observašao
	 */
	public TipoQuartoBean(int codigoTipoQuarto, String observašao) {
		super();
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.observašao = observašao;
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
	 * @return the observašao
	 */
	public String getObservašao() {
		return observašao;
	}
	/**
	 * @param observašao the observašao to set
	 */
	public void setObservašao(String observašao) {
		this.observašao = observašao;
	}
	
	
}
