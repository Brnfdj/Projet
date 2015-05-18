package fr.iutvalence.fdjbrn.motus;

import java.util.Scanner;

/**
 * Main class. TODO Better JAVADOC.
 *
 * @author breynaty
 * @version 18052015
 */
public class Main {
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Choose a nickname");
    	String nickname = sc.nextLine();
    	System.out.println("Please, chose a 6 letters secret");
    	String secret = sc.nextLine();
    	
        
        
        try {
        	Game game = new Game(nickname,secret);
			game.start();
		} catch (WrongSizeWordException exception) {
		}
        sc.close();
    }
    	
}


