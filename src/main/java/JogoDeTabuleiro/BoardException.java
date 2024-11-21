package JogoDeTabuleiro;

// Classe para tratar exceções relacionadas ao tabuleiro
public class BoardException extends RuntimeException {
    // Construtor que recebe uma mensagem como argumento
    public BoardException(String message) {
        super(message);
    }
}
