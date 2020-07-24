package projeto.exemplo.classes;

public class Aluno {

	private String nome;
	private int idade;
	private String email;
	
	/*
	 * O método construtor é utilizado para iniciar uma classe
	 * e pode receber parâmetros para a sua inicialização.
	 * Caso ele não tenha parâmetro irá iniciar a classe 
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
