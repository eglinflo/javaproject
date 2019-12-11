package makery.address.view;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import makery.address.MainApplication;
import makery.address.util.Question;
import makery.address.util.QuizzGeneration;
import javafx.scene.control.Label;

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
	
		@FXML
		private void handlePrintQuestion() {
			reset();
			answerA.setText(QuizzGeneration.randomQuestionSelection().get(0).getFirstAnswer());
			answerB.setText(QuizzGeneration.randomQuestionSelection().get(0).getSecondAnswer());
			answerC.setText(QuizzGeneration.randomQuestionSelection().get(0).getThirdAnswer());
			answerD.setText(QuizzGeneration.randomQuestionSelection().get(0).getFourthAnswer());
			questionLabel.setText(QuizzGeneration.randomQuestionSelection().get(0).getQuestion());
		}
		
		@FXML
		private void handleAnswerA() {
			result = Question.firstAnswer;
			if(verification(result, Question.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		@FXML
		private void handleAnswerB() {
			result = Question.secondAnswer;
			if(verification(result, Question.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		

		@FXML
		private void handleAnswerC() {
			result = Question.thirdAnswer;
			if(verification(result, Question.correctAnswer)==true) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		

		@FXML
		private void handleAnswerD() {
			result = Question.fourthAnswer;
			if(verification(result, Question.correctAnswer)==true) {
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