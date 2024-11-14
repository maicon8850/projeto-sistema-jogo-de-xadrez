package Chess.Pecas;

import Chess.ChessPiece;
import Chess.Color;
import JogoDeTabuleiro.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {

        super(board, color);
    }
    @Override
    public String toString(){

        return  "K";
    }
}
