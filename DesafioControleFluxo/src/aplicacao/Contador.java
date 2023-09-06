package aplicacao;

import java.util.Scanner;
import excecoes.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			exception.menssagem();
		}
		
		sc.close();
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o n�mero " + (i+1));
		}
	}

}
