package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] m) {

		int[] adjacents;
		
		int[][] resultMatrix = new int[m.length][];
		
		for (int i = 0; i < m.length; i++) {
			resultMatrix[i] = new int[m[i].length];
			
			for (int j = 0; j < m[i].length; j++) {
				adjacents = getAdjacentsWithDefault(m, i, j, 0);
				resultMatrix[i][j] = sumArray(adjacents) + m[i][j];
			}
		}

		return resultMatrix;
	}

	private static int[] getAdjacentsWithDefault(int[][] m, int i, int j, int defaultValue) {
		// Superior: i = i-1, j = j
		// Inferior: i = i+1, j = j
		// Left: i = i, j = j-1
		// Right: i = i, j = j+1

		int[] results = new int[4];

		// Superior
		if (i - 1 < 0) {
			results[0] = defaultValue;
		} else {
			results[0] = m[i - 1][j];
		}

		// Inferior
		if (i + 1 > m.length - 1) {
			results[1] = defaultValue;
		} else {
			results[1] = m[i + 1][j];
		}

		// Left
		if (j - 1 < 0) {
			results[2] = defaultValue;
		} else {
			results[2] = m[i][j - 1];
		}

		// Right
		if (j + 1 > m[i].length - 1) {
			results[3] = defaultValue;
		} else {
			results[3] = m[i][j + 1];
		}
		
		return results;
	}

	private static int sumArray(int[] a) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
}
