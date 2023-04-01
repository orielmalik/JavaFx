package VarietyofShapes;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Circleshaped extends Shape{

	public Circleshaped(int cx,int cy) {
super(cx,cy);

	}
	public void handle(double mousex,double mousey) {
	super.handle(mousex, mousey);
	}
	public void show(Group root) {
		 Circle c=new Circle(this.centerx,this.centery,90);
		 Random rnd=new Random();
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			c.setFill(Color.rgb(red, green, blue, .99));
			root.getChildren().add(c);
			super.show(root);
	}
}
