package SabloanePriectare;

import java.util.*;

public class Section implements Elements, Observable{

	protected String sectionTitle;
	protected List <Elements> listaElemente = new ArrayList<Elements>();
	protected List <Observer> obsList = new ArrayList<Observer>();
	
	public Section ( String numeSectiune ) {
		
		this.sectionTitle = numeSectiune ;
		
	}
	
	public int add ( Elements elem ) {
		
		listaElemente.add(elem);
		return listaElemente.indexOf(elem) ;
		
	}
	
	public void remove ( Elements elem ) {
		
		listaElemente.remove(elem);
		
	}
	
	public Elements getChild(int index) {
		
		return listaElemente.get(index);
		
	}
	
	public String get_SectionTitle() {
		
		return this.sectionTitle;
	
	}
	
	public void Accept ( Visitors bookStats ) {
		for ( Elements elem : listaElemente) {
			elem.Accept(bookStats);
		}
	}
	
	public void print() {
		System.out.println(  get_SectionTitle());
		for ( Elements e : listaElemente ) {
			
			e.print();
			
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
		System.out.println("Observatori notificati! :D ");
		
	}

	@Override
	public void SetNewValue(String newValue) {
		// TODO Auto-generated method stub
		
	}


}
