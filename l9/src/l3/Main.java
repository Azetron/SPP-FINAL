package l3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Book Titanic = new Book("Titanic");
        Author rPaul = new Author("Radu Paul");
        Titanic.addAuthor(rPaul);
        Builder jsonBuilder = new JSONBuilder();
        jsonBuilder.Build();
        Element myBook = jsonBuilder.GetResult();
        myBook.print();

	}

}
