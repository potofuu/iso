import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        System.out.println("Please indicate the board size");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Board gameBoard = new Board(n);
        gameBoard.initializeBoard();
        gameBoard.viewBoard();

        //Initialize the game
        System.out.println("\nPlease select your starting row");
        int startRow = scan.nextInt();
        System.out.println("\nPlease select your starting column");
        int startCol = scan.nextInt();
        System.out.println("\nPlayer A makes first move, " + startRow + " " + startCol);
        gameBoard.addPlayer(startRow, startCol);
        gameBoard.viewBoard();
        System.out.println("\nPlease select computer starting row");
        startRow = scan.nextInt();
        System.out.println("\nPlease select computer starting column");
        startCol = scan.nextInt();
        
        System.out.println("\nPlayer B makes second move, " + startRow + " " + startCol);
        gameBoard.addPlayer(startRow, startCol);
        gameBoard.viewBoard();

        //Begin game loop
        boolean gameRunning = true;
        while (gameRunning) {
            //pseudocode

            /*
             * Check if moves are possible
             * Ask for player move
             * Check if move is valid
             * Move player
             * AI turn
             * Run AI function to determine best move
             * Move AI
             * Player Turn
             * Loop
             */
            if () {
                
            }
            gameRunning = false;
        }


        scan.close();
        // System.out.println("Thanks for playering!");
    }
}
