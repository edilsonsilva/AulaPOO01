package projeto.exemplo.execucao;

import projeto.exemplo.classes.MyFile;

public class ExecutarMyFile {

	public static void main(String[] args) {

		MyFile mf = new MyFile("texto.txt", "C:\\dados\\");
		mf.conteudo="minhas informacoes";
		mf.criar();
	}

}
