package Exr4tablouri;
//import java.util.Random;

public class Tablouri {

	public static void main(String[] args) {
		int[] vector1 = new int[5];
		for (int i=0; i<vector1.length;i++) {
			vector1[i]=i;
			System.out.println(vector1[i]);
		}
		
		int[] vector2 = new int[10];
		int max =0;
		for (int i = 0;i<vector2.length;i++) {
			vector2[i]= (int)(Math.random() *100);
			if(max < vector2[i]) {
				max = vector2[i];
			}
		}
		
		System.out.println(max);
	}

}
