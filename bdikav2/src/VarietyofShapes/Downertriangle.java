package VarietyofShapes;



import java.util.Random;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
public class Downertriangle extends Shape {
private  int distance;
public Downertriangle(int cx,int cy,int d) {
super(cx,cy);	
if(d>=100) {
this.distance=d;
	}
else {
this.distance=60+d;	
}
	}
public int getDistance() {return distance;}
public void setDistance(int distance) {this.distance = distance;}
public void handle(double mousex,double mousey) {
	super.handle(mousex, mousey);
	}
	
	public void show(Group root) {
	Polygon Downertriangle=new Polygon();
	Downertriangle.getPoints().addAll(new Double[] { 
		(double) centerx+20,(double)centery+this.distance,
		(double) this.centerx-this.distance,(double) this.centery,
		(double)this.centerx+this.distance,(double) this.centery	
	});
	Random rnd=new Random();
	int red = rnd.nextInt(255);
	int green = rnd.nextInt(255);
	int blue = rnd.nextInt(255);
	Downertriangle.setFill(Color.rgb(red, green, blue, .99));
	root.getChildren().add(Downertriangle);
	super.show(root);

	}
	

}
