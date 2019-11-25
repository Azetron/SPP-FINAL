package l3;

public class ImageProxy implements Element{
		public String Nume;
		public Image realImage = null;
		
		
		public ImageProxy() {}
		public ImageProxy(String n){
			this.Nume = n;
		}
		public String getNume() {
			return Nume;
		}
		public void setNume(String nume) {
			Nume = nume;
		}
		@Override
		public void print() {
			if(realImage == null) {
				realImage=new Image(Nume);
			}
			realImage.print();
			
		}
		@Override
		public void accept(Visitor v) {
			v.visit(this);
			
		}
			
		
}
