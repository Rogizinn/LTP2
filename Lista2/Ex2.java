package Lista2;

import java.util.*;
public class Ex2 {
	public static void main (String [] args) {
		// Variáveis.
		float altura;
		char sexo;
		float maiorAltura = 0;
		float menorAltura = 2.5f;
		int contSexoMasc = 0;
		int contSexoFem = 0;
		float somaAltMasc = 0;
		float somaGeralAlt = 0;
		Scanner leia = new Scanner (System.in);
		
		do {
			// Entrada de Dados.
			do {
				System.out.print("Digite a altura (0 para finalizar): ");
				altura = leia.nextFloat();
				if (altura < 0 || altura > 2.5) {
					System.out.println("Altura invalida, digite entre 0 e 2.5");
				}
			}while( altura < 0 || altura > 2.5);
			
			if (altura == 0) {
				break;
			}
			
			do {
				System.out.println("Digite o sexo (M/F): ");
				sexo = leia.next().charAt(0);
				if (sexo != 'M' && sexo != 'F') {
					System.out.println("Sexo invalido, digite M ou F");
				}
			}while(sexo != 'M' && sexo != 'F');
			
			// Cálculos.
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (sexo == 'F') {
				contSexoFem ++;
			}else {
				contSexoMasc ++;
				somaAltMasc = somaAltMasc + altura;
			}
			somaGeralAlt = somaGeralAlt + altura;
			
		}while(altura != 0);
	}

}
