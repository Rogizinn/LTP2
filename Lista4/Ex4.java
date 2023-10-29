package Lista4;

import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		
		// Variáveis.
		String jog1, jog2; // jogador1 e jogador2
		Scanner leia = new Scanner(System.in);
		
		// Entrada e Saída de dados.
		do {
			
			System.out.print("Digite a jogada escolhida pelo jogador 1: ");
			jog1 = leia.next();
			System.out.print("Digite a jogada escolhida pelo jogador 2: ");
			jog2 = leia.next();
			
			if ( ! jog1.equals("pedra") && ! jog1.equals("papel") && ! jog1.equals("tesoura")   ||
					! jog2.equals("pedra") && ! jog2.equals("papel") && ! jog2.equals("tesoura") ){
				System.out.println("jogo terminado.");
				break;
			}
			
			identificarVencedor(jog1, jog2);
			
			byte retorno = testarVencedor(jog1, jog2);
			if (retorno == 0) {
				System.out.println("Empate !");
			} else if (retorno == 1) {
				System.out.println("Jogador 1 venceu o jogo!");
			} else {
				System.out.println("Jogador 2 venceu o jogo!");
			}
			
			
		}while( true );
		

	}

	// Cálculos.
	public static void identificarVencedor ( String jogad1, String jogad2) {
		
		if (jogad1.equals(jogad2)) {
			System.out.println("Empate !");
		} else {
			if (jogad1.equals("pedra") && jogad2.equals("tesoura") || 
					jogad1.equals("tesoura") && jogad2.equals("papel") ||
					jogad1.equals("papel") && jogad2.equals("pedra") ) {
				System.out.println("Jogador 1 venceu o jogo!");
			} else {
				System.out.println("Jogador 2 venceu o jogo!");
			}
		}
		
	}
	
	public static byte testarVencedor ( String jogad1, String jogad2 ) {
		byte vencedor = 0; // empate
		
		if (jogad1.equals("pedra")) {
			if (jogad2.equals("tesoura")) {
				vencedor = 1;
			} else {
				vencedor = 2;
			}
		} else if (jogad1.equals("papel")) {
				if (jogad2.equals("pedra")) {
					vencedor = 1;
				} else {
					vencedor = 2;
				}
		} else { // jog1 = tesoura
			if (jogad2.equals("papel")) {
				vencedor = 1;
			} else {
				vencedor = 2;
			}
		}

		return vencedor;
	}

}
