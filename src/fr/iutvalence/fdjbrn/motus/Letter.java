package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Letter {
    /* TODO JAVADOC. */
    private char  character;
    /* TODO JAVADOC. */
    private State state;

    /** character's getter. */
    public char getCharacter() {
        return this.character;
    }

    /** state's getter. */
    public State getState() {
        return this.state;
    }

    public Letter(char character) {
		this.character = character;
		this.state = State.NORMAL;
	}

	@Override
    public String toString() {
        return String.format("%s,%s", this.character, this.state);
    }
}
