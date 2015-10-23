package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class ConsumoBean {
	
	private int codigoConsumo;
	private HospedagemBean hospedagem;
	private ProdutoServicoBean tipoSevico;
	private FuncionarioBean funcionario;
	private Calendar dataConsumo;
	private int qtdConsumo;
	
	/**
	 * @param codigoConsumo
	 * @param hospedagem
	 * @param tipoSevico
	 * @param funcionario
	 * @param dataConsumo
	 * @param qtdConsumo
	 */
	public ConsumoBean(int codigoConsumo, HospedagemBean hospedagem,
			ProdutoServicoBean tipoSevico, FuncionarioBean funcionario,
			Calendar dataConsumo, int qtdConsumo) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.hospedagem = hospedagem;
		this.tipoSevico = tipoSevico;
		this.funcionario = funcionario;
		this.dataConsumo = dataConsumo;
		this.qtdConsumo = qtdConsumo;
	}

	/**
	 * 
	 */
	public ConsumoBean() {
		super();
	}

	/**
	 * @return the codigoConsumo
	 */
	public int getCodigoConsumo() {
		return codigoConsumo;
	}

	/**
	 * @param codigoConsumo the codigoConsumo to set
	 */
	public void setCodigoConsumo(int codigoConsumo) {
		this.codigoConsumo = codigoConsumo;
	}

	/**
	 * @return the hospedagem
	 */
	public HospedagemBean getHospedagem() {
		return hospedagem;
	}

	/**
	 * @param hospedagem the hospedagem to set
	 */
	public void setHospedagem(HospedagemBean hospedagem) {
		this.hospedagem = hospedagem;
	}

	/**
	 * @return the tipoSevico
	 */
	public ProdutoServicoBean getTipoSevico() {
		return tipoSevico;
	}

	/**
	 * @param tipoSevico the tipoSevico to set
	 */
	public void setTipoSevico(ProdutoServicoBean tipoSevico) {
		this.tipoSevico = tipoSevico;
	}

	/**
	 * @return the funcionario
	 */
	public FuncionarioBean getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(FuncionarioBean funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * @return the dataConsumo
	 */
	public Calendar getDataConsumo() {
		return dataConsumo;
	}

	/**
	 * @param dataConsumo the dataConsumo to set
	 */
	public void setDataConsumo(Calendar dataConsumo) {
		this.dataConsumo = dataConsumo;
	}

	/**
	 * @return the qtdConsumo
	 */
	public int getQtdConsumo() {
		return qtdConsumo;
	}

	/**
	 * @param qtdConsumo the qtdConsumo to set
	 */
	public void setQtdConsumo(int qtdConsumo) {
		this.qtdConsumo = qtdConsumo;
	}
	
	
}
