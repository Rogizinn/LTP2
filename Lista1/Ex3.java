package Lista1;

import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// Variáveis.
		byte tempoCasa;
		float salario;
		float bonus;
		float valeTransp;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados.
		System.out.print("Digite o Tempo de casa: ");
		tempoCasa = leia.nextByte();
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		
		// Cálculos.
		if (tempoCasa <= 5){
			if (salario <= 300){
				bonus = 50;
				valeTransp = (float) (0.05 * salario);
			}else{
				bonus = 80;
				valeTransp = (float) (0.06 * salario);
			}
		}else if (tempoCasa <= 10){
			if (salario <= 500){
				bonus = (float) (0.15 * salario);
				valeTransp = 70;
			}else if (salario <= 2000){
				bonus = (float) (0.13 * salario);
				valeTransp = 90;
			}else{
				bonus = (float) (0.12 * salario);
				valeTransp = (float) (0.08 * salario);
			}
		}else{
			bonus = 300;
		    valeTransp = (float) (0.04 * salario);
		}
		
		// Saídas.
		System.out.println("O bonus do empregado eh: " + bonus);
		System.out.println("O desconto de vale transporte eh: " + valeTransp);

	}

}
