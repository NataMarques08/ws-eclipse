package testejava;

import java.util.Scanner;

public class TesteJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Digite 3 numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println("O maior numero e "+soma(x, y, z));
		sc.close();
	}
	public static int soma(int a, int b, int c) {
		int result = 0;
		if(a > b && a > c ) {
			result = a;
		}else if(b > c) {
			result = b;
		}else {
			result = c;
		}
			return  result;
	}

}
