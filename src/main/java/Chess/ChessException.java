package Chess;

// Classe pública que herda de RuntimeException para lidar com exceções específicas de xadrez
public class ChessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message); // Passa a mensagem ao construtor da superclasse
    }
}