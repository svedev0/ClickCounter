package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	// This is just obvious
	public static int windowWidth = 250;
	public static int windowHeight = 210;
	
	int clicks;
	
	public static void main(String[] args) throws Exception {
		launch(args);
	}
	
	public void start(Stage window) {
		
		// Main stackpane
		StackPane root = new StackPane();
		
		// Main scene
		Scene mainScene = new Scene(root, windowWidth, windowHeight);
	
		// Number of clicks
		Label clicksLabel = new Label();
		clicksLabel.setText("" + clicks);
		
		// Create incrementing button
		Button clickIncrement = new Button("Click Here!");
		clickIncrement.setOnAction(e -> clicks++);
		clickIncrement.setOnAction(e -> System.out.println(clicks));
		
		root.getChildren().add(clicksLabel);
		root.getChildren().add(clickIncrement);
		
		// Styling
		StackPane.setAlignment(clickIncrement, Pos.CENTER);
		clickIncrement.setStyle("-fx-background-radius: 20em; "
							  + "-fx-min-width: 120px;"
               				  + "-fx-min-height: 120px;"
               				  + "-fx-max-width: 120px;"
               				  + "-fx-max-height: 120px;");
		
		StackPane.setAlignment(clicksLabel, Pos.TOP_CENTER);
		clicksLabel.setStyle("-fx-font-size: 3em;");
		
		// Window parameters
        window.getIcons().add(new Image("/icons/icon.png"));
		window.setTitle("Click Counter");
		window.setResizable(false);
        window.setScene(mainScene);
        window.show();
    }
}
