public class Circle {

	Point origin;
	int radius;
	
	//Create circle with radius r around the point
	public Circle(Point p, int radius) throws Throwable {
		this.origin = p; 
		
		if (radius <= 0) 
			throw new Error("Not positive radius");
		else 
			this.radius = radius;
	}
	
	public void setRadius(int radius){
		
		if (radius <= 0) 
			throw new Error("Not positive radius");
		else 
			this.radius = radius;
	}
	
	public double square() {				
		return Math.PI*Math.pow(this.radius, 2);
	}
	

	public double circuit() {		
		return 2*(Math.PI)*(double)this.radius;		
	}	
	
	public void move(Point p){
		this.origin = p;
	}

	public Point getLocation(){
		return this.origin;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public boolean isInside(Point p){
		 if ((p.getX() >= origin.getX() - radius) && (p.getX() <= origin.getX() + radius))
		 	if ((p.getY() >= origin.getY() - radius) && (p.getY() <= origin.getY() + radius))
		 		return true;
		 
		 return false;	 
	}

	public Rectangle boundingBox(){ //I totally don't get your comment. Can't understand how this method could be static if it's required Circle?
		Point rectalngleOrigin = new Point(origin.getX() - radius, origin.getY() - radius);
        try {
        	Rectangle result = new Rectangle(rectalngleOrigin, radius*2, radius*2);
        	return result;
        } catch (Throwable t) {}
        
		return null;
		
		
	}
	
	public String toString(){
        String result;
        result = "Circle origin: ";
        /*
         * result += "[" + origin.toString() + "] ";
         */
        result += "[" + origin.getX() + ", " + origin.getY() +"]";
        result += ", radius: ";
        result += radius;
        return result;
	}

}

