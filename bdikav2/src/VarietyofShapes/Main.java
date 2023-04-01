package VarietyofShapes;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {

	public static void main(String[] args)  {
		launch(args);

	}


	@Override
	public void start(Stage stage) throws Exception {
		Random rnd = new Random();
		Label lblEnterName = new Label();
		lblEnterName.setText(("Enter name:"));
		
		int[] p = new int[10];// p=random places
		for (int i = 0; i < 10; i++) {
			p[i] = (int) (70 + rnd.nextInt(400));
		}
		Group root = new Group();
		Scene scene = new Scene(root, 700, 700);
		scene.setFill(Color.GRAY);
		Shape[] shap = new Shape[5];
		shap[0] = new Circleshaped(p[0], p[1]);
		shap[1] = new Diamond(p[2], p[3]);
		shap[2] = new Downertriangle(p[4], p[5], 100);
		shap[3] = new Upperrtriangle(p[6], p[7], 100);
		shap[4] = new Square(p[8], p[9]);

		scene.addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				double mouseX = event.getX();
				double mouseY = event.getY();
				for (int i = 0; i < shap.length; i++) {
					shap[i].handle(mouseX, mouseY);
				}

			}
		});
		Button b0 = new Button("Add circle");

		b0.setLayoutX(550);
		b0.setLayoutY(100);
		b0.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				shap[0].show(root);

			}
		});
		Button b1 = new Button("Add Diamond");
		b1.setLayoutX(550);
		b1.setLayoutY(150);
		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				shap[1].show(root);

			}
		});

		Button b2 = new Button("Add Downertriangle");
		b2.setLayoutX(550);
		b2.setLayoutY(200);
		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg3) {
				shap[2].show(root);

			}
		});
		Button b3 = new Button("Add Upperrtriangle");
		b3.setLayoutX(550);
		b3.setLayoutY(300);
		b3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg2) {
				shap[3].show(root);

			}
		});
		Button b4 = new Button("Add Square");
		b4.setLayoutX(550);
		b4.setLayoutY(350);
		b4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg1) {
				shap[4].show(root);

			}
		});

		// Mouse Event

		EventHandler<MouseEvent> click = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				double x, y; // where in the window the click was made
				x = event.getX();
				y = event.getY();
				
				Text txt = new Text();
				txt.setX(x);
				txt.setY(y);
				txt.setText("[" + (int) x + "," + (int) y + "]");

				root.getChildren().add(txt);
			}
		};
		lblEnterName.setWrapText(true);
		root.getChildren().addAll(b0, b1, b2, b3, b4); // add buttons to root
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED, click);
		stage.setScene(scene);
		stage.setTitle("Original");
		root.getChildren().add(lblEnterName);
		// 4. show stage
		stage.show();

	}
}
