package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

/**
 * Main class. TODO Better JAVADOC.
 *
 * @author breynaty
 * @version TODO
 */
public class Main {
    /* TODO JAVADOC. */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Choose a nickname");
    	String nickname = sc.nextLine();
    	System.out.println("Please, chose a 6 letters secret");
    	String secret = sc.nextLine();
    	
        Game game = new Game(nickname,secret);
        
        try {
			game.start();
		} catch (WrongSizeWordException exception) {
		}
        sc.close();
    }
    	
}


