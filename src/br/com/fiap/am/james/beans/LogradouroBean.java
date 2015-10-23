package br.com.fiap.am.james.beans;

public class LogradouroBean {
	private int cep;
	private TipoLogradouroBean tipoLogradouro;
	private BairroBean bairro;
	private String descricaoLogradouro;
	/**
	 * 
	 */
	public LogradouroBean() {
		super();
	}
	/**
	 * @param cep
	 * @param tipoLogradouro
	 * @param bairro
	 * @param descricaoLogradouro
	 */
	public LogradouroBean(int cep, TipoLogradouroBean tipoLogradouro,
			BairroBean bairro, String descricaoLogradouro) {
		super();
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.bairro = bairro;
		this.descricaoLogradouro = descricaoLogradouro;
	}
	/**
	 * @return the cep
	 */
	public int getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(int cep) {
		this.cep = cep;
	}
	/**
	 * @return the tipoLogradouro
	 */
	public TipoLogradouroBean getTipoLogradouro() {
		return tipoLogradouro;
	}
	/**
	 * @param tipoLogradouro the tipoLogradouro to set
	 */
	public void setTipoLogradouro(TipoLogradouroBean tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	/**
	 * @return the bairro
	 */
	public BairroBean getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(BairroBean bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the descricaoLogradouro
	 */
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	/**
	 * @param descricaoLogradouro the descricaoLogradouro to set
	 */
	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}
	
	
}
