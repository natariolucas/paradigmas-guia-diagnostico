package main;

import unlam.paradigmas.diagnostico.*;

public class MainClass {
	public static void main(String[] args) {
		int[][][] auxM;
		
		System.out.println("-- Ejercicio 01");
		auxM = getMatrix01();
		for (int i = 0; i < auxM.length; i++) {
			printMatrix(auxM[i]);
			if (Ejercicio01.resolver(auxM[i])) {
				System.out.println("- Resuelto por caso de exito");
			} else {
				System.out.println("- Resuelto por caso fallido");
			}
			
		}
		
		System.out.println("\n-- Ejercicio 02");
		auxM = getMatrix02();
		for (int i = 0; i < auxM.length; i++) {
			printMatrix(auxM[i]);
			if (Ejercicio02.resolver(auxM[i])) {
				System.out.println("- Resuelto por caso de exito");
			} else {
				System.out.println("- Resuelto por caso fallido");
			}
			
		}
		
		System.out.println("\n-- Ejercicio 03");
		auxM = getMatrix03();
		for (int i = 0; i < auxM.length; i++) {
			printMatrix(auxM[i]);
			System.out.println("- Output: ");
			printMatrix(Ejercicio03.resolver(auxM[i]));			
		}
		
		System.out.println("\n-- Ejercicio 04");
		auxM = getMatrix04();
		for (int i = 0; i < auxM.length; i++) {
			printMatrix(auxM[i]);
			System.out.println("- Output: ");
			printArray(Ejercicio04.resolver(auxM[i]));			
		}
		
		System.out.println("\n-- Ejercicio 05");
		auxM = getMatrix05();
		for (int i = 0; i < auxM.length; i++) {
			printMatrix(auxM[i]);
			System.out.println("- Output: ");
			printMatrix(Ejercicio05.resolver(auxM[i]));			
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
	
	public static void printArray(int[] a) {		
		for (int i = 0; i < a.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			
			System.out.print(a[i]);
		}
		
		System.out.println("");
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
	
	public static int[][][] getMatrix02() {
		int[][][] m = 
			{
				{ 
					{ 1,1,1 },
					{ 1,1,1 },
					{ 9,8,7 }
				},
				{ 
					{ 1,1,1 },
					{ 1,1,0 },
					{ 9,9,9}
				}
			};
		
		return m;
	}
	
	public static int[][][] getMatrix03() {
		int[][][] m = 
			{
				{ 
					{ 8, 2, -3, 4 },
					{ 5, -6, -6, 20 },
					{ 21, 1, -5, 0 }
				}
			};
		
		return m;
	}
	
	public static int[][][] getMatrix04() {
		int[][][] m = 
			{
				{ 
					{ 1, 2, 3, 4 },
					{ 5, -6, -6, 20 },
					{ 1, 1, 10, 10 }
				}
			};
		
		return m;
	}
	
	public static int[][][] getMatrix05() {
		int[][][] m = 
			{
				{ 
					{ 1, 2, 3, 4 },
					{ 5, 6, 7, 8 },
					{ 9, 10, 11, 12 },
					{ 13, 14, 15, 16 }
				}
			};
		
		return m;
	}
}
