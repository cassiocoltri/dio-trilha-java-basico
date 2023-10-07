package servicos;

public interface Telefone extends Mensagem{
	
	@Override
	default void enviarMensagem() {
		System.out.println("Enviando mensagem...");
		
	}
	@Override
	default void deletarMensagem() {
		System.out.println("Deletando mensagem...");
		
	}
	@Override
	default void salvarMensagem() {
		System.out.println("Salvando mensagem...");
		
	}

}
