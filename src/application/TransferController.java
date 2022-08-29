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

public class TransferController {
	@FXML
	TextField fromAccTf;
	@FXML
	TextField toAccTf;
	@FXML
	TextField balanceTf;
	@FXML
	Label message;

	public void transfer(ActionEvent event) {
		String fromAcc = fromAccTf.getText();
		String toAcc = toAccTf.getText();
		double balance = Double.parseDouble(balanceTf.getText());

		message.setText("Transfer Successfull.");

		try {
			Main.bank.transfer(fromAcc, toAcc, balance);
		} catch (InvalidAccountException e) {
			message.setText(e.getMessage());

		} catch (InSufficientBalanceException e) {
			message.setText(e.getMessage());

		} catch (MaxWithdawException e) {
			message.setText(e.getMessage());
		}
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("EmployeeMenu.fxml");
	}

}
