package br.com.fiap.am.james.beans;

import java.util.Calendar;

public class HospedagemBean {
	
	private int codigoHospedagem;
	private QuartoBean quarto;
	private ReservaBean reserva;
	private ClienteBean cliente;
	private FuncionarioBean funcionario;
	private Calendar dataEntrada;
	private Calendar dataSaida;
	private double desconto;
	
	/**
	 * @param codigoHospedagem
	 * @param quarto
	 * @param reserva
	 * @param cliente
	 * @param funcionario
	 * @param dataEntrada
	 * @param dataSaida
	 * @param desconto
	 */
	public HospedagemBean(int codigoHospedagem, QuartoBean quarto,
			ReservaBean reserva, ClienteBean cliente,
			FuncionarioBean funcionario, Calendar dataEntrada,
			Calendar dataSaida, double desconto) {
		super();
		this.codigoHospedagem = codigoHospedagem;
		this.quarto = quarto;
		this.reserva = reserva;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.desconto = desconto;
	}

	/**
	 * 
	 */
	public HospedagemBean() {
		super();
	}

	/**
	 * @return the codigoHospedagem
	 */
	public int getCodigoHospedagem() {
		return codigoHospedagem;
	}

	/**
	 * @param codigoHospedagem the codigoHospedagem to set
	 */
	public void setCodigoHospedagem(int codigoHospedagem) {
		this.codigoHospedagem = codigoHospedagem;
	}

	/**
	 * @return the quarto
	 */
	public QuartoBean getQuarto() {
		return quarto;
	}

	/**
	 * @param quarto the quarto to set
	 */
	public void setQuarto(QuartoBean quarto) {
		this.quarto = quarto;
	}

	/**
	 * @return the reserva
	 */
	public ReservaBean getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(ReservaBean reserva) {
		this.reserva = reserva;
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
	 * @return the dataEntrada
	 */
	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	/**
	 * @return the dataSaida
	 */
	public Calendar getDataSaida() {
		return dataSaida;
	}

	/**
	 * @param dataSaida the dataSaida to set
	 */
	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}

	/**
	 * @return the desconto
	 */
	public double getDesconto() {
		return desconto;
	}

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
}
