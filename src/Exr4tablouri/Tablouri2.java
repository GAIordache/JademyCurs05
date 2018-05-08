package Exr4tablouri;
import java.util.Scanner;

public class Tablouri2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Introduceti un numar: ");
		int y = sc.nextInt();
		 
		int[] vector = new int[10];      
		/*
		 Nota: am creat un array cu marimea 10 doar pentru a testa programul mai rapid;
		 Pentru a fi mai rigurosi, ar trebui intai sa aflam numarul de cifre, 
		 apoi sa cream array-ul pentru aceasta marime .Asta se poate face prin diferite metode, de ex:
		    1. Metoda 1: impartiri succesive la 10;
		    int contorCifre = 0;
		    while (numar != 0) {
		      y = y / 10;
		      contorCifre++;
		    }
		    int[] vector = new int[contorCifre];
		     
		    2. Metoda 2: transformare in string si apelarea metodei length():
		      String str = String.valueOf(y);
		      int numarCifre = str.length();
		      int[] vector = new int[numarCifre];
		 
		*/
		 
		 
		int i = 0;
		while (y != 0){
		   int ultimaCifra = y % 10;
		   y = y / 10;
		   vector[i] = ultimaCifra;
		   i++;
		}
		System.out.println("Afisam cifrele din array: ");
		for (int j = vector.length-1; j > -1 ;j--) {
		   System.out.println(vector[j]);
		}
	}

}
