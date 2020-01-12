package SabloanePriectare;

import java.util.*;
import java.util.concurrent.TimeUnit;

import com.sun.jdi.InternalException;

public class Imagine implements Elements, Observable{

	protected String numeImagine ;
	protected String value;
	protected String oldVal;
	protected ArrayList<Observer> obsList = new ArrayList<Observer>();
	
	public Imagine (String numImagine) {
		
		this.numeImagine = numImagine ;
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InternalException e ) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getNumeImagine () {
		return numeImagine ;
	}
	
	public void setNumeImag ( String nume ) {
		
		this.numeImagine = nume ;
		
	}
	
	public void Accept (Visitors visit) {
		visit.Visit(this);
	}
	
	
	public void print() {
		
		System.out.println("Imagine : " + numeImagine);
		
	}

	@Override
	public void SetNewValue(String newValue) {
		
		this.oldVal = value;
		this.value = newValue;
		
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
		System.out.println("Observatorii notificati! :D");
		
	}


}
