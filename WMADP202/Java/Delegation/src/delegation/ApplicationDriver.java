package delegation;

public class ApplicationDriver {

	public static void main(String[] args) {
		ShapeContainer sc = new ShapeContainer();
		sc.add(new Shape(new RectangleArea(10, 20)));
		sc.add(new Shape(new SquareArea(10)));
		sc.add(new Shape(new CircleArea(10)));
		
		System.out.println(sc.totalShapesArea());
	}
}
