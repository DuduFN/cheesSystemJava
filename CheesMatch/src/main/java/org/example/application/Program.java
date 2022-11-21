package org.example.application;

import org.example.boardgame.Board;
import org.example.boardgame.Position;
import org.example.chees.Match;

public class Program {
    public static void main(String[] args) {

        Match match = new Match();
        UI.printBoard(match.getPieces());
    }
}
