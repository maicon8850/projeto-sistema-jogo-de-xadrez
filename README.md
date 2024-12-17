Sistema de Jogo de Xadrez em Java
Descrição do Projeto
Este projeto é um jogo de xadrez desenvolvido em Java como aplicação de conceitos de Programação Orientada a Objetos (POO). O objetivo é consolidar o aprendizado de POO, tratamento de exceções e estrutura de dados, fornecendo um sistema funcional de xadrez com jogabilidade no terminal.

Funcionalidades
Tabuleiro de xadrez 8x8 com representação visual no terminal.
Diferenciação de cores das peças:
Peças Brancas: Impressas em branco.
Peças Pretas: Impressas em amarelo.
Implementação dos movimentos básicos de peças (Rei, Torre, etc.).
Validação de regras, como:
Movimentos válidos.
Tratamento de peças capturadas.
Verificação de check e checkmate.
Tratamento de exceções robusto para evitar movimentos inválidos.
Tecnologias Utilizadas
Linguagem: Java 8+
Ferramentas:
IntelliJ IDEA / Eclipse
Terminal (Git Bash para Windows, bash/zsh no Mac/Linux)
Estrutura do Projeto

projeto-sistema-jogo-de-xadrez/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Aplicacao/
│   │   │   │   ├── Interface.java
│   │   │   │   └── Programa.java
│   │   │   │
│   │   │   ├── Chess/
│   │   │   │   ├── ChessMatch.java
│   │   │   │   ├── ChessPiece.java
│   │   │   │   ├── ChessPosition.java
│   │   │   │   ├── Color.java
│   │   │   │   └── Pecas/
│   │   │   │       ├── King.java
│   │   │   │       └── Rook.java
│   │   │   │
│   │   │   ├── JogoDeTabuleiro/
│   │   │       ├── Board.java
│   │   │       ├── BoardException.java
│   │   │       ├── Piece.java
│   │   │       └── Posicao.java
│
├── target/
│   └── classes/    # Arquivos compilados
│
└── README.md
Requisitos
Java 8 ou superior instalado.
Terminal com suporte a cores ANSI:
Windows: Git Bash.
Mac/Linux: Terminal padrão.
Como Executar
Clone o repositório:

git clone [https://github.com/maicon8850/projeto-sistema-jogo-de-xadrez.git]
cd sistema-jogo-xadrez
Compile o projeto:

javac -d target/classes src/main/java/Aplicacao/Programa.java
Execute o jogo:

java -cp target/classes Aplicacao.Programa
Exemplo de Saída no Terminal

8 R R R K R R R R
7 - - - - - - - -
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 - - - - - - - -
1 R R R K R R R R
  a b c d e f g h
Peças Brancas: Impressas em branco.
Peças Pretas: Impressas em amarelo.
Próximos Passos
Implementar movimentos avançados: En Passant, Roque e Promoção.
Melhorar interface gráfica usando JavaFX ou bibliotecas GUI.
Adicionar suporte a jogadas contra Inteligência Artificial.
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

Licença
Este projeto está licenciado sob a MIT License. Consulte o arquivo LICENSE para mais detalhes.

Se precisar de mais alguma modificação ou ajuste, me avise! 🚀
