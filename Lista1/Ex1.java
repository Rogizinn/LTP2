package Lista1;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// Variáveis.
		String nomeAluno;
		int nota1, nota2, nota3;
		float media;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados.
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextInt();
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextInt();
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextInt();
		
		// Cálculos e Saídas de dados.
		media = (nota1 + nota2 + nota3) / (float) 3;
		System.out.println("Media das notas: " + media);
		
		if (media <= 4){
			System.out.println("aluno REPROVADO");
		}else if (media < 7){
			System.out.println("aluno EM RECUPERACAO");
		}else{
			System.out.println("aluno APROVADO");
		}
			
	}

}