package SabloanePriectare;

import java.util.*;

import SabloanePriectare.Observer;

public class Paragrafe implements Elements, Observable {
	
	protected String numeParag ;
	protected String value;
	protected String oldValue;
	protected AlignStrategy strategy ;
	protected ArrayList<Observer> obsList = new ArrayList<Observer>();
	
	public Paragrafe (String numParag) {
		
		this.numeParag = numParag ;
		
	}
	
    public void SetStrategy(AlignStrategy Strategy){
        strategy = Strategy;
    }
    
    public void Accept(Visitors visit) {
    	visit.Visit(this);
    }
	
	
	public void print() {
		
		if ( strategy == null ) {
			System.out.println(numeParag);
		}else {
			strategy.print(numeParag);
		}
		
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
		System.out.println("Observatori notificati :D !");
		
	}

	@Override
	public void SetNewValue(String newValue) {
		
		this.oldValue = value;
		this.value = newValue;
		
	}


}
