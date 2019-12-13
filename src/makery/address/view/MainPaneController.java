package makery.address.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import makery.address.MainApplication;
import makery.address.util.QuizzGeneration;
import javafx.scene.control.Label;

public class MainPaneController extends MainApplication {

	@FXML
	public static Button answerA;
	@FXML
	public static Button answerB;
	@FXML
	public static Button answerC;
	@FXML
	public static Button answerD;
	@FXML
	public static Label a;
	@FXML
	public static Label b;
	@FXML
	public static Label c;
	@FXML
	public static Label d;
	@FXML
	public static Label questionLabel;

	public static String result;

	// Reference to the main application
	public MainApplication mainApp;

	public void setMainApp(MainApplication mainApp) {
		this.mainApp = mainApp;
	}
	
	/*@Override
	public void showQuestion (int q) {

		a.setText(QuizzGeneration.questions.get(q).getFirstAnswer());
		b.setText(QuizzGeneration.questions.get(q).getSecondAnswer());
		c.setText(QuizzGeneration.questions.get(q).getThirdAnswer());
		d.setText(QuizzGeneration.questions.get(q).getFourthAnswer());
		questionLabel.setText(QuizzGeneration.questions.get(q).getQuestion());

	}*/
	
	@FXML
	public void handlePrintQuestion() {
		String textAnswerA = QuizzGeneration.questions.get(0).getFirstAnswer();
		System.out.println(textAnswerA);
		//reset();
		showQuestion (1);

		/*answerA.setText(textAnswerA);
			answerB.setText(QuizzGeneration.questions.get(0).getSecondAnswer());
			answerC.setText(QuizzGeneration.questions.get(0).getThirdAnswer());
			answerD.setText(QuizzGeneration.questions.get(0).getFourthAnswer());*/
			//questionLabel.setText(textAnswerA);
	}

	@FXML
	private void handleAnswerA() {
		answerA.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				result = answerA.getText();
				//questionLabel.setText("blabla");
				if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
					answerA.setStyle("-fx-background-color: Green");
				}
				else {
					answerA.setStyle("-fx-background-color: Red");
				}
			}
		});


	}

	@FXML
	private void handleAnswerB() {
		answerB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				result = answerB.getText();
				//questionLabel.setText("blabla");
				if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
					answerB.setStyle("-fx-background-color: Green");
				}
				else {
					answerB.setStyle("-fx-background-color: Red");
				}
			}
		});
	}


	@FXML
	private void handleAnswerC() {
		answerC.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				result = answerC.getText();
				//questionLabel.setText("blabla");
				if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
					answerC.setStyle("-fx-background-color: Green");
				}
				else {
					answerC.setStyle("-fx-background-color: Red");
				}
			}
		});
	}


	@FXML
	private void handleAnswerD() {
		answerD.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				result = answerD.getText();
				//questionLabel.setText("blabla");
				if(verification(result, QuizzGeneration.questions.get(0).getCorrectAnswer())) {
					answerD.setStyle("-fx-background-color: Green");
				}
				else {
					answerD.setStyle("-fx-background-color: Red");
				}
			}
		});
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