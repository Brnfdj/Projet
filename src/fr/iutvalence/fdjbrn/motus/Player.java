package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Player {
    /* TODO JAVADOC. */
    private final String name;
    /* TODO JAVADOC. */
    private       int    score;

    /**
     * player's creation with his name.
     *
     * @param name name's player
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /** Method which allow getting player's name. */
    public String getName() {
        return this.name;
    }

    /** Method which allow getting player's score. */
    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return String.format("(%s,%d)", this.name, this.score);
    }
}
