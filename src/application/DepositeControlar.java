package application;

	import java.io.FileNotFoundException;

	import java.io.IOException;

	import banking.InvalidAccountException;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;

	public class DepositeControlar {
		
		@FXML
		TextField accNumtff;
		@FXML
		TextField balancetff;
		@FXML
		Label myLabelbb;


		public void deposit(ActionEvent Event) {
			String fromAcc=accNumtff.getText();
			double balance=Double.parseDouble(balancetff.getText());

			  // myLabelbb.setText(Double.toString(Main.bank.getBalance(fromAcc)));
			myLabelbb.setText("Deposited Successfully");
		
		try {
			Main.bank.deposit(fromAcc, balance);
		} catch (InvalidAccountException e) {
			myLabelbb.setText(e.getMessage());
			  //e.printStackTrace();
		}
		try {
		Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//myLabelbb.setText("Deposited Successfully");
		}
		
	}


		
		
		
		
		 public void Home( ActionEvent event) {
		    	Main.oj.fxCall("Home.fxml");
		    }
		    public void Back( ActionEvent event)  {
		    	Main.oj.fxCall("EmployeeMenu.fxml");
		    }
		

	}