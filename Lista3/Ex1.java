package Lista3;

import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		
		// Variáveis.
		String cidades[] = new String[20];
		int distancias[] = new int[20];
		String nomeCidadePesq;
		float preco;
		int tempoVoo;
		byte numEscalas;
		Scanner leia = new Scanner(System.in);
		int cont;
		boolean encontrou;
		int x;
		
		// Entrada, Cálculos e Saída de dados.
		for (cont = 0 ; cont <= 19 ; cont++) {
			do {
				System.out.print("Digite o nome da cidade (FIM p/ encerrar): ");
				cidades[cont] = leia.nextLine();
				if (cidades[cont].equals("")) {
					System.out.println("digitacao obrigatoria !");
				}
			}while(cidades[cont].equals(""));
			
			if (cidades[cont].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite a distancia até Belo Horizonte (km): ");
				distancias[cont] = leia.nextInt();
				if (distancias[cont] < 500) {
					System.out.println("Valor invalido, digite 500 ou maior");
				}
			}while(distancias[cont] < 500);
			
			leia.nextLine();
		}
		
		
		do {
			System.out.println("Digite a cidade de destino (SAIR p/ finalizar): ");
			nomeCidadePesq = leia.nextLine();
			if (nomeCidadePesq.equals("sair")) {
				break;
			}
			
			encontrou = false;
			for (x = 0; x < cont; x++) {
				if (nomeCidadePesq.equals(cidades[x])) {
					encontrou = true;
					break;
				}
			}
			if (encontrou) {
				preco = 0.25f * distancias[x];
				tempoVoo =  distancias[x] * 60 / 800 ;
				numEscalas = (byte) (tempoVoo / 180);
				System.out.println("Preco da passagem: " + preco);
				System.out.println("Tempo de voo em minutos: " + tempoVoo);
				System.out.println("Numero de escalas: " + numEscalas);
			} else {
				System.out.println("Nao existe voo para esta cidade");
			}
		}while( ! nomeCidadePesq.equals("sair") );
	}
}
