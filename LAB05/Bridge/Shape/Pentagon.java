package Shape;

import Color.ColorImp;

public class Pentagon extends Shape {
	public Pentagon(ColorImp c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColorImp();
	}

}
