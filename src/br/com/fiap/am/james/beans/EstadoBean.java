package br.com.fiap.am.james.beans;

public class EstadoBean {
	private int codigoEstado;
	private String nomeEstado;
	private String siglaEstado;
	
	/**
	 * @param codigoEstado
	 * @param nomeEstado
	 * @param siglaEstado
	 */
	public EstadoBean(int codigoEstado, String nomeEstado, String siglaEstado) {
		super();
		this.codigoEstado = codigoEstado;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
	}

	/**
	 * 
	 */
	public EstadoBean() {
		super();
	}

	/**
	 * @return the codigoEstado
	 */
	public int getCodigoEstado() {
		return codigoEstado;
	}

	/**
	 * @param codigoEstado the codigoEstado to set
	 */
	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	/**
	 * @return the nomeEstado
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}

	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	/**
	 * @return the siglaEstado
	 */
	public String getSiglaEstado() {
		return siglaEstado;
	}

	/**
	 * @param siglaEstado the siglaEstado to set
	 */
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
	
	
}
