package delegation;

public class Shape {

	private IShapeArea delegate;
	
	public Shape(IShapeArea shape) {
		this.delegate = shape;
	}
	
	public double calculateArea() {
		return this.delegate.calculateArea();
	}
	
}
