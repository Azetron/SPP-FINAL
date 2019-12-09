package l3;

public interface  Element {
		public void print();
		public void accept(Visitor v);
		public void setNewValue(String newValue);
}
