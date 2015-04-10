package fr.iutvalence.fdjbrn.motus;

/* TODO JAVADOC. */
public class Grid {
	/* TODO JAVADOC. */
	private static final int NB_COLUMN_DEFAULT = 6;
	/* TODO JAVADOC. */
	private static final int NB_LINE_DEFAULT = 8;
	/* TODO JAVADOC. */
	private final Letter grid[][];

	/** Constructeur d'une grille vide. */
	public Grid() {
		grid = new Letter[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
	}

	public void addCharacterToGrid(Letter letter, int line, int column) {
		grid[line][column] = letter;

	}

	@Override
	public String toString() {
		String a = "";
		for (int line = 0; line < NB_LINE_DEFAULT; line++) {
			for (int column = 0; column < NB_COLUMN_DEFAULT; column++) {
				if (grid[line][column] == null) {
					a += "_";
				} else
					a += grid[line][column];
			}
			a += "\n";
		}
		return a;
	}
}