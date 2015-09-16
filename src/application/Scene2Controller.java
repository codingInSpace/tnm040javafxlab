package application;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;

public class Scene2Controller {

	@FXML //fx:id = footer_message
	public Text footer_message;

	public void closeApplication(ActionEvent event) {
        Platform.exit();
    }

	public void showAbout() {
		JOptionPane.showMessageDialog(null, "hej det här är en bra app.");
	}

	public void niceMessage() {
		try {
			footer_message.setText("hej nu hände nånting kul");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
