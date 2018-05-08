package Exr1;

public class Book {
	private String mTitle;  
	private String mAuthor;
	private int mYear;
	private int mNumPages;
	private String mPublisher;
	
	// m = metoda  p = parametru __ = static -->le editezide aici ((((project --> properties --> Java Code style))))
	
	public Book(String pTitle, String pAuthor, String pPublisher, int pYear, int pNumPages) {
		super();
		mTitle = pTitle;
		mAuthor = pAuthor;
		mPublisher = pPublisher;
		mYear = pYear;
		mNumPages = pNumPages;
	}
	
	public String getTitle() {
		return mTitle;
	}
	public void setTitle(String pTitle) {
		mTitle = pTitle;
	}
	public String getAuthor() {
		return mAuthor;
	}
	public void setAuthor(String pAuthor) {
		mAuthor = pAuthor;
	}
	public int getYear() {
		return mYear;
	}
	public void setYear(int pYear) {
		mYear = pYear;
	}
	public int getNumPages() {
		return mNumPages;
	}
	public void setNumPages(int pNumPages) {
		mNumPages = pNumPages;
	}
	public String getPublisher() {
		return mPublisher;
	}
	public void setPublisher(String pPublisher) {
		mPublisher = pPublisher;
	}
	
	

}
