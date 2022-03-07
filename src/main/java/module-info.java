module com.example.javadesktopsudokudemo {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens sudoku to javafx.fxml;
	exports sudoku;
}