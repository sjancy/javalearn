package com.unt.csce3550.jerin;

import javafx.event.*;
import javafx.fxml.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;

import java.io.IOException;
import java.lang.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class SampleController {
	
	public void loginButtonClicked(ActionEvent event) {
		System.out.println("User Logged In");
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("NewScene.fxml"));
			Parent newViewParent = loader.load();
			
			
			//Parent newViewParent = FXMLLoader.load(getClass().getResource("NewScene.fxml"));
			Scene newScene = new Scene(newViewParent);
			
			NewSceneController newSceneController = loader.getController();
			newSceneController.setLabelText("Jerin");
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(newScene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
