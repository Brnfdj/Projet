package fr.iutvalence.fdjbrn.motus;

import java.lang.reflect.Array;

/* TODO JAVADOC. */
public class Game {

	public Game(Player namep, String secret) {
		Player P1 = new Player("namep");
		
	}

	public void start() {
		// TODO Auto-generated method stub

	}
	
	public Letter[] stringToLetterArray(final String s) {
		final Letter[] letters = new Letter[s.length()];
		for (int i = 0; i < s.length(); i++) {
			letters[i] = new Letter(s.charAt(i));
		}
		return letters;
	}
}