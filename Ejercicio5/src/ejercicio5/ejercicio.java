package ejercicio5;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float peseta;
		float euro = (float) 0.00601;
		System.out.println("Ingresa la cantidad de Peseta : ");
		peseta = teclado.nextFloat();
		float conversion = peseta * euro;
		System.out.println("El valor en Euro es: ");
		System.out.print(conversion);
		teclado.close();

	}

}
