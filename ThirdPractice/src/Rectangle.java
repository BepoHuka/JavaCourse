
public class Rectangle {

	int width;
	int length;
	Point origin;
	
	public Rectangle (Point p, int width, int length){
		this.origin = p;
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
		this.origin = p;
	}
	
	public boolean isInside(Point p){
		 if ((p.getX() >= origin.getX()) && (p.getX() <= origin.getX() + length))
		 	if ((p.getY() >= origin.getY()) && (p.getY() <= origin.getY() + width))
		 		return true;
		 
		 return false;	 
	}
	
	public String toString(){
        String result;
        result = "Rectangle coordinates: ";
        result += "[" + origin.getX() + ", " + origin.getY() +"] ";
        result += "[" + (origin.getX() + length) + ", " + origin.getY() +"] ";
        result += "[" + origin.getX() + ", " + (origin.getY() + width) +"] ";
        result += "[" + (origin.getX() + length) + ", " + (origin.getY() + width) +"] ";
        return result;
	}

}
