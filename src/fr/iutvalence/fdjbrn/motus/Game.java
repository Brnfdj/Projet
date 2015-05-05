package fr.iutvalence.fdjbrn.motus;

/**
 * Game class
 * 
 * @author breynaty
 *
 */
public class Game {
	Player player;
	Letter[] secret;
	Grid grid;

	/**
	 * Game's constructor
	 * 
	 * @param namep
	 * @param secret
	 */
	public Game(String playername, String secret) {
		player = new Player(playername);
		this.secret = stringToLetterArray(secret);
		grid = new Grid();
	}

	public void start() {
		int line = 0;
		while (true) {
			System.out.println(grid);
			// TODO Demander réponse
			String guess = "TECRAK";
			Letter[] answer = checkSecret(guess);
			grid.addLine(answer, line);
			line++;
		}
	}
	/**
	 * Method contains rules of motus, and give a color to a letter which depends of the location of it
	 * @param guess
	 * @return
	 */
	private Letter[] checkSecret(String guess) {
		Letter[] guessguess = stringToLetterArray(guess);
		for (int counter = 0; counter < guessguess.length; counter++) {
			if (guessguess[counter].getCharacter() == this.secret[counter]
					.getCharacter()) {
				guessguess[counter].setState(State.RED);
			}
			if (guessguess[counter].getCharacter() != this.secret[counter]
					.getCharacter()) {
				for (int seccounter = 0; seccounter < guessguess.length; seccounter++) {
					for (int thicounter = 0; thicounter < guessguess.length; thicounter++) {

						if (guessguess[seccounter].getCharacter() == this.secret[thicounter]
								.getCharacter()) {
							guessguess[counter].setState(State.YELLOW);

						}

						else {
							guessguess[counter].setState(State.WHITE);

						}
					}
				}
			}

		}
		return guessguess;
	}

	/**
	 * Method which allow to change a character type in a Letter type define in
	 * the program
	 * 
	 * @param stringChange
	 * @return
	 */
	private Letter[] stringToLetterArray(final String stringChange) {
		final Letter[] letters = new Letter[stringChange.length()];
		for (int counter = 0; counter < stringChange.length(); counter++) {
			letters[counter] = new Letter(stringChange.charAt(counter));
		}
		return letters;
	}
}
