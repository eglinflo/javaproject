package fxProject.view;

import fxProject.adress.MainApp;
import fxProject.util.QuizzGeneration;
import java.io.FileInputStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartmenuPane extends MainApp {

	public static void createStartmenuPane(Stage primaryStage) {
		try {
			
			Stage fenster = primaryStage;
			VBox startMenu = new VBox(30);
			startMenu.setAlignment(Pos.CENTER);
			VBox languageMenu = new VBox(30);
			languageMenu.setAlignment(Pos.TOP_CENTER);
			
			//Création des labels
			Label label1 = new Label("Hello! Welcome to the Trinat-Quiz!");
			label1.setFont(new Font("Lobster", 70));
			label1.setTextFill(Color.web("BLACK"));
			Label label2 = new Label("Click on the start button to begin");
			label2.setFont(new Font("Lobster", 36));
			label2.setTextFill(Color.web("GREY"));
			Label label3 = new Label("Choose your language");
			label3.setFont(new Font("Lobster", 60));
			Label languageLabel = new Label("Languages:");
			languageLabel.setFont(new Font("Lobster", 25));
			languageLabel.setTextFill(Color.web("GREY"));

			//Création des scènes
			Scene szene1 = new Scene(startMenu, 1400, 800);
			Scene szene2 = new Scene(languageMenu, 1400, 800);
			
			
			
			//Importation des images
			/*FileInputStream germanInput = new FileInputStream("C:\\Users\\Elève\\eclipse-workspace\\Java_Fx\\src\\u5\\german_flag.png");
	        Image germanImage = new Image(germanInput);
	        ImageView germanView = new ImageView(germanImage);
	        germanView.setFitWidth(180);
	    	germanView.setFitHeight(120);
			/*FileInputStream englishInput = new FileInputStream("C:\\Users\\Elève\\eclipse-workspace\\Java_Fx\\src\\u5\\english_flag.png");
	        Image englishImage = new Image(englishInput);
	        ImageView englishView = new ImageView(englishImage);
	        englishView.setFitWidth(180);
	    	englishView.setFitHeight(120);
			FileInputStream frenchInput = new FileInputStream("C:\\Users\\Elève\\eclipse-workspace\\Java_Fx\\src\\u5\\french_flag.png");
	        Image frenchImage = new Image(frenchInput);
	        ImageView frenchView = new ImageView(frenchImage);
	        frenchView.setFitWidth(180);
	    	frenchView.setFitHeight(120);*/
			
			//Création des boutons
			Button startbutton = new Button("Start");
			Button germanbutton = new Button(""/*,germanView*/);
			Button englishbutton = new Button(""/*,englishView*/);
			Button frenchbutton = new Button(""/*,frenchView*/);
			
			//Taille des boutons
			startbutton.setPrefSize(200,100);
			startbutton.setStyle("-fx-border-width: 2px;-fx-font-size: 40;");
			germanbutton.setPrefSize(180,180);
			englishbutton.setPrefSize(180,180);
			frenchbutton.setPrefSize(180,180);
			
			startMenu.getChildren().addAll(label1, label2, startbutton);
			languageMenu.getChildren().addAll(label3, languageLabel, germanbutton, englishbutton, frenchbutton);
			
			startbutton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					fenster.setScene(szene2);
					fenster.show();
				}
			});
			
			germanbutton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					QuizzGeneration.file = "questionGerman.csv";
					QuizzGeneration.generation();
					languageLabel.setText("German");
					System.out.println("Language: German");
					QuizPaneControll.createQuizPane(primaryStage);
				}
			});
			
			englishbutton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					QuizzGeneration.file = "questionEnglish.csv";
					QuizzGeneration.generation();
					languageLabel.setText("English");
					System.out.println("Language: English");
					QuizPaneControll.createQuizPane(primaryStage);
				}
			});
			
			frenchbutton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					QuizzGeneration.file = "questionFrench.csv";
					QuizzGeneration.generation();
					languageLabel.setText("French");
					System.out.println("Language: French");
					QuizPaneControll.createQuizPane(primaryStage);
				}
			});
			
			fenster.setScene(szene1);
			fenster.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}