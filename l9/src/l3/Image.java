package l3;

import java.util.ArrayList;

//import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable{
	public String Nume;
	
	public String value;
	public  String oldValue;
	ArrayList<Observer> o1 = new ArrayList<Observer>();
	
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
	@Override
	public void setNewValue(String newValue) {
		this.oldValue = this.Nume;
		this.Nume=newValue;
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
			a.update(oldValue,Nume);
		}
		
	}
	
}
