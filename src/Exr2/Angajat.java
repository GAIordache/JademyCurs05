package Exr2;

public class Angajat extends Om{
	int salariu;
	
	public Angajat(String pNume, int pVarsta, char pSex,int pSalariu) {
		super(pNume, pVarsta, pSex);
		this.salariu = pSalariu;
	}
    
	@Override
	public String toString() {
		String dummy = super.toString();
		return dummy + " salariu= " + salariu; 
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int pSalariu) {
		salariu = pSalariu;
	}
	
	
	

}
