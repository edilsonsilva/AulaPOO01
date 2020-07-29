package projeto.exemplo.heranca;


/*
 * A classe ContaBancaria n�o poder� ser instanciada,ou seja,
 * ela n�o poder� ser materializada, por ser generica de mais.
 * por isso iremos torn�-la abstrata
 * 
 */
public abstract class ContaBancaria {
	//vamos usar o modificador protected, pois estes atributos
	//ser�o compartilhados com as classes filhas
	
	protected int nBanco;
	protected int nAgencia;
	protected int nConta;
	protected String titular;
	protected double saldo;
	public int getnBanco() {
		return nBanco;
	}
	public void setnBanco(int nBanco) {
		this.nBanco = nBanco;
	}
	public int getnAgencia() {
		return nAgencia;
	}
	public void setnAgencia(int nAgencia) {
		this.nAgencia = nAgencia;
	}
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
