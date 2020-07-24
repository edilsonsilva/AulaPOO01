package projeto.exemplo.sistema.classes;

public class Produto {
	private int id;
	private String nome;
	private int quantidade;
	private double preco;
	private Fornecedor fornecedor;
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
}
