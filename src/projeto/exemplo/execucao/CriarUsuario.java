package projeto.exemplo.execucao;

import projeto.exemplo.classes.Usuario;

public class CriarUsuario {

	public static void main(String[] args) {
		
		Usuario us = new Usuario();
		us.nomeUsuario="admin";
		us.senha="123";
		us.nivel = "Gerência";
		
		
		
		us.login();
		us.login();
		
	}

}
