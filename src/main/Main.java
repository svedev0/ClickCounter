package main;

import javafx.application.Application;
import javafx.scene.Scene;
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

	public void start(Stage window) {
		
		VBox root = new VBox();
		
		// Create labels
		Label clicksLabel = new Label("Number Of Clicks:");
		Label clicksCounter = new Label();
		
		// Create incrementing button
		
		
		// Change text to clicks
		clicksCounter.setText("" + Counter.getClicks());
		
		// Styling
		clicksLabel.setStyle("-fx-font-size: 2.5em;"
						   + "-fx-font-family: consolas;");
		
		clicksCounter.setStyle("-fx-font-size: 3em;"
						     + "-fx-font-family: consolas;");
		
		// Add all children
		root.getChildren().add(clicksLabel);
		root.getChildren().add(clicksCounter);
		
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
