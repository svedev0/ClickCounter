package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) throws Exception {
		launch(args);
	}

	// This is just obvious
	public static int windowWidth = 300;
	public static int windowHeight = 300;
	
	int clicks;
	
	public void start(Stage window) {
		
		VBox root = new VBox();
		
		// Create labels
		Label clicksLabel = new Label("Number Of Clicks:");
		Label clicksCounter = new Label();
		
		// Change text to clicks
		clicksCounter.setText("" + clicks);
		
		// Create incrementing button
		Button clickIncrement = new Button("Click Here!");
		clickIncrement.setOnAction(e -> clicks++);
		clickIncrement.setOnAction(e -> System.out.println(clicks));
		
		// Styling
		clicksLabel.setStyle("-fx-font-size: 2.5em; -fx-font-family: consolas;");
		
		clicksCounter.setStyle("-fx-font-size: 3em; -fx-font-family: consolas;");
		
		clickIncrement.setStyle("-fx-font-size: 1.5em;");
		
		// Add all children
		root.getChildren().add(clicksLabel);
		root.getChildren().add(clicksCounter);
		root.getChildren().add(clickIncrement);
		
		// Main scene
		Scene mainScene = new Scene(root, windowWidth, windowHeight);
        
		// Window parameters
        window.getIcons().add(new Image("/icons/icon.png"));
		window.setTitle("Click Counter");
		window.setResizable(false);
        window.setScene(mainScene);
        window.show();
    }
}
