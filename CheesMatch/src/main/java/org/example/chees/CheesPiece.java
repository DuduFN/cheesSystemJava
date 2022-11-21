package org.example.chees;

import org.example.boardgame.Board;
import org.example.boardgame.Piece;

public class CheesPiece extends Piece {

    private Color color;

    public CheesPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
