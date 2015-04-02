package fr.iutvalence.fdjbrn.motus;
public enum Etat {
	/**
	 * Enumeration des etats possibles : ROUGE JAUNE BLANC et variable couleur.
	 */
	ROUGE("Caractère bien placé"), JAUNE("Caractère mal placé"), BLANC(
			"Caractère absent");

	private String couleur = "";

	/**
	 * Constructeur de Etat.
	 * @param couleur couleur caracterisant l'état
	 */
	private Etat(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return couleur;
	}
}
