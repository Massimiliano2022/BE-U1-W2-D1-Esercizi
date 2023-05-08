package esercizio2.app;

import java.util.Scanner;

import esercizio2.app.entities.Auto;
import esercizio2.app.exceptions.LitersConsumedEqualsToZeroException;

public class Application {

	public static void main(String[] args) {

		int km;
		int lConsumati;

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Inserire il numero di Km percorsi:");

			km = scanner.nextInt();

			System.out.println("Inserire il numero di litri consumati:");

			lConsumati = scanner.nextInt();

			Auto auto1 = new Auto(km, lConsumati);

			System.out.println("Hai consumato " + auto1.calcolaConsumoKm() + " L al chilometro");

		} catch (LitersConsumedEqualsToZeroException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
