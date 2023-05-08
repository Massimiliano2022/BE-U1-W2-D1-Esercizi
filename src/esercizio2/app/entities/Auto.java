package esercizio2.app.entities;

import esercizio2.app.exceptions.LitersConsumedEqualsToZeroException;

public class Auto {

	private int km;
	private int lConsumati;
	
	public Auto(int km, int lConsumati){
		setKm(km);
		setLConsumati(lConsumati);
	}
	
	public void setKm(int km){
		this.km=km;
	}
	
	public int getKm(){
		return km;
	}
	
	public void setLConsumati(int lConsumati){
		
		if(lConsumati==0) {
			throw new LitersConsumedEqualsToZeroException("Hai inserito un valore equivalente a 0 per i litri consumati. Inserire un valore > 0.");
		}else {
			this.lConsumati=lConsumati;
		}
	}
	
	public int getLConsumati(){
		return lConsumati;
	}
	
	public int calcolaConsumoKm(){
		return this.km/this.lConsumati;
	}
	
}
