package projeto.exemplo.classes;

public class Aluno {

	private String nome;
	private int idade;
	private String email;
	
	/*
	 * O m�todo construtor � utilizado para iniciar uma classe
	 * e pode receber par�metros para a sua inicializa��o.
	 * Caso ele n�o tenha par�metro ir� iniciar a classe 
	 * com os parenteses vazios
	 */
	public Aluno(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	public void cadastro() {
		System.out.println("Nome:"+nome);
		System.out.println("Idade:" +idade);
		System.out.println("E-Mail:"+email);
	}
}
