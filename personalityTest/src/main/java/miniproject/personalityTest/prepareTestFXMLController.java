package miniproject.personalityTest;

import java.io.FileInputStream;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;

public class prepareTestFXMLController {
	
	@FXML
	Button back;
	
	@FXML
	Button test;
	
	@FXML
	public void initialize() {
		
		//back
		try {
		FileInputStream inputBackImage = new FileInputStream("images/back.png");
		Image backImage = new Image(inputBackImage);
		back.setGraphic(new ImageView(backImage));
		}catch(Exception e) {}
		
		test.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("testFXML.fxml"));

				Scene scene = test.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				test.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("prepareTestFXMLController: " + exp);
			}
		});
		
		//test
		test.setStyle("-fx-background-color: '#0000cc';" + "-fx-text-fill: 'white';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;");
		test.setOnMouseExited(e -> test.setStyle("-fx-background-color: '#0000ff';" + "-fx-text-fill: 'white';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;"));
		test.setOnMouseReleased(e -> test.setStyle("-fx-background-color: '#0000ff';" + "-fx-text-fill: 'white';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;"));
		
		test.setOnMouseEntered(e -> test.setStyle("-fx-background-color: '#0000cc';" + "-fx-text-fill: 'white';" + "-fx-font-size: 13.5px;" + "-fx-font-weight: bold;"));
		test.setOnMousePressed(e -> test.setStyle("-fx-background-color: '#0000cc';" + "-fx-text-fill: 'white';" + "-fx-font-size: 13.5px;" + "-fx-font-weight: bold;"));
	
		back.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));

				Scene scene = back.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				back.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("prepareTestFXMLController: " + exp);
			}
		});
	}
}
