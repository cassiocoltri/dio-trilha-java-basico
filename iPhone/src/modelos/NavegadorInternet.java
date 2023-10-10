package modelos;

public interface NavegadorInternet {

	default void acessarSite() {
		System.out.println("Acessando site");
	}
	default void apagarHistorico() {
		System.out.println("Apagando histórico");
	}
	default void favoritos() {
		System.out.println("Favoritando site");
	}

}
