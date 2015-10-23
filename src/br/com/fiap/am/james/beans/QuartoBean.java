package br.com.fiap.am.james.beans;

public class QuartoBean {
	
	private int nroQuarto;
	private int codigoTipoQuarto;
	private int andar;
	private int capacidade;
	
	/**
	 * @return the nroQuarto
	 */
	public int getNroQuarto() {
		return nroQuarto;
	}
	/**
	 * @param nroQuarto the nroQuarto to set
	 */
	public void setNroQuarto(int nroQuarto) {
		this.nroQuarto = nroQuarto;
	}
	/**
	 * @return the codigoTipoQuarto
	 */
	public int getCodigoTipoQuarto() {
		return codigoTipoQuarto;
	}
	/**
	 * @param codigoTipoQuarto the codigoTipoQuarto to set
	 */
	public void setCodigoTipoQuarto(int codigoTipoQuarto) {
		this.codigoTipoQuarto = codigoTipoQuarto;
	}
	/**
	 * @return the andar
	 */
	public int getAndar() {
		return andar;
	}
	/**
	 * @param andar the andar to set
	 */
	public void setAndar(int andar) {
		this.andar = andar;
	}
	/**
	 * @return the capacidade
	 */
	public int getCapacidade() {
		return capacidade;
	}
	/**
	 * @param capacidade the capacidade to set
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	/**
	 * @param nroQuarto
	 * @param codigoTipoQuarto
	 * @param andar
	 * @param capacidade
	 */
	public QuartoBean(int nroQuarto, int codigoTipoQuarto, int andar,
			int capacidade) {
		super();
		this.nroQuarto = nroQuarto;
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.andar = andar;
		this.capacidade = capacidade;
	}
	/**
	 * 
	 */
	public QuartoBean() {
		super();
	}
	
	
}
