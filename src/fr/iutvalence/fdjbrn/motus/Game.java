package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

/**
 * Game class.
 *
 * @author breynaty
 * @version TODO
 */
public class Game {
    /* TODO JAVADOC. */
    private final Player player;
    /* TODO JAVADOC. */
    /* TODO private ? Final ? */ Letter[] secret;
    /* TODO JAVADOC. */
    /* TODO private ? Final ? */ Grid     grid;
    /* TODO JAVADOC. */
    /* TODO Final ? */
    private String loseWord;

    /** Game's constructor. */
    public Game(String playername, String sec) {
        player = new Player(playername);
        secret = stringToLetterArray(sec);
        grid = new Grid();
        loseWord = sec;
    }

    /**
     * Method which allow to change a character type in a Letter type define in
     * the program
     */
    private static Letter[] stringToLetterArray(final String stringChange) {
        final Letter[] letters = new Letter[stringChange.length()];
        for (int counter = 0; counter < stringChange.length(); counter++) {
            letters[counter] = new Letter(stringChange.charAt(counter));
        }
        return letters;
    }

    public void start() {
        // TODO Use try-with-resources
        Scanner sc = new Scanner(System.in);

        int line = 0;
        boolean lose = true;

        while (lose && (line < 6)) {
            System.out.println(grid);
            // TODO Translate.
            System.out.println("Veuillez saisir un mot de 6 lettres :");
            String guess = sc.nextLine();
            // TODO Make with Exception
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
            System.out.printf("You LOSE, the secret word was \"%s\"%n", loseWord);
        }
        else {
            System.out.println("Congratulations, you WON!");
        }

        sc.close();
    }

    /**
     * Method contains rules of motus, and give a color to a letter which depends of the location of it.
     *
     * @param guess TODO
     * @return TODO
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
}
