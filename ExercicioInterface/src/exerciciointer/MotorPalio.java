package exerciciointer;



public class MotorPalio implements Carro {
	private boolean contato;
	private int cambio;
	private boolean conducao;
	
	public boolean isContato() {
		return contato;
	}
	public void setContato(boolean contato) {
		this.contato = contato;
	}
	public int getCambio() {
		return cambio;
	}
	public void setCambio(int cambio) {
		this.cambio = cambio;
	}
	public boolean isConducao() {
		return conducao;
	}
	public void setConducao(boolean conducao) {
		this.conducao = conducao;
	}
	
	public void status() {
		System.out.println("Carro ta ligado? "+this.isContato());
		System.out.println("Qual marcha ta engatada? "+this.getCambio());
		System.out.println("Posso dirigir? "+this.isConducao());
	}
	
	@Override
	public void ligar() {
		if(this.isContato() == false) {
			this.setContato(true);
		}
		
	}
	@Override
	public void desligar() {
		if(this.isContato()) {
			this.setContato(false);
		}
	
	}
	@Override
	public int marcha() {
		if(this.isContato()) {
			this.setCambio(1);
		}else {
			System.out.println("O carro não vai andar porque esta desligado");
		}
		return this.getCambio();
	}
	@Override
	public void dirigir() {
		if(this.isContato() && this.getCambio()>0) {
			this.setConducao(true);
		}else {
			System.out.println("Erro!Nao posso dirigir, a marcha esta em ponto morto ou carro desligado");
		}
	}
	
	
	
}
