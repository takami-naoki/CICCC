package inheritance;


public class ApplicationDriver {

	public static void main(String[] args) {
		ShapeContainer sc = new ShapeContainer();
		sc.add(new Circle(10));
		sc.add(new Circle(15));
		sc.add(new Circle(18));
		
		sc.add(new Square(5));
		sc.add(new Square(8));
		sc.add(new Square(12));
		sc.add(new Square(25));
		
		sc.add(new Rectangle(5, 10));
		sc.add(new Rectangle(8, 4));
		sc.add(new Rectangle(7, 9));
		
		System.out.println(sc.totalShapesArea());
	}

}
