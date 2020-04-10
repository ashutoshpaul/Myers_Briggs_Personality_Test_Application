package miniproject.personalityTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public class resultFXMLController {
	
	@FXML
	Label personality;
	
	@FXML
	Label tag;
	
	@FXML
	Text description;
	
	@FXML
	Label likePersonalityPeople;
	
	@FXML
	Button sendEmail;
	
	@FXML
	Button done;
	
	static String userPersonality = "";
	static String userTag = "";
	static String userDescription = "";
	static String userLikePersonalityPeople = "";
	
	@FXML
	public void initialize() {
		personality.setText(Main.personalitySelected);
		tag.setText(getPersonalityTag(Main.personalitySelected));
		
		userPersonality = personality.getText().trim();
		userTag = tag.getText().trim();
		
		
		//load rest data from the Server
		try {
			URL url = new URL("http://127.0.0.1:5000/description/" + tag.getText().trim());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "JSON");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
			String output,result = "";
			
			while ((output = br.readLine()) != null) {
				result += output.trim();
			}
			
			result = result.replace("\\", "");
			result = result.substring(1, result.length() - 1);
			
			Gson gson = new Gson();
			PersonalityClass[] personality = gson.fromJson(result, PersonalityClass[].class);
			
			int count = 0;
			for(PersonalityClass x : personality) {
				if(count == 0) {
					count = 1;
				}else if(count == 1) {
					description.setText(x.getData());
					userDescription = description.getText().trim();
					count = 2;
				}else {
					likePersonalityPeople.setText(x.getData());
					userLikePersonalityPeople = likePersonalityPeople.getText().trim();
					count = 0;
				}
			}
			
		}catch(ConnectException c) {
			//serverStatus.setVisible(true);		//-1;	//no connection
		}catch(Exception e) {}
		
		//done
		done.setStyle("-fx-background-color: '#1a1aff';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#1a1aff';");
		done.setOnMouseExited(e -> done.setStyle("-fx-background-color: '#1a1aff';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#1a1aff';"));
		done.setOnMouseReleased(e -> done.setStyle("-fx-background-color: '#1a1aff';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#1a1aff';"));
		
		done.setOnMouseEntered(e -> done.setStyle("-fx-background-color: '#e6e6e6';" + "-fx-text-fill: '#1a1aff';" + "-fx-border-color: '#1a1aff';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
		done.setOnMousePressed(e -> done.setStyle("-fx-background-color: '#e6e6e6';" + "-fx-text-fill: '#1a1aff';" + "-fx-border-color: '#1a1aff';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
		
		done.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
				
				Scene scene = done.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				done.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("resultFXMLController: " + exp);
			}
		});
		
		//sendEmail
		sendEmail.setStyle("-fx-background-color: '#ff751a';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#ff751a';");
		sendEmail.setOnMouseExited(e -> sendEmail.setStyle("-fx-background-color: '#ff751a';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#ff751a';"));
		sendEmail.setOnMouseReleased(e -> sendEmail.setStyle("-fx-background-color: '#ff751a';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#ff751a';"));
		
		sendEmail.setOnMouseEntered(e -> sendEmail.setStyle("-fx-background-color: '#e6e6e6';" + "-fx-text-fill: '#ff751a';" + "-fx-border-color: '#ff751a';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
		sendEmail.setOnMousePressed(e -> sendEmail.setStyle("-fx-background-color: '#e6e6e6';" + "-fx-text-fill: '#ff751a';" + "-fx-border-color: '#ff751a';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
		
		sendEmail.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("emailFXML.fxml"));
				
				Scene scene = done.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				done.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("resultFXMLController: " + exp);
			}
		});
		
	}
	
	public String getPersonalityTag(String name) {
		//name: Personality name returned from the Server.
		
		String tag = "";
		switch(name.toLowerCase()) {
			case "protagonist":
				tag = "ENFJ";
			break;
			case "advocate":
				tag = "INFJ";
			break;
			case "campaigner":
				tag = "ENFP";
			break;
			case "mediator":
				tag = "INFP";
			break;
			case "mastermind":
				tag = "INTJ";
			break;
			case "commander":
				tag = "ENTJ";
			break;
			case "logician":
				tag = "INTP";
			break;
			case "debater":
				tag = "ENTP";
			break;
			case "entertainer":
				tag = "ESFP";
			break;
			case "adventurer":
				tag = "ISFP";
			break;
			case "virtuoso":
				tag = "ISTP";
			break;
			case "entrepreneur":
				tag = "ESTP";
			break;
			case "consul":
				tag = "ESFJ";
			break;
			case "defender":
				tag = "ISFJ";
			break;
			case "logistician":
				tag = "ISTJ";
			break;
			case "executive":
				tag = "ESTJ";
			break;
			default:
				tag = "";
		}
		
		return tag;
	}
}
