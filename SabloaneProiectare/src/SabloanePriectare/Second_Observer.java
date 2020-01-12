package SabloanePriectare;

public class Second_Observer implements Observer{
	
	public Second_Observer() {
		
	}
	
	@Override
	public void Update(String oldValue, String newValue) {
		System.out.println("Updated 2!");
		
	}

}
