package projeto.exemplo.sistema.classes;

import java.io.FileWriter;

public class CadastroCliente implements EfetuarCadastro{

	@Override
	public void cadastrar(CadCliente cli) {

		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:\\banco\\clientes.csv");
			fw.append(
					cli.getNome()+";"+
					cli.getCPF()+";"+
					cli.getSexo()+";"+
					cli.getDataNascimento()+";"+
					cli.getTelefone()+";"+
					cli.getEmail()+";"+
					cli.getTipo()+";"+
					cli.getLogradouro()+";"+
					cli.getNumero()+";"+
					cli.getComplemento()+";"+
					cli.getBairro()+";"+
					cli.getCep()+";"+
					cli.getUsuario()+";"+
					cli.getSenha()						
			);
			fw.close();
		}
		catch(Exception e) {
			System.out.println("Erro ao gravar o arquivo "+e.getMessage());
		}
		
	}

}
