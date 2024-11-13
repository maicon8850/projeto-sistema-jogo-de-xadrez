package JogoDeTabuleiro;

public class Posicao {

    private int row; // linha
    private int column; //coluna

    public Posicao(){


    }
    public Posicao(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    // agora quero imprimir a posicao na tela, logo preciso fazer a funão abaixo de tpString
    @Override
    public String toString(){
        return row + " , " + column;
    }
}
