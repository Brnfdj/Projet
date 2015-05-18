package fr.iutvalence.fdjbrn.motus;

/**
 * Grid class. A grid is a double tab with a number of coulumn and line.
 *
 * @author breynaty
 * @version 18052015
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

	/** Method allow to add a line on the grid on each turn */
	public void addLine(Letter[] letter, int line) {
		System.arraycopy(letter, 0, grid[line], 0, NB_COLUMN_DEFAULT);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < NB_LINE_DEFAULT; line++) {
			for (int column = 0; column < NB_COLUMN_DEFAULT; column++) {
				builder.append((grid[line][column] == null) ? "     |" : grid[line][column]);
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}