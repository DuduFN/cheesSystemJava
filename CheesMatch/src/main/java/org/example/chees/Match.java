package org.example.chees;

import org.example.boardgame.Board;

public class Match {

    private Board board;

    public Match(){
        board = new Board(8,8);
    }

    public CheesPiece[][] getPieces(){
        CheesPiece[][] mat = new CheesPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (CheesPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}
