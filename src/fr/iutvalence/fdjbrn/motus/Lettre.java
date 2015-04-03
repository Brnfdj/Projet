package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Lettre {
    /* TODO JAVADOC. */
    private char caractere;
    /* TODO JAVADOC. */
    private Etat etat;

    /* TODO EVITER LE FRANGLAIS !!! */
    /**
     * Getter de caractere.
     *
     * @return caractere
     */
    public char getCaractere() {
        return this.caractere;
    }

    /**
     * Getter de etat.
     *
     * @return etat
     */
    public Etat getEtat() {
        return this.etat;
    }

    @Override
    public String toString() {
        return String.format("|%s,%s|", this.caractere, this.etat);
    }
}
