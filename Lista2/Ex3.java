package Lista2;

import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		
		// Variáveis.
		int codOperario;
		char classe;
		int numPecas;
		float salario;
		float somaSal = 0;
		int somaNumPecas = 0;
		int menorNumPecas = 999;
		int codOpMenorNumPecas = 0;
		int somaNumPecasClasseB = 0;
		int contOperariosClasseB = 0;
		Scanner leia = new Scanner (System.in);
		
		do {
			
			System.out.println("Digite o codigo do operario (zero para finalizar: ");
			codOperario = leia.nextInt();
			if (codOperario == 0) {
				break;
			}
			
			do {
				System.out.println("Digite a classe do operario: ");
				classe = leia.next().charAt(0);
				if (classe != 'A' && classe != 'B' && classe != 'C') {
					System.out.println("Classe invalida, digite A, B ou C");
				}
			}while(classe != 'A' && classe != 'B' && classe != 'C');
			
			do {
				System.out.println("Digite o numero de pecas fabricadas: ");
				numPecas = leia.nextInt();
				if (numPecas < 0) {
					System.out.println("Num pecas invalido, digite acima de zero");
				}
			}while(numPecas < 0);
			
			// Cálculos.
			if (classe == 'A') {
				if (numPecas <= 30) {
					salario = 500 + 2 * numPecas;
				}else if (numPecas <= 40) {
					salario = 500 + 2.30f * numPecas;
				}else {
					salario = 500 + 2.80f * numPecas;
				}
			}else if (classe == 'B') {
				salario = 1200;
			}else {
				if (numPecas <= 50) {
					salario = 40 * numPecas;
				}else {
					salario = 45 * numPecas;
				}
			}
			
			System.out.println("Salario: " + salario);
			somaSal = somaSal + salario;
			somaNumPecas = somaNumPecas + numPecas;
			if (numPecas < menorNumPecas) {
				menorNumPecas = numPecas;
				codOpMenorNumPecas = codOperario;
			}
			
			if (classe == 'B') {
				somaNumPecasClasseB = somaNumPecasClasseB + numPecas;
				contOperariosClasseB ++;
			}
			
			
		}while(codOperario != 0);
		
		// Saídas.
		System.out.println("Total gasto com salarios: " + somaSal);
		System.out.println("Numero total de peças fabricadas: " + somaNumPecas);
		System.out.println("Codigo operario fabricou menor numero pecas: " + codOpMenorNumPecas);
		if (contOperariosClasseB > 0) {
			System.out.println("Media quantidade pecas fabricada classe B: " + somaNumPecasClasseB / contOperariosClasseB);
		}
		
	}

}
