package br.com.fiap.am.james.beans;

public class CidadeBean {
	private int codigoCidade;
	private EstadoBean estado;
	private String nomeCidade;
	/**
	 * @param codigoCidade
	 * @param estado
	 * @param nomeCidade
	 */
	public CidadeBean(int codigoCidade, EstadoBean estado, String nomeCidade) {
		super();
		this.codigoCidade = codigoCidade;
		this.estado = estado;
		this.nomeCidade = nomeCidade;
	}
	/**
	 * 
	 */
	public CidadeBean() {
		super();
	}
	/**
	 * @return the codigoCidade
	 */
	public int getCodigoCidade() {
		return codigoCidade;
	}
	/**
	 * @param codigoCidade the codigoCidade to set
	 */
	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	/**
	 * @return the estado
	 */
	public EstadoBean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoBean estado) {
		this.estado = estado;
	}
	/**
	 * @return the nomeCidade
	 */
	public String getNomeCidade() {
		return nomeCidade;
	}
	/**
	 * @param nomeCidade the nomeCidade to set
	 */
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	
}
