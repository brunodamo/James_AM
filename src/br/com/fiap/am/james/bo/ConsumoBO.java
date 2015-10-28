package br.com.fiap.am.james.bo;

import java.sql.Connection;

import br.com.fiap.am.james.beans.ConsumoBean;
import br.com.fiap.am.james.dao.ConsumoDAO;
import br.com.fiap.am.james.excecoes.Excecao;
/**
 * 
 * @author James
 *
 */
public abstract class ConsumoBO {

	/**
	 * Metodo que verificia regras de neg�cio antes de realizar uma insercao
	 * @param c
	 * @param conexao
	 * @throws Exception
	 * @see ConsumoBean, ConsumoDAO
	 */
	public static void inserir (ConsumoBean c, Connection conexao) throws Exception {
		if (c.getFuncionario() == null){
			throw new Excecao("Funcion�rio n�o existe!");
		}
		if (c.getHospedagem() == null){
			throw new Excecao("Hospedagem n�o existe!");
		}
		if (c.getDataConsumo() == null){
			throw new Excecao("Data de Consumo n�o existe!");
		}
		if (c.getQtdConsumo() < 1){
			throw new Excecao("O m�nimo de quantidade � 1!");
		}else if (c.getQtdConsumo()>999){
			throw new Excecao("Limite de quantidade de consumo excedido!");
		}
		new ConsumoDAO().insert(c, conexao);
	}
	
	/**
	 * Metodo que verifica regras de neg�cio antes de realizar uma atualizacao
	 * @param Objeto ConsumoBean
	 * @param Objeto Connection
	 * @return Num�ro de linhas atualizadas
	 * @throws Exception
	 */
	public static int atualizar (ConsumoBean c, Connection conexao) throws Exception {
		if (c.getFuncionario() == null){
			throw new Excecao("Funcion�rio n�o existe!");
		}
		if (c.getHospedagem() == null){
			throw new Excecao("Hospedagem n�o existe!");
		}
		if (c.getDataConsumo() == null){
			throw new Excecao("Data de Consumo n�o existe!");
		}
		if (c.getQtdConsumo() < 1){
			throw new Excecao("O m�nimo de quantidade � 1!");
		}else if (c.getQtdConsumo()>999){
			throw new Excecao("Limite de quantidade de consumo excedido!");
		}
		return new ConsumoDAO().update(c, conexao);
	}
	
	
}
