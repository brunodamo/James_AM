package br.com.fiap.am.james.beans;

public class TelefoneBean {
	private int codigoTelefone;
	private TipoFoneBean tipoFone;
	private int ddd;
	private long telefone;
	/**
	 * @param codigoTelefone
	 * @param tipoFone
	 * @param ddd
	 * @param telefone
	 */
	public TelefoneBean(int codigoTelefone, TipoFoneBean tipoFone, int ddd,
			long telefone) {
		super();
		this.codigoTelefone = codigoTelefone;
		this.tipoFone = tipoFone;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	/**
	 * 
	 */
	public TelefoneBean() {
		super();
	}
	/**
	 * @return the codigoTelefone
	 */
	public int getCodigoTelefone() {
		return codigoTelefone;
	}
	/**
	 * @param codigoTelefone the codigoTelefone to set
	 */
	public void setCodigoTelefone(int codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}
	/**
	 * @return the tipoFone
	 */
	public TipoFoneBean getTipoFone() {
		return tipoFone;
	}
	/**
	 * @param tipoFone the tipoFone to set
	 */
	public void setTipoFone(TipoFoneBean tipoFone) {
		this.tipoFone = tipoFone;
	}
	/**
	 * @return the ddd
	 */
	public int getDdd() {
		return ddd;
	}
	/**
	 * @param ddd the ddd to set
	 */
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	/**
	 * @return the telefone
	 */
	public long getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	
}
