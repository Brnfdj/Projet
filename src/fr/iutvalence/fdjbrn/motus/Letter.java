package fr.iutvalence.fdjbrn.motus;

/**
 * Letter class
 * @author breynaty
 *
 */
public class Letter {
    /**
     * A letter is defined with a character
     */
    private char  character;
    /**
     * A letter is defined with a state
     */
    private State state;

    /**
     * Letter's constructor
     * @param character
     */
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

    /* TODO */
    public void setState(State state) {
    	this.state = state;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s", this.character, this.state);
    }
}
