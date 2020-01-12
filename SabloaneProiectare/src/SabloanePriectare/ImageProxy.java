package SabloanePriectare;

public class ImageProxy implements Elements{

	protected String imageName ;
	protected Imagine realImage ;
	
	public ImageProxy ( String imgTitle ) {
		
		this.imageName = imgTitle ;
		
	}
	
	public String getImgName ( ) {
		
		return imageName ;
		
	}
	
	public void setImgName ( String imgname ) {
		
		this.imageName = imgname ;
		
	}
	
	public Imagine getRealImage () {
		
		return realImage ;
		
	}
	
	public void setRealImgName( Imagine realImage ) {
		
		this.realImage = realImage ;
		
	}
	
	public void Accept( Visitors visit) {
		visit.Visit(this);
	}

	@Override
	public void print() {
		realImage = new Imagine(getImgName());
		realImage.print();
		
		
	}

	@Override
	public void SetNewValue(String newValue) {
		realImage.SetNewValue(newValue);
		
	}



	

}
