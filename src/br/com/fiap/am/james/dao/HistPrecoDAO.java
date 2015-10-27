package br.com.fiap.am.james.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.am.james.beans.HistPrecoBean;
import br.com.fiap.am.james.beans.ProdutoServicoBean;

public class HistPrecoDAO {

	private PreparedStatement stmt = null;
	private ResultSet rs = null;


	/**
	 * Metodo que da select em todos HistPrecoBean do banco
	 * @param conexao
	 * @param tipo
	 * @return
	 * @throws Exception
	 */
	public List<HistPrecoBean> selectAll (Connection conexao, int tipo) throws Exception {
		List<HistPrecoBean> lstHistPreco = new ArrayList<HistPrecoBean>();
		HistPrecoBean hp = null;
		ProdutoServicoBean ps = null;
		Calendar cal = null;
		stmt = conexao.prepareStatement("SELECT HP.CD_HIST_PRECO, P.DS_SERVICO, P.NR_TIPO, P.CD_TIPO_SERVICO, HP.DT_VALIDADE, HP.VL_PRECO "
				+ "FROM T_AM_LDB_HIST_PRECO HP "
				+ "INNER JOIN T_AM_LDB_PRODUTO_SERVICO P "
				+ "ON HP.CD_TIPO_SERVICO = P.CD_TIPO_SERVICO "
				+ "WHERE DT_VALIDADE IN "
				+ "(SELECT MAX(DT_VALIDADE) "
				+ "FROM T_AM_LDB_HIST_PRECO "
				+ "WHERE P.NR_TIPO = ?)");
		stmt.setInt(1, tipo);
		rs = stmt.executeQuery();
		while(rs.next()){
			hp = new HistPrecoBean();
			hp.setCodigoHistPreco(rs.getInt("CD_HIST_PRECO"));
			ps = new ProdutoServicoBean();
			ps.setCodigoTipoServico(rs.getInt("CD_TIPO_SERVICO"));
			ps.setDescricaoServico(rs.getString("DS_SERVICO"));
			ps.setNroTipo(rs.getInt("NR_TIPO"));
			hp.setProdutoServico(ps);
			cal = Calendar.getInstance();
			cal.setTime(rs.getDate("DT_VALIDADE"));
			hp.setDataValidade(cal);
			hp.setPreco(rs.getDouble("VL_PRECO"));
			lstHistPreco.add(hp);
		}
		return lstHistPreco;
	}

}
