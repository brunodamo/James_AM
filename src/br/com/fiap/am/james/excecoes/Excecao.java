package br.com.fiap.am.james.excecoes;

/**
 * Metodo que verifica os exceptions mais comuns
 * @author rm73871
 *
 */
public class Excecao extends Exception {
	public Excecao(Exception e) {
		if (e.getClass().toString()
				.equals("class java.lang.NumberFormatException")) {
			System.out.println("N�mero inv�lido");
		} else if (e.getClass().toString()
				.equals("class java.lang.ArrayIndexOfBound")) {
			System.out.println("Limite excedido");
		}else if(e.getClass().toString()
				.equals("class java.lang.ArithmeticException")){
			System.out.println("Erro Aritim�tico");
		}else if(e.getClass().toString()
				.equals("class java.lang.IllegalArgumentException")){
			System.out.println("Par�metro fornecido fora dos padr�es estabelecidos");
		}
		else {
			System.out.println("Erro desconhecido");
			e.printStackTrace();
		}
	}
	/**
	 * Metodo consturtor que permite printar uma mensagem de erro, facilitando a identificacao do mesmo
	 * @param x
	 */
	public Excecao (String x){
		System.out.println(x);
	}
}
