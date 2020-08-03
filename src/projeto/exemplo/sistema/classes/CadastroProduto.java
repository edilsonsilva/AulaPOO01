package projeto.exemplo.sistema.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CadastroProduto {

	//Vamos carregar as classes para 
	//acesso ao banco de dados
	
	//Classe chamada Connection para estabelecer
	//a conexao com banco
	
	//Classe para executar comandos de SQL
	//PrepareStatement
	
	private Connection conexao = null;
	private PreparedStatement pst = null;
	
	//Transitar com os dados de produtos
	//vamos usar a classe Produtos
		
	
	public String cadastro(Produtos produto) {
		String msg = "";
		
		try {
			//Carregar o drive de comunicacao
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			//Passagem de dados para estabelecer a conexao com o banco
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoexemplo?serverTimezone=UTC","root","");
			
			
			//vamos fazer a consulta para inserir no banco
			String query = "insert into produto(nome,descricao,quantidade,preco)values(?,?,?,?)";
			
			//vamos preparar a consulta para a execução
			pst = conexao.prepareStatement(query);
			
			//realizar a passagem dos parametros
			pst.setString(1, produto.getNome());
			pst.setString(2,produto.getDescricao());
			pst.setInt(3, produto.getQuantidade());
			pst.setDouble(4, produto.getPreco());
			
			//executar a consulta e receber um valor como resposta
			//se o valor for 1, ou seja, maior que zero. Então 
			//o produto foi cadastrado, senão ele não foi cadastrado
			if(pst.executeUpdate()>0) {
				msg="Produto cadatrado com sucesso!";
			}
			else {
				msg = "Não foi possível cadastrar o produto.";
			}
			
		}
		catch(Exception e) {
			msg = "Erro ao tentar cadastrar o produto "+e.getMessage();
			e.printStackTrace();
		}
		finally {
			try {
			conexao.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return msg;
		
	}
	
	
	
}
