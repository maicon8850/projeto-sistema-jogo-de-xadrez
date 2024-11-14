package Aplicacao;

import Chess.ChessMatch;
import JogoDeTabuleiro.Board;
import JogoDeTabuleiro.Posicao;

public class Programa {
    public static void main(String[] args) {

        ChessMatch chess = new ChessMatch();
        Interface.printBoard(chess.getPieces());
    }
}
