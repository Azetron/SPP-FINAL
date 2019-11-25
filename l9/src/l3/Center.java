package l3;

public class Center implements AlignStrategy{
	
	public Center() {}
	
	@Override
	public void print(String Text) {
		System.out.println("++"+Text+"++");
		
	}
}
