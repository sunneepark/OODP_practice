package Shape;

import Color.ColorImp;

public abstract class Shape {
	ColorImp color;
	public Shape(ColorImp color) {
		this.color=color;
	}
	public abstract void applyColor();
}
