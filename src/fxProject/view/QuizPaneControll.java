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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class QuizPaneControll extends MainApp {

	public static int n = 0;
	public static void createQuizPane(Stage primaryStage)  
	{
		Stage fenster = primaryStage;

		Label questionlabel = new Label("QUESTION");
		questionlabel.setPrefSize(700, 100);
		questionlabel.setTextAlignment(TextAlignment.CENTER);
		questionlabel.setAlignment(Pos.CENTER);
		Label a = new Label("a");
		a.setPrefSize(400, 150);
		a.setAlignment(Pos.CENTER);
		Label b = new Label("b");
		b.setPrefSize(400, 100);
		b.setAlignment(Pos.CENTER);
		Label c = new Label("c");
		c.setPrefSize(400, 100);
		c.setAlignment(Pos.CENTER);
		Label d = new Label("d");
		d.setPrefSize(400, 100);
		d.setAlignment(Pos.CENTER);

		Button answerA = new Button("A");
		answerA.setPrefSize(400, 100);
		Button answerB = new Button("B");
		answerB.setPrefSize(400, 100);
		Button answerC = new Button("C");
		answerC.setPrefSize(400, 100);
		Button answerD = new Button("D");
		answerD.setPrefSize(400, 100);

		//Button nextQuestion = new Button("-> next");


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
		//pane.setAlignment(Pos.CENTER);

		SplitPane splitpane = new SplitPane();
		splitpane.setLayoutX(0);
		splitpane.setLayoutY(0);
		splitpane.setPrefSize(700,500);
		splitpane.setDividerPosition(0, 0.2);

		splitpane.setOrientation(Orientation.VERTICAL);
		splitpane.getItems().addAll(pane,gridpane);


		setTextIntoLabels(a, b, c, d, questionlabel, n);
		
		//handle A
		answerA.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String result = a.getText();
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())==true) {
					answerA.setBorder(new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));
					showRightAnswerIntoLabel (questionlabel, n);}
				else {
					answerA.setBorder(new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));}
			}
		});
		//handle B
		answerB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String result = b.getText();
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())==true) {
					answerB.setBorder(new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));
					showRightAnswerIntoLabel (questionlabel, n);}
				else {
					answerB.setBorder(new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));}
			}
		});
		//handle C
		answerC.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String result = c.getText();
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())==true) {
					answerC.setBorder(new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));
					showRightAnswerIntoLabel (questionlabel, n);}
				else {
					answerC.setBorder(new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));}
			}
		});
		//handle D
		answerD.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String result = d.getText();
				if(verification(result,QuizzGeneration.questions.get(n).getCorrectAnswer())==true) {
					answerD.setBorder(new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));
					showRightAnswerIntoLabel (questionlabel, n);}
				else {
					answerD.setBorder(new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(0,0,0,0))));}
			}
		});

		Scene quizScene = new Scene(splitpane, 1400, 800, Color.WHITE);
		fenster.setScene(quizScene);
		fenster.show();

	}

	public static boolean verification(String result,String correctAnswer) {
		
		result = result + "\\n";
		System.out.println(result+" "+correctAnswer);
		
		boolean test = result.equals(correctAnswer);
		System.out.println(test);
		
		if (test==true) {
			return true;
		}
		else {
			return false;
		}
	}
}