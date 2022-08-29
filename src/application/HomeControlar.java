package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class HomeControlar {

	public void employeeH(ActionEvent we) {
		try {

			AnchorPane root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void accountHolder(ActionEvent we) {
		try {

			AnchorPane root = FXMLLoader.load(getClass().getResource("AccountHolderMenu.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void exit(ActionEvent we) {

		System.exit(0);

	}

}
