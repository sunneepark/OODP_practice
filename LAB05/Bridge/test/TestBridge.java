package test;

import 	Shape.*;
import Color.*;

public class TestBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape tri = new Triangle(new Red());
		Shape pen = new Pentagon(new Green());
		tri.applyColor();
		pen.applyColor();
	}

}
