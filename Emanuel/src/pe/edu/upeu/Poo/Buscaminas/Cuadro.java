package pe.edu.upeu.Poo.Buscaminas;


	import javax.swing.JButton;
	/**
	 *
	 * @author LUIS
	 */
	public class Cuadro extends JButton {
	    
	    private boolean mina;
	    
	    public Cuadro()
	    {
	        super();
	        double random = Math.random();
	        if (random>0.5) 
	            mina=true;
	        else
	            mina=false;
	    }
	    
	    public boolean estaMinado()
	    {
	        return mina;
	    }
	}


