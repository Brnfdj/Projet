package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Letter {
    /* TODO JAVADOC. */
    private char character;
    /* TODO JAVADOC. */
    private State state;

    /**
     * character's getter.
     *
     * @return character
     */
    public char getCharacter() {
        return this.character;
    }

    /**
     * state's getter
     *
     * @return state
     */
    public State getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.character, this.state);
    }
}
