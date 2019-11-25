package l3;

//import java.util.concurrent.TimeUnit;

public class Image implements Element{
	public String Nume;
	
	public Image() {}
	public Image(String N) {
		this.Nume = N;
		/*try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			*/
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
	@Override
	public void print() {
		System.out.println(Nume);
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
}
