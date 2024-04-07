package unlam.paradigmas.diagnostico;

import java.util.*;

public class Ejercicio04 {

	public static int[] resolver(int[][] m) {
		int[] maxModas = new int[m.length];
		int[] rowModas;
		
		for (int i = 0; i < m.length; i++) {
			rowModas = getModas(m[i]);
			maxModas[i] = getMax(rowModas);
		}
		
		return maxModas;
	}
	
	// TODO: map[count][values...] modas
	
	private static int[] getModas(int[] a) {
		Map<Integer, Integer> valuesOccurrences = new HashMap<Integer, Integer>();
		
		int maxOccurrence = 0;
		int quantityMaxOccurrence = 0;
		
		for (int i = 0; i < a.length; i++) {
			int currentOccurrences = 0;
			
			if (valuesOccurrences.containsKey(a[i])) {
				currentOccurrences = valuesOccurrences.get(a[i]);
			}
			
			valuesOccurrences.put(a[i], currentOccurrences+1);
			
			if (currentOccurrences+1 > maxOccurrence) {
				maxOccurrence = currentOccurrences+1;
				quantityMaxOccurrence = 1;
			} else if (currentOccurrences+1 == maxOccurrence) {
				quantityMaxOccurrence += 1;
			} 
			
			
		}
		
		int[] modas = new int[quantityMaxOccurrence];
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : valuesOccurrences.entrySet()) {
			if (entry.getValue() == maxOccurrence) {
				modas[i] = entry.getKey();
				i++;
			}
		}
		
		return modas;
	}

	private static int getMax(int[] a) {
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				max = a[i];
			} else if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
}
