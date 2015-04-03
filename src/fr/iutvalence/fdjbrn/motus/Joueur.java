package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Joueur {
    /* TODO JAVADOC. */
    private final String nom;
    /* TODO JAVADOC. */
    private int score;

    /**
     * Construction d'un joueur par son nom.
     *
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
        return String.format("(%s,%d)", this.nom, this.score);
    }
}
