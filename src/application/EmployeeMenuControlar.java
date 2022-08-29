package application;

import javafx.event.ActionEvent;

public class EmployeeMenuControlar {

	public void addNewAcc(ActionEvent e) {

		Main.oj.fxCall("AccountSelect.fxml");
	}

	public void Transactionss(ActionEvent e) {

		Main.oj.fxCall("Transaction.fxml");
	}

	public void AccountDetail(ActionEvent e) {

		Main.oj.fxCall("AccountDetails.fxml");
	}

	public void AllAccountDisp(ActionEvent e) {

		Main.oj.fxCall("Account Desplay.fxml");
	}

	public void Deposit(ActionEvent e) {

		Main.oj.fxCall("Deposite.fxml");
	}

	public void WithdrawMenu(ActionEvent e) {

		Main.oj.fxCall("Withdraw.fxml");
	}

	public void tranAndAcDetail(ActionEvent e) {

		Main.oj.fxCall("TracnsactionAndAccountDetails.fxml");
	}

	public void Transfer(ActionEvent e) {

		Main.oj.fxCall("Transfer.fxml");
	}

	public void Home(ActionEvent e) {

		Main.oj.fxCall("Home.fxml");
	}

	public void exit(ActionEvent we) {

		System.exit(0);

	}

}
