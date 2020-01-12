package SabloanePriectare;

import java.util.*;

public class Carte {
	
	protected String numeCarte ;
	protected List<Autor> autori = new ArrayList<Autor>();
	protected List<Capitol> capitole = new ArrayList<Capitol>();
	protected List<Elements> listElem = new ArrayList<Elements>();
	
	public Carte ( String nume ) {
		
		this.numeCarte = nume ;
		
	}
	
	public void addContent ( Elements e ) {
		
		listElem.add(e);
		
	}
	
	public void adaugaAutor ( Autor numeAutor ) {
		
		autori.add(numeAutor);
		
	}
	
	public int CreazaCapitol ( String numeCapitol ) {
		
		Capitol capitol = new Capitol(numeCapitol);
		capitole.add(capitol);
		
		return capitole.indexOf(capitol) ;
		
	}
	
	public Capitol getCapitol (int index ) {
		if ( index < 0 || index >= capitole.size()) {
			return null;
		}
		return capitole.get(index);
		
	}
	
	public void Accept( Visitors visitor) {
		for(Elements elm : listElem) {
			elm.Accept(visitor);
		}
	}
	
	public void print () {
		System.out.println("Nume carte: " + numeCarte);
		for ( Autor i : autori) {
			i.print();
		}
		
		System.out.println();
		for ( Capitol e : capitole) {
			e.print();
		}
		
		for ( Elements m : listElem ) {
			
			m.print();
			
		}
		
	}
	
}
