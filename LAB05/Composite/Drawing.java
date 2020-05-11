package Composite;

import java.util.ArrayList;

public class Drawing implements Shape {
	ArrayList<Shape> shapes;
	
	public Drawing() {
		shapes = new ArrayList<>();	
	}
	public void add(Shape s) {
		shapes.add(s);
	}

	public void remove(Shape s) {
		shapes.remove(s);
	}

	public void clear() {
		shapes.clear();
	}

	@Override
	public void draw(String str) {
		// TODO Auto-generated method stub
		for(Shape item:shapes)
			item.draw(str);
	}

}
