package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {
		boolean daCero = false;

		for (int i = 0; i < m.length && !daCero; i++) {
			for (int j = 0; j < m[i].length && !daCero; j++) {
				if (m[i][j] == 0) {
					daCero = true;
				}
			}
		}

		return daCero;
	}
}
