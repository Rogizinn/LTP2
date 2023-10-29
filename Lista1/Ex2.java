package Lista1;

import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// Variáveis.
		int lado1, lado2, lado3;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados.
		System.out.print("Digite o lado 1: ");
		lado1 = leia.nextInt();
		System.out.print("Digite o lado 2: ");
		lado2 = leia.nextInt();
		System.out.print("Digite o lado 3: ");
		lado3 = leia.nextInt();
		
		// Cálculos e Saídas de dados.
		if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)){
			if ((lado1 == lado2) && (lado2 == lado3)){
				System.out.println("triangulo EQUILATERO");
			}else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
				System.out.println("triangulo ISOCELES");
			}else{
				System.out.println("triangulo ESCALENO");
			}
		}else{
			System.out.println("os 3 lados nao formam um triangulo");
		}
	}

}
