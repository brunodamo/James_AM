package br.com.fiap.am.james.bo;

import java.sql.Connection;

import br.com.fiap.am.james.beans.HospedagemBean;
import br.com.fiap.am.james.dao.HospedagemDAO;
import br.com.fiap.am.james.excecoes.Excecao;

public abstract class HospedagemBO {

	/**
	 * Metodo que valida o codigo de hospeag
	 * @param cdHosp
	 * @param conexao
	 * @return true ou Excecao
	 * @throws Exception
	 */
	public static boolean validaCodigo(int cdHosp, Connection conexao) throws Exception{
		try{
			new HospedagemDAO().select(cdHosp, conexao);
			return true;
		}catch (Exception e){
			throw new Excecao("Código de Hospedagem inválido!");
		}
	}
	/**
	 * Metodo que retorna o bean completo da hospedagem
	 * @param cdHosp
	 * @param conexao
	 * @return Objeto HospedagemBean
	 * @throws Exception
	 */
	public static HospedagemBean retornaHospedagem(int cdHosp, Connection conexao) throws Exception{
		return new HospedagemDAO().select(cdHosp, conexao);
	}
}
