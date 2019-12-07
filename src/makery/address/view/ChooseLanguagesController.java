package makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import makery.address.MainApplication;
import makery.address.util.QuizzGeneration;


public class ChooseLanguagesController {

	@FXML
	private Button germanBtn;
	@FXML
	private Button frenchBtn;
	@FXML
	private Button britishBtn;
	@FXML
	private Label languageChoiceLabel;

	// Reference to the main application
	public MainApplication mainApp;

	public void setMainApp(MainApplication mainApp) {
		this.mainApp = mainApp;

	}
	
	@FXML
	private void handleGerman() {
		QuizzGeneration.file = "questionGerman.csv";
		QuizzGeneration.generation();
	}
	
	@FXML
	private void handleEnglish() {
		QuizzGeneration.file = "questionEnglish.csv";
		QuizzGeneration.generation();
	}
	
	@FXML
	private void handleFrench() {
		QuizzGeneration.file = "questionFrench.csv";
		QuizzGeneration.generation();
	}
}
