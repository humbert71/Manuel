package pe.edu.upeu.Poo.practica1;

import java.util.Scanner;

public class Bonuspractica1 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entero");
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println((i * 2)-1);
				
		
		}

	}

}
