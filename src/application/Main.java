package application;

import java.io.IOException;

import banking.Bank;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	public static Bank bank = new Bank("arg");
	public static Stage primaryStage = null;
	public static Call oj = new Call();

	@Override
	public void start(Stage Stage) {
		try {
			primaryStage = Stage;
			AnchorPane root = FXMLLoader.load(getClass().getResource("Home.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			bank.loadData();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		launch(args);

	}
}
