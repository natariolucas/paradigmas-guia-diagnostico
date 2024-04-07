package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	public static boolean resolver(int[][] m) {
		int accumulator = m[0][0];
		
		boolean isValid = true;
		
		for(int i = 1; i < m.length && isValid; i++) {
			int currentElement = m[i][i];
			
			if (currentElement != accumulator) {
				isValid = false;
			} else {
				accumulator += currentElement;
			}
		}
		
		return isValid;
	}
}
