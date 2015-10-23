package br.com.fiap.am.james.beans;

public class PessoaEnderecoBean {
	private int codigoPessoaEndereco;
	private LogradouroBean logradouro;
	private PessoaBean pessoa;
	private int nroLogradouro;
	private String complemento;
	
	/**
	 * 
	 */
	public PessoaEnderecoBean() {
		super();
	}

	/**
	 * @param codigoPessoaEndereco
	 * @param logradouro
	 * @param pessoa
	 * @param nroLogradouro
	 * @param complemento
	 */
	public PessoaEnderecoBean(int codigoPessoaEndereco,
			LogradouroBean logradouro, PessoaBean pessoa, int nroLogradouro,
			String complemento) {
		super();
		this.codigoPessoaEndereco = codigoPessoaEndereco;
		this.logradouro = logradouro;
		this.pessoa = pessoa;
		this.nroLogradouro = nroLogradouro;
		this.complemento = complemento;
	}

	/**
	 * @return the codigoPessoaEndereco
	 */
	public int getCodigoPessoaEndereco() {
		return codigoPessoaEndereco;
	}

	/**
	 * @param codigoPessoaEndereco the codigoPessoaEndereco to set
	 */
	public void setCodigoPessoaEndereco(int codigoPessoaEndereco) {
		this.codigoPessoaEndereco = codigoPessoaEndereco;
	}

	/**
	 * @return the logradouro
	 */
	public LogradouroBean getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(LogradouroBean logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the pessoa
	 */
	public PessoaBean getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * @return the nroLogradouro
	 */
	public int getNroLogradouro() {
		return nroLogradouro;
	}

	/**
	 * @param nroLogradouro the nroLogradouro to set
	 */
	public void setNroLogradouro(int nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
