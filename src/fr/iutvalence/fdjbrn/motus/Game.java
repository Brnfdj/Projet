package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

/**
 * Game class.
 *
 * @author breynaty
 * @version 18052015
 */
public class Game {
	/**
	 * Game's attribute from player class.
	 */
	private final Player player;
	/**
	 * Game's attribute tab which contain the secret word.
	 */
	private Letter[] secret;
	/**
	 * Game's attribute game's grid.
	 */
	private final Grid grid;
	/**
	 * Attribute which contain the secret word in aim at at reveals if the user
	 * lose.
	 */
	private final String loseWord;
	/**
	 * Attribute which allow to set a score.
	 */
	private static final int SCORE_MULTIPLICATOR = 21;

	/** Game's constructor. */
	public Game(String playername, String sec) throws WrongSizeWordException {
		player = new Player(playername);
		secret = null;
		try {
			secret = stringToLetterArray(sec);
		} catch (WrongSizeWordException exc) {
			System.out.println("The secret word has to contain 6 letters");
		}
		grid = new Grid();
		loseWord = sec;
	}

	/**
	 * Method which allow to change a character type in a Letter type define in
	 * the program
	 * 
	 * @throws WrongSizeWordException
	 */
	private static Letter[] stringToLetterArray(final String stringChange)
			throws WrongSizeWordException {
		if (stringChange.length() != 6) {
			throw new WrongSizeWordException();
		} else {
			final Letter[] letters = new Letter[stringChange.length()];
			for (int counter = 0; counter < stringChange.length(); counter++) {
				letters[counter] = new Letter(stringChange.charAt(counter));
			}
			return letters;
		}
	}

	/**
	 * Method with the game's functionning.
	 * 
	 * @throws WrongSizeWordException
	 */
	public void start() throws WrongSizeWordException {
		Scanner sc = new Scanner(System.in);

		int line = 0;
		boolean lose = true;

		while (lose && (line < 6)) {
			System.out.println(grid);
			System.out.println("Please, enter a 6 letters word :");
			String guess = sc.nextLine();
			Letter[] answer = null;
			try {
				answer = checkSecret(guess);
			} catch (WrongSizeWordException exc) {
				System.out.println("The word has to contain 6 letters");
				this.player.setScore(100);
			}

			try {
				grid.addLine(answer, line++);
			} catch (NullPointerException exc) {
			}
			lose = !guess.equals(loseWord);
		}
		if (lose) {
			System.out.printf("You LOSE, the secret word was \"%s\"%n",
					loseWord);
		} else {
			final int coeff = line;
			System.out.println("Congratulations, you WON!");
			if (coeff != 1) {
				this.player.setScore(coeff * SCORE_MULTIPLICATOR);
			}
			System.out.println("Your score : " + this.player.getScore());
		}

		sc.close();
	}

	/**
	 * Method contains rules of motus, and give a color to a letter which
	 * depends of the location of it.
	 *
	 * @param guess
	 * 
	 * @return Letter[]
	 * @throws WrongSizeWordException
	 */
	private Letter[] checkSecret(String guess) throws WrongSizeWordException {
		if (guess.length() != 6) {
			throw new WrongSizeWordException();
		} else {
			Letter[] tabGuess = stringToLetterArray(guess);
			for (int i = 0; i < tabGuess.length; i++) {
				Letter letter = tabGuess[i];
				char current = letter.getCharacter();

				if (current == secret[i].getCharacter()) {
					letter.setState(State.RED);
					continue;
				}

				for (int j = 0; j < tabGuess.length; j++) {
					if (current == secret[j].getCharacter()) {
						letter.setState(State.YELLOW);
						break;
					}
				}

				if (letter.getState() != State.YELLOW) {
					letter.setState(State.WHITE);
				}
			}

			return tabGuess;
		}
	}
}
