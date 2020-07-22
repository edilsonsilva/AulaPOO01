package projeto.exemplo.classes;

//vamos importar uma biblioteca do java para criar arquivos
//chamada FileWriter
import java.io.FileWriter;


public class Arquivo {
	public String nome;
	public String caminho;
	public String conteudo;
	
	
	public void criar() {
		if(executar()) {
			System.out.println("Arquivo criado");
		}
		else {
			System.out.println("Não foi possível criar o arquivo");
		}
	}
	
	private boolean executar() {
		boolean criado = true;
		//estamos declarando o objeto fw para 
		//criar o nosso arquivo, porém neste momento
		//ele será nulo.
		FileWriter fw = null;
		//tentativa de execução do código
		try {
			fw = new FileWriter(caminho+nome);
			fw.append(conteudo);
			fw.close();
		}
		//tratamento de erro caso ele ocorra
		catch(Exception erro) {
			erro.printStackTrace();//Mostra a pilha de erros
			criado=false;
		}
		return criado;
	}
}
