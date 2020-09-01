package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        
           String nextLn;
           if (isXTurn){
               nextLn = "Player 1 (X) Move:\nEnter the row and column numbers, separated by a space: ";
           }
           else{
            nextLn = "Player 2 (O) Move:\nEnter the row and column numbers, separated by a space: ";
           }
           System.out.print(nextLn);
           String input = keyboard.nextLine();
           String[] parts = input.split(" ");
           int[] intParts = {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};

        return new TicTacToeMove(intParts[0], intParts[1]);

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
