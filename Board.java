import java.util.Arrays;

public class Board {
    int size;
    String playerTurn = "A";
    String[][] board;


    public Board(int n) {
        this.size = n;
    }

    public String[][] initializeBoard() {
        String[][] temp = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = ".";
            }
        }
        board = temp;
        return board;
    }

    public void viewBoard() {
        for (String[] x : board) {   
            for (String y : x) {
                System.out.print(y + " ");
            }
        System.out.println();
        }
    }

    public void addPlayer(int x1, int y1) {
        board[x1][y1] = playerTurn;
        if (playerTurn == "A") {
            playerTurn = "B";
        } else {
            playerTurn = "A";
        }
    }

    public void movePlayer() {

    }

    public void clearBoard() {

    }
    
    public void showPlayerTurn() {
        
    }
}
