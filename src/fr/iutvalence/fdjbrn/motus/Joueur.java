package fr.iutvalence.fdjbrn.motus;
public class Joueur {

	/**
	 * nom et score du joueur.
	 */
	private final String nom;
	private int score;

	/**
	 * Constructeur de joueur.
	 * @param nom nom du joueur
	 */
	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
	}

	/**
	 * Methode permettant d'obtenir le nom du joueur.
	 * 
	 * @return nom du joueur
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Methode permettant d'obtenir le score du joueur.
	 * 
	 * @return score du joueur
	 */

	public int getScore() {
		return this.score;
	}
	
	@Override
	public String toString() {
		return "(" + this.nom + "," + this.score + ")";
	}

}
