package br.com.fiap.am.james.beans;

public class TipoFoneBean {
	private int codigoTipoFone;
	private String descricaoTipoFone;
	/**
	 * @param codigoTipoFone
	 * @param descricaoTipoFone
	 */
	public TipoFoneBean(int codigoTipoFone, String descricaoTipoFone) {
		super();
		this.codigoTipoFone = codigoTipoFone;
		this.descricaoTipoFone = descricaoTipoFone;
	}
	/**
	 * 
	 */
	public TipoFoneBean() {
		super();
	}
	/**
	 * @return the codigoTipoFone
	 */
	public int getCodigoTipoFone() {
		return codigoTipoFone;
	}
	/**
	 * @param codigoTipoFone the codigoTipoFone to set
	 */
	public void setCodigoTipoFone(int codigoTipoFone) {
		this.codigoTipoFone = codigoTipoFone;
	}
	/**
	 * @return the descricaoTipoFone
	 */
	public String getDescricaoTipoFone() {
		return descricaoTipoFone;
	}
	/**
	 * @param descricaoTipoFone the descricaoTipoFone to set
	 */
	public void setDescricaoTipoFone(String descricaoTipoFone) {
		this.descricaoTipoFone = descricaoTipoFone;
	}
	
}
