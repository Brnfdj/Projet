package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Game {
    /* TODO JAVADOC. */
    public Game(Player namep, String secret) {
        // TODO Player is only a field?
        Player P1 = new Player("namep");
    }

    public void start() {
        // TODO Auto-generated method stub
    }

    /* TODO JAVADOC. */
    public Letter[] stringToLetterArray(final String s) {
        final Letter[] letters = new Letter[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
        }
        return letters;
    }
}
