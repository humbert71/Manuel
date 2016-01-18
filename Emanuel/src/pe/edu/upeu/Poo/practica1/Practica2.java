package pe.edu.upeu.Poo.practica1;

import java.util.Scanner;

        public class Practica2{

		public static void main(String[] args) {
			
			
		    Scanner scn = new Scanner(System.in);
			System.out.println("ingrese un valor: ");
			int h;
			h = scn.nextInt();
					
			if (h == 1)System.out.println(h+"La vocal es A");
			else if (h == 2)System.out.println(h+"La vocal es E");
			else if (h == 3)System.out.println(h+"La vocal es I");
			else if (h == 4)System.out.println(h+"La vocal es O");
			else if (h == 5)System.out.println(h+"La vocal es U");
			else System.out.println("El valor no coincide con el limite");
			
		}

	}


