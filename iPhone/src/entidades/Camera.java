package entidades;

import servicos.GerenciandoDados;

public class Camera implements GerenciandoDados{
	
	public void tirarFoto() {
		System.out.println("Tirando foto");
	}

	@Override
	public void salvar() {
		System.out.println("Salvando foto");
	}

	@Override
	public void deletar() {
		System.out.println("Deletando foto");	
	}

	@Override
	public void moverArquivo() {
		System.out.println("Movendo foto");	
	}

	@Override
	public void criarPasta() {
		System.out.println("Criando Album foto");
	}

	@Override
	public void enviar() {
		System.out.println("Enviando foto");
		
	}

}
