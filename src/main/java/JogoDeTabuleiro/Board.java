package JogoDeTabuleiro;

public class Board { // Tabuleiro

    // Atributos
    private int rows; // linhas
    private int columns; // colunas
    private Piece[][] pieces; // Matriz que representa o tabuleiro; cada célula pode armazenar uma peça.

    // Construtor
    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) { // Verifica se as dimensões são válidas
            throw new BoardException("Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns]; // Inicializa a matriz de peças
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    // Método para obter uma peça em uma posição específica
    public Piece getPiece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Posição não encontrada no tabuleiro");
        }
        return pieces[row][column];
    }

    // Método para posicionar uma peça no tabuleiro
    public void placePiece(Piece piece, int row, int column) {
        pieces[row][column] = piece;
    }

    // Método que retorna a peça em uma posição específica
    public Piece piece(int row, int column) {
        return pieces[row][column]; // Retorna a peça na posição especificada
    }

    public Piece piece(Posicao posicao) {
        // Removido a declaração redundante de Posicao
        if (!positionExists(posicao)) {
            throw new BoardException("Posição não encontrada no tabuleiro");
        }
        return pieces[posicao.getRow()][posicao.getColumn()];
    }

    public void placePiece(Piece piece, Posicao posicao) {
        pieces[posicao.getRow()][posicao.getColumn()] = piece;
        piece.posicao = posicao;
    }

    // Método para verificar se uma posição está dentro dos limites do tabuleiro
    private boolean positionExists(int row, int column) {

        //row >= 0: Verifica se a linha (row) é maior ou igual a 0 (não é negativa).
        //row < rows: Verifica se a linha (row) é menor que o número total de linhas (rows).
        //column >= 0: Verifica se a coluna (column) é maior ou igual a 0 (não é negativa).
        //column < columns: Verifica se a coluna (column) é menor que o número total de colunas (columns).
        //&& (E lógico): Retorna true apenas se todas as condições forem verdadeiras.
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    // Verifica se a posição é válida
    public boolean positionExists(Posicao posicao) {
        return positionExists(posicao.getRow(), posicao.getColumn());
    }

    // Método para verificar se existe uma peça em uma determinada posição
    public boolean thereIsAPiece(Posicao posicao) {
        if (!positionExists(posicao)) {
            throw new BoardException("Posição fora do tabuleiro");
        }
        return piece(posicao) != null;
    }
    public Piece removePiece(Posicao posicao) {
        if (!positionExists(posicao)) {
            throw new BoardException("Posição fora dos limites do tabuleiro: " + posicao);
        }
        if (piece(posicao) == null) {
            return null;
        }
        Piece removedPiece = piece(posicao);
        pieces[posicao.getRow()][posicao.getColumn()] = null;
        return removedPiece;
    }
}
