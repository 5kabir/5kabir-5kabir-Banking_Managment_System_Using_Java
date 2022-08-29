package application;

import java.io.FileNotFoundException;

import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WithdrawControlar {
	@FXML
	TextField accNumtf;
	@FXML
	TextField balancetf;
	@FXML
	Label myLabelb;

	public void withdraw(ActionEvent event) {
		String accNum = accNumtf.getText();
		double amount = Double.parseDouble(balancetf.getText());

		try {
			Main.bank.withdraw(accNum, amount);
		}

		catch (InvalidAccountException e) {
			myLabelb.setText(e.getMessage());
			// e.printStackTrace();
		} catch (InSufficientBalanceException e) {
			myLabelb.setText(e.getMessage());
			// e2.printStackTrace();
		} catch (MaxWithdawException e) {
			myLabelb.setText(e.getMessage());
			// e3.printStackTrace();
		}

		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		myLabelb.setText("Withdraw Successfully");
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("EmployeeMenu.fxml");
	}

}
