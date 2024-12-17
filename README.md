# Sistema de Jogo de Xadrez

## 📌 **Objetivo Geral**
Aplicar os conceitos de Programação Orientada a Objetos (POO) e boas práticas de desenvolvimento na construção de um sistema de jogo de xadrez, utilizando **Java**.

## 🚀 **Tecnologias Utilizadas**
- **Java**
- **Git e GitHub**
- **IDE**: IntelliJ IDEA

## 📝 **Estrutura do Projeto**
O projeto está organizado em camadas conforme o padrão de design **Layers Pattern**.

- **Entities**: Representação de classes como `Piece`, `Board`, `Position`, etc.
- **Chess Layer**: Classes específicas do jogo de xadrez, como `ChessMatch`, `ChessPiece`, `Rook`, `King`, etc.
- **UI**: Console responsável pela interação com o usuário.
- **Exceptions**: Tratamento de erros com classes personalizadas, como `BoardException` e `ChessException`.

---

## 🎯 **Funcionalidades Implementadas**

### 1. **Classes Iniciais**
- **Position**: Representa as posições do tabuleiro.
- Encapsulamento, Construtores e Sobrescrita do `toString`.

### 2. **Camada do Tabuleiro**
- **Classes**:
  - `Board`: Representa o tabuleiro de xadrez.
  - `Piece`: Representa uma peça genérica.
- Estrutura de dados: **Matriz**.
- **Associações** entre `Board` e `Piece`.

### 3. **Camada de Xadrez**
- **Classes**:
  - `ChessPiece`, `ChessMatch`, `Color` (enum).
- Peças específicas: **Rook**, **King**.
- Métodos de impressão do tabuleiro no console.

### 4. **Tratamento de Exceções e Programação Defensiva**
- Classes **BoardException** e **ChessException**.
- Validações de posições e regras básicas.

### 5. **Movimentação de Peças**
- Implementação de métodos:
  - `RemovePiece` (remover peças do tabuleiro).
  - `PerformChessMove` e `MakeMove` (lógica de movimentos).
- Exceções e interação com o usuário via console.

### 6. **Movimentos Possíveis e Polimorfismo**
- Classes com métodos abstratos:
  - `PossibleMoves`, `PossibleMove`, `IsThereAnyPossibleMove`.
- Peças implementadas:
  - **Rook** e **King** com lógica de movimentos possíveis.

### 7. **Lógica de Turnos**
- Alternância de jogadores a cada turno.
- Indicação do jogador atual e quantidade de turnos.

### 8. **Captura de Peças**
- Controle de peças capturadas.
- Exibição das peças capturadas no console.

### 9. **Regras de Xeque e Xeque-Mate**
- Identificação de xeque.
- Teste de xeque-mate.

### 10. **Movimentos Especiais**
- **Roque (Castling)**
- **En Passant**
- **Promoção de Peão**

---

## 📂 **Organização do Código**
```
projeto-sistema-jogo-de-xadrez/
├── src/
│   ├── boardgame/
│   │   ├── Board.java
│   │   ├── Piece.java
│   │   └── Position.java
│   ├── chess/
│   │   ├── ChessMatch.java
│   │   ├── ChessPiece.java
│   │   ├── Color.java
│   │   ├── Rook.java
│   │   ├── King.java
│   │   └── ...
│   ├── exceptions/
│   │   ├── BoardException.java
│   │   └── ChessException.java
│   ├── ui/
│   │   ├── UI.java
│   └── application/
│       └── Program.java
└── README.md
```

---

## 🛠️ **Passos para Configurar o Projeto**

### 1. **Clonar o Repositório**
```bash
git clone https://github.com/maicon8850/projeto-sistema-jogo-de-xadrez.git
cd projeto-sistema-jogo-de-xadrez
```

### 2. **Configurar o Git (Opcional)**
```bash
git init
git remote add origin https://github.com/maicon8850/projeto-sistema-jogo-de-xadrez.git
```

### 3. **Compilar e Executar o Projeto**
Utilize sua **IDE** favorita (IntelliJ, Eclipse, etc.) ou execute via terminal:
```bash
javac application/Program.java
java application.Program
```

---

## 🎓 **Conceitos de POO Aplicados**
- Encapsulamento
- Construtores
- Sobrescrita de Métodos (ToString)
- Polimorfismo
- Herança
- Abstração
- Modificadores de Acesso
- Classes e Métodos Abstratos

## 📚 **Estruturas de Dados Utilizadas**
- Matriz
- Listas (`ArrayList`)

## ⚠️ **Tratamento de Exceções**
- `BoardException`
- `ChessException`
- Validação de movimentos e posições.

---

## 💡 **Melhorias Futuras**
- Implementar uma interface gráfica.
- Salvar o estado do jogo em um arquivo.
- Implementar modo **multiplayer online**.

---

## 🧑‍💻 **Autor**
**Maicon Douglas**
- GitHub: [maicon8850](https://github.com/maicon8850)

---

**"Aprender é como jogar xadrez: cada movimento importa!"**
