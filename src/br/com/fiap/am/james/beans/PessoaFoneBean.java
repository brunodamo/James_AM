package br.com.fiap.am.james.beans;

public class PessoaFoneBean {
	private PessoaBean pessoa;
	private TelefoneBean telefone; 
	private int ramal;
	/**
	 * @param pessoa
	 * @param telefone
	 * @param ramal
	 */
	public PessoaFoneBean(PessoaBean pessoa, TelefoneBean telefone, int ramal) {
		super();
		this.pessoa = pessoa;
		this.telefone = telefone;
		this.ramal = ramal;
	}
	/**
	 * 
	 */
	public PessoaFoneBean() {
		super();
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
	 * @return the telefone
	 */
	public TelefoneBean getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(TelefoneBean telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the ramal
	 */
	public int getRamal() {
		return ramal;
	}
	/**
	 * @param ramal the ramal to set
	 */
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
}
