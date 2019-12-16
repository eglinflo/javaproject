package fxProject.view;

import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class CorrectAnswerPane extends QuizPaneControll {


	public static void showCorrectAnswer(Stage primaryStage)  
	{

		Stage fenster = primaryStage;

		Label answerlb = new Label("The correct answer was: ");
		answerlb.setFont(new Font("Loster", 25));
		answerlb.setAlignment(Pos.CENTER);
		answerlb.setTextAlignment(TextAlignment.CENTER);

		Label answerlabel = new Label("Right Answer");
		showRightAnswerIntoLabel (answerlabel, QuizPaneControll.n);
		answerlabel.setFont(new Font("Loster", 30));
		answerlabel.setAlignment(Pos.CENTER);
		answerlabel.setTextAlignment(TextAlignment.CENTER);
		answerlabel.setTextFill(Color.FORESTGREEN);

		Button next = new Button("-> Next");
		next.setPrefSize(200, 50);
		next.setFont(new Font("Loster", 22));
		next.setAlignment(Pos.CENTER);


		StackPane pane = new StackPane();
		pane.setBorder(new Border(new BorderStroke(Color.TRANSPARENT,BorderStrokeStyle.SOLID, null, new BorderWidths(2), new Insets(50,50,50,50))));
		pane.setLayoutX(0);
		pane.setLayoutY(0);
		pane.setPrefSize(1400,800);
		pane.setStyle("-fx-background-color: WHITE");
		pane.getChildren().addAll(answerlb, answerlabel,next);
		StackPane.setAlignment(answerlb, Pos.TOP_CENTER);
		StackPane.setAlignment(answerlabel, Pos.CENTER);
		StackPane.setAlignment(next, Pos.BOTTOM_RIGHT);


		//handlefunction nextButton
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				try {
					TimeUnit.SECONDS.sleep(1);;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(QuizPaneControll.n<9) {
					QuizPaneControll.n ++;
					QuizPaneControll.createQuizPane(primaryStage);

				}
				else {
					ResultPane.createResultPane(primaryStage);
				}
			}

		});

		
		Scene answerScene = new Scene(pane, 1400, 800, Color.WHITE);
		fenster.setScene(answerScene);
		fenster.show();

	}
}
