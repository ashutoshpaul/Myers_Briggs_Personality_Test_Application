package miniproject.personalityTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import miniproject.notice.NoticeObject;
import miniproject.notice.NoticePane;

public class descriptionFXMLController {
	
	@FXML
	Button back;
	
	@FXML
	Label personalityTag;
	
	@FXML
	Label personalityName;
	
	@FXML
	Text description;
	
	@FXML
	Label likePersonalityPeople;
	
	@FXML
	Label serverStatus;
	
	@FXML
	public void initialize() {
		serverStatus.setVisible(false);
		
		//back
		try {
		FileInputStream inputBackImage = new FileInputStream("images/back.png");
		Image backImage = new Image(inputBackImage);
		back.setGraphic(new ImageView(backImage));
		}catch(Exception e) {}
		
		back.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("aboutFXML.fxml"));
				
				Scene scene = back.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				back.getScene().setRoot(loader);
				
			}catch(Exception exp) {
				System.out.println("descriptionFXMLController: " + exp);
			}
		});
		
		//send request to Server
		loadDescription();
		
	}
	
	public void loadDescription() {
		
		try {
			URL url = new URL("http://127.0.0.1:5000/description/" + Main.personalitySelected);
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
			
			personalityTag.setText(Main.personalitySelected);
			
			int count = 0;
			for(PersonalityClass x : personality) {
				if(count == 0) {
					personalityName.setText(x.getData());
					count = 1;
				}else if(count == 1) {
					description.setText(x.getData());
					count = 2;
				}else {
					likePersonalityPeople.setText(x.getData());
					count = 0;
				}
			}
			
		}catch(ConnectException c) {
			serverStatus.setVisible(true);		//-1;	//no connection
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
