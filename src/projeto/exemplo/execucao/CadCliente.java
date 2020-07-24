package projeto.exemplo.execucao;


import projeto.exemplo.sistema.classes.Cliente;
public class CadCliente {

	public static void main(String[] args) {
		
		//Vamos realizar a instancia da classe cliente
		Cliente cli = new Cliente();
		
		cli.cadastro();
		
		cli.usuario.login();
		
		cli.usuario.alterarSenha();

	}

}
