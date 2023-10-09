package boardgame;

import chess.ChessPosition;

public class Piece {
	
	protected ChessPosition position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
}
