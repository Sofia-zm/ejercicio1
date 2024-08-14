package ejercicio4;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float euro;
		float peseta =(float) 166.386;
		System.out.println("Ingresa la cantidad de Euros : ");
		euro = teclado.nextFloat();
		float conversion = euro * peseta;
		System.out.println("El valor en Pesetas es: ");
		System.out.print(conversion);
		teclado.close();

	}

}
