package JogoDeTabuleiro;

public class Piece { //peça

    protected  Posicao posicao;
    private Board board;

    protected Board getBoard() { // somente calsses dentro do mesmo pacote poderam
        // acessar e sub classes que vão poder acessar o tabuleiro de uma peça

        return board;
    }

    public Piece(Board board) {
        this.board = board;
        posicao = null; // posicao de uma peça recem criada
    }
}
