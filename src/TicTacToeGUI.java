import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeGUI extends Application {
    private GameBoard gameBoard;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        gameBoard = new GameBoard();

        GridPane grid = new GridPane();
        Button[][] buttons = new Button[3][3];

        // Crée des boutons pour chaque case du tableau
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                buttons[i][j] = new Button(" ");
                buttons[i][j].setMinSize(100, 100);
                buttons[i][j].setOnAction(e -> handleButtonClick(row, col, buttons));
                grid.add(buttons[i][j], j, i);
            }
        }

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(int row, int col, Button[][] buttons) {
        if (gameBoard.getCell(row, col) == ' ') {
            gameBoard.setCell(row, col, 'X');
            buttons[row][col].setText("X");

            // Vérifie si le joueur gagne
            if (gameBoard.checkWin('X')) {
                showWinnerMessage("Félicitations ! Vous avez gagné !");
                return;
            }

            // Coup de l'IA
            AI ai = new AI();
            int[] aiMove = ai.findBestMove(gameBoard);
            gameBoard.setCell(aiMove[0], aiMove[1], 'O');
            buttons[aiMove[0]][aiMove[1]].setText("O");

            // Vérifie si l'IA gagne
            if (gameBoard.checkWin('O')) {
                showWinnerMessage("L'IA a gagné !");
            }
        }
    }

    private void showWinnerMessage(String message) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Partie Terminée !");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
