package projeto.exemplo.classes;

public class Usuario {
	//Caracter�sticas da classe usuario
	//Atributos da classe usu�rio
	public String nomeUsuario;
	public String senha;
	public String nivel;
	
	//A��es que podem ser executadas pelo usuario
	//M�todo login para acessar o sistema
	public void login() {
		if(verificar()) {
			System.out.println("Voc� est� logado");
		}
		else {
			System.out.println("Usu�rio ou senha incorreto");
		}
	}
	
	//M�todo logout para sair do sistem
	public void logout() {
		System.out.println("Voc� saiu");
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
