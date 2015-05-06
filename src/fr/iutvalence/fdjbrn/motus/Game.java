package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

/**
 * Game class
 * 
 * @author breynaty
 *
 */
public class Game {
	private final Player player;
	Letter[] secret;
	Grid grid;
	private String loseWord;

	/**
	 * Game's constructor
	 * 
	 * @param namep
	 * @param sec
	 */
	public Game(String playername, String sec) {
		player = new Player(playername);
		secret = stringToLetterArray(sec);
		grid = new Grid();
		loseWord = sec;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);

		int line = 0;
		boolean lose = true;

		while (lose && line < 6) {
			System.out.println(grid);
			System.out.println("Veuillez saisir un mot de 6 lettres :");
			String guess = sc.nextLine();
			if (guess.length() != 6) {
				System.out.println("Erreur, le mot doit contenir 6 lettres");
				line++;
				continue;
			}
			Letter[] answer = checkSecret(guess);

			grid.addLine(answer, line++);
			lose = !guess.equals(loseWord);
		}
		if (lose) {
			System.out.printf("You lose, the secret word was \"%s\"%n",
					loseWord);
		} else {
			System.out.println("Congratulations, you WON !");
		}

		sc.close();
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

	/**
	 * Method which allow to change a character type in a Letter type define in
	 * the program
	 * 
	 * @param stringChange
	 * @return
	 */
	private static Letter[] stringToLetterArray(final String stringChange) {
		final Letter[] letters = new Letter[stringChange.length()];
		for (int counter = 0; counter < stringChange.length(); counter++) {
			letters[counter] = new Letter(stringChange.charAt(counter));
		}
		return letters;
	}
}
