package projeto.exemplo.execucao;

import projeto.exemplo.heranca.Corrente;


public class CriarContaCorrente {
	public static void main(String[] args) {
		Corrente ct = new Corrente();
		
		ct.setnBanco(15);
		ct.setnAgencia(20);
		ct.setnConta(1204);
		ct.setTitular("Paula");
		ct.setSaldo(500);
		ct.setLimite(1000);
		
		ct.verificarSaldo();
		ct.sacar(900);
				
		
	}
}
