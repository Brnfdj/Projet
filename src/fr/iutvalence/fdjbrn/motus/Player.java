package fr.iutvalence.fdjbrn.motus;

/**
 * Player class
 * 
 * @author breynaty
 *
 */
public class Player {

	/**
	 * Constant for score's beginning
	 */
	private static final int BEGIN_SCORE = 1000;

	/**
	 * Player's attribute, his name
	 */
	private final String name;

	/**
	 * Player's attribute, his score
	 */
	private int score;

	/**
	 * player's creation with his name.
	 *
	 * @param name
	 *            name's player
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

	@Override
	public String toString() {
		return String.format("(%s,%d)", this.name, this.score);
	}
}
