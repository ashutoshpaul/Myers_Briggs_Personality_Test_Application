package miniproject.personalityTest;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.net.URI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;

public class aboutFXMLController {
	
	@FXML
	Button back;
	
	@FXML
	ComboBox personalityTypes;
	
	@FXML
	Button visitWebsite;
	
	String website = "https://www.myersbriggs.org/my-mbti-personality-type/take-the-mbti-instrument/home.htm?bhcp=1";
	
	@FXML
	public void initialize() {
		
		//back
		try {
		FileInputStream inputBackImage = new FileInputStream("images/back.png");
		Image backImage = new Image(inputBackImage);
		back.setGraphic(new ImageView(backImage));
		}catch(Exception e) {}
		
		back.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
				
				Scene scene = back.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				back.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("aboutFXMLController: " + exp);
			}
		});
		
		visitWebsite.setOnAction(e -> {
			try {
				if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				    Desktop.getDesktop().browse(new URI(website));
				}
			}catch(Exception ex) {}
		});
		
		visitWebsite.setStyle("-fx-background-color: '#e6ffff';" + "-fx-text-fill: '#000080';");
		visitWebsite.setUnderline(false);
		visitWebsite.setOnMouseExited(e -> {
			visitWebsite.setStyle("-fx-background-color: '#e6ffff';" + "-fx-text-fill: '#000080';");
			visitWebsite.setUnderline(false);
		});
		visitWebsite.setOnMouseReleased(e -> {
			visitWebsite.setStyle("-fx-background-color: '#e6ffff';" + "-fx-text-fill: '#000080';");
			visitWebsite.setUnderline(false);
		});
		visitWebsite.setOnMouseEntered(e -> {
			visitWebsite.setStyle("-fx-background-color: '#e6ffff';" + "-fx-text-fill: '#000080';");
			visitWebsite.setUnderline(true);
		});
		visitWebsite.setOnMousePressed(e -> {
			visitWebsite.setStyle("-fx-background-color: '#e6ffff';" + "-fx-text-fill: '#000080';");
			visitWebsite.setUnderline(true);
		});
		
		//personalityTypes
		personalityTypes.getItems().add("ENFJ (Protagonist)");
		personalityTypes.getItems().add("INFJ (Advocate)");
		personalityTypes.getItems().add("ENFP (Campaigner)");
		personalityTypes.getItems().add("INFP (Mediator)");
		personalityTypes.getItems().add("INTJ (Mastermind)");
		personalityTypes.getItems().add("ENTJ (Commander)");
		personalityTypes.getItems().add("INTP (Logician)");
		personalityTypes.getItems().add("ENTP (Debater)");
		personalityTypes.getItems().add("ESFP (Entertainer)");
		personalityTypes.getItems().add("ISFP (Adventurer)");
		personalityTypes.getItems().add("ISTP (Virtuoso)");
		personalityTypes.getItems().add("ESTP (Entrepreneur)");
		personalityTypes.getItems().add("ESFJ (Consul)");
		personalityTypes.getItems().add("ISFJ (Defender)");
		personalityTypes.getItems().add("ISTJ (Logistician)");
		personalityTypes.getItems().add("ESTJ (Executive)");
		
		personalityTypes.setOnAction(e -> {
			try {
				Main.personalitySelected = personalityTypes.getSelectionModel().getSelectedItem().toString().substring(0 , personalityTypes.getSelectionModel().getSelectedItem().toString().indexOf(" "));
				Parent loader = FXMLLoader.load(getClass().getResource("descriptionFXML.fxml"));
				
				Scene scene = personalityTypes.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				personalityTypes.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("aboutFXMLController: " + exp);
			}
		});
		
	}
}
