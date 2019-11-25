package l3;
import java.util.ArrayList;
import java.util.List;

public class Book {
	
	public String Titlu;
	
	public Book() {}
	public Book(String T) {
		this.Titlu= T;
	}
	public String getTitlu() {
		return Titlu;
	}
	public void setTitlu(String titlu) {
		Titlu = titlu;
	}
	List<Author> a1 = new ArrayList<Author>();
	List<Element> e1 = new ArrayList<Element>();
	
	
	
	public void addAuthor(Author author) {
		a1.add(author);
		
	}
	
	
	public void addContent(Element Element) {
		e1.add(Element);
		
	}
	public void print() {
		System.out.println(Titlu);
		System.out.println("Authors:");
		for(var e : a1) {
			System.out.println(e);
		}
		
		System.out.println();
		for(var e : e1) {
			e.print();
		}
		
	}
}
