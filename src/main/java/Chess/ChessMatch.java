    package Chess;

    import Chess.Pecas.King;
    import Chess.Pecas.Rook;
    import JogoDeTabuleiro.Board;
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
        // Método que configura as peças iniciais no tabuleiro
        private void initialSetup() {
            // Coloca uma torre branca na posição (2, 1)
            board.placePiece(new Rook(board, Color.WHITE), new Posicao(2, 1));

            board.placePiece(new King(board, Color.BLACK), new Posicao(4 , 5));
            // Adicione o restante das peças conforme necessário
        }
    }
