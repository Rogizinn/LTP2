package Lista5;

import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		
		// Variáveis.
		String horarioInicio;
		String horarioFim;
		int duracao;
		float vlrChamada;
		float vlrMinuto;
		float vlrConta = 0;
		int hi=0,mi=0; // hora e minuto iniciais
		int hf=0,mf=0; // hora e minuto finais
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada, Cálculos e Saída de dados.
		do {
			do {
				do {
					System.out.print("Horario inicial da chamada (FIM para encerrar): ");
					horarioInicio = leia.next();
					if (horarioInicio.equalsIgnoreCase("fim")) {
						break;
					}	
				}while( ! horaEhValida(horarioInicio) );
				
				if (horarioInicio.equalsIgnoreCase("fim")) {
					break;
				}
				
				do {
					System.out.print("Horario final da chamada: ");
					horarioFim = leia.next();
				}while( ! horaEhValida(horarioFim) );
				
				hi = Integer.parseInt( horarioInicio.substring(0,2));
				mi = Integer.parseInt( horarioInicio.substring(3));
				hf = Integer.parseInt( horarioFim.substring(0,2));
				mf = Integer.parseInt( horarioFim.substring(3));
				
				if (hf < hi || hf == hi && mf <= mi) {
					System.out.println("Valor invalido, digito horario Final maior que o Inicial");
				}
			}while(hf < hi || hf == hi && mf <= mi);
			
			if (horarioInicio.equalsIgnoreCase("fim")) {
				break;
			}
			
			duracao =  (hf - hi)*60 + mf - mi;
			if (hi < 6) {
				vlrMinuto = 0.10f;
			}else if (hi < 8) {
				vlrMinuto = 0.15f;
			}else if (hi < 18) {
				vlrMinuto = 0.20f;
			}else {
				vlrMinuto = 0.15f;
			}
			vlrChamada = duracao * vlrMinuto;
			System.out.println("Valor da chamada: " + vlrChamada);
			vlrConta = vlrConta + vlrChamada;				
			
		}while(true);

		System.out.println("Valor total da conta: " + vlrConta);
	}
	
	// Cálculos.
	public static boolean horaEhValida ( String horario ) {
		int hora, minuto;
		
		if (horario.length() != 5 || horario.charAt(2) != ':') {
			System.out.println("horario invalido, digite no formato HH:MM");
			return false;
		}
		try {
			hora = Integer.parseInt( horario.substring(0,2));
			minuto = Integer.parseInt( horario.substring(3));
		}catch (NumberFormatException e) {
			System.out.println("horario invalido, digite hora e minuto numericos");
			return false;
		}
		
		if (hora < 0 || hora > 23) {
			System.out.println("horario invalido, digite hora entre 0 e 23");
			return false;
		}
		
		if (minuto < 0 || minuto > 59) {
			System.out.println("horario invalido, digite minuto entre 0 e 59");
			return false;
		}

		return true;
	}
}
