package projeto.exemplo.heranca;

public class Corrente extends ContaBancaria implements Operacoes{
	private double limite;
	
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public void descontoTaxaAdm() {
		super.saldo = saldo-(saldo*0.02);
	}


	@Override
	public void sacar(double valor) {
		if(valor > super.saldo+limite) {
			System.out.println("Saldo insuficiente");
		}   
		else if(valor <= super.saldo) {
			super.saldo -= valor;
			System.out.println("O valor sacado � "+
					valor+"\nSeu saldo atual � "+
					super.saldo+"\nO seu limite � de "+limite);
		}
		else {
			limite -= valor - super.saldo;
			super.saldo = 0;
			System.out.println("O seu saldo � 0\nO valor do seu Limte � "+
						limite+" e voc� est� "+(1000-limite)+" no negativo");
	
		}
		
	}


	@Override
	public void depositar(double valor) {
		if(limite==1000) {
			super.saldo += valor;
		}
		else if(limite < 1000 && valor > 1000) {
			limite += (1000-limite);
			super.saldo+=1000-valor;									
		}
		else {
			limite+=valor;
		}
		
	}


	@Override
	public void verificarSaldo() {
		System.out.println("O saldo atual � "+super.saldo+"\nO Limite � "+limite);
		
	}
}
