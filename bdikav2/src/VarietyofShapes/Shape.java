package VarietyofShapes;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public abstract class Shape {
	protected int centerx, centery;
protected Eyes e;
	public Shape(int cx, int cy) {
		this.centerx = cx;
		this.centery = cy;
		e=new Eyes(cx,cy);
	}

	public void setcenterx(int leftPX) {
		this.centerx = leftPX;
	}

	public void setcentery(int cy) {
		this.centery = cy;
	}

	public int getcenterx() {
		return this.centerx;
	}

	public int getcentery() {
		return this.centery;
	}

	public int getRadiuseye() {
		return 50;
	}

	public int getRadiuspupil() {
		return 15;
	}

	public void show(Group root) {
		e = new Eyes(this.centerx, this.centery);
		e.show(root);
	}

	public void handle(double mousex, double mousey) {
		e.handler(mousex, mousey);
	}
}
