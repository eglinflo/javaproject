package fxProject.adress;

import fxProject.view.QuizPaneControll;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import makery.address.util.QuizzGeneration;

public class MainApp extends Application {

	public static void setTextIntoLabels (Label la, Label lb, Label lc, Label ld,Label lq, int q) {

		la.setText(QuizzGeneration.questions.get(q).getFirstAnswer());
		lb.setText(QuizzGeneration.questions.get(q).getSecondAnswer());
		lc.setText(QuizzGeneration.questions.get(q).getThirdAnswer());
		ld.setText(QuizzGeneration.questions.get(q).getFourthAnswer());
		lq.setText(QuizzGeneration.questions.get(q).getQuestion());
	}
	public static void showRightAnswerIntoLabel (Label l, int q) {

		l.setText(QuizzGeneration.questions.get(q).getCorrectAnswer());
		
	}

	@Override
	public void start(Stage primaryStage) {
		QuizzGeneration.generation();
		QuizPaneControll.createQuizPane(primaryStage);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
