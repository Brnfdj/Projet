package fr.iutvalence.fdjbrn.motus;

/**
 * Player class. TODO BETTER JAVADOC
 *
 * @author breynaty
 * @version 18052015
 */
public class Player {
    /** Constant for score's beginning. */
    private static final int BEGIN_SCORE = 1000;
    /** Player's attribute, his name. */
    private final String name;
    /** Player's attribute, his score. */
    private int score;

    /**
     * player's creation with his name.
     *
     * @param name name's player
     */
    public Player(String name) {
        this.name = name;
        this.score = BEGIN_SCORE;
    }

    /** Method which allow getting player's name. */
    public String getName() {
        return this.name;
    }

    /** Method which allow getting player's score. */
    public int getScore() {
        return this.score;
    }
    
    /**
     * Method allows seting the player's score by decreasing.
     * @param surcharge
     */
    public void setScore(int surcharge){
    	this.score = this.score - surcharge;
    }

    @Override
    public String toString() {
        return String.format("(%s,%d)", this.name, this.score);
    }
}
