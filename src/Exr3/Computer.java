package Exr3;

public class Computer {
	 
	String denumire;
	   double frecventa;
	   int ram;
	    
	   // constructor implicit
	   Computer() { }
	    
	   // constructor cu parametri
	   Computer(String denumire, double frecv, int memorie) {
	      this.denumire = denumire;
	      frecventa = frecv;
	      ram = memorie;
	   }
	    
	   // metoda tip setter (pentru initializare atribute)
	   public void setAtributeComputer(String den, double frecv, int mem) {
	      denumire = den;
	       
	      // faceti verificari riguroase, acestea sunt doar un exemplu
	      if (frecv > 0) frecventa = frecv;
	      else frecventa = 0;
	       
	      if (mem > 0 && mem <= 16) ram = mem;
	   }
	    
	   @Override
	   public String toString() {
	      return "Computer " + denumire + ", frecventa procesor: " + frecventa + "GHz, RAM: " + ram + " GB.";
	   }
}
