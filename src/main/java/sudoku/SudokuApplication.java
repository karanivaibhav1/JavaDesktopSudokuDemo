package sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import sudoku.buildlogic.SudokuBuildLogic;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuApplication extends Application {
	
	private IUserInterfaceContract.View uiImpl;
	
	@Override
	public void start(Stage stage) throws IOException {
		uiImpl = new UserInterfaceImpl(stage);
		try {
			SudokuBuildLogic.build(uiImpl);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		launch();
	}
}