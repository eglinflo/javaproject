package makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import makery.address.MainApplication;

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
}
