package entidades;

import servicos.Email;
import servicos.NavegadorInternet;
import servicos.Telefone;
import servicos.Tocador;

public class AparelhoTelefone implements Email, NavegadorInternet, Telefone, Tocador{

	private String modelo;
	
	public AparelhoTelefone() {
	}
	
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
	public void apagarHistorico() {
		System.out.println("apagando histórico...");
	}

	@Override
	public void favoritos() {
		System.out.println("acessando favoritos");
	}

	@Override
	public void enviarEmail() {
		System.out.println("enviando email...");
	}

	@Override
	public void caixaEntrada() {
		System.out.println("acessando caixa de entrada");
	}

	@Override
	public void deletar() {
		System.out.println("deletando email");
	}

	@Override
	public void salvar() {
		System.out.println("salvando email");
	}

	@Override
	public void acessarSite() {
		System.out.println("acessando site...");
	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo música...");
		
	}

	@Override
	public void reproduzirVideos() {
		System.out.println("Reproduzindo vídeo...");
		
	}

}
