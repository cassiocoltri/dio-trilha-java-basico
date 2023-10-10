package modelos;

public interface Calendario {

	default void executarCalendario() {
		System.out.println("Iniciando calendário");
	}
	default void criarLembreteCalendario() {
		System.out.println("Criando lembrete no calendario");
	}
	default void deletarLembreteCalendario() {
		System.out.println("Deletando lembrete do calendario");		
	}
	default void moverEventoCalendario() {
		System.out.println("Movendo lembrete do calendario");
	}
	default void editarLembreteCalendario() {
		System.out.println("Editando lembrete no calendario");
	}
}
