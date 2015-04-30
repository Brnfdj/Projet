package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public enum State {
    /* TODO JAVADOC. */
    RED("well positioned character"),
    /* TODO JAVADOC. */
    YELLOW("incorrectly positioned character"),
    /* TODO JAVADOC. */
    WHITE("character not"),
    /* TODO JAVADOC. */
    NORMAL("secret character");
    /* TODO JAVADOC. */
    private final String color;

    /**
     * state's constructor.
     *
     * @param color state's color
     */
    State(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
