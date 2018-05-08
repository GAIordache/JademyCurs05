package Exr4tablouri;
import java.util.Scanner;
import java.util.Random;

public class Matrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][]	matrice1 = new int[n][m];
		for (int i =0;i<matrice1.length;i++) {
			for (int j=0;j<matrice1[i].length;j++) {
				matrice1[i][j] = (int)(Math.random()*100);
			}
		}
			
		for (int[] i : matrice1) {
			for (int j: i) {
				System.out.println(j); 
			}
		}

	}

}
