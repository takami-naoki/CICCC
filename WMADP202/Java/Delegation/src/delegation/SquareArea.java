package delegation;

public class SquareArea implements IShapeArea {

	private double side;
	
	public SquareArea(double side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}
	
}
