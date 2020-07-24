package delegation;

public class CircleArea implements IShapeArea {

	private double radius;
	
	public CircleArea(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return this.radius * this.radius * 3.14;
	}

}
