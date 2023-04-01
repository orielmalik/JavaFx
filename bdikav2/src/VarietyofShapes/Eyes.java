package VarietyofShapes;

import javafx.scene.Group;

//class for 2 eyes
public class Eyes {
	private Eye[] eyes=new Eye[2];
public Eyes(int cxone,int cyone) {
		 eyes[0]=new Eye(cxone-100,cyone);
		 eyes[1]=new Eye(cxone+100,cyone);
}
public Eyes() {//default package
	for (int i = 0; i < 2; i++) {
		eyes[i]=new Eye(100,200);
		}
 eyes[1].setcenterx(200);
}
public int []getCenterX() {
	int array[]=new int[2];
	 for (int i = 0; i < 2; i++) {
	array[i]=eyes[i].getcenterx();}
	 return array;
}	
public int []getCentery() {
	int array[]=new int[2];
	 for (int i = 0; i < 2; i++) {
	array[i]=eyes[i].getcentery();}
	 return array;
}	


public void handler(double mouseX,double mouseY) {
eyes[0].handle(mouseX, mouseY);
eyes[1].handle(mouseX, mouseY);
}


public void show(Group r) {
	for (int i = 0; i < 2; i++) {
		eyes[i].show(r);}
	}

}

	
	

