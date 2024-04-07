package main;

import unlam.paradigmas.diagnostico.*;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("-- Ejercicio 01");
		int[][][] m1 = getMatrix01();
		for (int i = 0; i < m1.length; i++) {
			printMatrix(m1[i]);
			if (Ejercicio01.resolver(m1[i])) {
				System.out.println("- Resuelto por caso de exito");
			} else {
				System.out.println("- Resuelto por caso fallido");
			}
			
		}
		
	}

	public static void printMatrix(int[][] m) {		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j != 0) {
					System.out.print(",");
				}
				System.out.print(m[i][j]);
			}

			System.out.println("");
		}
	}
	
	public static int[][][] getMatrix01() {
		int[][][] m = 
			{
				{ 
					{ 1, 2, 3 },
					{ 4, 1, 6 },
					{ 7, 8, 2 }
				},
				{ 
					{ 1, 2, 3 },
					{ 4, 3, 6 },
					{ 7, 8, 2 }
				}
			};
		
		return m;
	}
}
