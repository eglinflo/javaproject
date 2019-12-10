package makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import makery.address.MainApplication;
import makery.address.util.QuizzGeneration;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class MainPaneController {
	
		@FXML
		private Button answerA;
		@FXML
		private Button answerB;
		@FXML
		private Button answerC;
		@FXML
		private Button answerD;
		@FXML
		private Label questionLabel;
		
		public String result;
		
	// Reference to the main application
		public MainApplication mainApp;

		public void setMainApp(MainApplication mainApp) {
			this.mainApp = mainApp;
		}
		
		private void printAnswerA() {
			answerA.setText(QuizzGeneration.firstAnswer);
		}
		
		private void printAnswerB() {
			answerB.setText(QuizzGeneration.secondAnswer);
		}
		
		private void printAnswerC() {
			answerC.setText(QuizzGeneration.thirdAnswer);
		}
		
		private void printAnswerD() {
			answerD.setText(QuizzGeneration.fourthAnswer);
		}
		
		private void handleAnswerA() {
			result = QuizzGeneration.firstAnswer;
			if(verification(result, QuizzGeneration.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		private void handleAnswerB() {
			result = QuizzGeneration.secondAnswer;
			if(verification(result, QuizzGeneration.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		private void handleAnswerC() {
			result = QuizzGeneration.thirdAnswer;
			if(verification(result, QuizzGeneration.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		private void handleAnswerD() {
			result = QuizzGeneration.fourthAnswer;
			if(verification(result, QuizzGeneration.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		public boolean verification(String result,String correctAnswer) {
			
			if (result==correctAnswer) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void reset() {
			questionLabel.setText("");
			answerA.setStyle("-fx-background-color: Gray");
			answerB.setStyle("-fx-background-color: Gray");
			answerC.setStyle("-fx-background-color: Gray");
			answerD.setStyle("-fx-background-color: Gray");
			answerA.setText("");
			answerB.setText("");
			answerC.setText("");
			answerD.setText("");
		}
}