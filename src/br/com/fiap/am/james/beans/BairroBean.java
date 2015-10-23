package br.com.fiap.am.james.beans;

public class BairroBean {
	private int codigoBairro;
	private CidadeBean cidade;
	private String nomeBairro;
	
	/**
	 * @param codigoBairro
	 * @param cidade
	 * @param nomeBairro
	 */
	
	public BairroBean(int codigoBairro, CidadeBean cidade, String nomeBairro) {
		super();
		this.codigoBairro = codigoBairro;
		this.cidade = cidade;
		this.nomeBairro = nomeBairro;
	}

	/**
	 * 
	 */
	public BairroBean() {
		super();
	}

	/**
	 * @return the codigoBairro
	 */
	public int getCodigoBairro() {
		return codigoBairro;
	}

	/**
	 * @param codigoBairro the codigoBairro to set
	 */
	public void setCodigoBairro(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}

	/**
	 * @return the cidade
	 */
	public CidadeBean getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(CidadeBean cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the nomeBairro
	 */
	public String getNomeBairro() {
		return nomeBairro;
	}

	/**
	 * @param nomeBairro the nomeBairro to set
	 */
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	
	
	
	
}
