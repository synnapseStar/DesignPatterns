package SabloanePriectare;

public class DocumentManager {
	
	protected static DocumentManager docManager;
	protected Carte myBook ;
	
	public DocumentManager() {
		
	}
	
	public static DocumentManager getInstance() {
		
		if (docManager == null) {
			docManager = new DocumentManager();
		}
		
		return docManager;
	}
	
	public Carte getBook() {
		
		return this.myBook;
		
	}
	
	public void setBook( Carte book) {
		
		this.myBook = book;
		
	}
	
}
