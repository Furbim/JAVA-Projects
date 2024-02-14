package program;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0; i< m;i++) {
			for (int j=0; j< n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			
			
		}
		
		int r = sc.nextInt();
		
		for (int i=0; i< m;i++) {
			for (int j=0; j< n; j++) {
				
				if (mat[i][j] == r) {
					
					System.out.println("Position: " + i + "," + j);
					if (j-1 >= 0) {
						System.out.println("Left: "+ mat[i][j-1]);	
					}
					if (i-1 >= 0) {
						System.out.println("Up: "+ mat[i-1][j]);	
						
					}

					if ( j+1 < n) {
						System.out.println("Down: "+ mat[i+1][j]);	
						
					}
					if ( i+1 < m) {
						System.out.println("Right: "+ mat[i][j+1]);	
						
					}
					
				}
				
			}
			
			
		}
		
		
	sc.close();	
	}

}
