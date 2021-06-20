package shapes;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = null;
		
		s = new Circle();
		s.calArea();
		
		s = new Circle(4.5f);
		s.calArea();
	}

}
