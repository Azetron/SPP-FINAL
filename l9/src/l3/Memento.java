package l3;

public class Memento {
	public Element state;
	
	public void setState(Element s) {
		this.state=s;
	}
	public Element getState() {
		return this.state;
	}
}
