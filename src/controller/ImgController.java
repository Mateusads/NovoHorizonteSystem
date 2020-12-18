package controller;

import java.io.File;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;

public class ImgController implements Runnable {

	Image img = null;
	final FileChooser fc = new FileChooser();
	
	public File saveImg() {  	
    	
        FileChooser file = new FileChooser();  
        file.setTitle("Open File");  
//        file.showOpenDialog(Main.getStage());
        
        File arquivo = file.showOpenDialog(Main.getStage());
        
        if(file != null) {
        	
        	System.out.println(arquivo.getPath());
        	return arquivo;
        }
        
        return arquivo;
//        
//        filePath = fc.getSelectedExtensionFilter().getDescription();
//        
//       
//        System.out.println("file" + file.getTitle());
//		return filePath;  

        

    	
//    	String caminho = getClass().getClass().getResource("/view/".to);

    	
//	    try {
//			imagePaciente = new Image(new FileInputStream("/img/fotoPerfil.png"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

    
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
