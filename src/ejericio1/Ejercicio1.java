package ejericio1;

import java.util.Scanner;

import colors.Colors;

public class Ejercicio1 {

	public void figura(int ancho, String color1, String color2) {
		int altura;
		int segundaMitad = 0;
		int primeraMitad = 0;
		for (altura = 0; altura < ancho; altura++) {

			for (primeraMitad = 0; primeraMitad < (ancho - altura); primeraMitad++) {
				System.out.printf(color1 + "  ");
			}
			for (segundaMitad = 0; segundaMitad < altura; segundaMitad++) {
				System.out.printf(color2 + "  ");
			}
			System.out.println();
		}
	}

	public void ejercicio1() {
		System.out.println("¿Cuantas veces quieres la figura?");
		Scanner keyboard = new Scanner(System.in);
		int veces = keyboard.nextInt();
		String color1 = Colors.BLACK_BACKGROUND;
		String color2 = Colors.BLUE_BACKGROUND;
		for (int i = 1; i <= 4; i++) {
			if (i == 0) {
				figura(10, color1, color2);
			} else {
				String almacen = color2;
				color2 = color1;
				color1 = almacen;
				figura(10, color1, color2);
			}
		}
	}
}
