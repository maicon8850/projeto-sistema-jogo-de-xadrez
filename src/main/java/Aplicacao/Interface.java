package Aplicacao;

import Chess.ChessMatch;
import Chess.ChessPiece;

public class Interface {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {  // length trabalha com arrays
            System.out.print((8 - i) + " ");  // Corrige o espaço e a numeração das linhas
            for (int j = 0; j < pieces[i].length; j++) {  // Corrige o acesso às colunas
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");  // Corrige a impressão das letras das colunas
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("- ");  // Corrige o espaço ao imprimir uma peça nula
        } else {
            System.out.print(piece + " ");  // Se houver uma peça, imprime sua representação
        }
    }
}
