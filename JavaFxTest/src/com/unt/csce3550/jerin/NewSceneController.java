package com.unt.csce3550.jerin;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class NewSceneController {
	
	@FXML 
	private Label welcomeLabel;
	
	public void setLabelText(String name) {
		//welcomeLabel = new Label();
		welcomeLabel.setText("Welcome "+name);
	}
	
	public void goBackButtonClicked(ActionEvent event) {
		System.out.println("Go Back Button Clicked ");
		
		try {
			Parent newViewParent = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene newScene = new Scene(newViewParent);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(newScene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
