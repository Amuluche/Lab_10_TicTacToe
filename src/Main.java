import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

    static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
    static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] TicTacToeBoard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}}; // Creates an imitation of a tictactoe board using underscores, plus signs and vertical lines.

        Scanner Player1 = new Scanner(System.in);
        Scanner Player2 = new Scanner(System.in);

        System.out.println("Player1 enter board placement 1-9: ");
        int player1 = Player1.nextInt();

        System.out.println("Player2 enter board placement 1-9: ");
        int player2 = Player2.nextInt();
        System.out.println(player1);


        switch (player1) {
            case 1:
                TicTacToeBoard[0][0] = 'X';
                break;
            case 2:
                TicTacToeBoard[0][2] = 'X';
                break;
            case 3:
                TicTacToeBoard[0][4] = 'X';
                break;
            case 4:
                TicTacToeBoard[2][0] = 'X';
                break;
            case 5:
                TicTacToeBoard[2][2] = 'X';
                break;
            case 6:
                TicTacToeBoard[2][4] = 'X';
                break;
            case 7:
                TicTacToeBoard[4][0] = 'X';
                break;
            case 8:
                TicTacToeBoard[4][2] = 'X';
                break;
            case 9:
                TicTacToeBoard[4][4] = 'X';
                break;
        }// Sets X placement for player 1 on the board

        switch (player2) {
            case 1:
                TicTacToeBoard[0][0] = 'O';
                break;
            case 2:
                TicTacToeBoard[0][2] = 'O';
                break;
            case 3:
                TicTacToeBoard[0][4] = 'O';
                break;
            case 4:
                TicTacToeBoard[2][0] = 'O';
                break;
            case 5:
                TicTacToeBoard[2][2] = 'O';
                break;
            case 6:
                TicTacToeBoard[2][4] = 'O';
                break;
            case 7:
                TicTacToeBoard[4][0] = 'O';
                break;
            case 8:
                TicTacToeBoard[4][2] = 'O';
                break;
            case 9:
                TicTacToeBoard[4][4] = 'O';
                break;
        }// sets the O placements for player 2 on the board.


        if (player1 < 1 || player1 > 9) {
            System.out.println("Invalid placement");// prompts an invalid input when one is entered
        }

        if (player2 < 1 || player2 > 9) {
            System.out.println("Invalid placement");// prompts an invalid input when one is entered
        } else if (player1 == player2) {
            System.out.println("Invalid, there is already a placement in that position");// prompts that there is already a placement in place.

        }

        if (player1==1 || player1==2 ){
            System.out.println("Player X wins");
        }

        if (player2==5 || player2==4 ){
            System.out.println("Player O wins");
        }

        if (player2==6 || player2==6 ){
            System.out.println("No winner, it a tie");
        }

        while (true) {

            for (char[] row : TicTacToeBoard) {
                System.out.println(row);
            } // Prints out the created line from the code above

            Player1 = new Scanner(System.in);
            Player2 = new Scanner(System.in);

            System.out.println("Player1 enter board placement 1-9: ");
            player1 = Player1.nextInt();

            System.out.println("Player2 enter board placement 1-9: ");
            player2 = Player2.nextInt();
            System.out.println(player1);
        }


    }
    public static void checkWinner( ) {
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);

        List leftcol = Arrays.asList(1, 4, 7);
        List middlecol = Arrays.asList(2, 5, 8);
        List rightcol = Arrays.asList(3, 6, 9);

        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(7, 5, 3);


        return;}


}
