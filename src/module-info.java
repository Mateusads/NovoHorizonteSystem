module TesteJavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens controller to javafx.graphics, javafx.fxml;
}
