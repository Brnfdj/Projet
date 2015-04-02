package fr.iutvalence.fdjbrn.motus;
public enum Etat {
	/**
	 * Enumeration des etats possibles : ROUGE JAUNE BLANC et variable couleur.
	 */
	ROUGE("Caract�re bien plac�"), JAUNE("Caract�re mal plac�"), BLANC(
			"Caract�re absent");

	private String couleur = "";

	/**
	 * Constructeur de Etat.
	 * @param couleur couleur caracterisant l'�tat
	 */
	private Etat(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return couleur;
	}
}
