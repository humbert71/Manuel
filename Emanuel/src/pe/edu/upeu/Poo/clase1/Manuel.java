package pe.edu.upeu.Poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Manuel {

	public static void main(String[] args) {

		Persona Emanuel = new Persona();
		Emanuel.nombres = "Emanuel Emanuel";
		Emanuel.apellpaterno = "Apaza Apza";
		Emanuel.apellmaterno = "Calla Mercado";
		Emanuel.altura = 1.72;
		Emanuel.celular = "948454595";
		Emanuel.direccion = "Jr. Gonzales Prada 674";
		Emanuel.dni = "41758745";
		Emanuel.email = "emanuelhumberto.07@gmail.com";
		Emanuel.estadocivil = "soltero";
		Emanuel.religion = "Adventista";
		Emanuel.sexo = "Masculino";
		Emanuel.tipodesangre = "A +";
		Emanuel.vivo = true;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Emanuel.fechadenacimiento = sdf.parse("03/06/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(Emanuel);

	}

}
