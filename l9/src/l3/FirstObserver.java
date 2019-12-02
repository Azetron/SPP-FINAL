package l3;

public class FirstObserver implements Observer{

	@Override
	public void update(String old, String newV) {
		
		System.out.println("OldValue= "+old+" "+"NewValue= "+newV);
	}

}
