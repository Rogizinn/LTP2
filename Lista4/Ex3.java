package Lista4;

import java.util.*;
public class Ex3 {

	// Vetor.
	static String vetCidades[] = {"BELO HORIZONTE","SAO PAULO","RIO DE JANEIRO","SALVADOR","CURITIBA"};

	public static void main(String[] args) {
		
		//Variáveis.
		String nomeHosp[] = new String[100];
		byte diaEntrada;
		byte diaSaida;
		String tipoQuarto;
		String cidadeHotel;
		float vlrConta[] = new float[100];
		float somaVlrConta = 0;
		float mediaVlrConta;
		int cont;
		boolean encontrouCidade;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados.
		for (cont = 0; cont < 100 ; cont++ ) {
			System.out.print("Nome do hospede (SAIR para finalizar): ");
			nomeHosp[cont] = leia.nextLine();
			if (nomeHosp[cont].equalsIgnoreCase("sair")) {
				break;
			}
			

			do {
				System.out.print("Dia da entrada no hotel: ");
				diaEntrada = leia.nextByte();
				System.out.print("Dia da saida no hotel: ");
				diaSaida = leia.nextByte();
				if (diaSaida <= diaEntrada) {
					System.out.println("valor invalido, digite Saida maior que Entrada");
				}
			}while(diaSaida <= diaEntrada);
			
			do {
				System.out.print("Tipo de quarto: ");
				tipoQuarto = leia.next();
				if ( ! tipoQuarto.equals("STANDARD") && ! tipoQuarto.equals("LUXO") && 
						! tipoQuarto.equals("SUPER-LUXO") ) {
					System.out.println("Tipo de quarto invalido, digite STANDARD, LUXO ou SUPER-LUXO");
				}
			}while(! tipoQuarto.equals("STANDARD") && ! tipoQuarto.equals("LUXO") && 
					! tipoQuarto.equals("SUPER-LUXO"));
			
			leia.nextLine();
			do {
				System.out.println("Cidade do hotel: ");
				cidadeHotel = leia.nextLine();
				encontrouCidade = cidadeEhValida(cidadeHotel);
				if ( ! encontrouCidade) {
					System.out.println("Cidade invalida, nao ha hotel neste cidade!!");
				}
			}while(! encontrouCidade);
			
			// Cálculos.
			vlrConta[cont] = calcularConta(diaEntrada, diaSaida, tipoQuarto);
			somaVlrConta = somaVlrConta + vlrConta[cont];
			System.out.println("Valor da conta: " + vlrConta[cont] );
			
			
		}
		
		mediaVlrConta = somaVlrConta / cont;
		System.out.println("Relatório de contas acima da média");
		System.out.println("NOME HOSPEDE  VALOR CONTA");
		for (int x = 0; x < cont ; x++) {
			if (vlrConta[x] > mediaVlrConta) {
				System.out.println(nomeHosp[x] + "           " + vlrConta[x]);
			}
		}
		System.out.println("Media de valores de conta: " + mediaVlrConta);

	}
	
	public static boolean cidadeEhValida (String cidade) {
		boolean encontrou = false;
		for (byte x = 0 ; x < 5 ; x++) {
			if (cidade.equalsIgnoreCase(vetCidades[x])) {
				encontrou = true;
				break;
			}
		}
		return encontrou;
	}

	public static float calcularConta (byte entrada, byte saida, String tpQuarto) {
		float vlrDiaria;
		//float vlrConta;
		
		if (tpQuarto.equals("STANDARD")) {
			vlrDiaria = 120;
		}else if (tpQuarto.equals("LUXO")) {
			vlrDiaria = 150;
		}else {
			vlrDiaria = 180;
		}
		
		// vlrConta = (saida - entrada) * vlrDiaria;
		// return vlrConta;
		return (saida - entrada) * vlrDiaria;
		
	}
}
