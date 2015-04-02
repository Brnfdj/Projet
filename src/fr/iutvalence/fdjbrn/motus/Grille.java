package fr.iutvalence.fdjbrn.motus;

public class Grille {
	/**
	 * Definition constante nombre de colonnes et lignes et definition du
	 * tableau à double entree de type Lettre.
	 */
	private final static int NB_COLONNE_DEFAUT = 6;
	private final static int NB_LIGNE_DEFAUT = 8;
	Lettre grille[][];

	/**
	 * Constructeur de grille[][].
	 */
	public Grille() {
		super();
		grille = new Lettre[NB_LIGNE_DEFAUT][NB_COLONNE_DEFAUT];
	}

	public String toString() {

		return null;
	}

}
