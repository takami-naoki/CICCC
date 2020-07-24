package inheritance;

import java.util.ArrayList;

public class ShapeContainer {

	private ArrayList<Shape> shapes;
	
	public ShapeContainer() {
		this.shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
	public double totalShapesArea() {
		double totalArea = 0;
		for (Shape shape : this.shapes) {
			totalArea += shape.calculateArea();
		}
		return totalArea;
	}
}
