package modelos;

import servicos.GerenciandoDados;

public interface Mensagem extends GerenciandoDados{
	
	default void enviarMensagem() {
		System.out.println("Enviado mensagem");
	}
	default void salvarMensagem() {
		System.out.println("Salvando Mensagem");
	}
	default void deletarMensagem() {
		System.out.println("Deletando Mensagem");
	}
	default void criarPastaMensagem() {
		System.out.println("Criando pasta de Mensagem");
	}
	default void moverArquivoMensagem() {
		System.out.println("Movendo arquivo de Mensagem");
	}

}
