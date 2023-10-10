package modelos;

public interface Tocador {
	
	// Metodos musica
	default void reproduzirMusica() {
		System.out.println("Reproduzindo música");
	}
	default void criarAlbumMusica() {
		System.out.println("Criando álbum de música");
	}
	default void deletarMusica() {
		System.out.println("Deletando música");		
	}
	default void moverMusica() {
		System.out.println("Movendo arquivo de música");
	}
	default void salvarMusica() {
		System.out.println("Salvando música");
	}
	
	// Metodos video:
	default void reproduzirVideos() {
		System.out.println("Reproduzindo vídeo");
	}
	default void criarAlbumVideo() {
		System.out.println("Criando álbum de vídeo");
	}
	default void deletarVideo() {
		System.out.println("Deletando vídeo");
	}
	default void moverVideo() {
		System.out.println("Movendo vídeo");
	}
	default void salvarVideo() {
		System.out.println("Salvando vídeo");
	}

}
