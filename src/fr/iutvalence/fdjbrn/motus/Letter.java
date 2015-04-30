package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Letter {
    /* TODO JAVADOC. */
    private char  character;
    /* TODO JAVADOC. */
    private State state;

    /* TODO JAVADOC. */
    public Letter(char character) {
        this.character = character;
        this.state = State.NORMAL;
    }

    /** Character's getter. */
    public char getCharacter() {
        return this.character;
    }

    /** State's getter. */
    public State getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.character, this.state);
    }
}
