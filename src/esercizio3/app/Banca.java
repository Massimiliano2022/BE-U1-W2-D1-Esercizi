package esercizio3.app;

import esercizio3.app.entities.ContoCorrente;
import esercizio3.app.entities.ContoOnLine;
import esercizio3.app.exceptions.BancaException;

public class Banca {
	public static void main(String args[]) {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 2000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(1750.5);
			conto1.preleva(1750.5);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e.toString());
			e.printStackTrace();
		}

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(2000);

			conto2.stampaSaldo();

		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e.toString());
			e.printStackTrace();
		}
	}
}