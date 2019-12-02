package l3;

public class SecondObserver implements Observer{

	@Override
	public void update(String old, String newV) {
		
		System.out.println("OldValue= "+old+" "+"NewValue= "+newV);
	}

}
