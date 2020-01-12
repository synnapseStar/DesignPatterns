package SabloanePriectare;

public class ComandaOpen implements Comanda{
	
	public String caleJSON;
	
	public ComandaOpen( String path) {
		
		this.caleJSON = path ;
		
	}
	
	@Override
	public void execute() {
		JSONBuilder builder = new JSONBuilder();
		builder.build();
		Carte carte = new Carte("Cartea 1");
		carte.addContent(builder.getResult());
		DocumentManager.getInstance().setBook(carte);
		carte.print();
		
	}

}
