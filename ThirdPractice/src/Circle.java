public class Circle {

	Point origin;
	int radius;
	
	//Create circle with radius r around the point
	public Circle(Point p, int radius){
		this.origin = p; 
		
		if (radius == 0) {
			System.out.println("Radius can't be 0. Will be changed to default 100.");
			this.radius = 100;
		}
				
		if (radius < 0){
			System.out.println("Radius can't be negative. Will be taken by abs.");
			this.radius = Math.abs(radius);
		} 	
		else 
			this.radius = radius;
	}
	
	public void setRadius(int radius){
		
		if (radius == 0) {
			System.out.println("Radius can't be 0. Will be changed to default 100.");
			this.radius = 100;
		}
				
		if (radius < 0){
			System.out.println("Radius can't be negative. Will be taken by abs.");
			this.radius = Math.abs(radius);
		} 	
		else 
			this.radius = radius;
	}

	
	public double square() {				
		return (Math.PI*Math.pow(this.radius, 2));
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

	public Rectangle boundingBox(){
		Point rectalngleOrigin = new Point(origin.getX() - radius, origin.getY() - radius);
		return new Rectangle(rectalngleOrigin, radius*2, radius*2);		
	}
	
	public String toString(){
        String result;
        result = "Circle origin: ";
        result += "[" + origin.getX() + ", " + origin.getY() +"]";
        result += ", radius: ";
        result += radius;
        return result;
	}

}

