
public class diz�st� extends masa�st� {

	
	private String marka;
	
	public diz�st�(String marka,int islemciGucu){
		
		super(islemciGucu);
		this.marka=marka;
		System.out.println("Bilgisayar Markas� :"  + marka);
	}
	
	public String getmarka() {
	    return marka;
	  }

	  public void setmarka(String marka) {
	    this.marka = marka;
	  }
		
	
	
	
	
	
}
