import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer numeroConta;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		
		System.out.println("Digite o número da conta: ");
		numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do Cliente: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Digite o saldo da conta: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", " + "obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
				+ " já está disponível para saque");
		
		sc.close();
	}
}
