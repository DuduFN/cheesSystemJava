package org.example.application;

import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;
import org.example.chess.Match;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Match match = new Match();

        while (true) {
            UI.printBoard(match.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = match.peformChessMove(source, target);
        }
    }
}
