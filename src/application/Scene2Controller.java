package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Scene2Controller {

	@FXML
	protected MenuItem closeButton;

	public void closeApplication(ActionEvent event) {
//        System.out.println("hej.");
        Platform.exit();
    }

}
