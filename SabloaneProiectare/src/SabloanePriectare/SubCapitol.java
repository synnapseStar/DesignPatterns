package SabloanePriectare;

import java.util.*;


public class SubCapitol {
	
	protected String numeSubCapitol ;
	protected List<Elements> elemente = new ArrayList <Elements>();
	
	public SubCapitol (String numeSubCap) {
		
		this.numeSubCapitol = numeSubCap ;
		
	}
	
	int createNewImagine(String numeImg) throws Exception {
		Imagine img1 = new Imagine(numeImg);
		elemente.add(img1);
		
		return elemente.indexOf(img1);
		
	}
	
	int createNewParagraf(String numeParagraf) {
		Paragrafe parag1 = new Paragrafe(numeParagraf);
		elemente.add(parag1);
		
		return elemente.indexOf(parag1);
		
	}
	
	int createNewTabel(String numeTable) {
		Tabel tabel1 = new Tabel(numeTable);
		elemente.add(tabel1);
		
		return elemente.indexOf(tabel1);
		
	}
	
	public void print () {
		
		System.out.println("Subcapitol : " + numeSubCapitol);
		for ( Elements e : elemente) {
			e.print();
		}
		
	}


}
