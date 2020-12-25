package aula02;

public class Caneta {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		 System.out.println("Modelo "+this.modelo);
		 System.out.println("Uma caneta "+this.cor);
		 System.out.println("Ponta "+this.ponta);
		 System.out.println("Carga "+this.carga+"%");
		 System.out.println("Esta tampada? "+this.tampada);
		 rabiscar();
	 }
	 
	 void rabiscar() {
		if(this.tampada==true) {
			System.out.println("Erro");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	protected void tampar() {
		 this.tampada = true;
	}
	
	protected void destampar() {
		 this.tampada = false;
	 }
}
