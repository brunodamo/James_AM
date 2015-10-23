package br.com.fiap.am.james.beans;

public class ProdutoServicoBean {
	private int codigoTipoServico;
	private String descricaoServico;
	private int nroTipo;
	/**
	 * @param codigoTipoServico
	 * @param descricaoServico
	 * @param nroTipo
	 */
	public ProdutoServicoBean(int codigoTipoServico, String descricaoServico,
			int nroTipo) {
		super();
		this.codigoTipoServico = codigoTipoServico;
		this.descricaoServico = descricaoServico;
		this.nroTipo = nroTipo;
	}
	/**
	 * 
	 */
	public ProdutoServicoBean() {
		super();
	}
	/**
	 * @return the codigoTipoServico
	 */
	public int getCodigoTipoServico() {
		return codigoTipoServico;
	}
	/**
	 * @param codigoTipoServico the codigoTipoServico to set
	 */
	public void setCodigoTipoServico(int codigoTipoServico) {
		this.codigoTipoServico = codigoTipoServico;
	}
	/**
	 * @return the descricaoServico
	 */
	public String getDescricaoServico() {
		return descricaoServico;
	}
	/**
	 * @param descricaoServico the descricaoServico to set
	 */
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	/**
	 * @return the nroTipo
	 */
	public int getNroTipo() {
		return nroTipo;
	}
	/**
	 * @param nroTipo the nroTipo to set
	 */
	public void setNroTipo(int nroTipo) {
		this.nroTipo = nroTipo;
	}
	
	
}
