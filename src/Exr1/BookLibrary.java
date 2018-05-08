package Exr1;

public class BookLibrary {

	private String mName;
	private String mAddress;
	private Shelf[] mShelves;
	
	public BookLibrary(String pName, String pAddress, Shelf[] pShelves) {
		super();
		mName = pName;
		mAddress = pAddress;
		mShelves = pShelves;
	}
	
	public String getName() {
		return mName;
	}
	public void setName(String pName) {
		mName = pName;
	}
	public String getAddress() {
		return mAddress;
	}
	public void setAddress(String pAddress) {
		mAddress = pAddress;
	}
	public Shelf[] getShelves() {
		return mShelves;
	}
	public void setShelves(Shelf[] pShelves) {
		mShelves = pShelves;
	}
	
	
}
