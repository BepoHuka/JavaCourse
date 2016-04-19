
public class Circle {

	private int x0;
	private int radius;
	
	//Create circle with radius r around the point
	public Circle(int x0, int radius){
		this.x0 = x0; 
		this.radius = this.setRadius(radius);
	}
	
	private int setRadius(int radius){
		if (radius <= 0){
			if (radius == 0) {
				System.out.println("Radius can't be 0. Will be changed to default 100.");
				return 100;
			} else {
				System.out.println("Radius can't be negative. Will be taken by abs.");
				return Math.abs(radius);
			} 
		} else return radius;
	}

	
	public double square() {
		return (Math.PI*Math.pow(this.radius, 2))/4;
	}
	

	public double perimetr() {
		return 2*(Math.PI)*(double)this.radius;
	}
	

	public int getx0(){
		return this.x0;
	}
	
	public int getRadius(){
		return this.radius;
	}

}

