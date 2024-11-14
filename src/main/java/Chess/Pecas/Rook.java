package Chess.Pecas;

import Chess.ChessPiece;
import Chess.Color;
import JogoDeTabuleiro.Board;

public class Rook extends ChessPiece { //Rook sera o nome dessa peça
    public Rook(Board board, Color color) {  // aqui mostra quem é o tabuleiro, quem é a cor, logo epassa
        super(board, color);
    }
    @Override
    public String toString(){
        return  "R";
    }
}
