package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public enum Etat {
    /* TODO JAVADOC. */
    ROUGE("Caractère bien placé"),
    /* TODO JAVADOC. */
    JAUNE("Caractère mal placé"),
    /* TODO JAVADOC. */
    BLANC("Caractère absent");
    /* TODO JAVADOC. */
    /* TODO final ?. */
    private String couleur;

    /**
     * Constructeur de Etat.
     *
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
