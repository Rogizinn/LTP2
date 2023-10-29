package Lista5;

import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		
		// Variáveis.
		String codigo;
		Scanner leia = new Scanner(System.in);
		boolean valido;
		
		do {
			// Entrada de dados.
			do {
				System.out.print("Codigo (FIM para encerrar): ");
				codigo = leia.next();
				if (codigo.equalsIgnoreCase("fim")) {
					break;
				}
				valido = true;
				if (codigo.length() != 11) {
					System.out.println("codigo invalido, digite 11 caracteres");
					valido = false;
				}else {
					for (int x = 0 ; x <= 10; x++) {
						//	if (Character.digit( codigo.charAt(x) , 10 ) == -1 ) {
						//		System.out.println("codigo invalido, digite apenas digitos !!");
						//  }

						if (codigo.charAt(x) < '0' || codigo.charAt(x) > '9' ) {	
							System.out.println("codigo invalido, digite apenas digitos !!");
							valido = false;
							break;
						}
					}
				}
				
			}while( ! valido );
			
			if (codigo.equalsIgnoreCase("fim")) {
				break;
			}
			
			// Cálculo e Saída de dados.
			
//			String digDigitado = codigo.substring(9);
//			String digCalculado = calcularDigitos(codigo);
//			if (digDigitado.equals(digCalculado)) {
//				System.out.println("Digitos corretos");
//			}else {
//				System.out.println("Digitos invalidos");
//			}
						
			if ( codigo.substring(9).equals(calcularDigitos(codigo)) ) {
				System.out.println("Digitos corretos");
			}else {
				System.out.println("Digitos invalidos");
			}
			
		}while( ! codigo.equalsIgnoreCase("fim") );
		
		
	}
	
	public static String calcularDigitos (String cod) {
		byte digito1, digito2;
		int soma = 0;
		int mult = 1;
		
		for (byte x = 0; x <= 8; x++) {
			soma = soma + Character.digit( cod.charAt(x) , 10);
			mult = mult * Character.digit( cod.charAt(x) , 10);
			
			//soma = soma + Integer.parseInt( cod.substring(x,x+1) );
		}
		
		digito1 = (byte) (soma / 10);
		digito2 = (byte) (mult % 10);
		return digito1 + "" + digito2;
		
		// outra forma de calcular o digito 2:
		//String multSTR = String.valueOf(mult);
		//char dig2 = multSTR.charAt( multSTR.length() - 1 );
			
	}
}
