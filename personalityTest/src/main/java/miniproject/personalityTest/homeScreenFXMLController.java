package miniproject.personalityTest;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class homeScreenFXMLController {
	
	@FXML
	Button about;
	
	@FXML
	Button takeTest;
	
	@FXML
	Button aboutApp;
	
	@FXML
	Button developer;
	
	@FXML
	public void initialize() {
		
		takeTest.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("prepareTestFXML.fxml"));

				Scene scene = takeTest.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				takeTest.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("homeScreenFXMLController: " + exp);
			}
		});
		
		about.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("aboutFXML.fxml"));

				Scene scene = about.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				about.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("homeScreenFXMLController: " + exp);
			}
		});
		
		developer.setOnAction(e -> {
			Alert sent = new Alert(AlertType.INFORMATION);
			sent.setTitle("Developer");
			sent.setHeaderText("Ashutosh Paul");
			sent.setContentText("This Application has been developed by Ashutosh Paul who is a "
					+ "3rd year CSE, BE student.\n\n\n");
			sent.show();
		});
		
		aboutApp.setOnAction(e -> {
			Alert sent = new Alert(AlertType.INFORMATION);
			sent.setTitle("About");
			sent.setHeaderText("About App");
			sent.setContentText("This is a simple application. User can take the test comprising "
					+ "of 40 questions and get to know his/her personality.\n\n\n");
			sent.show();
		});
	}
}
