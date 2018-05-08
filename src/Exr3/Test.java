package Exr3;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
	       computer1.denumire = "Dell";
	       computer1.frecventa = 2.8;
	       computer1.ram = 4;
	        
	       Computer computer2 = new Computer("Asus", 1.9, 8);
	        
	       Computer computer3 = new Computer();
	       computer3.setAtributeComputer("UltraPowerPC", 6.5, 16);
	        
	       Computer[] computerArray = new Computer[3];
	       computerArray[0] = computer1;
	       computerArray[1] = computer2;
	       computerArray[2] = computer3;
	    
	       ArrayList<Computer> computerArrList = new ArrayList();
	       computerArrList.add(computer1);
	       computerArrList.add(computer2);
	       computerArrList.add(computer3);
	        
	       // afisare array
	       System.out.println("\nAfisam array-ul ================");
	       for (Computer comp : computerArray) {
	          System.out.println(comp);
	       }
	        
	       // afisare ArrayList
	       System.out.println("\nAfisam ArrayList-ul ================");
	       for (int i = 0; i<computerArrList.size(); i++) {
	          System.out.println(computerArrList.get(i));
	       }
	        
	       // incercati si variantele astea:
	       System.out.println("\nAfisam direct array-ul ================");
	       System.out.println(computerArray);
	       System.out.println("\nAfisam directArrayList-ul ================");
	       System.out.println(computerArrList);

	}

}
