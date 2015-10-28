package br.com.fiap.am.james.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.james.beans.HistPrecoBean;
import br.com.fiap.am.james.dao.HistPrecoDAO;

public abstract class HistPrecoBO {
	
	/**
	 * Metodo que traz todos HisPrecoBeans presentes no banco para a servlet
	 * @param Objeto Connection
	 * @param tipo(1 = produto e 2 = serviço)
	 * @return Lista de HistPrecoBean
	 * @throws Exception
	 */
	public static List<HistPrecoBean> selecionar (Connection conexao, int tipo) throws Exception {
		List<HistPrecoBean> lstHistPreco = new HistPrecoDAO().selectAll(conexao, tipo);		
		return lstHistPreco;
	}
}
