package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Call {
	public void fxCall(String ex) {
		try {

			AnchorPane root = FXMLLoader.load(getClass().getResource(ex));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
