package br.com.fiap.am.james.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;

import br.com.fiap.am.james.beans.ConsumoBean;
//import br.com.fiap.am.james.beans.FuncionarioBean;
//import br.com.fiap.am.james.beans.HospedagemBean;
//import br.com.fiap.am.james.beans.ProdutoServicoBean;

/**
 * Essa classe DAO tem a função de realizar o CRUD desse sistema.
 * @see ConsumoBO, ConsumoBean
 * @author James
 *
 */
public class ConsumoDAO {
	
	private PreparedStatement stmt = null;
//	private ResultSet rs = null;
	

	/**
	 * Metodo para inserir um registro de ConsumoBean
	 * @param Objeto ConsumoBean
	 * @param Objeto Connection
	 * @throws Exception
	 */
	public void insert (ConsumoBean c, Connection conexao)throws Exception{
		stmt = conexao.prepareStatement("INSERT INTO T_AM_LDB_CONSUMO (CD_CONSUMO,CD_HOSPEDAGEM,CD_TIPO_SERVICO,"
				+ "CD_PESSOA,DT_CONSUMO,QT_CONSUMO) VALUES (SQ_AM_CONSUMO.nextval,?,?,?,?,?) ");
		stmt.setInt(1, c.getHospedagem().getCodigoHospedagem());
		stmt.setInt(2, c.getTipoSevico().getCodigoTipoServico());
		stmt.setInt(3, c.getFuncionario().getCodigoPessoa());
		stmt.setDate(4, new Date(c.getDataConsumo().getTimeInMillis()));
		stmt.setInt(5, c.getQtdConsumo());
		stmt.execute();
	}
	/**
	 * Metodo para atualizar um registro de ConsumoBean
	 * @param Objeto ConsumoBean
	 * @param Objeto Connection
	 * @return Numéro de linhas atualizadas
	 * @throws Exception
	 */
	public int update (ConsumoBean c, Connection conexao) throws Exception{
		stmt = conexao.prepareStatement("UPDATE T_AM_LDB_CONSUMO SET CD_HOSPEDAGEM = ?, CD_TIPO_SERVICO = ?,"
				+ "CD_PESSOA = ?, DT_CONSUMO = ?, QT_CONSUMO = ? WHERE CD_CONSUMO = ?");
		stmt.setInt(1, c.getHospedagem().getCodigoHospedagem());
		stmt.setInt(2, c.getTipoSevico().getCodigoTipoServico());
		stmt.setInt(3, c.getFuncionario().getCodigoPessoa());
		stmt.setDate(4, new Date(c.getDataConsumo().getTimeInMillis()));
		stmt.setInt(5, c.getQtdConsumo());
		stmt.setInt(6, c.getCodigoConsumo());
		return stmt.executeUpdate();
	}
//	/**
//	 * Metodo para exlcuir um registro de ConsumoBean
//	 * @param c
//	 * @param conexao
//	 * @return
//	 * @throws Exception
//	 */
//	public int delete (ConsumoBean c, Connection conexao) throws Exception{
//		stmt = conexao.prepareStatement("DELETE FROM T_AM_LDB_CONSUMO WHERE CD_CONSUMO = ?");
//		stmt.setInt(1, c.getCodigoConsumo());
//		return stmt.executeUpdate();
//	}
//	/**
//	 * Metodo que retona uma lista de registros de ConsumoBeans
//	 * @param conexao
//	 * @return
//	 * @throws Exception
//	 */
//	public List<ConsumoBean> selectAll (Connection conexao) throws Exception {
//		List<ConsumoBean> lstConsumo = new ArrayList<ConsumoBean>();
//		Calendar cal = null;
//		HospedagemBean hosp = null;
//		ProdutoServicoBean prod = null;
//		FuncionarioBean func= null;
//		stmt = conexao.prepareStatement("SELECT * FROM T_AM_LDB_CONSUMO C "
//				+ "INNER JOIN T_AM_LDB_HOSPEDAGEM H "
//				+ "ON C.CD_HOSPEDAGEM = H.CD_HOSPEDAGEM"
//				+ "INNER JOIN T_AM_LDB_PRODUTO_SERVICO P "
//				+ "ON C.CD_TIPO_SERVICO = P.CD_TIPO_SERVICO"
//				+ "INNER JOIN T_AM_LDB_FUNCIONARIO F"
//				+ " ON C.CD_PESSOA = F.CD_FUNCIONARIO");
//		rs = stmt.executeQuery();
//		while (rs.next()){
//		ConsumoBean c = new ConsumoBean();
//		c.setCodigoConsumo(rs.getInt("C.CD_CONSUMO"));
//		hosp = new HospedagemBean();
//		hosp.setCodigoHospedagem(rs.getInt("H.CD_HOSPEDAGEM"));
//		c.setHospedagem(hosp);
//		prod = new ProdutoServicoBean();
//		prod.setCodigoTipoServico(rs.getInt("P.CD_TIPO_SERVICO"));
//		prod.setDescricaoServico(rs.getString("P.DS_SERVICO"));
//		prod.setNroTipo(rs.getInt("P.NR_TIPO"));
//		c.setTipoSevico(prod);
//		func = new FuncionarioBean();
//		func.setCodigoPessoa(rs.getInt("F.CD_FUNCIONARIO"));
//		c.setFuncionario(func);
//		cal = Calendar.getInstance();
//		cal.setTime(rs.getDate("DT_CONSUMO"));
//		c.setDataConsumo(cal);
//		c.setQtdConsumo(rs.getInt("QT_CONSUMO"));
//		lstConsumo.add(c);
//		}
//		return lstConsumo;
//	}
	
}
