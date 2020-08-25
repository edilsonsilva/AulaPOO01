package projeto.exemplo.sistema.classes;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CadLogin {
	private Connection con = null;
	private PreparedStatement pst = null;
	// O ResultSet guarda o resultado de um select
	private ResultSet rs = null;
	private ResultSet rslinhas = null;

	private String encriptografar(String senha) {
		String senhaAlterada="";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes(),0,senha.length());
			senhaAlterada = new BigInteger(1,md.digest()).toString(16);
			
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return senhaAlterada;
	}

	public String cadastrar(Usuarios usuarios) {
		String msg = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoexemplo?serverTimezone=UTC", "root",
					"");

			String consulta = "insert into usuario(nomeusuario,senha,nivelusuario)values(?,?,?)";

			pst = con.prepareStatement(consulta);

			pst.setString(1, usuarios.getNomeUsuario());
			pst.setString(2, encriptografar(usuarios.getSenha()));
			pst.setString(3, usuarios.getNivelUsuario());

			if (pst.executeUpdate() > 0) {
				msg = "Cadastro realizado com sucesso!";
			} else {
				msg = "Não foi possível cadastrar.";
			}
		} catch (Exception e) {
			msg = "Erro ao tentar cadastrar. " + e.getMessage();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return msg;
	}

	public boolean logar(Usuarios usuarios) {
		
		boolean retorno = true;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoexemplo?serverTimezone=UTC", "root",
					"");

			String consulta = "select * from usuario where nomeusuario=? and senha=?";

			pst = con.prepareStatement(consulta);

			pst.setString(1, usuarios.getNomeUsuario());
			pst.setString(2, encriptografar(usuarios.getSenha()));

			rs = pst.executeQuery();

			if (rs.next()) {
				retorno = true;
			} else {
				retorno = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	
	
	public Object[][] listar(){		
		Object[][] dados = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoexemplo?serverTimezone=UTC", "root",
					"");
			String consulta = "select * from produto";
			
			pst = con.prepareStatement(consulta);
			rs = pst.executeQuery();
			Object[][] resultado = new Object[4][5];
			int ls = 0;			
			while(rs.next()) {
				resultado[ls][0] = rs.getInt(1);
				resultado[ls][1] = rs.getString(2);
				resultado[ls][2] = rs.getString(3);
				resultado[ls][3] = rs.getInt(4);
				resultado[ls][4] = rs.getDouble(5);
				ls++;
			}
			dados = resultado;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dados;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}











