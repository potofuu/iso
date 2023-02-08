import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        System.out.println("Please indicate the board size");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        Board gameBoard = new Board(n);
        gameBoard.initializeBoard();
        gameBoard.viewBoard();
    }
}
