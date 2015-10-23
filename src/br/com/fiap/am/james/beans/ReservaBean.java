package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class ReservaBean {
	
	private int codigoReserva;
	private ClienteBean cliente;
	private FuncionarioBean funcionario;
	private Calendar dataSolicitacao;
	private Calendar dataInicioReserva;
	private Calendar dataFinalReserva;
	private int qtdAdulto;
	private int qtdCriancaC;
	private int statusReserva;
	/**
	 * @param codigoReserva
	 * @param cliente
	 * @param funcionario
	 * @param dataSolicitacao
	 * @param dataInicioReserva
	 * @param dataFinalReserva
	 * @param qtdAdulto
	 * @param qtdCriancaC
	 * @param statusReserva
	 */
	public ReservaBean(int codigoReserva, ClienteBean cliente,
			FuncionarioBean funcionario, Calendar dataSolicitacao,
			Calendar dataInicioReserva, Calendar dataFinalReserva,
			int qtdAdulto, int qtdCriancaC, int statusReserva) {
		super();
		this.codigoReserva = codigoReserva;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataSolicitacao = dataSolicitacao;
		this.dataInicioReserva = dataInicioReserva;
		this.dataFinalReserva = dataFinalReserva;
		this.qtdAdulto = qtdAdulto;
		this.qtdCriancaC = qtdCriancaC;
		this.statusReserva = statusReserva;
	}
	/**
	 * 
	 */
	public ReservaBean() {
		super();
	}
	/**
	 * @return the codigoReserva
	 */
	public int getCodigoReserva() {
		return codigoReserva;
	}
	/**
	 * @param codigoReserva the codigoReserva to set
	 */
	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	/**
	 * @return the cliente
	 */
	public ClienteBean getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
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
	 * @return the dataSolicitacao
	 */
	public Calendar getDataSolicitacao() {
		return dataSolicitacao;
	}
	/**
	 * @param dataSolicitacao the dataSolicitacao to set
	 */
	public void setDataSolicitacao(Calendar dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	/**
	 * @return the dataInicioReserva
	 */
	public Calendar getDataInicioReserva() {
		return dataInicioReserva;
	}
	/**
	 * @param dataInicioReserva the dataInicioReserva to set
	 */
	public void setDataInicioReserva(Calendar dataInicioReserva) {
		this.dataInicioReserva = dataInicioReserva;
	}
	/**
	 * @return the dataFinalReserva
	 */
	public Calendar getDataFinalReserva() {
		return dataFinalReserva;
	}
	/**
	 * @param dataFinalReserva the dataFinalReserva to set
	 */
	public void setDataFinalReserva(Calendar dataFinalReserva) {
		this.dataFinalReserva = dataFinalReserva;
	}
	/**
	 * @return the qtdAdulto
	 */
	public int getQtdAdulto() {
		return qtdAdulto;
	}
	/**
	 * @param qtdAdulto the qtdAdulto to set
	 */
	public void setQtdAdulto(int qtdAdulto) {
		this.qtdAdulto = qtdAdulto;
	}
	/**
	 * @return the qtdCriancaC
	 */
	public int getQtdCriancaC() {
		return qtdCriancaC;
	}
	/**
	 * @param qtdCriancaC the qtdCriancaC to set
	 */
	public void setQtdCriancaC(int qtdCriancaC) {
		this.qtdCriancaC = qtdCriancaC;
	}
	/**
	 * @return the statusReserva
	 */
	public int getStatusReserva() {
		return statusReserva;
	}
	/**
	 * @param statusReserva the statusReserva to set
	 */
	public void setStatusReserva(int statusReserva) {
		this.statusReserva = statusReserva;
	}
	
	
	
}
