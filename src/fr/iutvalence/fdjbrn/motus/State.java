package fr.iutvalence.fdjbrn.motus;

/**
 * State class
 * @author breynaty
 *
 */
public enum State {
    /**
     * well positioned character
     */
    RED("RED"),
    
    /**
     * incorrectly positioned character
     */
    YELLOW("YEL"),
    
    /**
     * character not
     */
    WHITE("WHI"),
    
    /**
     * default state
     */
    NORMAL("SEC");
    
    /**
     * color is a state's attribute
     */
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
