package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Medicamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class criarMedicamentoController implements Initializable {

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelFone;

    @FXML
    private Label labelFabricante;

    @FXML
    private Label labelEfeitos;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldFabricante;

    @FXML
    private TextArea textAreaEfeitos;

    @FXML
    private TextField textFieldFone;

    @FXML
    private CheckBox checkBoxControlado;
    
    Alert alertErro = new Alert(AlertType.ERROR);
    
    Medicamento remedio;

    @FXML
    void OnClickSalvar(ActionEvent event) {
    	    	
    	if(textFieldNome.getText().isEmpty()) {
    		alertErro.show();
    		
    	}else {
    		
    		remedio = new Medicamento(textFieldNome.getText(),
    					textFieldFabricante.getText(),
    					textAreaEfeitos.getText(),
    					textFieldFone.getText(),
    					checkBoxControlado.isSelected()
    					);
    		Main.changeScreen(1);

    	}

    }

    @FXML
    void OnClickVoltar(ActionEvent event) {
    	Main.changeScreen(1);

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		textFieldNome.setText("");
		alertErro.setAlertType(AlertType.ERROR);
    	alertErro.setTitle("Erro de dados");
    	alertErro.setHeaderText("Nome do Medicamento é obrigatório"); 
		
	}

}
