package JogoDeTabuleiro;

public class Board { // Tabuleiro

    // Atributos
    private int rows;
    private int columns;
    private Piece[][] pieces;

    // Construtor
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns]; // Inicializa a matriz de peças
    }

    // Getters e Setters
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    // Método para obter uma peça em uma posição específica
    public Piece getPiece(int row, int column) {
        return pieces[row][column];
    }

    // Método para posicionar uma peça no tabuleiro
    public void placePiece(Piece piece, int row, int column) {
        pieces[row][column] = piece;
    }
}
