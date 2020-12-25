package objetofisico;

public class Computador {

	public static void main(String[] args) {
		
		Hardware pc = new Hardware();
		pc.energia = 110f;
		pc.hd = 500;
		pc.memoriaRam = 8;
		pc.mouse = "Exbom";
		pc.teclado = "Lite series";
		pc.monitor = true;
		pc.power = false;
		pc.status();
	}

}
