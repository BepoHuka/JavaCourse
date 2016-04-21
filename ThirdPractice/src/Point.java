
public class Point {
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point getLocation(){
		return this;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y	;
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x = " + this.x + ", y = " + this.y;
	}
}
