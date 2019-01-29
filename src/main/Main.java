package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		Component button = new Button("Click Here!");

		button.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				if (e.MOUSE_CLICKED) {
					clicks++;
				} else {
					return;
				}
			}
		});

		// Window parameters
		window.getIcons().add(new Image("/icons/icon.png"));
		window.setTitle("Click Counter");
		window.setResizable(false);
		window.setScene(mainScene);
		window.show();
	}
}
