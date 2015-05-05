package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

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
	private boolean lose = true;
	private String loseText = "You lose, the secret word was";

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
		String loseWord = secret;
	}

	public void start() {

		int line = 0;

		Scanner sc = new Scanner(System.in);

		while (lose && line < 6) {
			System.out.println(grid);
			System.out.println("Veuillez saisir un mot de 6 lettres :");
			String str = sc.nextLine();
			String guess = str;
			Letter[] answer = checkSecret(guess);
			grid.addLine(answer, line);
			line++;
		}

		System.out.println(loseText);
	}

	/**
	 * Method contains rules of motus, and give a color to a letter which
	 * depends of the location of it
	 * 
	 * @param guess
	 * @return
	 */
	private Letter[] checkSecret(String guess) {
		Letter[] tabGuess = stringToLetterArray(guess);
		for (int i = 0; i < tabGuess.length; i++) {
			if (tabGuess[i].getCharacter() == secret[i].getCharacter()) {
				tabGuess[i].setState(State.RED);
			} else {
				for (int j = 0; j < tabGuess.length; j++) {
					if (tabGuess[i].getCharacter() == secret[j].getCharacter()) {
						tabGuess[i].setState(State.YELLOW);
					}
				}

				if (tabGuess[i].getState() != State.YELLOW) {
					tabGuess[i].setState(State.WHITE);
				}

			}
		}

		return tabGuess;
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
