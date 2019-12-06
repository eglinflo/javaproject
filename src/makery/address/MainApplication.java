package makery.address;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import makery.address.view.ChooseLanguagesController;

public class MainApplication extends Application {

	private Stage primaryStage;
	private BorderPane roootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("FTM_Quizz");

		initRootLayout();

		showChooseLanguage();
	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApplication.class.getResource("view/RoootLayout.fxml"));
			roootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(roootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the language choice inside the root layout.
	 */
	public void showChooseLanguage() {
		try {
			// Load language choice.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApplication.class.getResource("view/ChooseLanguage.fxml"));
			AnchorPane chooseLanguage = (AnchorPane) loader.load();

			// Set ChooseLanguage into the center of root layout.
			roootLayout.setCenter(chooseLanguage);
			
			// Give the controller access to the main app.
	        ChooseLanguagesController controller = loader.getController();
	        controller.setMainApp(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}