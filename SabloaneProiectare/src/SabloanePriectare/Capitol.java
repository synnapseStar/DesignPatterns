package SabloanePriectare;

import java.util.*;

public class Capitol {
	
	protected String numeCapitol ;
	protected List<SubCapitol> Subcapitole = new ArrayList <SubCapitol>();
	
	public Capitol ( String numeCap ) {
		
		this.numeCapitol = numeCap ;
		
	}
	
	
	public int CreazaSubCapitol ( String numeSubCapitol ) {
		
		SubCapitol subcap = new SubCapitol(numeSubCapitol);
		Subcapitole.add(subcap);
		
		return Subcapitole.indexOf(subcap) ;
		
	}
	
	public SubCapitol getSubCapitol (int index ) {
		if ( index < 0 || index >= Subcapitole.size()) {
			return null;
		}
		return Subcapitole.get(index);
		
	}
	
	public void print () {
		System.out.println("Capitol: " + numeCapitol) ;
	}

}
