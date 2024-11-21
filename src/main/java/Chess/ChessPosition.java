package Chess;

import JogoDeTabuleiro.Posicao;

public class ChessPosition {
    private char column; // Coluna (a-h)
    private int row;     // Linha (1-8)

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Erro ao instanciar ChessPosition. Valores válidos são de a1 a h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /**
     * Converte a posição de xadrez (a1, b2, etc.) para o formato interno da matriz (0-indexed).
     */
    protected Posicao toPosition() {
        return new Posicao(8 - row, column - 'a'); // Converte para formato interno
    }

    /**
     * Converte uma posição de matriz para o formato de xadrez.
     */
    protected static ChessPosition fromPosition(Posicao position) {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row; // Retorna no formato padrão de xadrez
    }
}
