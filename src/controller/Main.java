package controller;
	


import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application  {
	
	private static Stage stage;
	
	private static Scene mainScene;
	private static Scene criarPacienteScene;
	private static Scene criarMedicamentoScene;
	
	@Override
	public void start(Stage primaryStage) throws IOException  {
		
		stage = primaryStage;

		
		Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/main_screen.fxml"));
		mainScene = new Scene(fxmlMain);		

		
		Parent fxmlCriarPaciente = FXMLLoader.load(getClass().getResource("/view/criarPaciente.fxml"));
		criarPacienteScene = new Scene(fxmlCriarPaciente);		
		
		Parent fxmlCriarMedicamento = FXMLLoader.load(getClass().getResource("/view/criarMedicamento.fxml"));
		criarMedicamentoScene = new Scene(fxmlCriarMedicamento);	
		
		
		primaryStage.setScene(mainScene);

		primaryStage.show();
		
	}
	
	public static void changeScreen(int op) {
		switch (op) {
			case 1:
				stage.setScene(mainScene);
				break;
			
			case 2:
				stage.setScene(criarPacienteScene);
				break;
				
			case 3:
				stage.setScene(criarMedicamentoScene);
				break;
			
			
		}
	}
	
	public static Stage getStage() {
		return stage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	private static ArrayList<OnChangeScreen> listners = new ArrayLista<>();
//	
//	public static interface OnChangeScreen{
//		void onScreenChanged(String newScreen, Object userData);
//	}
	
	
}
