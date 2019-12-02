package l3;

import java.util.ArrayList;

public class Table implements Element,Observable{
	public String Nume;
	
	public String value;
	public String oldValue;
	ArrayList<Observer> o1 = new ArrayList<Observer>();
	
	public Table() {}
	public Table(String N) {
		this.Nume = N;
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
	
	public void print() {
		System.out.println(Nume);
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
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
			a.update(oldValue, Nume);
		}
		
	}
	@Override
	public void setNewValue(String newValue) {
		this.oldValue = this.Nume;
		this.Nume =newValue;
		notifyObserver();
	}
	
}
