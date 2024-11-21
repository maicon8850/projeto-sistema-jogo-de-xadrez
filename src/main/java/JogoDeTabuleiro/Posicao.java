package JogoDeTabuleiro;

public class Posicao {

    private int row; // linha
    private int column; //coluna

    public Posicao(){


    }
    public Posicao(int row, int column) { // Corrigido
        this.row = row;
        this.column = column;
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
    @Override //SOBREPOSIÇÃO
    public String toString(){
        return row + " , " + column;
    }
}
