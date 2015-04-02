package fr.iutvalence.fdjbrn.motus;

public class Lettre {
	/**
	 * Definition des attributs de la classe : caractere et etat.
	 */
	private char caractere;
	private Etat etat;
	
	/**
	 * Getter de caractere.
	 * @return caractere
	 */
	public char getCaractere() {
		return this.caractere;
	}
	
	/**
	 * Getter de etat.
	 * @return etat 
	 */
	public Etat getEtat(){
		return this.etat;
	}
	
	public String toString() {
		return "|" + this.caractere + "," + this.etat + "|";
	}
}
