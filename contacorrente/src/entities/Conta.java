package entities;



public class Conta {
	private String numConta;
	protected String titular;
	private double deposito;
	private double saldo;
	
	
	
	
	//-- Métodos especiais
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	// -- Métodos da classe
	public double depositoConta(double value) {
		if(value == 0.0f) {
			System.out.println("Valor invalido para deposito!");
		}
		setDeposito(value);
		this.saldo += this.deposito;
		return getDeposito();
	}

	public double saldoConta() {
		return getSaldo();
	}
	
	public double saque(double value) {
		return this.saldo -= value;
	}

	public String toString() {
		return "%nUpdated account data:%n"
				+"Account "
				+getNumConta()
				+", Holder: "
				+getTitular()
				+", Balance: "+
				saldoConta();
	}
	
}
