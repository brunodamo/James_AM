package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class ClienteBean extends PessoaBean{
	
	private String cpf;
	private String rg;
	private Calendar dataNascimento;
	private int quartoPreferido;
	private String email;
	private String senha;
	
	/**
	 * @param codigoPessoa
	 * @param nomePessoa
	 * @param cpf
	 * @param rg
	 * @param dataNascimento
	 * @param quartoPreferido
	 * @param email
	 * @param senha
	 */
	public ClienteBean(int codigoPessoa, String nomePessoa, String cpf, String rg,
			Calendar dataNascimento, int quartoPreferido, String email,
			String senha) {
		super(codigoPessoa, nomePessoa);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.quartoPreferido = quartoPreferido;
		this.email = email;
		this.senha = senha;
	}

	/**
	 * 
	 */
	public ClienteBean() {
		super();
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the dataNascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the quartoPreferido
	 */
	public int getQuartoPreferido() {
		return quartoPreferido;
	}

	/**
	 * @param quartoPreferido the quartoPreferido to set
	 */
	public void setQuartoPreferido(int quartoPreferido) {
		this.quartoPreferido = quartoPreferido;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
}
