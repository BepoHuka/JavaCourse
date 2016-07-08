
public class Rectangle {

	private double width;
	private double length;
	private Point origin;
	
	public Rectangle (){
		this.origin = new Point();
		this.width = 1.0;
		this.length = 2.0;	
	}
	
	public Rectangle (Point p, double width, double length) throws Throwable {
		this.origin = p;
		if (width >= 0)
			this.width = width;
		else
			throw new Error("Not positive width");
		if (length >= 0)
			this.length = length;	
		else
			throw new Error("Not positive length");
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
		// It's more convenient to look through coordinates separately than create one huge "IF". Isn't it?
		 if ((p.getX() >= origin.getX()) && (p.getX() <= origin.getX() + length))
		 	if ((p.getY() >= origin.getY()) && (p.getY() <= origin.getY() + width))
		 		return true;
		 
		 return false;	 
	}
	
	public String toString(){
		//There is only Origin point and the rest three points calculated with length and width there is no needs to convert to Points.
        String result;
        result = "Rectangle coordinates: ";
        /*
         * result += "[" + origin.toString() + "] ";
         */
        result += "[" + origin.getX() + ", " + origin.getY() +"] ";
        result += "[" + (origin.getX() + length) + ", " + origin.getY() +"] ";
        result += "[" + origin.getX() + ", " + (origin.getY() + width) +"] ";
        result += "[" + (origin.getX() + length) + ", " + (origin.getY() + width) +"]";
        return result;
	}
	
}
