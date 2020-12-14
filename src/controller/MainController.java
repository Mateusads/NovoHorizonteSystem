package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {

    @FXML
    private AnchorPane telaPrincipal;

    @FXML
    private MenuBar menuPrincipál;

    @FXML
    private Button apagarBtn;

    @FXML
    private Button criarBtn;

    @FXML
    private Button editarBtn;

    @FXML
    void OnClickApagar(ActionEvent event) {

    }

    @FXML
    void OnClickCriar(ActionEvent event) {
    	System.out.println("testeBtnCriar");
  

    }

    @FXML
    void OnClickEditar(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}