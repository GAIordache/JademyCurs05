package Exr1;

public class Shelf {
	private String mFloor;
	private int mCorner;
	private Book[] mBooks;
	
	public Shelf(String pFloor, int pCorner, Book[] pBooks) {
		super();
		mFloor = pFloor;
		mCorner = pCorner;
		mBooks = pBooks;
	}
	
	public String getFloor() {
		return mFloor;
	}
	public void setFloor(String pFloor) {
		mFloor = pFloor;
	}
	public int getCorner() {
		return mCorner;
	}
	public void setCorner(int pCorner) {
		mCorner = pCorner;
	}
	public Book[] getBooks() {
		return mBooks;
	}
	public void setBooks(Book[] pBooks) {
		mBooks = pBooks;
	}
	
	
}
