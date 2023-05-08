package esercizio1.app;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int inputNumber;

		int[] listaNumeri = new int[5];

		Scanner scanner;

		do {
			System.out.println("Inserisci un numero nell'array:");

			scanner = new Scanner(System.in);

			inputNumber = scanner.nextInt();

			try {

				generaNumeriCasualiArray(listaNumeri);

				listaNumeri[0] = inputNumber;

				stampaNumeri(listaNumeri);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (inputNumber != 0);

		scanner.close();
	}

	public static void generaNumeriCasualiArray(int[] listaNumeri) {
		for (int i = 0; i < listaNumeri.length; i++) {

			int numeroCasuale = (int) (Math.floor(Math.random() * 10)) + 1;

			listaNumeri[i] = numeroCasuale;

		}

	}

	public static void stampaNumeri(int[] listaNumeri) {

		for (int i = 0; i < listaNumeri.length; i++) {

			System.out.println(listaNumeri[i]);

		}

	}

}
