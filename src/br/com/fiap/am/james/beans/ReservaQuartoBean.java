package br.com.fiap.am.james.beans;

public class ReservaQuartoBean {
		
	private ReservaBean reserva;
	private QuartoBean quarto;
	private int qtdPessoaQuarto;
	private int observacao;
	
	
	/**
	 * 
	 */
	public ReservaQuartoBean() {
		super();
	}
	/**
	 * @param reserva
	 * @param quarto
	 * @param qtdPessoaQuarto
	 * @param observacao
	 */
	public ReservaQuartoBean(ReservaBean reserva, QuartoBean quarto,
			int qtdPessoaQuarto, int observacao) {
		super();
		this.reserva = reserva;
		this.quarto = quarto;
		this.qtdPessoaQuarto = qtdPessoaQuarto;
		this.observacao = observacao;
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
	 * @return the qtdPessoaQuarto
	 */
	public int getQtdPessoaQuarto() {
		return qtdPessoaQuarto;
	}
	/**
	 * @param qtdPessoaQuarto the qtdPessoaQuarto to set
	 */
	public void setQtdPessoaQuarto(int qtdPessoaQuarto) {
		this.qtdPessoaQuarto = qtdPessoaQuarto;
	}
	/**
	 * @return the observacao
	 */
	public int getObservacao() {
		return observacao;
	}
	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(int observacao) {
		this.observacao = observacao;
	}
	
	
}
