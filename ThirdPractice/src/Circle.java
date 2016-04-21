public class Circle {

	Point start;
	int radius;
	
	//Create circle with radius r around the point
	public Circle(Point p, int radius){
		this.start = p; 
		
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
		return (Math.PI*Math.pow(this.radius, 2))/4;
	}
	

	public double circuit() {
		return 2*(Math.PI)*(double)this.radius;
	}
	

	public Point getLocation(){
		return this.start;
	}
	
	public int getRadius(){
		return this.radius;
	}

}

