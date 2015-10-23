package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class FuncionarioBean extends PessoaBean{
	
	private Calendar dataAdmissao;
	private String descricaoCargo;
	
	
	/**
	 * @param codigoPessoa
	 * @param nomePessoa
	 * @param dataAdmissao
	 * @param descricaoCargo
	 */
	public FuncionarioBean(int codigoPessoa, String nomePessoa,
			Calendar dataAdmissao, String descricaoCargo) {
		super(codigoPessoa, nomePessoa);
		this.dataAdmissao = dataAdmissao;
		this.descricaoCargo = descricaoCargo;
	}

	/**
	 * 
	 */
	public FuncionarioBean() {
		super();
	}

	/**
	 * @return the dataAdmissao
	 */
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	/**
	 * @return the descricaoCargo
	 */
	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	/**
	 * @param descricaoCargo the descricaoCargo to set
	 */
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	
	

}
