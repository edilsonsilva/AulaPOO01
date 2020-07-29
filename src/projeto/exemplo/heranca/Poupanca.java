package projeto.exemplo.heranca;

public class Poupanca extends ContaBancaria implements Operacoes{
	
	private double rendimento;
	
	
	public double getRendimento() {
		return rendimento;
	}


	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}


	public void calcularRendimento() {
		super.saldo = saldo*(1+rendimento);	
	}


	
	
	@Override
	public String sacar(double valor) {
		String msg = "";
		if(valor>super.saldo) {
			msg = "Saldo insuficiente";
		}
		else
		{
			super.saldo -= valor;
			msg = "Seu saldo atual é "+super.saldo;
		}	
		return msg;
	}
	
	
	
	
	@Override
	public String depositar(double valor) {
		
		String msg = "";
		super.saldo+=valor;
		msg = "Você depositou: "+valor+"\nSeu saldo atual é "+super.saldo;
		return msg;
	}
	
	
	@Override
	public String verificarSaldo() {
		return "Seu saldo atual é "+super.saldo;
	}

}
