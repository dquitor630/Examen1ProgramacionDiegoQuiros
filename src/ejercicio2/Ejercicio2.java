package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public int siguiente(int n) {
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}

		return suma;
	}

	public void ejercicio2() {
		System.out.println("Inserta un número");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		do {
			System.out.print(num + ", ");
			num = siguiente(num);
		} while (num != 0);
		System.out.print(0);
	}
}
