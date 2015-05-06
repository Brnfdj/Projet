package fr.iutvalence.fdjbrn.motus;

/**
 * Grid class. TODO Better JAVADOC.
 *
 * @author breynaty
 * @version TODO
 */
public class Grid {
    /** Constant : default number of column. */
    private static final int NB_COLUMN_DEFAULT = 6;
    /** Constant : default number of line. */
    private static final int NB_LINE_DEFAULT = 8;
    /** New double entry table. */
    private final Letter grid[][];

    /** Constructor of an empty grid. */
    public Grid() {
        grid = new Letter[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
    }

    // TODO BETTER JAVADOC
    /** Method allow to add a line on the grid. */
    public void addLine(Letter[] letter, int line) {
        for (int counter = 0; counter < NB_COLUMN_DEFAULT; counter++) {
            grid[line][counter] = letter[counter];
        }
    }

    @Override
    public String toString() {
        // TODO StringBuilder
        String a = "";
        for (int line = 0; line < NB_LINE_DEFAULT; line++) {
            for (int column = 0; column < NB_COLUMN_DEFAULT; column++) {
                a += (grid[line][column] == null) ? "_" : grid[line][column].toString();
            }
            a += "\n";
        }
        return a;
    }
}
