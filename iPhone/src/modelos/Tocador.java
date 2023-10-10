package modelos;

public interface Tocador {
	
	// Metodos musica
	default void reproduzirMusica() {
		System.out.println("Reproduzindo m�sica");
	}
	default void criarAlbumMusica() {
		System.out.println("Criando �lbum de m�sica");
	}
	default void deletarMusica() {
		System.out.println("Deletando m�sica");		
	}
	default void moverMusica() {
		System.out.println("Movendo arquivo de m�sica");
	}
	default void salvarMusica() {
		System.out.println("Salvando m�sica");
	}
	
	// Metodos video:
	default void reproduzirVideos() {
		System.out.println("Reproduzindo v�deo");
	}
	default void criarAlbumVideo() {
		System.out.println("Criando �lbum de v�deo");
	}
	default void deletarVideo() {
		System.out.println("Deletando v�deo");
	}
	default void moverVideo() {
		System.out.println("Movendo v�deo");
	}
	default void salvarVideo() {
		System.out.println("Salvando v�deo");
	}

}
