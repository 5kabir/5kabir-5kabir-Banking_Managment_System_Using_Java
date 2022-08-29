package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SavingsControlar {
	@FXML
	TextField nameTf;
	@FXML
	TextField nidTf;
	@FXML
	TextField balanceTf;
	@FXML
	TextField maxWithTf;
	@FXML
	Label info;

	public void Submit(ActionEvent event)  {
		String name = nameTf.getText();
		String nid = nidTf.getText();
		double maxLim = Double.parseDouble(balanceTf.getText());
		double balance = Double.parseDouble(maxWithTf.getText());
		String AccNum = Main.bank.addAccount(name, nid, balance, maxLim);
		//DataHandler.saveData(Main.bank);
		info.setText("Account Created Successfully.\nYour Account Number is: " + AccNum);
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("AccountSelect.fxml");
	}
}