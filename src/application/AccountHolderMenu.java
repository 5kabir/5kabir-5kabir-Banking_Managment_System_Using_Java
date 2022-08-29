package application;

import javafx.event.ActionEvent;

public class AccountHolderMenu {

	public void accountHolderDetails(ActionEvent e) {

	 Main.oj.fxCall("AccountDetails.fxml");
	}

	public void accountHolderTransDetails(ActionEvent e) {

		Main.oj.fxCall("Transaction.fxml");
	}

	     public void exit(ActionEvent we) {

		 System.exit(0);

	}

	public void Home(ActionEvent e) {

		Main.oj.fxCall("Home.fxml");
	}

}
