package pe.edu.upeu.Poo.clase2;

public class Repaso {

	public static void main(String[] args) {
	
		Repaso r = new Repaso();
		
		double a =25;
		double b =144;
		
		/**
		 * Suma +  
		 * Resta *
		 * Multiplicacion *
		 * Division /
		 * Modulo %
		 * 
		 */
		 

		//Esta instruccion me sirve para imprimir el la consola
		System.out.println("La suma es: "+r.sumar(a+b));
		
	
        System.out.println("Operaciones Logicas");
	
	    /**
	     * And &&
	     * Or ||
	     * Negacion !
	     */
	    
	    System.out.println(true || false);
	    
	 }


	 public int sumar(int sum1, int sum2){
         
		 return sum1 +sum2;


     }

	 public double calcIGV(double monto){
	     double igv = 18;
		 
		 return monto * igv / 100;
		 
		 
		 
		 
	 }




}