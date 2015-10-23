package br.com.fiap.am.james.beans;

public abstract class PessoaBean {
	protected int codigoPessoa;
	protected String nomePessoa;
	
	
	
	/**
	 * @param codigoPessoa
	 * @param nomePessoa
	 */
	public PessoaBean(int codigoPessoa, String nomePessoa) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nomePessoa = nomePessoa;
	}

	
	/**
	 * 
	 */
	public PessoaBean() {
		super();
	}


	/**
	 * @return the codigoPessoa
	 */
	public int getCodigoPessoa() {
		return codigoPessoa;
	}


	/**
	 * @param codigoPessoa the codigoPessoa to set
	 */
	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}


	/**
	 * @return the nomePessoa
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}


	/**
	 * @param nomePessoa the nomePessoa to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	
	
}
