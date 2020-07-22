package projeto.exemplo.execucao;

import projeto.exemplo.classes.Arquivo;
public class Texto {

	public static void main(String[] args) {
		
		Arquivo ar = new Arquivo();
		ar.caminho="c:\\banco\\";
		ar.nome="planilha.csv";
		ar.conteudo = "Código;Produto;Preço";
		ar.criar();

	}

}
