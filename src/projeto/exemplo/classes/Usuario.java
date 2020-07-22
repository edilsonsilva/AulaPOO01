package projeto.exemplo.classes;

public class Usuario {
	//Características da classe usuario
	//Atributos da classe usuário
	public String nomeUsuario;
	public String senha;
	public String nivel;
	
	//Ações que podem ser executadas pelo usuario
	//Método login para acessar o sistema
	public void login() {
		if(verificar()) {
			System.out.println("Você está logado");
		}
		else {
			System.out.println("Usuário ou senha incorreto");
		}
	}
	
	//Método logout para sair do sistem
	public void logout() {
		System.out.println("Você saiu");
	}
	
	private boolean verificar() {
		if(nomeUsuario=="admin" && senha=="123") {
			return true;
		}
		else {
			return false;
		}
	}
}
