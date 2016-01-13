package pe.edu.upeu.Poo.clase1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	String nombres;
	String apellpaterno;
	String apellmaterno;
	Double altura;
	String dni;
	String celular;
	Date fechadenacimiento;
    String email;
    String tipodesangre;
    String direccion;
    String religion;
    String sexo;
    String estadocivil;
    Boolean vivo;
	
    public int getEdad(){
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
		Date now = new Date();
		int anioActual = Integer.parseInt(sdf.format(now));
		int anioNacimiento = Integer.parseInt(sdf.format(fechadenacimiento));
		
		return anioActual - anioNacimiento;
    }

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellpaterno=" + apellpaterno + ", apellmaterno=" + apellmaterno
				+ ", altura=" + altura + ", dni=" + dni + ", celular=" + celular + ", fechadenacimiento="
				+ fechadenacimiento + ", email=" + email + ", tipodesangre=" + tipodesangre + ", direccion=" + direccion
				+ ", religion=" + religion + ", sexo=" + sexo + ", estadocivil=" + estadocivil + ", vivo=" + vivo + "]";
	}
    	
    }
    
   
	
	
	

