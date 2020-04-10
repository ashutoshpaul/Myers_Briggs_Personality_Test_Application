package miniproject.personalityTest;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.Window;

public class emailFXMLController {
	
	@FXML
	TextField email;
	
	@FXML
	Button receiveEmail;
	
	@FXML
	Button cancel;
	
	@FXML
	Label connectionStatus;
	
	@FXML
	public void initialize() {
		connectionStatus.setVisible(false);
		receiveEmail.setOnAction(e -> {
			if(email.getText().trim().equalsIgnoreCase("") != true) {
				connectionStatus.setVisible(false);
				boolean isSent = SendEmail.sendMail(email.getText().trim(), resultFXMLController.userPersonality, resultFXMLController.userTag, resultFXMLController.userDescription, resultFXMLController.userLikePersonalityPeople);
				if(isSent == true) {
					connectionStatus.setVisible(false);
					Alert sent = new Alert(AlertType.INFORMATION);
					sent.setTitle("Successful");
					sent.setHeaderText("Email Sent Successfully");
					sent.setContentText("An email has been sent to your mail ID. The email consits "
							+ "of your personality report. Press OK to continue.\n\n\n");
					Optional<ButtonType> btn = sent.showAndWait();
					if(btn.get() == ButtonType.OK) {
						//go to homeScreenFXML
						try {
							Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
							
							Scene scene = receiveEmail.getScene();
							Window window = scene.getWindow();
							Stage stage = (Stage) window;
							
							receiveEmail.getScene().setRoot(loader);
							
						}catch(Exception exp) {
							System.out.println("emailFXMLController: " + exp);
						}
					}
				}else {
					connectionStatus.setVisible(true);
				}
			}else {		//empty email field
				Alert error = new Alert(AlertType.WARNING);
				error.setTitle("Message");
				error.setHeaderText("Email field empty");
				error.setContentText("Email field is empty. Please enter your email ID.\n\n\n");
				error.show();
			}
		});
		
		cancel.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
				
				Scene scene = cancel.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				cancel.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("emailFXMLController: " + exp);
			}
		});
		
		//cancel
		cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';");
		cancel.setOnMouseExited(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';"));
		cancel.setOnMouseReleased(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';"));
		
		cancel.setOnMouseEntered(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'white';" + "-fx-text-fill: 'red';" + "-fx-font-size: 12px;" + "-fx-font-weight: bold;" + "-fx-border-width: 1.5px;"));
		cancel.setOnMousePressed(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'white';" + "-fx-text-fill: 'red';" + "-fx-font-size: 12px;" + "-fx-font-weight: bold;" + "-fx-border-width: 1.5px;"));
		
		//receiveEmail
		receiveEmail.setStyle("-fx-border-color: '#4d4dff';" + "-fx-background-color: '#4d4dff';" + "-fx-text-fill: 'white';");
		receiveEmail.setOnMouseExited(e -> receiveEmail.setStyle("-fx-border-color: '#4d4dff';" + "-fx-background-color: '#4d4dff';" + "-fx-text-fill: 'white';"));
		receiveEmail.setOnMouseReleased(e -> receiveEmail.setStyle("-fx-border-color: '#4d4dff';" + "-fx-background-color: '#4d4dff';" + "-fx-text-fill: 'white';"));
		
		receiveEmail.setOnMouseEntered(e -> receiveEmail.setStyle("-fx-border-color: '#0000ff';" + "-fx-background-color: '#0000ff';" + "-fx-text-fill: 'white';" + "-fx-font-size: 11.5px;" + "-fx-font-weight: bold;"));
		receiveEmail.setOnMousePressed(e -> receiveEmail.setStyle("-fx-border-color: '#0000ff';" + "-fx-background-color: '#0000ff';" + "-fx-text-fill: 'white';" + "-fx-font-size: 11.5px;" + "-fx-font-weight: bold;"));
	
	}
}
