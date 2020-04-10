package miniproject.personalityTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import com.google.gson.Gson;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class TestFXMLController {
	
	Label q0 = new Label();
	Label q1 = new Label();
	Label q2 = new Label();
	Label q3 = new Label();
	Label q4 = new Label();
	Label q5 = new Label();
	Label q6 = new Label();
	Label q7 = new Label();
	Label q8 = new Label();
	Label q9 = new Label();
	Label q10 = new Label();
	Label q11 = new Label();
	Label q12 = new Label();
	Label q13 = new Label();
	Label q14 = new Label();
	Label q15 = new Label();
	Label q16 = new Label();
	Label q17 = new Label();
	Label q18 = new Label();
	Label q19 = new Label();
	Label q20 = new Label();
	Label q21 = new Label();
	Label q22 = new Label();
	Label q23 = new Label();
	Label q24 = new Label();
	Label q25 = new Label();
	Label q26 = new Label();
	Label q27 = new Label();
	Label q28 = new Label();
	Label q29 = new Label();
	Label q30 = new Label();
	Label q31 = new Label();
	Label q32 = new Label();
	Label q33 = new Label();
	Label q34 = new Label();
	Label q35 = new Label();
	Label q36 = new Label();
	Label q37 = new Label();
	Label q38 = new Label();
	Label q39 = new Label();
	
	Label qX = new Label();
	
	Slider s0 = new Slider(-10 , +10 , 5);
	Slider s1 = new Slider(-10 , +10 , 5);
	Slider s2 = new Slider(-10 , +10 , 5);
	Slider s3 = new Slider(-10 , +10 , 5);
	Slider s4 = new Slider(-10 , +10 , 5);
	Slider s5 = new Slider(-10 , +10 , 5);
	Slider s6 = new Slider(-10 , +10 , 5);
	Slider s7 = new Slider(-10 , +10 , 5);
	Slider s8 = new Slider(-10 , +10 , 5);
	Slider s9 = new Slider(-10 , +10 , 5);
	Slider s10 = new Slider(-10 , +10 , 5);
	Slider s11 = new Slider(-10 , +10 , 5);
	Slider s12 = new Slider(-10 , +10 , 5);
	Slider s13 = new Slider(-10 , +10 , 5);
	Slider s14 = new Slider(-10 , +10 , 5);
	Slider s15 = new Slider(-10 , +10 , 5);
	Slider s16 = new Slider(-10 , +10 , 5);
	Slider s17 = new Slider(-10 , +10 , 5);
	Slider s18 = new Slider(-10 , +10 , 5);
	Slider s19 = new Slider(-10 , +10 , 5);
	Slider s20 = new Slider(-10 , +10 , 5);
	Slider s21 = new Slider(-10 , +10 , 5);
	Slider s22 = new Slider(-10 , +10 , 5);
	Slider s23 = new Slider(-10 , +10 , 5);
	Slider s24 = new Slider(-10 , +10 , 5);
	Slider s25 = new Slider(-10 , +10 , 5);
	Slider s26 = new Slider(-10 , +10 , 5);
	Slider s27 = new Slider(-10 , +10 , 5);
	Slider s28 = new Slider(-10 , +10 , 5);
	Slider s29 = new Slider(-10 , +10 , 5);
	Slider s30 = new Slider(-10 , +10 , 5);
	Slider s31 = new Slider(-10 , +10 , 5);
	Slider s32 = new Slider(-10 , +10 , 5);
	Slider s33 = new Slider(-10 , +10 , 5);
	Slider s34 = new Slider(-10 , +10 , 5);
	Slider s35 = new Slider(-10 , +10 , 5);
	Slider s36 = new Slider(-10 , +10 , 5);
	Slider s37 = new Slider(-10 , +10 , 5);
	Slider s38 = new Slider(-10 , +10 , 5);
	Slider s39 = new Slider(-10 , +10 , 5);
	
	Pane pane0 = new Pane();
	Pane pane1 = new Pane();
	Pane pane2 = new Pane();
	Pane pane3 = new Pane();
	Pane pane4 = new Pane();
	
	@FXML
	Button cancel;
	
	@FXML
	AnchorPane root;
	
	@FXML
	Button reset;
	
	int category0 = 0;
	int category1 = 0;
	int category2 = 0;
	int category3 = 0;
	
	Button submit = new Button("Submit");
	
	@FXML
	public void initialize() {
		
		//reset
		try {
			FileInputStream inputResetImage = new FileInputStream("images/reset.png");
			Image resetImage = new Image(inputResetImage);
			reset.setGraphic(new ImageView(resetImage));
		}catch(Exception e) {}
		
		root.setStyle("-fx-background-color: 'white';");
		
		pane0.setStyle("-fx-background-color: '#ccccb3';");
		pane1.setStyle("-fx-background-color: '#e0e0d1';");
		pane2.setStyle("-fx-background-color: '#ffffb3';");
		pane3.setStyle("-fx-background-color: '#c6ffb3';");
		pane4.setStyle("-fx-background-color: '#b3ff99';");
		
		root.getChildren().addAll(pane0 , pane1 , pane2 , pane3 , pane4);
		
		pane0.setPrefWidth(120.0);
		pane1.setPrefWidth(120.0);
		pane2.setPrefWidth(120.0);
		pane3.setPrefWidth(120.0);
		pane4.setPrefWidth(120.0);
		
		//pane0
		AnchorPane.setTopAnchor(pane0, 20.0);
		AnchorPane.setLeftAnchor(pane0, 100.0);
		AnchorPane.setBottomAnchor(pane0, 0.0);
		AnchorPane.setBottomAnchor(pane0, 70.0);
		//pane1
		AnchorPane.setTopAnchor(pane1, 20.0);
		AnchorPane.setLeftAnchor(pane1, 220.0);
		AnchorPane.setBottomAnchor(pane1, 0.0);
		AnchorPane.setBottomAnchor(pane1, 70.0);
		//pane2
		AnchorPane.setTopAnchor(pane2, 20.0);
		AnchorPane.setLeftAnchor(pane2, 340.0);
		AnchorPane.setBottomAnchor(pane2, 0.0);
		AnchorPane.setBottomAnchor(pane2, 70.0);
		//pane3
		AnchorPane.setTopAnchor(pane3, 20.0);
		AnchorPane.setLeftAnchor(pane3, 460.0);
		AnchorPane.setBottomAnchor(pane3, 0.0);
		AnchorPane.setBottomAnchor(pane3, 70.0);
		//pane4
		AnchorPane.setTopAnchor(pane4, 20.0);
		AnchorPane.setLeftAnchor(pane4, 580.0);
		AnchorPane.setBottomAnchor(pane4, 0.0);
		AnchorPane.setBottomAnchor(pane4, 70.0);
		
		q0.setText("Don't mind being the center of attention.");
		q1.setText("Don't talk a lot.");
		q2.setText("Feel comfortable around people");
		q3.setText("Keep in the background.");
		q4.setText("Start conversations.");
		q5.setText("Have little to say.");
		q6.setText("Talk to a lot of different people at parties.");
		q7.setText("Don't like to draw attention to myself.");
		q8.setText("Am the life of the party.");
		q9.setText("Am quiet around strangers.");
		q10.setText("Feel little concern for others.");
		q11.setText("Am interested in people.");
		q12.setText("Insult people.");
		q13.setText("Sympathize with others' feelings.");
		q14.setText("Am not interested in other people's problems.");
		q15.setText("Have a soft heart.");
		q16.setText("Am not really interested in others.");
		q17.setText("Take time out for others.");
		q18.setText("Feel others' emotions.");
		q19.setText("Make people feel at ease.");
		q20.setText("Am always prepared.");
		q21.setText("Leave my belongings around.");
		q22.setText("Pay attention to details.");
		q23.setText("Make a mess of things.");
		q24.setText("Get chores done right away.");
		q25.setText("Often forget to put things back in their proper place.");
		q26.setText("Like order");
		q27.setText("Shirk my duties.");
		q28.setText("Follow a schedule.");
		q29.setText("Am exacting in my work.");
		q30.setText("Have a rich vocabulary.");
		q31.setText("Understanding abstract ideas.");
		q32.setText("Have a vivid imagination.");
		q33.setText("Am not interested in abstract ideas.");
		q34.setText("Have excellent ideas.");
		q35.setText("Do not have a good imagination.");
		q36.setText("Am quick to understand things.");
		q37.setText("Use difficult words.");
		q38.setText("Spend time reflecting on things.");
		q39.setText("Am full of ideas.");
		
		root.getChildren().addAll(q0 , q1 , q2 , q3 , q4 , q5 , q6 , q7 , q8 , q9 ,
				q10 , q11 , q12 , q13 , q14 , q15 , q16 , q17 , q18 , q19 ,
				q20 , q21 , q22 , q23 , q24 , q25 , q26 , q27 , q28 , q29 ,
				q30 , q31 , q32 , q33 , q34 , q35 , q36 , q37 , q38 , q39);
		
		q0.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q1.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q2.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q3.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q4.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q5.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q6.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q7.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q8.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q9.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q10.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q11.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q12.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q13.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q14.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q15.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q16.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q17.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q18.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q19.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q20.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q21.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q22.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q23.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q24.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q25.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q26.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q27.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q28.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q29.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q30.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q31.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q32.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q33.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q34.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q35.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q36.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q37.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q38.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		q39.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		
		qX.setStyle("-fx-font-size: 15px;" + "-fx-background-color: 'white';");
		
		//q0
		AnchorPane.setTopAnchor(q0, 0.0 + 10.0);
		AnchorPane.setLeftAnchor(q0, 70.0);
		AnchorPane.setRightAnchor(q0, 0.0);
		//q1
		AnchorPane.setTopAnchor(q1, 80.0 * 1 + 10.0);
		AnchorPane.setLeftAnchor(q1, 70.0);
		AnchorPane.setRightAnchor(q1, 0.0);
		//q2
		AnchorPane.setTopAnchor(q2, 80.0 * 2 + 10.0);
		AnchorPane.setLeftAnchor(q2, 70.0);
		AnchorPane.setRightAnchor(q2, 0.0);
		//q3
		AnchorPane.setTopAnchor(q3, 80.0 * 3 + 10.0);
		AnchorPane.setLeftAnchor(q3, 70.0);
		AnchorPane.setRightAnchor(q3, 0.0);
		//q4
		AnchorPane.setTopAnchor(q4, 80.0 * 4 + 10.0);
		AnchorPane.setLeftAnchor(q4, 70.0);
		AnchorPane.setRightAnchor(q4, 0.0);
		//q5
		AnchorPane.setTopAnchor(q5, 80.0 * 5 + 10.0);
		AnchorPane.setLeftAnchor(q5, 70.0);
		AnchorPane.setRightAnchor(q5, 0.0);
		//q6
		AnchorPane.setTopAnchor(q6, 80.0 * 6 + 10.0);
		AnchorPane.setLeftAnchor(q6, 70.0);
		AnchorPane.setRightAnchor(q6, 0.0);
		//q7
		AnchorPane.setTopAnchor(q7, 80.0 * 7 + 10.0);
		AnchorPane.setLeftAnchor(q7, 70.0);
		AnchorPane.setRightAnchor(q7, 0.0);
		//q8
		AnchorPane.setTopAnchor(q8, 80.0 * 8 + 10.0);
		AnchorPane.setLeftAnchor(q8, 70.0);
		AnchorPane.setRightAnchor(q8, 0.0);
		//q9
		AnchorPane.setTopAnchor(q9, 80.0 * 9 + 10.0);
		AnchorPane.setLeftAnchor(q9, 70.0);
		AnchorPane.setRightAnchor(q9, 0.0);
		//q10
		AnchorPane.setTopAnchor(q10, 80.0 * 10 + 10.0);
		AnchorPane.setLeftAnchor(q10, 70.0);
		AnchorPane.setRightAnchor(q10, 0.0);
		//q11
		AnchorPane.setTopAnchor(q11, 80.0 * 11 + 10.0);
		AnchorPane.setLeftAnchor(q11, 70.0);
		AnchorPane.setRightAnchor(q11, 0.0);
		//q12
		AnchorPane.setTopAnchor(q12, 80.0 * 12 + 10.0);
		AnchorPane.setLeftAnchor(q12, 70.0);
		AnchorPane.setRightAnchor(q12, 0.0);
		//q13
		AnchorPane.setTopAnchor(q13, 80.0 * 13 + 10.0);
		AnchorPane.setLeftAnchor(q13, 70.0);
		AnchorPane.setRightAnchor(q13, 0.0);
		//q14
		AnchorPane.setTopAnchor(q14, 80.0 * 14 + 10.0);
		AnchorPane.setLeftAnchor(q14, 70.0);
		AnchorPane.setRightAnchor(q14, 0.0);
		//q15
		AnchorPane.setTopAnchor(q15, 80.0 * 15 + 10.0);
		AnchorPane.setLeftAnchor(q15, 70.0);
		AnchorPane.setRightAnchor(q15, 0.0);
		//q16
		AnchorPane.setTopAnchor(q16, 80.0 * 16 + 10.0);
		AnchorPane.setLeftAnchor(q16, 70.0);
		AnchorPane.setRightAnchor(q16, 0.0);
		//q17
		AnchorPane.setTopAnchor(q17, 80.0 * 17 + 10.0);
		AnchorPane.setLeftAnchor(q17, 70.0);
		AnchorPane.setRightAnchor(q17, 0.0);
		//q18
		AnchorPane.setTopAnchor(q18, 80.0 * 18 + 10.0);
		AnchorPane.setLeftAnchor(q18, 70.0);
		AnchorPane.setRightAnchor(q18, 0.0);
		//q19
		AnchorPane.setTopAnchor(q19, 80.0 * 19 + 10.0);
		AnchorPane.setLeftAnchor(q19, 70.0);
		AnchorPane.setRightAnchor(q19, 0.0);
		//q20
		AnchorPane.setTopAnchor(q20, 80.0 * 20 + 10.0);
		AnchorPane.setLeftAnchor(q20, 70.0);
		AnchorPane.setRightAnchor(q20, 0.0);
		//q21
		AnchorPane.setTopAnchor(q21, 80.0 * 21 + 10.0);
		AnchorPane.setLeftAnchor(q21, 70.0);
		AnchorPane.setRightAnchor(q21, 0.0);
		//q22
		AnchorPane.setTopAnchor(q22, 80.0 * 22 + 10.0);
		AnchorPane.setLeftAnchor(q22, 70.0);
		AnchorPane.setRightAnchor(q22, 0.0);
		//q23
		AnchorPane.setTopAnchor(q23, 80.0 * 23 + 10.0);
		AnchorPane.setLeftAnchor(q23, 70.0);
		AnchorPane.setRightAnchor(q23, 0.0);
		//q24
		AnchorPane.setTopAnchor(q24, 80.0 * 24 + 10.0);
		AnchorPane.setLeftAnchor(q24, 70.0);
		AnchorPane.setRightAnchor(q24, 0.0);
		//q25
		AnchorPane.setTopAnchor(q25, 80.0 * 25 + 10.0);
		AnchorPane.setLeftAnchor(q25, 70.0);
		AnchorPane.setRightAnchor(q25, 0.0);
		//q26
		AnchorPane.setTopAnchor(q26, 80.0 * 26 + 10.0);
		AnchorPane.setLeftAnchor(q26, 70.0);
		AnchorPane.setRightAnchor(q26, 0.0);
		//q27
		AnchorPane.setTopAnchor(q27, 80.0 * 27 + 10.0);
		AnchorPane.setLeftAnchor(q27, 70.0);
		AnchorPane.setRightAnchor(q27, 0.0);
		//q28
		AnchorPane.setTopAnchor(q28, 80.0 * 28 + 10.0);
		AnchorPane.setLeftAnchor(q28, 70.0);
		AnchorPane.setRightAnchor(q28, 0.0);
		//q29
		AnchorPane.setTopAnchor(q29, 80.0 * 29 + 10.0);
		AnchorPane.setLeftAnchor(q29, 70.0);
		AnchorPane.setRightAnchor(q29, 0.0);
		//q30
		AnchorPane.setTopAnchor(q30, 80.0 * 30 + 10.0);
		AnchorPane.setLeftAnchor(q30, 70.0);
		AnchorPane.setRightAnchor(q30, 0.0);
		//q31
		AnchorPane.setTopAnchor(q31, 80.0 * 31 + 10.0);
		AnchorPane.setLeftAnchor(q31, 70.0);
		AnchorPane.setRightAnchor(q31, 0.0);
		//q32
		AnchorPane.setTopAnchor(q32, 80.0 * 32 + 10.0);
		AnchorPane.setLeftAnchor(q32, 70.0);
		AnchorPane.setRightAnchor(q32, 0.0);
		//q33
		AnchorPane.setTopAnchor(q33, 80.0 * 33 + 10.0);
		AnchorPane.setLeftAnchor(q33, 70.0);
		AnchorPane.setRightAnchor(q33, 0.0);
		//q34
		AnchorPane.setTopAnchor(q34, 80.0 * 34 + 10.0);
		AnchorPane.setLeftAnchor(q34, 70.0);
		AnchorPane.setRightAnchor(q34, 0.0);
		//q35
		AnchorPane.setTopAnchor(q35, 80.0 * 35 + 10.0);
		AnchorPane.setLeftAnchor(q35, 70.0);
		AnchorPane.setRightAnchor(q35, 0.0);
		//q36
		AnchorPane.setTopAnchor(q36, 80.0 * 36 + 10.0);
		AnchorPane.setLeftAnchor(q36, 70.0);
		AnchorPane.setRightAnchor(q36, 0.0);
		//q37
		AnchorPane.setTopAnchor(q37, 80.0 * 37 + 10.0);
		AnchorPane.setLeftAnchor(q37, 70.0);
		AnchorPane.setRightAnchor(q37, 0.0);
		//q38
		AnchorPane.setTopAnchor(q38, 80.0 * 38 + 10.0);
		AnchorPane.setLeftAnchor(q38, 70.0);
		AnchorPane.setRightAnchor(q38, 0.0);
		//q39
		AnchorPane.setTopAnchor(q39, 80.0 * 39 + 10.0);
		AnchorPane.setLeftAnchor(q39, 70.0);
		AnchorPane.setRightAnchor(q39, 0.0);
		
		root.getChildren().addAll(s0 , s1 , s2 , s3 , s4 , s5 , s6 , s7 , s8 , s9 , 
								s10 , s11 , s12 , s13 , s14 , s15 , s16 , s17 , s18 , s19 , 
								s20 , s21 , s22 , s23 , s24 , s25 , s26 , s27 , s28 , s29 ,
								s30 , s31 , s32 , s33 , s34 , s35 , s36 , s37 , s38 , s39);
		
		s0.setPrefWidth(500.0);
		s1.setPrefWidth(500.0);
		s2.setPrefWidth(500.0);
		s3.setPrefWidth(500.0);
		s4.setPrefWidth(500.0);
		s5.setPrefWidth(500.0);
		s6.setPrefWidth(500.0);
		s7.setPrefWidth(500.0);
		s8.setPrefWidth(500.0);
		s9.setPrefWidth(500.0);
		s10.setPrefWidth(500.0);
		s11.setPrefWidth(500.0);
		s12.setPrefWidth(500.0);
		s13.setPrefWidth(500.0);
		s14.setPrefWidth(500.0);
		s15.setPrefWidth(500.0);
		s16.setPrefWidth(500.0);
		s17.setPrefWidth(500.0);
		s18.setPrefWidth(500.0);
		s19.setPrefWidth(500.0);
		s20.setPrefWidth(500.0);
		s21.setPrefWidth(500.0);
		s22.setPrefWidth(500.0);
		s23.setPrefWidth(500.0);
		s24.setPrefWidth(500.0);
		s25.setPrefWidth(500.0);
		s26.setPrefWidth(500.0);
		s27.setPrefWidth(500.0);
		s28.setPrefWidth(500.0);
		s29.setPrefWidth(500.0);
		s30.setPrefWidth(500.0);
		s31.setPrefWidth(500.0);
		s32.setPrefWidth(500.0);
		s33.setPrefWidth(500.0);
		s34.setPrefWidth(500.0);
		s35.setPrefWidth(500.0);
		s36.setPrefWidth(500.0);
		s37.setPrefWidth(500.0);
		s38.setPrefWidth(500.0);
		s39.setPrefWidth(500.0);
		
		//s0
		AnchorPane.setTopAnchor(s0, 0.0 + 45.0);
		AnchorPane.setLeftAnchor(s0, 150.0);
		//s1
		AnchorPane.setTopAnchor(s1, 80.0 * 1 + 45.0);
		AnchorPane.setLeftAnchor(s1, 150.0);
		//s2
		AnchorPane.setTopAnchor(s2, 80.0 * 2 + 45.0);
		AnchorPane.setLeftAnchor(s2, 150.0);
		//s3
		AnchorPane.setTopAnchor(s3, 80.0 * 3 + 45.0);
		AnchorPane.setLeftAnchor(s3, 150.0);
		//s4
		AnchorPane.setTopAnchor(s4, 80.0 * 4 + 45.0);
		AnchorPane.setLeftAnchor(s4, 150.0);
		//s5
		AnchorPane.setTopAnchor(s5, 80.0 * 5 + 45.0);
		AnchorPane.setLeftAnchor(s5, 150.0);
		//s6
		AnchorPane.setTopAnchor(s6, 80.0 * 6 + 45.0);
		AnchorPane.setLeftAnchor(s6, 150.0);
		//s7
		AnchorPane.setTopAnchor(s7, 80.0 * 7 + 45.0);
		AnchorPane.setLeftAnchor(s7, 150.0);
		//s8
		AnchorPane.setTopAnchor(s8, 80.0 * 8 + 45.0);
		AnchorPane.setLeftAnchor(s8, 150.0);
		//s9
		AnchorPane.setTopAnchor(s9, 80.0 * 9 + 45.0);
		AnchorPane.setLeftAnchor(s9, 150.0);
		//s10
		AnchorPane.setTopAnchor(s10, 80.0 * 10 + 45.0);
		AnchorPane.setLeftAnchor(s10, 150.0);
		//s11
		AnchorPane.setTopAnchor(s11, 80.0 * 11 + 45.0);
		AnchorPane.setLeftAnchor(s11, 150.0);
		//s12
		AnchorPane.setTopAnchor(s12, 80.0 * 12 + 45.0);
		AnchorPane.setLeftAnchor(s12, 150.0);
		//s13
		AnchorPane.setTopAnchor(s13, 80.0 * 13 + 45.0);
		AnchorPane.setLeftAnchor(s13, 150.0);
		//s14
		AnchorPane.setTopAnchor(s14, 80.0 * 14 + 45.0);
		AnchorPane.setLeftAnchor(s14, 150.0);
		//s15
		AnchorPane.setTopAnchor(s15, 80.0 * 15 + 45.0);
		AnchorPane.setLeftAnchor(s15, 150.0);
		//s16
		AnchorPane.setTopAnchor(s16, 80.0 * 16 + 45.0);
		AnchorPane.setLeftAnchor(s16, 150.0);
		//s17
		AnchorPane.setTopAnchor(s17, 80.0 * 17 + 45.0);
		AnchorPane.setLeftAnchor(s17, 150.0);
		//s18
		AnchorPane.setTopAnchor(s18, 80.0 * 18 + 45.0);
		AnchorPane.setLeftAnchor(s18, 150.0);
		//s19
		AnchorPane.setTopAnchor(s19, 80.0 * 19 + 45.0);
		AnchorPane.setLeftAnchor(s19, 150.0);
		//s20
		AnchorPane.setTopAnchor(s20, 80.0 * 20 + 45.0);
		AnchorPane.setLeftAnchor(s20, 150.0);
		//s21
		AnchorPane.setTopAnchor(s21, 80.0 * 21 + 45.0);
		AnchorPane.setLeftAnchor(s21, 150.0);
		//s22
		AnchorPane.setTopAnchor(s22, 80.0 * 22 + 45.0);
		AnchorPane.setLeftAnchor(s22, 150.0);
		//s23
		AnchorPane.setTopAnchor(s23, 80.0 * 23 + 45.0);
		AnchorPane.setLeftAnchor(s23, 150.0);
		//s24
		AnchorPane.setTopAnchor(s24, 80.0 * 24 + 45.0);
		AnchorPane.setLeftAnchor(s24, 150.0);
		//s25
		AnchorPane.setTopAnchor(s25, 80.0 * 25 + 45.0);
		AnchorPane.setLeftAnchor(s25, 150.0);
		//s26
		AnchorPane.setTopAnchor(s26, 80.0 * 26 + 45.0);
		AnchorPane.setLeftAnchor(s26, 150.0);
		//s27
		AnchorPane.setTopAnchor(s27, 80.0 * 27 + 45.0);
		AnchorPane.setLeftAnchor(s27, 150.0);
		//s28
		AnchorPane.setTopAnchor(s28, 80.0 * 28 + 45.0);
		AnchorPane.setLeftAnchor(s28, 150.0);
		//s29
		AnchorPane.setTopAnchor(s29, 80.0 * 29 + 45.0);
		AnchorPane.setLeftAnchor(s29, 150.0);
		//s30
		AnchorPane.setTopAnchor(s30, 80.0 * 30 + 45.0);
		AnchorPane.setLeftAnchor(s30, 150.0);
		//s31
		AnchorPane.setTopAnchor(s31, 80.0 * 31 + 45.0);
		AnchorPane.setLeftAnchor(s31, 150.0);
		//s32
		AnchorPane.setTopAnchor(s32, 80.0 * 32 + 45.0);
		AnchorPane.setLeftAnchor(s32, 150.0);
		//s33
		AnchorPane.setTopAnchor(s33, 80.0 * 33 + 45.0);
		AnchorPane.setLeftAnchor(s33, 150.0);
		//s34
		AnchorPane.setTopAnchor(s34, 80.0 * 34 + 45.0);
		AnchorPane.setLeftAnchor(s34, 150.0);
		//s35
		AnchorPane.setTopAnchor(s35, 80.0 * 35 + 45.0);
		AnchorPane.setLeftAnchor(s35, 150.0);
		//s36
		AnchorPane.setTopAnchor(s36, 80.0 * 36 + 45.0);
		AnchorPane.setLeftAnchor(s36, 150.0);
		//s37
		AnchorPane.setTopAnchor(s37, 80.0 * 37 + 45.0);
		AnchorPane.setLeftAnchor(s37, 150.0);
		//s38
		AnchorPane.setTopAnchor(s38, 80.0 * 38 + 45.0);
		AnchorPane.setLeftAnchor(s38, 150.0);
		//s39
		AnchorPane.setTopAnchor(s39, 80.0 * 39 + 45.0);
		AnchorPane.setLeftAnchor(s39, 150.0);
		
		s0.setShowTickMarks(true);
		s0.setShowTickLabels(true);
		s0.setSnapToTicks(true);
		s0.setValue(0.0);
		s0.setMinorTickCount(0);
		s0.setMajorTickUnit(5.0);
		
		s1.setShowTickMarks(true);
		s1.setShowTickLabels(true);
		s1.setSnapToTicks(true);
		s1.setValue(0.0);
		s1.setMinorTickCount(0);
		s1.setMajorTickUnit(5.0);
		
		s2.setShowTickMarks(true);
		s2.setShowTickLabels(true);
		s2.setSnapToTicks(true);
		s2.setValue(0.0);
		s2.setMinorTickCount(0);
		s2.setMajorTickUnit(5.0);
		
		s3.setShowTickMarks(true);
		s3.setShowTickLabels(true);
		s3.setSnapToTicks(true);
		s3.setValue(0.0);
		s3.setMinorTickCount(0);
		s3.setMajorTickUnit(5.0);
		
		s4.setShowTickMarks(true);
		s4.setShowTickLabels(true);
		s4.setSnapToTicks(true);
		s4.setValue(0.0);
		s4.setMinorTickCount(0);
		s4.setMajorTickUnit(5.0);
		
		s5.setShowTickMarks(true);
		s5.setShowTickLabels(true);
		s5.setSnapToTicks(true);
		s5.setValue(0.0);
		s5.setMinorTickCount(0);
		s5.setMajorTickUnit(5.0);
		
		s6.setShowTickMarks(true);
		s6.setShowTickLabels(true);
		s6.setSnapToTicks(true);
		s6.setValue(0.0);
		s6.setMinorTickCount(0);
		s6.setMajorTickUnit(5.0);
		
		s7.setShowTickMarks(true);
		s7.setShowTickLabels(true);
		s7.setSnapToTicks(true);
		s7.setValue(0.0);
		s7.setMinorTickCount(0);
		s7.setMajorTickUnit(5.0);
		
		s8.setShowTickMarks(true);
		s8.setShowTickLabels(true);
		s8.setSnapToTicks(true);
		s8.setValue(0.0);
		s8.setMinorTickCount(0);
		s8.setMajorTickUnit(5.0);
		
		s9.setShowTickMarks(true);
		s9.setShowTickLabels(true);
		s9.setSnapToTicks(true);
		s9.setValue(0.0);
		s9.setMinorTickCount(0);
		s9.setMajorTickUnit(5.0);
		
		s10.setShowTickMarks(true);
		s10.setShowTickLabels(true);
		s10.setSnapToTicks(true);
		s10.setValue(0.0);
		s10.setMinorTickCount(0);
		s10.setMajorTickUnit(5.0);
		
		s11.setShowTickMarks(true);
		s11.setShowTickLabels(true);
		s11.setSnapToTicks(true);
		s11.setValue(0.0);
		s11.setMinorTickCount(0);
		s11.setMajorTickUnit(5.0);
		
		s12.setShowTickMarks(true);
		s12.setShowTickLabels(true);
		s12.setSnapToTicks(true);
		s12.setValue(0.0);
		s12.setMinorTickCount(0);
		s12.setMajorTickUnit(5.0);
		
		s13.setShowTickMarks(true);
		s13.setShowTickLabels(true);
		s13.setSnapToTicks(true);
		s13.setValue(0.0);
		s13.setMinorTickCount(0);
		s13.setMajorTickUnit(5.0);
		
		s14.setShowTickMarks(true);
		s14.setShowTickLabels(true);
		s14.setSnapToTicks(true);
		s14.setValue(0.0);
		s14.setMinorTickCount(0);
		s14.setMajorTickUnit(5.0);
		
		s15.setShowTickMarks(true);
		s15.setShowTickLabels(true);
		s15.setSnapToTicks(true);
		s15.setValue(0.0);
		s15.setMinorTickCount(0);
		s15.setMajorTickUnit(5.0);
		
		s16.setShowTickMarks(true);
		s16.setShowTickLabels(true);
		s16.setSnapToTicks(true);
		s16.setValue(0.0);
		s16.setMinorTickCount(0);
		s16.setMajorTickUnit(5.0);
		
		s17.setShowTickMarks(true);
		s17.setShowTickLabels(true);
		s17.setSnapToTicks(true);
		s17.setValue(0.0);
		s17.setMinorTickCount(0);
		s17.setMajorTickUnit(5.0);
		
		s18.setShowTickMarks(true);
		s18.setShowTickLabels(true);
		s18.setSnapToTicks(true);
		s18.setValue(0.0);
		s18.setMinorTickCount(0);
		s18.setMajorTickUnit(5.0);
		
		s19.setShowTickMarks(true);
		s19.setShowTickLabels(true);
		s19.setSnapToTicks(true);
		s19.setValue(0.0);
		s19.setMinorTickCount(0);
		s19.setMajorTickUnit(5.0);
		
		s20.setShowTickMarks(true);
		s20.setShowTickLabels(true);
		s20.setSnapToTicks(true);
		s20.setValue(0.0);
		s20.setMinorTickCount(0);
		s20.setMajorTickUnit(5.0);
		
		s21.setShowTickMarks(true);
		s21.setShowTickLabels(true);
		s21.setSnapToTicks(true);
		s21.setValue(0.0);
		s21.setMinorTickCount(0);
		s21.setMajorTickUnit(5.0);
		
		s22.setShowTickMarks(true);
		s22.setShowTickLabels(true);
		s22.setSnapToTicks(true);
		s22.setValue(0.0);
		s22.setMinorTickCount(0);
		s22.setMajorTickUnit(5.0);
		
		s23.setShowTickMarks(true);
		s23.setShowTickLabels(true);
		s23.setSnapToTicks(true);
		s23.setValue(0.0);
		s23.setMinorTickCount(0);
		s23.setMajorTickUnit(5.0);
		
		s24.setShowTickMarks(true);
		s24.setShowTickLabels(true);
		s24.setSnapToTicks(true);
		s24.setValue(0.0);
		s24.setMinorTickCount(0);
		s24.setMajorTickUnit(5.0);
		
		s25.setShowTickMarks(true);
		s25.setShowTickLabels(true);
		s25.setSnapToTicks(true);
		s25.setValue(0.0);
		s25.setMinorTickCount(0);
		s25.setMajorTickUnit(5.0);
		
		s26.setShowTickMarks(true);
		s26.setShowTickLabels(true);
		s26.setSnapToTicks(true);
		s26.setValue(0.0);
		s26.setMinorTickCount(0);
		s26.setMajorTickUnit(5.0);
		
		s27.setShowTickMarks(true);
		s27.setShowTickLabels(true);
		s27.setSnapToTicks(true);
		s27.setValue(0.0);
		s27.setMinorTickCount(0);
		s27.setMajorTickUnit(5.0);
		
		s28.setShowTickMarks(true);
		s28.setShowTickLabels(true);
		s28.setSnapToTicks(true);
		s28.setValue(0.0);
		s28.setMinorTickCount(0);
		s28.setMajorTickUnit(5.0);
		
		s29.setShowTickMarks(true);
		s29.setShowTickLabels(true);
		s29.setSnapToTicks(true);
		s29.setValue(0.0);
		s29.setMinorTickCount(0);
		s29.setMajorTickUnit(5.0);
		
		s30.setShowTickMarks(true);
		s30.setShowTickLabels(true);
		s30.setSnapToTicks(true);
		s30.setValue(0.0);
		s30.setMinorTickCount(0);
		s30.setMajorTickUnit(5.0);
		
		s31.setShowTickMarks(true);
		s31.setShowTickLabels(true);
		s31.setSnapToTicks(true);
		s31.setValue(0.0);
		s31.setMinorTickCount(0);
		s31.setMajorTickUnit(5.0);
		
		s32.setShowTickMarks(true);
		s32.setShowTickLabels(true);
		s32.setSnapToTicks(true);
		s32.setValue(0.0);
		s32.setMinorTickCount(0);
		s32.setMajorTickUnit(5.0);
		
		s33.setShowTickMarks(true);
		s33.setShowTickLabels(true);
		s33.setSnapToTicks(true);
		s33.setValue(0.0);
		s33.setMinorTickCount(0);
		s33.setMajorTickUnit(5.0);
		
		s34.setShowTickMarks(true);
		s34.setShowTickLabels(true);
		s34.setSnapToTicks(true);
		s34.setValue(0.0);
		s34.setMinorTickCount(0);
		s34.setMajorTickUnit(5.0);
		
		s35.setShowTickMarks(true);
		s35.setShowTickLabels(true);
		s35.setSnapToTicks(true);
		s35.setValue(0.0);
		s35.setMinorTickCount(0);
		s35.setMajorTickUnit(5.0);
		
		s36.setShowTickMarks(true);
		s36.setShowTickLabels(true);
		s36.setSnapToTicks(true);
		s36.setValue(0.0);
		s36.setMinorTickCount(0);
		s36.setMajorTickUnit(5.0);
		
		s37.setShowTickMarks(true);
		s37.setShowTickLabels(true);
		s37.setSnapToTicks(true);
		s37.setValue(0.0);
		s37.setMinorTickCount(0);
		s37.setMajorTickUnit(5.0);
		
		s38.setShowTickMarks(true);
		s38.setShowTickLabels(true);
		s38.setSnapToTicks(true);
		s38.setValue(0.0);
		s38.setMinorTickCount(0);
		s38.setMajorTickUnit(5.0);
		
		s39.setShowTickMarks(true);
		s39.setShowTickLabels(true);
		s39.setSnapToTicks(true);
		s39.setValue(0.0);
		s39.setMinorTickCount(0);
		s39.setMajorTickUnit(5.0);
		
		root.getChildren().addAll(submit , qX);
		
		//submit
		AnchorPane.setTopAnchor(submit, 3240.0);
		AnchorPane.setLeftAnchor(submit, 280.0);
		AnchorPane.setRightAnchor(submit, 245.0);
		//qX
		AnchorPane.setTopAnchor(qX, 3260.0);
		
		submit.setStyle("-fx-background-color: '#00b33c';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#00b33c';");
		submit.setOnMouseExited(e -> submit.setStyle("-fx-background-color: '#00b33c';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#00b33c';"));
		submit.setOnMouseReleased(e -> submit.setStyle("-fx-background-color: '#00b33c';" + "-fx-text-fill: '#ffffff';" + "-fx-border-color: '#00b33c';"));
		
		submit.setOnMouseEntered(e -> submit.setStyle("-fx-background-color: '#ffffff';" + "-fx-text-fill: '#00b33c';" + "-fx-border-color: '#00b33c';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
		submit.setOnMousePressed(e -> submit.setStyle("-fx-background-color: '#ffffff';" + "-fx-text-fill: '#00b33c';" + "-fx-border-color: '#00b33c';" + "-fx-font-weight: bold;" + "-fx-font-size: 12.5px;" + "-fx-border-width: 1.5px;"));
	
		//cancel
		cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';");
		cancel.setOnMouseExited(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';"));
		cancel.setOnMouseReleased(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'red';" + "-fx-text-fill: 'white';"));
		
		cancel.setOnMouseEntered(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'white';" + "-fx-text-fill: 'red';" + "-fx-font-size: 12px;" + "-fx-font-weight: bold;" + "-fx-border-width: 1.5px;"));
		cancel.setOnMousePressed(e -> cancel.setStyle("-fx-border-color: 'red';" + "-fx-background-color: 'white';" + "-fx-text-fill: 'red';" + "-fx-font-size: 12px;" + "-fx-font-weight: bold;" + "-fx-border-width: 1.5px;"));
	
		reset.setOnAction(e -> {
			Alert confirm = new Alert(AlertType.CONFIRMATION);
			confirm.setTitle("Option");
			confirm.setHeaderText("Reset Submissions");
			confirm.setContentText("Press OK to reset your answers.\n\n\n");
			Optional<ButtonType> bt = confirm.showAndWait();
			if(bt.get() == ButtonType.OK) {
				
				//reset slider(s) to 0.0
				s0.setValue(0.0);
				s1.setValue(0.0);
				s2.setValue(0.0);
				s3.setValue(0.0);
				s4.setValue(0.0);
				s5.setValue(0.0);
				s6.setValue(0.0);
				s7.setValue(0.0);
				s8.setValue(0.0);
				s9.setValue(0.0);
				s10.setValue(0.0);
				s11.setValue(0.0);
				s12.setValue(0.0);
				s13.setValue(0.0);
				s14.setValue(0.0);
				s15.setValue(0.0);
				s16.setValue(0.0);
				s17.setValue(0.0);
				s18.setValue(0.0);
				s19.setValue(0.0);
				s20.setValue(0.0);
				s21.setValue(0.0);
				s22.setValue(0.0);
				s23.setValue(0.0);
				s24.setValue(0.0);
				s25.setValue(0.0);
				s26.setValue(0.0);
				s27.setValue(0.0);
				s28.setValue(0.0);
				s29.setValue(0.0);
				s30.setValue(0.0);
				s31.setValue(0.0);
				s32.setValue(0.0);
				s33.setValue(0.0);
				s34.setValue(0.0);
				s35.setValue(0.0);
				s36.setValue(0.0);
				s37.setValue(0.0);
				s38.setValue(0.0);
				s39.setValue(0.0);
			}
		});
		
		//cancel
		cancel.setOnAction(e -> {
			try {
				Parent loader = FXMLLoader.load(getClass().getResource("homeScreenFXML.fxml"));
				
				Scene scene = cancel.getScene();
				Window window = scene.getWindow();
				Stage stage = (Stage) window;
				
				cancel.getScene().setRoot(loader);
			}catch(Exception exp) {
				System.out.println("TestFXMLController: " + exp);
			}
		});
		
		submit.setOnAction(e -> {
			String result = getResult();
			if(result != null) {
				try {
					Main.personalitySelected = result;
					Parent loader = FXMLLoader.load(getClass().getResource("resultFXML.fxml"));
					
					Scene scene = cancel.getScene();
					Window window = scene.getWindow();
					Stage stage = (Stage) window;
					
					cancel.getScene().setRoot(loader);
				}catch(Exception exp) {
					System.out.println("TestFXMLController: " + exp);
				}
			}
		});
		
	}
	
	final static int ONE = 1;
	final static int TWO = 2;
	final static int THREE = 3;
	final static int FOUR = 4;
	final static int FIVE = 5;
	
	public String getResult() {
		//each question holds 10 marks. (0.0 , 2.5 , 5.0 , 7.5 , 10.0)
		//each category holds 100 marks (each category has 10 questions)
		//calculate 4 category score separately and send to the Server
		
		category0 = category1 = category2 = category3 = 0;
		
		//category0 : s0 - s9
		category0 = category0 + 2 * getValue(s0);
		category0 = category0 + 2 * getValue(s1);
		category0 = category0 + 2 * getValue(s2);
		category0 = category0 + 2 * getValue(s3);
		category0 = category0 + 2 * getValue(s4);
		category0 = category0 + 2 * getValue(s5);
		category0 = category0 + 2 * getValue(s6);
		category0 = category0 + 2 * getValue(s7);
		category0 = category0 + 2 * getValue(s8);
		category0 = category0 + 2 * getValue(s9);
		
		//category1 : s10 - s19
		category1 = category1 + 2 * getValue(s10);
		category1 = category1 + 2 * getValue(s11);
		category1 = category1 + 2 * getValue(s12);
		category1 = category1 + 2 * getValue(s13);
		category1 = category1 + 2 * getValue(s14);
		category1 = category1 + 2 * getValue(s15);
		category1 = category1 + 2 * getValue(s16);
		category1 = category1 + 2 * getValue(s17);
		category1 = category1 + 2 * getValue(s18);
		category1 = category1 + 2 * getValue(s19);
		
		//category2 : s20 - s29
		category2 = category2 + 2 * getValue(s20);
		category2 = category2 + 2 * getValue(s21);
		category2 = category2 + 2 * getValue(s22);
		category2 = category2 + 2 * getValue(s23);
		category2 = category2 + 2 * getValue(s24);
		category2 = category2 + 2 * getValue(s25);
		category2 = category2 + 2 * getValue(s26);
		category2 = category2 + 2 * getValue(s27);
		category2 = category2 + 2 * getValue(s28);
		category2 = category2 + 2 * getValue(s29);
		
		//category3 : s30 - s39
		category3 = category3 + 2 * getValue(s30);
		category3 = category3 + 2 * getValue(s31);
		category3 = category3 + 2 * getValue(s32);
		category3 = category3 + 2 * getValue(s33);
		category3 = category3 + 2 * getValue(s34);
		category3 = category3 + 2 * getValue(s35);
		category3 = category3 + 2 * getValue(s36);
		category3 = category3 + 2 * getValue(s37);
		category3 = category3 + 2 * getValue(s38);
		category3 = category3 + 2 * getValue(s39);
		
		//connecting to the Server
		try {
			URL url = new URL("http://127.0.0.1:5000/prediction/" + category0 + "/" + category1 + "/" + category2 + "/" + category3);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
			String output,result = "";
			
			while ((output = br.readLine()) != null) {
				result += output.trim();
			}
			
			result = result.replace("\"['", "");
			result = result.replace("']\"", "");
			
			return result;
		}catch(ConnectException c) {							//no connection
			Alert error = new Alert(AlertType.ERROR);
			error.setTitle("Error");
			error.setHeaderText("Connection Failed");
			error.setContentText("Unable to connect to the server. "
					+ "Please try again after some time.\n\n\n");
			error.show();
		}catch(Exception e) {}
		
		return null;
	}
	
	public int getValue(Slider s) {
		int temp;
		
		if(s.getValue() == -10.0)
			temp = ONE;
		else if(s.getValue() == -5.0)
			temp = TWO;
		else if(s.getValue() == 0.0)
			temp = THREE;
		else if(s.getValue() == 5.0)
			temp = FOUR;
		else
			temp = FIVE;
		
		return temp;
	}
}
