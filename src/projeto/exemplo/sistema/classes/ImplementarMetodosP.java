package projeto.exemplo.sistema.classes;

import java.io.FileWriter;

public class ImplementarMetodosP implements Metodos{

	@Override
	public void cadastro() {
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\banco\\produtos.csv");
			
			Produto pr = new Produto();
			pr.setId(51);
			pr.setNome(";Blusa;");
			pr.setQuantidade(5);
			pr.setPreco(55.80);
			pr.setFornecedor(new Fornecedor());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}
