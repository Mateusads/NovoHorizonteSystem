module TesteJavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens controller to javafx.graphics, javafx.fxml;
}
