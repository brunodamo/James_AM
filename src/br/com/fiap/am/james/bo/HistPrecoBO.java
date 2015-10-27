package br.com.fiap.am.james.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.james.beans.HistPrecoBean;
import br.com.fiap.am.james.dao.HistPrecoDAO;

public abstract class HistPrecoBO {
	
	/**
	 * Metodo que traz todos HisPrecoBeans presentes no banco para a servlet
	 * @param conexao
	 * @param tipo
	 * @return
	 * @throws Exception
	 */
	public static List<HistPrecoBean> selecionar (Connection conexao, int tipo) throws Exception {
		List<HistPrecoBean> lstHistPreco = new HistPrecoDAO().selectAll(conexao, tipo);		
		return lstHistPreco;
	}
}
