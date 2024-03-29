package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Move the active tetromino one square to the left.
 *
 * @author David J. Pearce
 *
 */
public class MoveLeft extends AbstractTranslation {
	/**
	 * Construct a new move left translation.
	 */
	public MoveLeft() {
		super(-1,0);
	}

	@Override
	public boolean isValid(Board board) {
		ActiveTetromino tetromino = board.getActiveTetromino();
	try {
		if (tetromino.getBoundingBox().getMinX() <= 0) {
			return false;
		}

		if (!super.isValid(board)) {
			return false;
		}

		if (board.CheckTouch1(tetromino)) {
			return false;
		}
	}catch (NullPointerException e){
		return false;
	}

		return true;

	}

	}
