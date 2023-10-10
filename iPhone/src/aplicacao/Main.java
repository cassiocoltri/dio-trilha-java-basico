package aplicacao;

import entidades.AparelhoTelefone;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------Teste---------");
		AparelhoTelefone aparelho = new AparelhoTelefone("Iphone");
		
		System.out.println("Fun��es Internet:");
		aparelho.acessarSite();
		aparelho.apagarHistorico();
		aparelho.favoritos();
		
		System.out.println("\n--[Fun��es e-mail:]--");
		aparelho.enviarEmail();
		aparelho.deletarEmail();
		aparelho.salvarEmail();
		aparelho.moverArquivoEmail();
		aparelho.criarPastaEmail();
		
		System.out.println("\n--[Fun��es Camera:]--");
		aparelho.tirarFoto();
		aparelho.salvarFoto();
		aparelho.deletarFoto();
		aparelho.moverArquivo();
		aparelho.enviarFoto();
		aparelho.criarAlbumFotos();
		
		System.out.println("\n--[Fun��es Mensagem]--");
		aparelho.enviarMensagem();
		aparelho.salvarMensagem();
		aparelho.deletarMensagem();
		aparelho.criarPastaMensagem();
		aparelho.moverArquivoMensagem();
		
		System.out.println("\n--[Fun��es Tocador Musica]--");
		aparelho.reproduzirMusica();
		aparelho.salvarMusica();
		aparelho.deletarMusica();
		aparelho.moverMusica();
		aparelho.criarAlbumMusica();
		
		System.out.println("\n--[Fun��es Tocador V�deo]--");
		aparelho.reproduzirVideo();
		aparelho.salvarVideo();
		aparelho.deletarVideo();
		aparelho.moverVideo();
		aparelho.criarAlbumVideo();
		
		System.out.println("\n--[Fun��es Calendario]--");
		aparelho.executarCalendario();
		aparelho.criarLembreteCalendario();
		aparelho.deletarLembreteCalendario();
		aparelho.editarLembreteCalendario();
		aparelho.moverEventoCalendario();
		
	}

}
