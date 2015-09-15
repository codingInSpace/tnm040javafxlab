package application;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;

public class Scene2Controller {

//	@FXML
//	protected MenuItem closeButton;

	@FXML //fx:id = content_message
	public Text footer_message;

	public void closeApplication(ActionEvent event) {
//        System.out.println("hej.");
        Platform.exit();
    }

	public void showAbout(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "hej det här är en bra app.");
	}

	public void niceMessage(ActionEvent event) {
		try {
			footer_message.setText("hej nu hände nånting kul");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
