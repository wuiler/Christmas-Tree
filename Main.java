
/*
* A Christmas Tree Draw!

 * @author      José Wuiler Pozzi <wuiler@gmail.com>
 * @version     1.0
*/
class Main {

	// the star like me ;-)
	private static String shineStar = "*";
	// the leafs of the tree
	private static String leafs = "1";
	// the root od the tree
	private static String root = "0";
	// grass
	private static String grass = "/\\";

	public static void main(String[] args) {
		// gretting messages !!! to the PODs
		Print.coloursOut(ConsoleColors.RED_BACKGROUND, "Felices Fiestas", true);
		Print.coloursOut(ConsoleColors.GREEN_BACKGROUND, "¡TEAM GLOBANT!", true);
		// give some space
		System.out.println(" ");

		int c = 0;
		/*
		 * First of all, we are going to draw the shine Star * we use the first "for"
		 * for the row and the second one to draw the spaces.
		 */
		for (int i = 0; i < 1; i++)
			for (int j = 0; j < 10 - i; j++) {
				// making some spaces...
				System.out.print(" ");
			}
		// then we print out the Star
		Print.coloursLine(ConsoleColors.YELLOW_BACKGROUND_BRIGHT, shineStar, true);

		// give a break ;-)
		System.out.println();

		/*
		 * Second we draw the each leaf of the tree. We use the first for the row and
		 * the second one to draw the spaces. That a big tree, 10 rows of leaf.
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++)
				// spaces...
				System.out.print(" ");
			for (c = 0; c < (2 * i + 1); c++)
				// each leaf, in binary one. :-)
				Print.coloursLine(ConsoleColors.GREEN_BRIGHT, leafs, true);
			System.out.println("");
		}
		/*
		 * At last, we print out the root of the Christmas Tree. That a big tree, 3 rows
		 * for the root of the tree.
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < (c / 2); j++)
				System.out.print(" ");
			for (int m = 0; m < 3; m++)
				Print.coloursLine(ConsoleColors.BLUE_BOLD, root, true);
			System.out.println("");
		}

		/*
		 * Like a bonus track, adding some grass to make it beautiful
		 */
		for (int n = 0; n <= (c / 2); n++)
			Print.coloursLine(ConsoleColors.GREEN, grass, true);
		// give a jump break!
		System.out.println("");
		/*
		 * That's All Folks!!!
		 */

	}

}