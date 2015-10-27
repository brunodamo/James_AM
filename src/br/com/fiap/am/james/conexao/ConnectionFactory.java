package br.com.fiap.am.james.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
* Classe criada para criar e gerenciar as conexões com o banco de dados. 
* @author James
* @version 1.0
* @since 1.0
**/

public final class ConnectionFactory {
	private static ConnectionFactory conexao = null;
	
	/**
	 * Método que <b>verifica</b> se há uma conexão instanciada. 
	 * @return conexao;
	 * @author James
	 */
	public static ConnectionFactory controlarInstancia(){
		if(conexao == null){
			conexao = new ConnectionFactory();
		}
		return conexao;
	}
	
	/**
	 * Método que <b>executa</b> a conexão com o banco de dados. 
	 * @return DriverManager.getConnection("<String de conexão>");
	 * @author James
	 */
	public Connection getConnection(String usuario, String senha) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL", usuario, senha);
		//return DriverManager.getConnection("jdbc:oracle:thin:/:@localhost:1521:xe", "system", "admin"); 
	}
}
