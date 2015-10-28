package br.com.fiap.am.james.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import br.com.fiap.am.james.beans.ClienteBean;
import br.com.fiap.am.james.beans.FuncionarioBean;
import br.com.fiap.am.james.beans.HospedagemBean;
import br.com.fiap.am.james.beans.ReservaBean;

public class HospedagemDAO {
	
	private PreparedStatement stmt  = null;
	private ResultSet rs = null;
	
	/**
	 * Metodo que compara com o banco se existe codigo inserido no front
	 * @param Codigo da Hospedagem
	 * @param Objeto Connection
	 * @return Objeto HospedagemBean encontrado
	 * @throws Exception
	 */
	public HospedagemBean select (int cdHospedagem, Connection conexao) throws Exception{
			stmt = conexao.prepareStatement("SELECT H.CD_HOSPEDAGEM, R.CD_RESERVA, C.CD_PESSOA, C.NM_PESSOA,  F.CD_FUNCIONARIO, H.DT_ENTRADA, H.VC_PERC_DESCONTO FROM T_AM_LDB_HOSPEDAGEM H INNER JOIN T_AM_LDB_PESSOA C  ON H.CD_CLIENTE = C.CD_PESSOA  INNER JOIN T_AM_LDB_FUNCIONARIO F ON H.CD_FUNCIONARIO = F.CD_FUNCIONARIO INNER JOIN T_AM_LDB_RESERVA R ON H.CD_RESERVA = R.CD_RESERVA  WHERE H.CD_HOSPEDAGEM = ?");
			stmt.setInt(1, cdHospedagem);
			rs = stmt.executeQuery();
			rs.next();
			HospedagemBean hp = new HospedagemBean();
			hp.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));
			ReservaBean r = new ReservaBean();
			r.setCodigoReserva(rs.getInt("CD_RESERVA"));
			hp.setReserva(r);
			ClienteBean c = new ClienteBean();
			c.setCodigoPessoa(rs.getInt("CD_PESSOA"));
			c.setNomePessoa(rs.getString("NM_PESSOA"));
			hp.setCliente(c);
			FuncionarioBean f = new FuncionarioBean();
			f.setCodigoPessoa(rs.getInt("CD_FUNCIONARIO"));
			hp.setFuncionario(f);
			Calendar cal = null;
			cal = Calendar.getInstance();
			cal.setTime(rs.getDate("DT_ENTRADA"));
			hp.setDataEntrada(cal);
			hp.setDesconto(rs.getInt("VC_PERC_DESCONTO"));
			return hp;
	}
}
