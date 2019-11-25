package l3;

public class Table implements Element{
	public String Nume;
	
	public Table() {}
	public Table(String N) {
		this.Nume = N;
	}
	public String getNume() {
		return Nume;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	public String toString() {
		return this.Nume;
	}
	
	public void print() {
		System.out.println(Nume);
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
}
