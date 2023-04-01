package VarietyofShapes;

import javafx.scene.Group;

public class Diamond extends Shape {
	Downertriangle d;
	Upperrtriangle T;

	public Diamond(int cx, int cy) {
		super(cx, cy);
	}

	public void handle(double mousex, double mousey) {
		super.handle(mousex, mousey);
	}

	public void show(Group root) {
		Downertriangle d = new Downertriangle(centerx, centery, 70);
		Upperrtriangle T = new Upperrtriangle(centerx, centery, 70);
		d.show(root);
		T.show(root);
		super.show(root);
	}
}
