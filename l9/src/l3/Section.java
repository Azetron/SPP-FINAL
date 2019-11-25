package l3;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
		String Title;
				List<Element> e1 = new ArrayList<Element>();

		public Section() {}
		public Section(String t) {
			this.Title = t;
		}
				
		public void removeSection(Section section) {
			e1.remove(section);
		}
		
		public Element getElement(int index) {
			return e1.get(index);
		}
		
		public void add(Element e) {
			e1.add(e);
		}
		
		
		public void print() {
			System.out.println(Title);
			for(var e : e1) {
				e.print();
			}
			
		}
	
		
		@Override
		public void accept(Visitor v) {
			for(var e : e1) {
				e.accept(v);
			}
			
		}
		
		
}
