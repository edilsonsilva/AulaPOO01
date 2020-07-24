package projeto.exemplo.sistema.classes;

public class Funcionario implements Acoes{

	public String nome;
	public String cargo;
	public Double salario;

	public Usuario usuario;

	@Override
	public void cadastro() {
		System.out.println("Dados cadastrados");
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Salario: "+this.salario);
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar(String nome) {
		// TODO Auto-generated method stub
		
	}

	
}
