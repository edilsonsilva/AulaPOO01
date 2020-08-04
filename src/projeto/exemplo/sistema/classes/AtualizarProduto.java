package projeto.exemplo.sistema.classes;

//importar as classe de conex�o e manipula��o de banco de dados
import java.sql.Connection;//Conex�o com o banco de dados
import java.sql.DriverManager;
import java.sql.PreparedStatement;//Manipula��o de comandos SQL

public class AtualizarProduto {

	//Declara��o dos objetos para manipula��o do banco de dados
	private Connection con = null;
	private PreparedStatement pst=null;
	
	public String atualizar(Produtos produto) {
		String msg = "";
		
		try {
			//Carregar o drive de comuni��o com o banco de dados
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			//Grenciador do Driver com a passagem de servidor, usuario e senha
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoexemplo?serverTimezone=UTC", "root", "");
			
			//Consulta para atulizar os produtos
			String query = "update produto set nome=?,descricao=?,quantidade=?,preco=? where id=?";
			
			//preparar a consulta para ser executada
			pst = con.prepareStatement(query);
			
			//passagem dos parametros para a consulta
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getDescricao());
			pst.setInt(3, produto.getQuantidade());
			pst.setDouble(4, produto.getPreco());
			pst.setInt(5, produto.getId());
			
			
			//Vamos executar a consulta no banco de dados
			if(pst.executeUpdate()>0) {
				msg = "O produto foi atualizado com sucesso!";
			}
			else
			{
				msg = "O produto n�o foi atualizado";
			}
				
		}
		
		catch(Exception e) {
			msg = "Erro ao tentar atualizar os produtos. "+e.getMessage();
		}
		
		finally {
			try {con.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		return msg;
		
	}
}
