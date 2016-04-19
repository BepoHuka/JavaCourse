
public class Restangle {

	int width;
	int length;
	float x;
	float y;
	
	public Restangle (int width, int length, int x, int y){
			this.width = width;
			this.length = length;
			this.x = x;
			this.y = y;
	}
	
	public double square(){
		return this.width*this.length; 
	}
	
	public double perimetr(){
		return 2*(this.width+this.length);
	}	
	
	public void move(float x, float y){

		}

}
