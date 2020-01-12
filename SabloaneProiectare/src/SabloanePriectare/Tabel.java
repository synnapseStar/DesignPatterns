package SabloanePriectare;

import java.util.ArrayList;

public class Tabel implements Elements, Observable{

	protected String numeTabel ;
	protected String value ;
	protected String oldValue ;
	protected ArrayList<Observer> obsList = new ArrayList<Observer>();
	
	public Tabel ( String numTabel ) {
		
		this.numeTabel = numTabel ;
		
	}
	
	public void Accept ( Visitors visit ) {
		visit.Visit(this);
	}
	
	public void print() {
		
		System.out.println("Tabel : "+ numeTabel);
		
	}

	@Override
	public void AddObserver(Observer observer) {
		obsList.add(observer);
		
	}

	@Override
	public void RemoveObserver(Observer observer) {
		obsList.remove(observer);
		
	}

	@Override
	public void NotifyAllObservers() {
		System.out.println("Observatori notificati :D!");
		
	}

	@Override
	public void SetNewValue(String newValue) {
		this.oldValue = value ;
		this.value = newValue ;
		
	}



}
