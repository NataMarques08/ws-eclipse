package aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public  Caneta(String modelo, float ponta,String cor) {
		setModelo(modelo);
		setPonta(ponta);
		setCor(cor);
		this.destampar();	
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean getTampada() {
		return this.tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public void destampar() {
		setTampada(false);
	}
	public void tampar() {
		setTampada(true);
	}
	void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: "+getModelo());
		System.out.println("Ponta: "+getPonta());
		System.out.println("Cor: "+getCor());
		System.out.println("Tampada? "+getTampada());
	}
	
}
