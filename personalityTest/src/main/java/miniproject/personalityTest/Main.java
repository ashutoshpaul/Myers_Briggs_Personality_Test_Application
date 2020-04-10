package miniproject.personalityTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    
	static final int width = 800;
	static final int height = 450;
	
	static Parent root;
	static Scene scene;
	static Stage stage;
	
	static String personalitySelected = "";	//used in HomeScreenFXML to view description of personality
	
	@Override
	public void start(Stage s) throws Exception {
		root = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
		//root = FXMLLoader.load(getClass().getResource("testFXML.fxml"));
		scene = new Scene(root, width, height);
		s.setTitle("Personality Test Application");
        s.setScene(scene);
        s.show();
	}
	
	public static void main(String[] args) {
    	launch(args);
    }
}

