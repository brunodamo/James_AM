package br.com.fiap.am.james.beans;

public class TipoQuartoBean {
	private int codigoTipoQuarto;
	private String observa�ao;
	/**
	 * @param codigoTipoQuarto
	 * @param observa�ao
	 */
	public TipoQuartoBean(int codigoTipoQuarto, String observa�ao) {
		super();
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.observa�ao = observa�ao;
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
	 * @return the observa�ao
	 */
	public String getObserva�ao() {
		return observa�ao;
	}
	/**
	 * @param observa�ao the observa�ao to set
	 */
	public void setObserva�ao(String observa�ao) {
		this.observa�ao = observa�ao;
	}
	
	
}
