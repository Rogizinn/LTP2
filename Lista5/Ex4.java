package Lista5;

import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		
		// Variáveis.
		String placa;
		String dataMulta;
		float vlrMulta;
		float somaVlrMulta = 0;
		int contMultas = 0;
		float menorVlrMulta = 99999;
		Scanner leia = new Scanner(System.in);
		boolean erro;
		
		// Entrada e Saída de dados.
		do {
			do {
				System.out.print("Placa do veiculo (FIM para finalizar): ");
				placa = leia.next();
				if (placa.equalsIgnoreCase("fim")) {
					break;
				}
				erro = false;
				if (placa.length() != 7) {
					System.out.println("Placa invalida, digite placa com 7 caracteres");
					erro = true;
				}else {
					for (int x = 0; x <= 6; x++) {
						if (x <= 2) {
							if (placa.charAt(x) < 'A' || placa.charAt(x) > 'Z') {
								System.out.println("Placa invalida, digite letra maiuscula nas 3 primeiras posicoes");
								erro = true;
								break;
							}
						}else {
							if (placa.charAt(x) < '0' || placa.charAt(x) > '9') {
								System.out.println("Placa invalida, digite numero nas 4 ultimas posicoes");
								erro = true;
								break;
							}
						}
					}
				}
			}while( erro );
			
			if (placa.equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Data da multa: ");
				dataMulta = leia.next();
			}while( ! dataEhValida(dataMulta) );
			
			do {
				System.out.println("Valor da multa: ");
				vlrMulta = leia.nextFloat();
				if (vlrMulta <= 0) {
					System.out.println("Valor invalido, digite acima de zero");
				}
			}while(vlrMulta <= 0);
			
			// Cálculos.
			somaVlrMulta = vlrMulta + somaVlrMulta;
			contMultas ++;
			if (vlrMulta < menorVlrMulta) {
				menorVlrMulta = vlrMulta;
			}
			
		}while(! placa.equalsIgnoreCase("fim"));
		
		System.out.println("Soma das multas: " + somaVlrMulta);
		System.out.println("Media das multas: " + somaVlrMulta / contMultas);
		System.out.println("Valor da menor multa: " + menorVlrMulta);

	}
	
	public static boolean dataEhValida (String data) {
		int dia, mes, ano;
		if (data.length() != 10) {
			System.out.println("Data invalida, digite data com 10 caracteres");
			return false;
		}
		if (data.charAt(2) != '/' || data.charAt(5) != '/') {
			System.out.println("Data invalida, digite data no formato DD/MM/AAAA");
			return false;
		}
		try {
			dia = Integer.parseInt( data.substring(0,2) );
			mes = Integer.parseInt( data.substring(3,5) );
			ano = Integer.parseInt( data.substring(6) );
		}catch(NumberFormatException erro) {
			System.out.println("Data invalida, digite dia, mes e ano numericos! ");
			return false;
		}
		
		if (ano > 2023) {
			System.out.println("Ano invalido, digite ano menor ou igual a 2023");
			return false;
		}
		
		if (dia < 1 || dia > 31) {
			System.out.println("Data invalida, digite dia entre 1 e 31");
			return false;
		}
		
		if (mes < 1 || mes > 12) {
			System.out.println("Mes invalido, digite entre 1 e 12");
			return false;
		}
		if ( (mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
			System.out.println("Data invalida, digite maximo 30 dias para os meses 4, 6, 9 e 11");
			return false;
		}
		if (mes == 2) {
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)  {   // ano bissexto
				if (dia > 29) {
					System.out.println("Data invalida, digite maximo 29 dias para fevereiro em ano bissexto");
					return false;
				}
			}else{
				if (dia > 28) {
					System.out.println("Data invalida, digite maximo 28 dias para fevereiro em ano NAO bissexto");
					return false;
				}
			}
				
		}
		
		return true;
	}
}
