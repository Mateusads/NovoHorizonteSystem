package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {	

	   @FXML
	    private AnchorPane telaPrincipal;

	    @FXML
	    private MenuBar menuPrincipál;

	    @FXML
	    private Menu menuAbrir;

	    @FXML
	    private MenuItem menuPaciente;

	    @FXML
	    private MenuItem menuContrato;

	    @FXML
	    private Menu menuEditar;

	    @FXML
	    private MenuItem menuEditarPaciente;

	    @FXML
	    private MenuItem menuEditarMedicacao;

	    @FXML
	    private Button btnBuscaPaciente;

	    @FXML
	    private Button btnAddPaciente;

	    @FXML
	    private Button btnAddMedicamento;

	    @FXML
	    private Button btnBuscaContrato;

	    @FXML
	    private ImageView logoFoneImageView;

	    @FXML
	    void OnClickBuscaContrato(ActionEvent event) {

	    }

	    @FXML
	    void OnClickBuscaPaciente(ActionEvent event) {

	    }

	    @FXML
	    void OnClickContrato(ActionEvent event) {

	    }

	    @FXML
	    void OnClickCriar(ActionEvent event) {
	    	Main.changeScreen(2);

	    }

	    @FXML
	    void OnClickCriarMedicamento(ActionEvent event) {
	    	Main.changeScreen(3);

	    }

	    @FXML
	    void OnClickEditMedicacao(ActionEvent event) {
	    	Main.changeScreen(3);

	    }

	    @FXML
	    void OnClickEditPaciente(ActionEvent event) {
	    	Main.changeScreen(2);

	    }

	    @FXML
	    void OnClickPaciente(ActionEvent event) {	    	
	    	Main.changeScreen(2);

	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}






