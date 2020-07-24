package projeto.exemplo.classes;

public class MyFile {

	private String nome;
	private String caminho;
	public String conteudo;
	
		
	
	public MyFile(String nome,String caminho) {
		this.nome = nome;
		this.caminho = caminho;
	}
	public MyFile(String nome, String caminho, String conteudo) {
		this.nome = nome;
		this.caminho = caminho;
		this.conteudo = conteudo;
	}
	public void criar() {
		
	}
	
	
}
