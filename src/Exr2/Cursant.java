package Exr2;

public class Cursant extends Om {
	private String institutie;
	
	public Cursant (String pNume,int pVarsta, char pSex, String pInstitutie) {
		super(pNume,pVarsta,pSex);
		this.institutie = pInstitutie;
	}
	
	@Override
	public String toString() {
		return "\nCursant [nume=" + getNume() + ", varsta=" + getVarsta() + ", sex=" + getSex() + ", institutie=" + institutie;
	}

	public String getInstitutie() {
		return institutie;
	}

	public void setInstitutie(String pInstitutie) {
		institutie = pInstitutie;
	}
	
	

}
