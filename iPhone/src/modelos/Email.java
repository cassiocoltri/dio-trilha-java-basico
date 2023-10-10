package modelos;

public interface Email {
	
	default void enviarEmail() {
		System.out.println("Enviado email");
	}
	
	default void salvarEmail() {
		System.out.println("Salvando email");
	}

	default void deletarEmail() {
		System.out.println("Excluindo email");
	}
	default void criarPastaEmail() {
		System.out.println("Criando pasta de email");
	}
	default void moverArquivoEmail() {
		System.out.println("Movendo email");
		
	}
	
}
