package br.com.fiap.am.james.testes;

public class TesteData {
	/**
	 * Metodo main da classe TesteData
	 * @param args
	 */
	public static void main(String[] args) {
		String data = "29/12/1992";
    	int dia = Integer.parseInt(data.substring(0,2));
    	int mes = Integer.parseInt(data.substring(3,5));
    	int ano = Integer.parseInt(data.substring(6,10));
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(ano);
		
	}
}
