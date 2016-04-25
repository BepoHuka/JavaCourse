
public class ThirdPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point myPoint = new Point(3, 4);
		Circle myCircle = new Circle(myPoint, 5);
		Rectangle myRectanle = myCircle.boundingBox();
		
		
		System.out.println(myPoint);
		System.out.println(myCircle);
		System.out.println(myRectanle);
	}

}
