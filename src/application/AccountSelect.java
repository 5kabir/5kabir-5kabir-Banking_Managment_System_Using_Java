package application;

import javafx.event.ActionEvent;

public class AccountSelect {

	public void SavingsAcc(ActionEvent e) {

		Main.oj.fxCall("SavingsAccount.fxml");
	}

	public void CurrentAccount(ActionEvent e) {

		Main.oj.fxCall("CurrentAccount.fxml");
	}

	public void StudentAcc(ActionEvent e) {

		Main.oj.fxCall("StudentAccount.fxml");

	}

	public void Back(ActionEvent e) {

		Main.oj.fxCall("EmployeeMenu.fxml");

	}

	public void Home(ActionEvent e) {

		Main.oj.fxCall("Home.fxml");

	}

}
