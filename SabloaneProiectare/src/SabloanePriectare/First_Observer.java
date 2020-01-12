package SabloanePriectare;

public class First_Observer implements Observer{
	
	public First_Observer() {
		
	}
	
	@Override
	public void Update(String oldValue, String newValue) {
		System.out.println("Updated!");
		
	}

}
