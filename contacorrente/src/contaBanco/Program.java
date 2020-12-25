package contaBanco;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cc = new Conta();
		// variavel auxiliar para operacoes de deposito e saque
		double value;
		
		
		System.out.print("Enter account number:");
		cc.setNumConta(sc.nextLine());
		System.out.print("Enter account holder:");
		cc.setTitular(sc.nextLine());
		System.out.print("Is there a initial deposit (y/n)?");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.print("Enter initial deposit value:");
			value = sc.nextDouble();
			cc.depositoConta(value);
			System.out.println(cc);
		}
		System.out.print("Enter a deposit value:");
		value = sc.nextDouble();
		cc.depositoConta(value);
		System.out.println(cc);
		System.out.print("Enter a withdraw value:");
		value = sc.nextDouble();
		cc.saque(value);
		System.out.println(cc);
		
		
		sc.close();
	}

}
