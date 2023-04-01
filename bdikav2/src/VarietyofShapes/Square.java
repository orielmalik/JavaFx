package VarietyofShapes;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.Random;
public class Square extends Shape {
public Square(int cx,int cy)	{
super(cx,cy);
}
public void handle(double mousex,double mousey) {
	super.handle(mousex, mousey);
}
public void show (Group root) {
	Random rnd=new Random();
Rectangle s = new Rectangle(this.centerx-80,this.centery+20,200,200) ;
int red = rnd.nextInt(255);
int green = rnd.nextInt(255);
int blue = rnd.nextInt(255);
s.setFill(Color.rgb(red, green, blue, .99));
root.getChildren().addAll(s);
super.show(root);

}	
	
	
	
}
