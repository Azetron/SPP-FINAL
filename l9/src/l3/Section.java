package l3;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element,Observable{
		String Title;
				List<Element> e1 = new ArrayList<Element>();
		
		public String content;
		public String oldContent;
		ArrayList<Observer> o1 = new ArrayList<Observer>();
		
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
		public void addObserver(FirstObserver firstObserver) {
			o1.add(firstObserver);
			
		}
		@Override
		public void setNewValue(String newValue) {
			this.oldContent=this.Title;
			this.Title=newValue;
			notifyObserver();
		}
		@Override
		public void addObserver(Observer o) {
				o1.add(o);
			
		}
		@Override
		public void removeObserver(Observer o) {
			o1.remove(o);
			
		}
		@Override
		public void notifyObserver() {
			for(Observer a : o1) {
				a.update(oldContent, Title);
			}
			
		}
		
		
}
