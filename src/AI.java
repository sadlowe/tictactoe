public class AI {

    public int[] findBestMove(GameBoard board) {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Use the getter method instead of directly accessing the board
                if (board.getCell(i, j) == ' ') {
                    board.setCell(i, j, 'O'); // Tentative move for AI
                    int score = minimax(board, 0, false); // Evaluate the move
                    board.setCell(i, j, ' '); // Undo the move
                    if (score > bestScore) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        return bestMove;
    }

    private int minimax(GameBoard board, int depth, boolean isMaximizing) {
        // Dummy implementation, replace with actual Minimax logic
        return 0;
    }
}
