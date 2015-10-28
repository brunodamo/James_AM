package br.com.fiap.am.james.testes;

import java.sql.Connection;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.fiap.am.james.beans.ConsumoBean;
import br.com.fiap.am.james.beans.FuncionarioBean;
import br.com.fiap.am.james.beans.HospedagemBean;
import br.com.fiap.am.james.beans.ProdutoServicoBean;
import br.com.fiap.am.james.bo.HospedagemBO;
import br.com.fiap.am.james.conexao.ConnectionFactory;
import br.com.fiap.am.james.excecoes.Excecao;

public class TesteConsumo {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		try{
			con = ConnectionFactory.controlarInstancia().getConnection("OPS$RM73871","171192");
			do{
				ConsumoBean c = new ConsumoBean();
				HospedagemBean hosp = new HospedagemBean();
				int codHosp = Integer.parseInt(JOptionPane.showInputDialog("Insira o código de hospedagem"));
				if (HospedagemBO.validaCodigo(codHosp, con)){
					hosp.setCodigoHospedagem(codHosp);
					System.out.println("Código valido!");
					c.setHospedagem(hosp);
				}else{
					System.out.println("Código inválido");
				}
				String data = JOptionPane.showInputDialog("Insira a data do Consumo no formato dd/mm/yyyy");
				int dia = Integer.parseInt(data.substring(0,2));
				int mes = Integer.parseInt(data.substring(3,5));
				int ano = Integer.parseInt(data.substring(6,10));
				Calendar cal = Calendar.getInstance();
				cal.set(ano, (mes-1), dia);
				c.setDataConsumo(cal);    
				ProdutoServicoBean ps = new ProdutoServicoBean();
				ps.setCodigoTipoServico(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do tipo de servico")));
				c.setTipoSevico(ps);
				c.setQtdConsumo(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade consumida")));
				FuncionarioBean func = new FuncionarioBean();
				func.setCodigoPessoa(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionario")));
				c.setFuncionario(func);
			}while(JOptionPane.showConfirmDialog(null, "Continuar Cadastrando?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		}catch (Exception e){
			System.out.println(e);
			throw new Excecao("Falha");
		}finally{
			try{
				con.close();
			}catch (Exception e){
				throw new Excecao("Falha");
			}
		}
	}
}


//		Connection con = null;
//		try{
////			CargoBO bo = new CargoBO();
//			con = ConexaoFactory.controlarInstancia().getConnection("","");
//			con.setAutoCommit(false);
//			Cargo c = new Cargo();
//			do{
//				c = new Cargo();
//				c.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
//				c.setNivel(JOptionPane.showInputDialog("Digite o nível"));
//				c.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário")));
//				CargoBO.novoCargo(c,con);
//			}while(JOptionPane.showConfirmDialog(null, "Continuar Cadastrando?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
//
//			List<Cargo> lista = CargoBO.listarCargos(con);
//			for (Cargo obj : lista){
//				System.out.println(obj.getCargo() + "\n" + obj.getNivel() + "\n" + obj.getSalario());
//			}
//
//			String strSearch = JOptionPane.showInputDialog("Digite o cargo que deseja pesquisar");
//			c = CargoBO.consultarCargo(strSearch,con);
//			System.out.println(c.getTudo());
////			int teste=10/0;
//			con.commit();
//			con.setAutoCommit(true);
//		}catch (Exception e){
//			con.rollback();
//			System.out.println(e);
//			throw new Excecao("Falha");
//		}finally{
//			try{
//				con.close();
//			}catch (Exception e){
//				throw new Excecao("Falha");
//			}
//		}
//	}


