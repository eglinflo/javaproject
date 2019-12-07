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
			verification();
		}
		
		private void handleAnswerB() {
			verification();
		}
		
		private void handleAnswerC() {
			verification();
		}
		
		private void handleAnswerD() {
			verification();
		}
}