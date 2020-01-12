package SabloanePriectare;

public class StatisticsCommand implements Comanda{
	


	@Override
	public void execute() {
		BookStatistics stats = new BookStatistics();
		
		Carte carte = DocumentManager.getInstance().getBook();

		DocumentManager.getInstance().getBook().Accept(stats);
	}
	

}
