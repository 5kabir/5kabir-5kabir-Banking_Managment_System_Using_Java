package application;

import java.io.IOException;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AccandTraInfo {
	@FXML
	TextField acctN;
	@FXML
	ListView<Transaction> list;
	@FXML
	Label accInfo;

	public void showTrans(ActionEvent event) {
		// String accNumber = accNg.getText();
		String nid = acctN.getText();
		ObservableList<Transaction> details;

		try {
			details = FXCollections.observableArrayList(Main.bank.getAccTransactions(nid));
			for (int i = 0; i < details.size(); i++)
				list.getItems().add(details.get(i));
		} catch (InvalidAccountException e) {
			// mylabel2.setText(e.getMessage());
			// e.printStackTrace();
		}
	}

	public void AccInfo(ActionEvent event) {
		String nid = acctN.getText();

		try {
			accInfo.setText(Main.bank.findAccount(nid).toString());
		} catch (InvalidAccountException e) {
			accInfo.setText(e.getMessage());
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
