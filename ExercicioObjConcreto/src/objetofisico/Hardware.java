package objetofisico;

public class Hardware {
	
	//atributos
	boolean monitor;
	String mouse;
	String teclado;
	int memoriaRam;
	int hd;
	float energia;
	boolean power;
	
	
	//--Métodos
	
	void status() {
		System.out.println("Meu mouse eh "+this.mouse);
		System.out.println("Meu teclado eh "+this.teclado);
		System.out.println("Tem "+this.memoriaRam+"GB de RAM");
		System.out.println("E "+this.hd+" de HD");
		System.out.println("Energia dele "+this.energia+"V");
		ligado_desligado();
		display();
	}
	
	void ligado_desligado() {
		if(this.power==true) {
			System.out.println("PC ta ligado");
		}else {
			System.out.println("Meu computador esta desligado, nao posso usar");
		}
	}
	
	void display() {
		if(this.monitor==true) {
			System.out.println("Monitor tambem, Posso usar tranquilo");
		}else {
			System.out.println("Monitor desligado, preciso ligar para usar o PC tranquilo!");
		}
	}
	
	
}
