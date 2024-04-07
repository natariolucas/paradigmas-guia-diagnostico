package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		int[][] result = new int[(2 * m.length) - 1][];

		// first half
		int resultRow = 0;
		for (int i = m.length - 1; i >= 0; i--) {
			result[resultRow] = new int[m.length - i]; // Size of resultant row
			result[resultRow][0] = m[i][0]; // set first row element

			// "L" movements
	
			for (int j = i + 1; j < m.length; j++) {
				result[resultRow][j-i] = m[j][j-i];
			}
			
			resultRow++;
		}
		
		// second half
		for (int i = 1; i < m.length; i++) {
			result[resultRow] = new int[m.length - i]; // Size of resultant row
			result[resultRow][0] = m[0][i]; // set first row element

			// "L" movements
	
			for (int j = i + 1; j < m.length; j++) {
				result[resultRow][j-i] = m[j-i][j];
			}
			
			resultRow++;
		}
		
		return result;
	}
}
