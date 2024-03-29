package fxProject.view;

import fxProject.adress.MainApp;
import fxProject.util.QuizzGeneration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.util.concurrent.TimeUnit;

public class QuizPaneControll extends MainApp {

	public static int n = 0;
	public static int compteur=0;
	public static int wait = 1;

	public static void createQuizPane(Stage primaryStage)  
	{
		Stage fenster = primaryStage;

		Label questionlabel = new Label("QUESTION");
		questionlabel.setPrefSize(1000, 200);
		questionlabel.setTextAlignment(TextAlignment.CENTER);
		questionlabel.setAlignment(Pos.CENTER);
		questionlabel.setFont(new Font("Loster", 22));

		Label a = new Label("a");
		a.setPrefSize(400, 150);
		a.setAlignment(Pos.CENTER);
		a.setFont(new Font("Loster", 20));

		Label b = new Label("b");
		b.setPrefSize(400, 100);
		b.setAlignment(Pos.CENTER);
		b.setFont(new Font("Loster", 20));

		Label c = new Label("c");
		c.setPrefSize(400, 100);
		c.setAlignment(Pos.CENTER);
		c.setFont(new Font("Loster", 20));

		Label d = new Label("d");
		d.setPrefSize(400, 100);
		d.setAlignment(Pos.CENTER);
		d.setFont(new Font("Loster", 20));

		Button answerA = new Button("A");
		answerA.setPrefSize(400, 100);
		Button answerB = new Button("B");
		answerB.setPrefSize(400, 100);
		Button answerC = new Button("C");
		answerC.setPrefSize(400, 100);
		Button answerD = new Button("D");
		answerD.setPrefSize(400, 100);

		GridPane gridpane =new GridPane();
		gridpane.setBorder(new Border(new BorderStroke(Color.GREY,BorderStrokeStyle.SOLID,	null, new BorderWidths(2), new Insets(0,0,0,0))));
		gridpane.setGridLinesVisible(false);
		gridpane.setHgap(100);
		gridpane.setVgap(15);
		gridpane.setLayoutX(0);
		gridpane.setLayoutY(100);
		gridpane.setPrefSize(1000,400);
		gridpane.add(answerA, 0, 0);
		gridpane.add(a, 0, 1);
		gridpane.add(answerB, 1, 0);
		gridpane.add(b, 1, 1);
		gridpane.add(answerC, 0, 2);
		gridpane.add(c, 0, 3);
		gridpane.add(answerD, 1, 2);
		gridpane.add(d, 1, 3);
		gridpane.setAlignment(Pos.CENTER);

		Pane pane = new Pane();
		pane.setBorder(new Border(new BorderStroke(Color.GREY,BorderStrokeStyle.SOLID,	null, new BorderWidths(2), new Insets(0,0,0,0))));
		pane.setLayoutX(0);
		pane.setLayoutY(0);
		pane.setPrefSize(700,100);
		pane.getChildren().add(questionlabel);

		SplitPane splitpane = new SplitPane();
		splitpane.setLayoutX(0);
		splitpane.setLayoutY(0);
		splitpane.setPrefSize(700,500);
		splitpane.setDividerPosition(0, 0.2);
		splitpane.setOrientation(Orientation.VERTICAL);
		splitpane.getItems().addAll(pane,gridpane);


		setTextIntoLabels(a, b, c, d, questionlabel, n);

		//handle A button
		answerA.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				String result = a.getText()  + "\n";
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())) {
					answerA.setStyle("-fx-border-color: #00ff00; -fx-border-width: 2px;");
				}
				else { answerA.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
				}

				try {
					TimeUnit.SECONDS.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				CorrectAnswerPane.showCorrectAnswer(primaryStage);
			}
		});

		//handle B button
		answerB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				String result = b.getText()  + "\n";
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())) {
					answerB.setStyle("-fx-border-color: #00ff00; -fx-border-width: 2px;");}
				else {
					answerB.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");}

				try {
					TimeUnit.SECONDS.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				CorrectAnswerPane.showCorrectAnswer(primaryStage);
			}
		});

		//handle C button
		answerC.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				String result = c.getText()  + "\n";
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())) {
					answerC.setStyle("-fx-border-color: #00ff00; -fx-border-width: 2px;");}
				else {
					answerC.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");}

				try {
					TimeUnit.SECONDS.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				CorrectAnswerPane.showCorrectAnswer(primaryStage);
			}
		});

		//handle D button
		answerD.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				String result = d.getText()  + "\n";
				if(verification(result,QuizzGeneration.questions.get(n).getCorrectAnswer())) {
					answerD.setStyle("-fx-border-color: #00ff00; -fx-border-width: 2px;");}
				else {
					answerD.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");}

				try {
					TimeUnit.SECONDS.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				CorrectAnswerPane.showCorrectAnswer(primaryStage);
			}
		});

		Scene quizScene = new Scene(splitpane, 1400, 800, Color.WHITE);
		fenster.setScene(quizScene);
		fenster.show();

	}

	public static boolean verification(String result,String correctAnswer) {

		boolean status = true;
		int cpt = 0;

		char[] resultArray = result.toCharArray();
		char[] answerArray = correctAnswer.toCharArray();


		while (cpt<resultArray.length-1 && status == true) {
			System.out.println(resultArray[cpt]);
			System.out.println(answerArray[cpt]);
			if(resultArray[cpt] != answerArray[cpt]) {
				status = false;
			}
			else {
				status = true;
			}
			cpt++;
		}

		if (status==true) {
			compteur++;
			return true;
		}
		else {
			return false;
		}
	}
}