/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursion;

/**
 *
 * @author nana
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
	
public class RekursionBaum extends Application {

			 	private Group root;
			 	private Pane draw;
			 	
			 	int cursorX = 0;
			 	int cursorY = 200;
			 	
			 	public static void main(String[] args){
			 		launch(args);
			 	}
			 	
			 	void drawLine() {
			 		Line line = new Line(300, 350, 300 , 250);
			 		Line lineR = new Line(200 , 350, 200 + 50*Math.cos(45), 350 + 50*Math.sin(45));
			 		draw.getChildren().add(line);	
			 		draw.getChildren().add(lineR);
			 	}
			 
			 	@Override
			 	public void start(Stage primaryStage) throws Exception {
			 		System.out.println("Test");
			 		
			 		root = new Group();
			 		draw = new Pane();
			 		
			 		Scene scene = new Scene(root, 600, 400);
			 		primaryStage.setScene(scene);
			 		primaryStage.setTitle("Aufgabe 3.1");
			 		
			 		Pane borderpane = new Pane();
			 		borderpane.getChildren().add(draw);
			 		root.getChildren().add(borderpane);
			 		primaryStage.show();
			 		
			 		drawLine();
			 	}
}