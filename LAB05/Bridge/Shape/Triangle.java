package Shape;

import Color.ColorImp;

public class Triangle extends Shape{
	public Triangle(ColorImp c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColorImp();
	}
}
