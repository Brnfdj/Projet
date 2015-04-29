package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Main {
    /* TODO JAVADOC. */
    public static void main(String[] args) {
        Player Yohann = new Player("Yohann");
        Game game = new Game(Yohann, "TRUC");
        game.start();
    }
}
