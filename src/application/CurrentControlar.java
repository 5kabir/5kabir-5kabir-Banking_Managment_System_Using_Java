package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrentControlar {

	@FXML
	TextField nametf;
	@FXML
	TextField idtf;
	@FXML
	TextField balancetf;
	@FXML
	TextField tradelicencetf;

	@FXML
	Label te;

	public void Home(ActionEvent ex) {
		Main.oj.fxCall("Home.fxml");

	}

	public void Back(ActionEvent ex) {
		Main.oj.fxCall("AccountSelect.fxml");

	}

	public void Creat(ActionEvent ex) {
		String name = nametf.getText();
		String id = idtf.getText();
		double balance = Double.parseDouble(balancetf.getText());
		String trade = tradelicencetf.getText();
		String accNum = Main.bank.addAccount(name, id, balance, trade);
		te.setText(accNum);
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

}
