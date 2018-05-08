package Exr1;

public class Main {

	public static void main(String[] args) {
		// Generam o instanta de biblioteca
		BookLibrary library = new BookLibrary("Universitara",
				"Bucuresti",
				new Shelf[] {
					new Shelf("First", 0, new Book[] {
							new Book("Morometii", "Marin Preda", "RAO", 2015, 800), 
							// new Book + CTRL + SPACE si alegem constructorul 
							new Book("Harap Alb", "Ion Creanga", "RAO", 2009, 150)
					}),
					new Shelf("First", 1, new Book[] {
							new Book("Crima si pedeapsa", "Dostoievski", "RAO", 2015, 500)
					})
		});
		
		System.out.println(library.getShelves());
		
		
		
		// Book b1 = new Book (....);
		// Book b2 = new Book (....);
		// Book[] bs1 = new Book[] {b1,b2}
		// Shelf s1 = new Shelf 
		
	}

}
