package VarietyofShapes;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eye {

	protected int centerx, centery, px, py;// p=pupil
	Circle eye;
	Circle pupil;
	public Eye() {
		System.out.println("Deafult package of (110,220)");
		this.centerx = 110;
		this.centery = 220;
	}

	public Eye(int cx, int cy) {
		this.centerx = cx;
		this.centery = cy;
		this.px = cx;
		this.py = cy;
		 pupil = new Circle(px, py, 20);
	}

	public void setcenterx(int cx) {
		this.centerx = cx;
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

	public void setcenterxpupil(int p) {
		this.px = p;
	}

	public void setcenterypupil(int pc) {
		this.py = pc;
	}

	public int getRadiuseye() {
		return 50;
	}

	public int getRadiuspupil() {
		return 20;
	}

	public void handle(double mouseX, double mouseY) {

		double leftCX = (double) this.centerx, leftCY = (double) this.centery, leftPX, leftPY;
		double length = Math.sqrt((mouseX - leftCX) * (mouseX - leftCX) + (mouseY - leftCY) * (mouseY - leftCY));
		double vx = (mouseX - leftCX) / length;
		double vy = (mouseY - leftCY) / length;
		leftPX = leftCX + vx * 30;
		leftPY = leftCY + vy * 30;
		this.setcenterxpupil((int) leftPX);
		this.setcenterypupil((int) leftPY);
		
		update();
	}
	public void update() {
		this.pupil.setCenterX(px);
		this.pupil.setCenterY(py);
	}

	public void show(Group root) {
		 eye = new Circle(this.centerx, this.centery, 50);
		eye.setFill(Color.WHITE);
		eye.setStroke(Color.BLACK);
		 pupil = new Circle(px, py, 20);
		
		root.getChildren().addAll(eye, pupil);
	}

}