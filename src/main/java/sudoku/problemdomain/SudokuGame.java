package sudoku.problemdomain;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
	
	private final GameState gameState;
	private final int[][] gridState;
	
	public static final int GRID_BOUNDARY = 9;
	
	public SudokuGame(GameState state, int[][] gridState) {
		this.gameState = state;
		this.gridState = gridState;
	}
	
	
	public GameState getGameState() {
		return gameState;
	}
	
	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNewArray(gridState);
	}
}
