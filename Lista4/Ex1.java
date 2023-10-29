package Lista4;

import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		
		// Variáveis.
		int numA, numB, numC;
		Scanner leia = new Scanner(System.in);
		int valorRetorno;
		
		// Entrada e Saída de dados.
		System.out.print("Digite o valor de A: ");
		numA = leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		numB = leia.nextInt();
		
		System.out.print("Digite o valor de C: ");
		numC = leia.nextInt();

		valorRetorno = somarInteirosEntreAeB(numA, numB);
		System.out.println("Soma dos inteiros entre A e B: " + valorRetorno);
		
		exibirIntEntreAeB_DivisivelPorC(numA, numB, numC);
		
		System.out.println("Percentual de C em relacao a A: " + calcularPercent_C_sobre_A(numA, numC) );
		
	}

	// Cálculos.
	public static int somarInteirosEntreAeB (int a , int b) {
		int soma = 0;
		for (int x = a + 1; x <= b -1; x++) {
			soma = soma + x;
		}
		return soma;
	}
	
	public static void exibirIntEntreAeB_DivisivelPorC (int a, int b, int c) {
		for (int x = a + 1; x <= b -1; x++) {
			if ( x % c == 0) {
				System.out.println("Inteiro entre A e B divisivel por C: " + x);
			}
		}
	}
	
	public static float calcularPercent_C_sobre_A (int a, int c) {
		float percentual;
		percentual = c * 100 / (float)a;
		return percentual;
	}

}
