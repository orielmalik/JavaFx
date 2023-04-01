package VarietyofShapes;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Upperrtriangle extends Shape {
	private int distance;

	public Upperrtriangle(int cx, int cy, int d) {
		super(cx, cy);
		if (d >= 100) {
			this.distance = d;
		} else {
			this.distance = 60 + d;
		}
	}

	public void handle(double mousex, double mousey) {
		super.handle(mousex, mousey);
	}

	public void show(Group root) {
		Polygon uppert = new Polygon();
		uppert.getPoints()
				.addAll(new Double[] { (double) centerx, (double) centery - this.distance,
						(double) this.centerx - this.distance, (double) this.centery,
						(double) this.centerx + this.distance, (double) this.centery });
		Random rnd = new Random();
		int red = rnd.nextInt(255);
		int green = rnd.nextInt(255);
		int blue = rnd.nextInt(255);
		uppert.setFill(Color.rgb(red, green, blue, .99));
		root.getChildren().addAll(uppert);

		super.show(root);

	}

}
