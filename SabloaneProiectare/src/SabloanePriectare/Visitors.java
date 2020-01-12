package SabloanePriectare;

public interface Visitors {
	
	void Visit( Imagine img ) ;
	void Visit( ImageProxy imgprox ) ;
	void Visit( Paragrafe paraf ) ;
	void Visit( Tabel tab ) ;
	
}
