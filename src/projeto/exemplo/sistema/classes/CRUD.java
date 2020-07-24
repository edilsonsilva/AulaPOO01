package projeto.exemplo.sistema.classes;

public class CRUD implements Metodos{

	@Override
	public void cadastro() {
		// TODO Auto-generated method stub
		
	}

	public void cadastro(Fornecedor fornecedor) {
		System.out.println("Id: "+fornecedor.getId());
		System.out.println("Razão Social: "+fornecedor.getRazaoSocial());
		System.out.println("CNPJ: "+fornecedor.getCnpj());
	}
	
	public void cadastro(Produto produto) {
		System.out.println("Id: "+produto.getId());
		System.out.println("Nome:"+produto.getNome());
		System.out.println("Preco:"+produto.getPreco());
	}
	
	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}
