package controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.Paciente;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class criarPacienteController implements Initializable {
	
    @FXML
    private ImageView imgViewLogo;

	@FXML
    private Label labelNome;

    @FXML
    private Label labelCPF;

    @FXML
    private Label labelSexo;

    @FXML
    private TextField nomeTextField = new TextField("");

    @FXML
    private TextField DataNacimentoTextField;

    @FXML
    private ChoiceBox sexoChoiceBox = new ChoiceBox();
    
    
    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelSobrenome;

    @FXML
    private TextField sobreNomeTextField;

    @FXML
    private Label labelNaturalidade;

    @FXML
    private TextField naturalidadeTextField;

    @FXML
    private Label labelDataNacimento;

    @FXML
    private TextField cpfTextField;

    @FXML
    private Label labelRG;

    @FXML
    private TextField rgTextField;

    @FXML
    private Label labelNomeMae;

    @FXML
    private TextField nomeMaeTextField;

    @FXML
    private ImageView imageFieldFotoPaciente;  

    private Image imagePaciente;  

    @FXML
    private Label labelFotoPaciente;

    @FXML
    private Button btnFotoPaciente;

    @FXML
    private Button btnSavePaciente;
    
    File path;
    
    final Alert alertErro = new Alert(null);
    
    final Alert alertSucess = new Alert(null);

    
    Paciente novoPaciente;
    String sexoPaciente;
    
    @FXML
    private Button btnLimparDados;

    @FXML
    void OnClickLimpar(ActionEvent event) {
    	nomeTextField.setText("");
		sobreNomeTextField.setText(""); 
		DataNacimentoTextField.setText("");
		cpfTextField.setText("");
		rgTextField.setText("");
		nomeMaeTextField.setText("");
		Image image = new Image(getClass().getResourceAsStream("/img/fotoPerfil.png"));
		imageFieldFotoPaciente.setImage(image);
		
		

    }
	

    @FXML
    void OnClickSavePaciente(ActionEvent event) {
    	

    	if(nomeTextField.getText().isEmpty() || sobreNomeTextField.getText().isEmpty() || 
    			DataNacimentoTextField.getText().isEmpty() || naturalidadeTextField.getText().isEmpty() ||
    				cpfTextField.getText().isEmpty() || rgTextField.getText().isEmpty() ||
    					nomeMaeTextField.getText().isEmpty() || path.getPath() == null ||
    						sexoChoiceBox.getValue() == null) {
    		alertErro.show();

    	}else {
    		sexoPaciente = (String) sexoChoiceBox.getValue();
    		novoPaciente = new Paciente(nomeTextField.getText(), 
    				sobreNomeTextField.getText(), 
    				naturalidadeTextField.getText(),
    				DataNacimentoTextField.getText(),
    				cpfTextField.getText(),
    				rgTextField.getText(),
    				sexoPaciente,
    				nomeMaeTextField.getText()    				
    				);  		
    			alertErro.show();
    			Main.changeScreen(1);
    		
    			
    			System.out.println(path.getPath());

    		
    	}




    }

    @FXML
    void OnClickVoltar(ActionEvent event) {
    	Main.changeScreen(1);
    }

    @FXML
    void OnclickFoto(ActionEvent event) throws FileNotFoundException {  
    	ImgController img = new ImgController();
    	
    	path = img.saveImg();
    	String urlImg = path.getPath();
    	Image image = new Image (new FileInputStream(urlImg));
    	imageFieldFotoPaciente.setImage(image);
    	
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	

    	alertErro.setAlertType(AlertType.ERROR);
    	alertErro.setTitle("Erro de dados");
    	alertErro.setHeaderText("DADOS INVALIDOS OU NÃO PREENCHIDOS"); 
    	alertSucess.setAlertType(AlertType.CONFIRMATION);
    	alertSucess.setTitle("DADOS SALVOS COM SUCESSO");
    	alertSucess.setHeaderText("SUCESSO");
		sexoChoiceBox.setItems(FXCollections.observableArrayList(
				"Masculino", "Feminino"));
		

		
		
		

	}
	


}
