package makery.address.view;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import makery.address.MainApplication;
import makery.address.util.QuizzGeneration;
import javafx.scene.control.Label;

public class MainPaneController {
	
		@FXML
		public static Button answerA;
		@FXML
		public static Button answerB;
		@FXML
		public static Button answerC;
		@FXML
		public static Button answerD;
		@FXML
		private static Label questionLabel;
		
		public static String result;
		
	// Reference to the main application
		public MainApplication mainApp;

		public void setMainApp(MainApplication mainApp) {
			this.mainApp = mainApp;
		}
	
	
		public void handlePrintQuestion() {
			String textAnswerA = QuizzGeneration.questions.get(0).getFirstAnswer();
			System.out.println(textAnswerA);
			reset();
			
			//answerA.setText(textAnswerA);
			/*answerB.setText(QuizzGeneration.questions.get(0).getSecondAnswer());
			answerC.setText(QuizzGeneration.questions.get(0).getThirdAnswer());
			answerD.setText(QuizzGeneration.questions.get(0).getFourthAnswer());*/
			questionLabel.setText(textAnswerA);
		}
				
		@FXML
		private void handleAnswerA() {
			result = QuizzGeneration.questions.get(0).getFirstAnswer();
			questionLabel.setText("blabla");
			if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		@FXML
		private void handleAnswerB() {
			result = QuizzGeneration.questions.get(0).getSecondAnswer();
			if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		

		@FXML
		private void handleAnswerC() {
			result = QuizzGeneration.questions.get(0).getThirdAnswer();
			if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		

		@FXML
		private void handleAnswerD() {
			result = QuizzGeneration.questions.get(0).getFourthAnswer();
			if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
				answerA.setStyle("-fx-background-color: Green");
			}
			else {
				answerA.setStyle("-fx-background-color: Red");
			}
		}
		
		public static boolean verification(String result,String correctAnswer) {
			
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
			answerA.setText(" ");
			answerB.setText(" ");
			answerC.setText(" ");
			answerD.setText(" ");
		}
}