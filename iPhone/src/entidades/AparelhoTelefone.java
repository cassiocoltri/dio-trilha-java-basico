package entidades;

import modelos.Calendario;
import modelos.Email;
import modelos.Mensagem;
import modelos.NavegadorInternet;
import modelos.Tocador;

public class AparelhoTelefone implements NavegadorInternet, Email, Mensagem, Tocador, Calendario {

	private Camera camera = new Camera();
	private String modelo;

	public AparelhoTelefone(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void salvar() {
		System.out.println("Salvando arquivo");	
	}
	public void salvarFoto() {
		camera.salvar();
	}

	@Override
	public void deletar() {
		System.out.println("Deletando arquivo");
	}

	public void deletarFoto() {
		camera.deletar();
	}

	@Override
	public void moverArquivo() {
		System.out.println("Movendo arquivo");
	}
	public void moverFoto() {
		camera.moverArquivo();
	}

	@Override
	public void criarPasta() {
		System.out.println("Criando pasta");
	}
	public void criarAlbumFotos() {
		camera.salvar();
	}

	@Override
	public void enviar() {
		Mensagem.super.enviarMensagem();
	}
	public void enviarFoto() {
		camera.enviar();
	}

	public void tirarFoto() {
		camera.tirarFoto();;
	}
	
	// Funções Tocador Musica:
	public void reproduzirMusica() {
		Tocador.super.reproduzirMusica();
	}
	public void criarAlbumMusica() {
		Tocador.super.criarAlbumMusica();
	}
	public void deletarMusica() {
		Tocador.super.deletarMusica();
	}
	public void moverMusica() {
		Tocador.super.moverMusica();
	}
	public void salvarMusica() {
		Tocador.super.salvarMusica();
	}
	// Funções Tocador Video:
	public void reproduzirVideo() {
		Tocador.super.reproduzirVideos();
	}
	public void salvarVideo() {
		Tocador.super.salvarVideo();
	}
	public void moverVideo() {
		Tocador.super.moverVideo();
	}
	public void deletarVideo() {
		Tocador.super.deletarVideo();
	}
	public void criarAlbumVideo() {
		Tocador.super.criarAlbumVideo();
	}
	
	// Funções Calendário:
	public void executarCalendario() {
		Calendario.super.executarCalendario();
	}
	public void criarLembreteCalendario() {
		Calendario.super.criarLembreteCalendario();
	}
	public void deletarLembreteCalendario() {
		Calendario.super.deletarLembreteCalendario();
	}
	public void moverEventoCalendario() {
		Calendario.super.moverEventoCalendario();
	}
	public void editarLembreteCalendario() {
		Calendario.super.editarLembreteCalendario();
	}
	
}
