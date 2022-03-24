package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Move the active tetromino one square to the right.
 *
 * @author David J. Pearce
 *
 */

public class MoveRight extends AbstractTranslation {
	/**
	 * Construct a new move right translation.
	 */
	public MoveRight() {
		super(1,0);
	}

	@Override
	public boolean isValid(Board board) {
		ActiveTetromino tetromino = board.getActiveTetromino();
		if(!super.isValid(board)){
			return false;
		}
		if(tetromino.getBoundingBox().getMaxX() >= board.getWidth() - 1){
			return false;
		}

		return true;
	}
}
