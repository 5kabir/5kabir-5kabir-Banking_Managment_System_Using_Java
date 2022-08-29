package application;

import java.io.IOException;

import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccountDetails {
	@FXML
	TextField AccNumbt;
	@FXML
	Label mylebell;

	public void AccInfo(ActionEvent event) {
		String accNum = AccNumbt.getText();

		try {
			mylebell.setText(Main.bank.findAccount(accNum).toString());
		} catch (InvalidAccountException e) {
			mylebell.setText(e.getMessage());
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("EmployeeMenu.fxml");
	}

}
