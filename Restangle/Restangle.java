
public class Restangle {

	int  sideA;
	int  sideB;
	
	public Restangle (int sideA, int sideB){
			this.sideA = sideA;
			this.sideB = sideB;
	}
	
	public double square(){
		return this.sideA*this.sideB; 
	}
	
	public double perimetr(){
		return 2*(this.sideA+this.sideB);
	}	
	

}
