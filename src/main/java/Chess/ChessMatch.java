    package Chess;

    import JogoDeTabuleiro.Board;

    public class ChessMatch {
        private Board board;

        public ChessMatch() {
            board = new Board(8, 8); // Cria um tabuleiro 8x8 para o xadrez

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

    }
