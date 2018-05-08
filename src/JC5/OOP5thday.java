package JC5;

import java.util.Scanner;

public class OOP5thday {

	public static void main(String[] args) {
		/*Fiecare metoda si instanta dintr-un obiect are acces la datele din acel obiect prin 
		 * faptul ca primeste un parametru ascuns  -> this <-
		 * 
		 */
		
		String[] sarray = new String[10];
		Scanner scanner = new Scanner(System.in);
		int idx = 0;
		while (true) {
			sarray[idx++] = scanner.next();
			
			/* variabile/ obiecte declarate in main(globale) vor fi sterse de garbage collector
			numai dupa ce clasa main se termina deci declara in diferite clase in clasa main pentru o functionare eficienta
			 a garbage collectorului. 
			*/	
		}
		
		// Constructorii incep cu upper case desi sunt metode si cu "new" 
		// Daca nu declar un constructor compilatorul va face el un constructor default
		// Nu am voie sa fac 2 metode cu aceeasi semnatura
		// CORECT
		// Daca nu am constructor default si creez unul custom trebuie sa apelez constructorul custom 
		// nu mai pot construi cu cel default decat daca am ambii constructori si cel default si cel custom
		
		
		
		
		
	}

}
