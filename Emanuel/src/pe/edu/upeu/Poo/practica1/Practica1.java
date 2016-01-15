package pe.edu.upeu.Poo.practica1;

import java.util.Scanner;

public class Practica1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
		@SuppressWarnings("unused")
		double resultado = 0;
		System.out.println("Ingrese el monto");
		double mont = scan.nextDouble();  
		 if (mont >= 0 && mont <= 1000){
			 
			System.out.println("Su valor :"+mont+"No hay bonificacion");
		 }else if (mont >= 1000 && mont <= 5000){
			 resultado= mont*3/100;
		 }else if (mont >= 5000 && mont <= 20000){
			 resultado=mont*3/100;
		 }else if (mont > 20000){
			 resultado=mont*3/100;
			 
			}

		System.out.println("Su valor:"+mont+"Hay bonificacion");

	
	
	
	
	
	
	}
	
		
}		
		
