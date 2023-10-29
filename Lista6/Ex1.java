package Lista6;

import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		
		// Variáveis.
		String nomeDig;
		Scanner leia = new Scanner(System.in);
		
		// Entrada e Saída de dados.
		System.out.print("Nome em letras minusculas: ");
		nomeDig = leia.nextLine();
		
		nomeDig = cortarEspacosEsquerda(nomeDig);
		System.out.println(nomeDig);
		
		nomeDig = cortarEspacosDireita(nomeDig);
		System.out.println(nomeDig + "****");
		
		nomeDig = cortarExcessoEspacoEntrePalavras(nomeDig);
		System.out.println(nomeDig);
		
		System.out.println(converterPrimLetraMaiusc(nomeDig));
		
		nomeDig = converterTodasPrimLetraMaiusc(nomeDig);
		System.out.println(nomeDig);


	}

	// Cálculos.
	public static String converterPrimLetraMaiusc (String nome) {
		nome = Character.toUpperCase( nome.charAt(0) ) + nome.substring(1);
		return nome;
	}
	
	public static String converterTodasPrimLetraMaiusc (String nome) {
		nome = converterPrimLetraMaiusc(nome);
		for (int x = 1; x <= nome.length() - 1 ; x++ ) {
			if (nome.charAt(x) == ' ') {
				nome = nome.substring(0,x+1) + Character.toUpperCase( nome.charAt(x+1) ) + 
						nome.substring(x + 2);
			}
		}
		return nome;
	}
	
	public static String cortarEspacosEsquerda (String nome) {
		while (nome.charAt(0) == ' ') {
			//nome = nome.substring(1);
			nome = nome.replaceFirst(" ","");
		}
		return nome;

	}
	
	public static String cortarEspacosDireita (String nome) {
		while (nome.charAt( nome.length()-1 ) == ' ') {
			nome = nome.substring(0, nome.length()-1 );
		}
		return nome;

	}
	
	public static String cortarExcessoEspacoEntrePalavras (String nome) {
		while (nome.contains("  ")) {
			nome = nome.replace("  "," ");
		}
		return nome;
	}
}
