package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Grille {
    /* TODO JAVADOC. */
    private static final int NB_COLONNE_DEFAUT = 6;
    /* TODO JAVADOC. */
    private static final int NB_LIGNE_DEFAUT   = 8;
    /* TODO Visibilité ? Final ? */
    /* TODO JAVADOC. */ Lettre grille[][];

    /** Constructeur d'une grille vide. */
    public Grille() {
        grille = new Lettre[NB_LIGNE_DEFAUT][NB_COLONNE_DEFAUT];
    }

    /* TODO Cela viole la convention de toString !!! */
    @Override
    public String toString() {
        return null;
    }
}
