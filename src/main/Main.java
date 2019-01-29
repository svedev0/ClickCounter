package main;

import javafx.application.Application;
import javafx.scene.Scene;
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
		
		StackPane root = new StackPane();
		
		Scene mainScene = new Scene(root, windowWidth, windowHeight);
	
		
		
		// Window parameters
        window.getIcons().add(new Image("/icons/icon.png"));
		window.setTitle("Click Counter");
		window.setResizable(false);
        window.setScene(mainScene);
        window.show();
    }
}
