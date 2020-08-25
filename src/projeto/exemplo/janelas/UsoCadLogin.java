package projeto.exemplo.janelas;

import projeto.exemplo.sistema.classes.CadLogin;
import projeto.exemplo.sistema.classes.Usuarios;

public class UsoCadLogin {

	public static void main(String[] args) {
		
		CadLogin cl= new CadLogin();
		
		System.out.println("Quantidade de dados encontrados: "+cl.listar().length);

		for(int linha = 0; linha<=3;linha++) {
			for(int coluna=0;coluna<=4;coluna++){
				System.out.print(cl.listar()[linha][coluna]+"\t");
			}
			System.out.println("\n---------------------------------------");
		}
		

	}

}
