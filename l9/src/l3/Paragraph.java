package l3;

public class Paragraph implements Element{
	public String Nume;
	public AlignStrategy As;
	
	
	public Paragraph() {}
	public Paragraph(String N) {
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
		if(As == null) {
			System.out.println(Nume);
		}
		else {
			As.print(Nume);
		}
		
	}
	public void setAlignStrategy(AlignStrategy As) {
		this.As=As;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
}
