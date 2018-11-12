package tecShop.controller.view;
	



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
* @author  Richard Connolly
* @version 1.0
* @since   2018-11
* Notes in Notes document in src folder of this project.
*/


public class LoginController {

	
	
	/*********************************FXML Tags for the username, password and status on the login screen*********************************************************/
	@FXML
	private Label message;

	@FXML
	private TextField txtUserName;

	@FXML
	private TextField txtPassword;

	/*********************************stores login screen data and moves to main screen on success************************************************/
	public void Login(ActionEvent e) throws Exception {
		if (txtUserName.getText().equals("Richard") && txtPassword.getText().equals("password")) {
			message.setText("Login Success");
			Stage primaryStage = new Stage ();
			AnchorPane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(pane, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			message.setText("Login Failed");
		}

	}
}