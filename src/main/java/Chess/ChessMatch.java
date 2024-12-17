    package Chess;

    import Chess.Pecas.King;
    import Chess.Pecas.Rook;
    import JogoDeTabuleiro.Board;
    import JogoDeTabuleiro.BoardException;
    import JogoDeTabuleiro.Posicao;

    public class ChessMatch {
        private Board board;

        public ChessMatch() {
            board = new Board(8, 8);
            initialSetup();// Cria um tabuleiro 8x8 para o xadrez

        }

    public  ChessPiece [][] getPieces(){
            ChessPiece [][] met = new ChessPiece[board.getRows()][board.getColumns()];

            for ( int  i = 0; i < board.getRows(); i++){
                for (int j = 0; j < board.getColumns(); j++ ){

                    met[i][j] = (ChessPiece) board.piece(i,j);
                }
        }
         return met;
    }

        private void initialSetup() {
            try {
                placeNewPiece('c', 1, new Rook(board, Color.WHITE));
                placeNewPiece('c', 2, new Rook(board, Color.WHITE));
                placeNewPiece('d', 2, new Rook(board, Color.WHITE));
                placeNewPiece('e', 2, new Rook(board, Color.WHITE));
                placeNewPiece('e', 1, new Rook(board, Color.WHITE));
                placeNewPiece('d', 1, new King(board, Color.WHITE));
                placeNewPiece('c', 7, new Rook(board, Color.BLACK));
                placeNewPiece('c', 8, new Rook(board, Color.BLACK));
                placeNewPiece('d', 7, new Rook(board, Color.BLACK));
                placeNewPiece('e', 7, new Rook(board, Color.BLACK));
                placeNewPiece('e', 8, new Rook(board, Color.BLACK));
                placeNewPiece('d', 8, new King(board, Color.BLACK));
            } catch (ChessException e) {
                System.out.println("Erro ao configurar o tabuleiro: " + e.getMessage());
            }
        }

        private void placeNewPiece(char column, int row, ChessPiece piece) {
            board.placePiece(piece, new ChessPosition(column, row).toPosition());
        }

        public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
            Posicao source = sourcePosition.toPosition();
            Posicao target = targetPosition.toPosition();
            validateSourcePosition(source);
            ChessPiece capturedPiece = (ChessPiece) board.removePiece(target);
            board.placePiece((ChessPiece) board.removePiece(source), target);
            return capturedPiece;
        }

        private void validateSourcePosition(Posicao position) {
            if (!board.thereIsAPiece(position)) {
                throw new ChessException("Não há peça na posição de origem.");
            }
            if (!(board.piece(position) instanceof ChessPiece)) {
                throw new ChessException("A peça na posição de origem não é válida.");
            }
        }

    }
