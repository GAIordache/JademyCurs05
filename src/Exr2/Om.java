package Exr2;

public class Om {
	private String nume;
	private int varsta;
	private char sex;
	
	public Om (String pNume, int pVarsta, char pSex) {
		this.nume = pNume;
		this.varsta = pVarsta;
		this.sex = pSex;
	}
	
	@Override
	public String toString() {
		return "\n Om [nume=" + nume + ", varsta=" + varsta + ", sex=" + sex;
		
	}
	
	public void setNume (String pNume) {
		this.nume = pNume;
	}
	
	public String getNume () {
		return this.nume;
	}
	
	public void setVarsta (int pVarsta) {
		this.varsta = pVarsta;		
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public void setSex (char pSex) {
		this.sex = pSex;
		
	}
	
	public char getSex () {
		return this.sex;
	}
}

