package SabloanePriectare;

public class BookStatistics implements Visitors{
	
	protected int numarImg = 0;
	protected int numarImgProx = 0;
	protected int numarParaf = 0;
	protected int numarTabel = 0;
	
	public BookStatistics () {
		
	}
	
	
	@Override
	public void Visit(Imagine img) {
		numarImg++;
		
	}

	@Override
	public void Visit(ImageProxy imgprox) {
		numarImgProx++;
		
	}

	@Override
	public void Visit(Paragrafe paraf) {
		numarParaf++;
		
	}

	@Override
	public void Visit(Tabel tab) {
		numarTabel++;
		
	}
	
	public void printStats() {
		System.out.println("Numar imagini : " + numarImg);
		System.out.println("Numar imagini prox : " + numarImgProx);
		System.out.println("Numar paragrafe : " + numarParaf);
		System.out.println("Numar tabele : " + numarTabel);
	}

}
