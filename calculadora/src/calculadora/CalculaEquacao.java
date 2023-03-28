package calculadora;

import java.util.Scanner;

public class CalculaEquacao {

	public static void main(String[] args) {
		
		Equacao equacao = new Equacao();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o operando1: ");
		double operando1 = scanner.nextDouble();
		equacao.setOperando1(operando1);

		System.out.println("Digite o operador: ");
		String operador = scanner.next();
		equacao.setOperador(operador);

		System.out.println("Digite o operando2: ");
		double operando2 = scanner.nextDouble();
		equacao.setOperando2(operando2);
		
		equacao.calculaResultado();
		System.out.println("resultado: " + equacao.getResultado());
	}
	

	
	
}
