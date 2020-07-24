package projeto.exemplo.execucao;

import projeto.exemplo.sistema.classes.CRUD;
import projeto.exemplo.sistema.classes.Fornecedor;

public class UsarCRUD {

	public static void main(String[] args) {
		Fornecedor f = new Fornecedor();
		f.setId(10);
		f.setRazaoSocial("Bebidas do Brasil");
		f.setCnpj("5656565656");
		
		CRUD crud = new CRUD();
		crud.cadastro(f);
		

	}

}
