public class Book extends TangibleAsset {
	String isbn;
	
	public Book(String name, int place, String color, String isbn) {
		super(name, place, color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}
}