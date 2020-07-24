package projeto.exemplo.execucao;

import projeto.exemplo.sistema.classes.Funcionario;

public class CadFuncionario {

	public static void main(String[] args) {

		Funcionario fn = new Funcionario();
		fn.nome = "Paula";
		fn.cargo = "Vendas";
		fn.salario = 3250.96;
		fn.usuario.nomeUsuario = "paula.vendas";
		fn.usuario.senha= "123";
		fn.usuario.nivel="funcionario";

	}

}
