package application;

import java.io.IOException;
import java.util.ArrayList;

import banking.BankAccount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class DisplayAll {
	@FXML
	TextArea area;
	String accounts;

	public void initialize() {
		ArrayList<BankAccount> ac = Main.bank.getAccounts();
		for (int i = 0; i < ac.size(); i++)
			accounts += ac.get(i).toString() + "\n";
		area.setText(accounts);
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("EmployeeMenu.fxml");
	}
}
