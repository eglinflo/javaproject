package fxProject.view;

import fxProject.adress.MainApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class ResultPane extends MainApp {

	/*public static void main(String[] args) {
		launch(args);
	}*/

	public static void createResultPane(Stage primaryStage) {
		Stage fenster = primaryStage;
        
        Label titleLabel = new Label("Result");
        titleLabel.setFont(new Font("Loster", 120));
        titleLabel.setTextAlignment(TextAlignment.CENTER);
        
        Label correctAnswerLabel = new Label("Number of correct answers");
        correctAnswerLabel.setFont(new Font("Loster", 32));
        correctAnswerLabel.setTextFill(Color.GREY);
        correctAnswerLabel.setTextAlignment(TextAlignment.CENTER);
        
        Label numberCorrectAnswer = new Label ("5");
        numberCorrectAnswer.setFont(new Font("Loster", 28));
        numberCorrectAnswer.setTextFill(Color.GREY);
        numberCorrectAnswer.setTextAlignment(TextAlignment.CENTER);

        ProgressBar correctAnswerBar = new ProgressBar(0);
        correctAnswerBar.setPrefSize(400, 50);
        correctAnswerBar.setProgress(0.5);
        
        Label falseAnswerLabel = new Label("Number of correct answers");
        falseAnswerLabel.setFont(new Font("Loster", 32));
        falseAnswerLabel.setTextFill(Color.GREY);
        falseAnswerLabel.setTextAlignment(TextAlignment.CENTER);
        
        Label numberFalseAnswer = new Label ("5");
        numberFalseAnswer.setFont(new Font("Loster", 28));
        numberFalseAnswer.setTextFill(Color.GREY);
        numberFalseAnswer.setTextAlignment(TextAlignment.CENTER);
        
        ProgressBar falseAnswerBar = new ProgressBar(0);
        falseAnswerBar.setPrefSize(400, 50);
        falseAnswerBar.setProgress(0.5);
        
        Button exitButton = new Button("Exit Game");
        exitButton.setPrefSize(300, 100);
        exitButton.setStyle("-fx-font-size: 36; ");

        VBox resultLayout = new VBox(30);
        resultLayout.setPrefSize(700, 500);
        resultLayout.setAlignment(Pos.TOP_CENTER);
        resultLayout.getChildren().addAll(titleLabel, correctAnswerLabel, correctAnswerBar, numberCorrectAnswer, falseAnswerLabel, falseAnswerBar, numberFalseAnswer, exitButton);
        Scene resultScene = new Scene(resultLayout, 1400, 800, Color.WHITE);

        fenster.setScene(resultScene);
        fenster.show();
        
        exitButton.setOnAction(new EventHandler <ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.exit(0);
				}
			});
    }
}