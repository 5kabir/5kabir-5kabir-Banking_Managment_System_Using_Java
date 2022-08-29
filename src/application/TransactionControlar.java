package application;

import java.io.IOException;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TransactionControlar {
	@FXML
	TextField accNg;
	@FXML
	TextField nidNg;
	@FXML

	ListView<Transaction> list;

	public void showTrans(ActionEvent Event) {
		String accNumber = accNg.getText();
		String nid = nidNg.getText();
		ObservableList<Transaction> details;
		try {
			details = FXCollections.observableArrayList(Main.bank.getAccTransactions(nid, accNumber));
			for (int i = 0; i < details.size(); i++)
				list.getItems().add(details.get(i));
		} catch (InvalidAccountException e) {
			//elabel.setText(e.getMessage());
			//e.printStackTrace();
		}
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("EmployeeMenu.fxml");
	}
}
