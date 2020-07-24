package projeto.exemplo.sistema.classes;

import java.io.FileWriter;

public class ImplementarMetodos implements Metodos {

	@Override
	public void cadastro() {
		FileWriter fw;
		try {
			fw = new FileWriter("c:\\banco\\fornecedor.csv");
			Fornecedor f = new Fornecedor();
			
			f.setId(10);
			f.setCnpj(";45455454545;");
			f.setRazaoSocial("Novos LDTA");
			
			
			
			fw.append(String.valueOf(f.getId()));
			fw.append(f.getCnpj());
			fw.append(f.getRazaoSocial());
			
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}
