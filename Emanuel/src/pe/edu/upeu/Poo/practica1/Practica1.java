package pe.edu.upeu.Poo.practica1;

import java.util.Scanner;

public class Practica1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		
		@SuppressWarnings("unused")
		double resultado = 0;
		System.out.println("ingrese el monto de la venta");
		double pro = scan.nextDouble();  
		 if (pro >= 0 && pro <= 1000){
			 
			System.out.println("su valor :"+pro+"no tiene bonificacion");
		 }else if (pro >= 1000 && pro <= 5000){
			 resultado= pro*3/100;
		 }else if (pro >= 5000 && pro <= 20000){
			 resultado=pro*3/100;
		 }else if (pro > 20000){
			 resultado=pro*3/100;
			 
			}

		System.out.println("su valor:"+pro+"tiene bonificacion");

	
	
	
	
	
	
	}
	
		
}		
		
