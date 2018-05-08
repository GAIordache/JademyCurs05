

package Exr2;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Angajat angj1 = new Angajat("Gigi",22,'m',2000);
		System.out.println(angj1);
		angj1.setNume("Mary");
		String stare = angj1.toString();
		System.out.println(stare);
		
		ArrayList<Om> oameni = new ArrayList<Om>();
		oameni.add(angj1);
		System.out.println(oameni);
		
		Cursant cur1 = new Cursant("victor",12,'m',"Matematica");
		System.out.println(cur1);
		oameni.add(cur1);
		
		for (Om om : oameni) {
	          
	         /* doarece ArrayList-ul contine obiecte din mai multe subclase
	          trebuie intai sa facem downcast la clasa potrivita, inainte de 
	          a putea accesa un atribut (nu toti oamenii sunt programatori 
	          si nu toti stiu limbaje de programare) */
	          
	         // varianta 1 - metoda getClass()
	         if(om.getClass() == Cursant.class){
	        	 Cursant temp = (Cursant)om;
	            System.out.println(  temp.getInstitutie());
	         }
	          
	         // varianta 2 - cuvantul cheie instanceof
	         if( om  instanceof Cursant){
	            Cursant temp = (Cursant)om;
	            System.out.println(temp.getInstitutie());
	         }
	          
	      }
		System.out.println(oameni);
	}

}
