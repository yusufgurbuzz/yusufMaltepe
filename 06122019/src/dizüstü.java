
public class dizüstü extends masaüstü {

	
	private String marka;
	
	public dizüstü(String marka,int islemciGucu){
		
		super(islemciGucu);
		this.marka=marka;
		System.out.println("Bilgisayar Markasý :"  + marka);
	}
	
	public String getmarka() {
	    return marka;
	  }

	  public void setmarka(String marka) {
	    this.marka = marka;
	  }
		
	
	
	
	
	
}
