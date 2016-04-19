
public class Circle {

	int  circumference;
	
	public Circle (int sideA, int sideB){
			this.sideA = sideA;
			this.sideB = sideB;
	}
	
	public Point(int x, int y){
		this.x = x; this.y = y; 
	}
	
	public double square(){
		return this.sideA*this.sideB; 
	}
	
	public double perimetr(){
		return 2*(this.sideA+this.sideB);
	}	
	

}

}
