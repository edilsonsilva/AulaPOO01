package projeto.exemplo.execucao;

import projeto.exemplo.heranca.Poupanca;
public class CriarContaPoupanca {

	
	
	public static void main(String[] args) {
		
		Poupanca pp = new Poupanca();
		pp.setnBanco(22);
		pp.setnAgencia(4527);
		pp.setnConta(48);
		pp.setTitular("João");
		pp.setSaldo(500);
		
		pp.verificarSaldo();
		pp.setRendimento(0.02);
		pp.calcularRendimento();
		pp.verificarSaldo();
		
		//pp.depositar(100);	
		//pp.sacar(300);
		pp.verificarSaldo();
	}

}
