package aplicacao;

import entidades.AparelhoTelefone;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------Teste---------");
		
		AparelhoTelefone iPhone = new AparelhoTelefone("iPhone");
		
		iPhone.acessarSite();
		iPhone.apagarHistorico();

	}

}
