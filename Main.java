import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Player 1 Name: ");
    String p1Name = sc.nextLine();
    System.out.println("Enter Player 2 Name: ");
    String p2Name = sc.nextLine();
    Player player1 = new Player(p1Name, "x");
    Player player2 = new Player(p2Name, "o");

    Space basicSpace = new Space(" ", 0);
    Space testSpace = new Space("x", 1);
    SmallBoard defaultBoard = new SmallBoard(player1, player2);
    SmallBoard otherBoard = new SmallBoard(player1, player2);
    otherBoard.fillSpaces(testSpace);
    defaultBoard.fillSpaces(basicSpace);
    SmallBoard board1 = new SmallBoard(player1, player2);
    SmallBoard board2 = new SmallBoard(player1, player2);
    SmallBoard board3 = new SmallBoard(player1, player2);
    SmallBoard board4 = new SmallBoard(player1, player2);
    SmallBoard board5 = new SmallBoard(player1, player2);
    SmallBoard board6 = new SmallBoard(player1, player2);
    SmallBoard board7 = new SmallBoard(player1, player2);
    SmallBoard board8 = new SmallBoard(player1, player2);
    SmallBoard board9 = new SmallBoard(player1, player2);
    board1.fillSpaces(basicSpace);
    board2.fillSpaces(basicSpace);
    board3.fillSpaces(basicSpace);
    board4.fillSpaces(basicSpace);
    board5.fillSpaces(basicSpace);
    board6.fillSpaces(basicSpace);
    board7.fillSpaces(basicSpace);
    board8.fillSpaces(basicSpace);
    board9.fillSpaces(basicSpace);
    SmallBoard[][] bigBoard = {
        {board1, board2, board3},
        {board4, board5, board6},
        {board7, board8, board9}
    };

    boolean checkIfWin = false;

    ArrayList<Move> gamePath = new ArrayList<Move>();

    Player activePlayer = player1;
    printBoard(bigBoard);
    System.out.println("\n" + activePlayer.getName() + " enter the big row: ");
    int firstBigRow = sc.nextInt();
    System.out.println(activePlayer.getName() + " enter the big column: ");
    int firstBigColumn = sc.nextInt();
    System.out.println(activePlayer.getName() + " enter the small row: ");
    int firstSmallRow = sc.nextInt();
    System.out.println(activePlayer.getName() + " enter the small column: ");
    int firstSmallColumn = sc.nextInt();
    Move firstMove = new Move(activePlayer, firstBigRow, firstBigColumn, firstSmallRow, firstSmallColumn);
    gamePath.add(firstMove);
    takeTurn(firstMove, bigBoard);

    int i = 0;
    while (!checkIfWin) {
        printBoard(bigBoard);
        if (activePlayer == player1) {
            activePlayer = player2;
        }
        else {
            activePlayer = player1;
        }
        i++;
        Move prevMove = gamePath.get(i - 1);
        System.out.println(activePlayer.getName() + " is are moving in row #" + prevMove.getSmallRow() + " and column #" + prevMove.getSmallColumn());
        System.out.println(activePlayer.getName() + " enter the new small row: ");
        int newSmallRow = sc.nextInt();
        System.out.println(activePlayer.getName() + " enter the new small column: ");
        int newSmallColumn = sc.nextInt();
        
        
        Move currentMove = new Move(activePlayer, prevMove.getSmallRow(), prevMove.getSmallColumn(), newSmallRow, newSmallColumn);
        gamePath.add(currentMove);

        takeTurn(currentMove, bigBoard);
        }
    }

    static void Goto(int y, int x) // top left corner is 1,1
	{
		System.out.print("\u001b["+x+";"+y+"H");
	}


    public static void takeTurn (Move move, SmallBoard[][] bigBoard){
        bigBoard[move.getBigRow() - 1][move.getBigColumn() - 1].addMove(move);
    }

    public static void printBoard(SmallBoard[][] bigBoard){
        System.out.print("\033[H\033[2J");
        System.out.print("\033[H");
        bigBoard[0][0].printBoard(1, 1);
        Goto(12, 1);
        System.out.print("█");
        Goto(12, 2);
        System.out.print("█");
        Goto(12, 3);
        System.out.print("█");

        bigBoard[0][1].printBoard(13, 1);
        Goto(24, 1);
        System.out.print("█");
        Goto(24, 2);
        System.out.print("█");
        Goto(24, 3);
        System.out.print("█");

        bigBoard[0][2].printBoard(25, 1);

        Goto(1, 4);
        System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

        bigBoard[1][0].printBoard(1, 5);
        Goto(12, 5);
        System.out.print("█");
        Goto(12, 6);
        System.out.print("█");
        Goto(12, 7);
        System.out.print("█");

        bigBoard[1][1].printBoard(13, 5);
        Goto(24, 5);
        System.out.print("█");
        Goto(24, 6);
        System.out.print("█");
        Goto(24, 7);
        System.out.print("█");

        bigBoard[1][2].printBoard(25, 5);

        Goto(1, 8);
        System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

        bigBoard[2][0].printBoard(1, 9);
        Goto(12, 9);
        System.out.print("█");
        Goto(12, 10);
        System.out.print("█");
        Goto(12, 11);
        System.out.print("█");

        bigBoard[2][1].printBoard(13, 9);
        Goto(24, 9);
        System.out.print("█");
        Goto(24, 10);
        System.out.print("█");
        Goto(24, 11);
        System.out.print("█");

        bigBoard[2][2].printBoard(25, 9);
        System.out.println("\n");

    }
    















        // Scanner sc = new Scanner(System.in);
        // System.out.println("What is the first player's name?");
        // String p1Name = sc.nextLine();
        // Player player1 = new Player(p1Name, "x"); //setup first player
        // System.out.println("What is the second player's name?");
        // String p2Name = sc.nextLine();
        // Player player2 = new Player(p2Name, "o"); //setup second player
        // System.out.println(p1Name + ", you will be x's. " + p2Name + ", you will be o's.");

        // sc.close();
        
        // System.out.println("What is player 1's name?");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + ". How tall are you (cm)?");
        // double height = sc.nextDouble();
        // System.out.println("What is your gpa?");
        // int gpa = sc.nextInt();
        // System.out.println("How many hours have you spent outside in the past month?");
        // int hoursOutside = sc.nextInt();
        // System.out.println("Rate your rizz from 1-10");
        // double rizzRating = sc.nextDouble();
        // Player p1 = new Player(name, height, gpa, hoursOutside, rizzRating );

        // System.out.println("What is player 2's name?");
        // String name2 = sc.nextLine();
        // System.out.println("Hello, " + name2 + ". How tall are you (cm)?");
        // double height2 = sc.nextDouble();
        // System.out.println("What is your gpa?");
        // int gpa2 = sc.nextInt();
        // System.out.println("How many hours have you spent outside in the past month?");
        // int hoursOutside2 = sc.nextInt();
        // System.out.println("Rate your rizz from 1-10");
        // double rizzRating2 = sc.nextDouble();
        // Player p2 = new Player(name2, height2, gpa2, hoursOutside2, rizzRating2 );
}
