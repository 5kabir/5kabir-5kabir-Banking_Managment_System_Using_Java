package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StudentAccControlar {

	@FXML
	TextField nameTf;
	@FXML
	TextField nidTf;
	@FXML
	TextField balanceTf;
	@FXML
	TextField institutionIdTf;
	@FXML
	TextField institutionNameTf;
	@FXML
	Label info;

	public void CreateAccount(ActionEvent event) {

		String name = nameTf.getText();
		String nid = nidTf.getText();
		double balance = Double.parseDouble(balanceTf.getText());
		String institutionId = institutionIdTf.getText();
		String institutionName = institutionNameTf.getText();

		String accNum = Main.bank.addAccount(name, nid, balance, institutionId, institutionName);
		info.setText(accNum);
		try {
			Main.bank.saveData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Home(ActionEvent event) throws IOException {
		Main.oj.fxCall("Home.fxml");
	}

	public void Back(ActionEvent event) throws IOException {
		Main.oj.fxCall("AccountSelect.fxml");
	}
}
