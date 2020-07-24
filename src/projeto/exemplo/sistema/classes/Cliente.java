package projeto.exemplo.sistema.classes;

public class Cliente implements Acoes{
	//Atributos da classe cliente
	public String nome;
	public String cpf;
	public String sexo;
	public Usuario usuario;
	
	@Override
	public void cadastro() {

		System.out.println("Você cadastrou os seguintes dados:");
		System.out.println("Nome "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Sexo: "+this.sexo);
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
