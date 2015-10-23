package br.com.fiap.am.james.bo;

import java.sql.Connection;

import br.com.fiap.am.james.beans.HospedagemBean;
import br.com.fiap.am.james.dao.HospedagemDAO;
import br.com.fiap.am.james.excecoes.Excecao;

public abstract class HospedagemBO {


	
	public static boolean validaCodigo(int cdHosp, Connection conexao) throws Exception{
		try{
			new HospedagemDAO().select(cdHosp, conexao);
			return true;
		}catch (Exception e){
			throw new Excecao("Código de Hospedagem inválido!");
		}
	}
	public static HospedagemBean retornaHospedagem(int cdHosp, Connection conexao) throws Exception{
		return new HospedagemDAO().select(cdHosp, conexao);
	}
}
