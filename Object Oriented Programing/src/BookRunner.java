
public class BookRunner {

	public static void main(String[] args) {
		Book book= new Book(13,"Java","Jancy");
		
		book.addReview(new Review(10,"Good Book", 5));
		book.addReview(new Review(12,"nice", 3));
		System.out.println(book);

	}

}
