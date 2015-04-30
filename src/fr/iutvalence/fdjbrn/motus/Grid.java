package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Grid {
    /* TODO JAVADOC. */
    private static final int NB_COLUMN_DEFAULT = 6;
    /* TODO JAVADOC. */
    private static final int NB_LINE_DEFAULT   = 8;
    /* TODO JAVADOC. */
    private final Letter grid[][];

    /** Constructor of an empty grid. */
    public Grid() {
        grid = new Letter[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
    }

    /* TODO JAVADOC. */
    public void addLine(Letter[] letter, int line) {
        //TODO
    }

    /* TODO Implement with StringBuilder. */
    @Override
    public String toString() {
        // TODO StringBuilder
        String a = "";
        for (int line = 0; line < NB_LINE_DEFAULT; line++) {
            for (int column = 0; column < NB_COLUMN_DEFAULT; column++) {
                a += (grid[line][column] == null) ? "_" : grid[line][column];
            }
            a += "\n";
        }
        return a;
    }
}
