package br.com.fiap.am.james.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.james.beans.HistPrecoBean;
import br.com.fiap.am.james.dao.HistPrecoDAO;

public abstract class HistPrecoBO {

	public static List<HistPrecoBean> selecionar (Connection conexao) throws Exception {
		List<HistPrecoBean> lstHistPreco = new HistPrecoDAO().selectAll(conexao);
		return lstHistPreco;
	}

}
