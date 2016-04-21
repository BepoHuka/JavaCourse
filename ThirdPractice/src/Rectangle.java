
public class Rectangle {

	int width;
	int length;
	Point start;
	
	public Rectangle (Point p, int width, int length){
		this.start = p;
		this.width = width;
		this.length = length;	
	}
	
	public double square(){
		return this.width*this.length; 
	}
	
	public double perimetr(){
		return 2*(this.width+this.length);
	}	
	
	public void move(Point p){
		this.start = p;
	}

}
