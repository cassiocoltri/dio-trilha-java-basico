package excecoes;

public class ParametrosInvalidosException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public void menssagem() {
		System.out.println("O segundo par�metro deve ser maior que o primeiro!!");
	}

}
