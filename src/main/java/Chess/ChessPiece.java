package Chess;

import JogoDeTabuleiro.Board;
import JogoDeTabuleiro.Piece;
//Esta classe representa uma peça de xadrez específica. Ela deve herdar da classe Piece
// (já que ChessPiece é um tipo especializado de peça).
public class ChessPiece extends Piece {   // sub classe de piece

    private Color color;

    public ChessPiece (Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
