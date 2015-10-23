package br.com.fiap.am.james.beans;

public class TipoLogradouroBean {
	private int codigoTipoLogradouro;
	private String descricaoTipoLogradouro;
	/**
	 * 
	 */
	public TipoLogradouroBean() {
		super();
	}
	/**
	 * @param codigoTipoLogradouro
	 * @param descricaoTipoLogradouro
	 */
	public TipoLogradouroBean(int codigoTipoLogradouro,
			String descricaoTipoLogradouro) {
		super();
		this.codigoTipoLogradouro = codigoTipoLogradouro;
		this.descricaoTipoLogradouro = descricaoTipoLogradouro;
	}
	/**
	 * @return the codigoTipoLogradouro
	 */
	public int getCodigoTipoLogradouro() {
		return codigoTipoLogradouro;
	}
	/**
	 * @param codigoTipoLogradouro the codigoTipoLogradouro to set
	 */
	public void setCodigoTipoLogradouro(int codigoTipoLogradouro) {
		this.codigoTipoLogradouro = codigoTipoLogradouro;
	}
	/**
	 * @return the descricaoTipoLogradouro
	 */
	public String getDescricaoTipoLogradouro() {
		return descricaoTipoLogradouro;
	}
	/**
	 * @param descricaoTipoLogradouro the descricaoTipoLogradouro to set
	 */
	public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
		this.descricaoTipoLogradouro = descricaoTipoLogradouro;
	}
}
