package swen221.tetris.moves;

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
}
