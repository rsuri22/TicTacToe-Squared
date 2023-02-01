import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Player 1 Name: ");
    //Creates Players 
    String p1Name = sc.nextLine();
    System.out.println("Enter Player 2 Name: ");
    String p2Name = sc.nextLine();
    Player player1 = new Player(p1Name, "x");
    Player player2 = new Player(p2Name, "o");

    //Initializes board elements and creates board
    Space basicSpace = new Space(" ", 0);
    SmallBoard defaultBoard = new SmallBoard(player1, player2);
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

    //Stores completed game moves
    ArrayList<Move> gamePath = new ArrayList<Move>();


    //Sets active player then starts the game with the first move
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
    takeTurn(firstMove, bigBoard, activePlayer);

    //Gameloop
    int i = 0;
    int newSmallRow = 0;
    int newSmallColumn = 0;
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
        
        if (bigBoard[prevMove.getSmallRow() - 1][prevMove.getSmallColumn() - 1].getNumber() == 1) {
            System.out.println("The player playing O can now choose where their opponent's next move will be. Enter a big row: ");
            prevMove.setSmallRow(sc.nextInt());
            System.out.println("Enter a big column: ");
            prevMove.setSmallColumn(sc.nextInt());
        }

        if (bigBoard[prevMove.getSmallRow() - 1][prevMove.getSmallColumn() - 1].getNumber() == -1) {
            System.out.println("The player playing X can now choose where the next move will be. Enter a big row: ");
            prevMove.setSmallRow(sc.nextInt());
            System.out.println("Enter a big column: ");
            prevMove.setSmallColumn(sc.nextInt());
        }


        boolean legalMove = false;
        while (!legalMove){
            legalMove = true;
            System.out.println(activePlayer.getName() + " is are moving in row #" + prevMove.getSmallRow() + " and column #" + prevMove.getSmallColumn());
            System.out.println(activePlayer.getName() + " enter the new small row: ");
            newSmallRow = sc.nextInt();
            System.out.println(activePlayer.getName() + " enter the new small column: ");
            newSmallColumn = sc.nextInt();

            if (newSmallColumn > 3 || newSmallRow > 3) {
                System.out.println("Yeah thats an illegal move. Try again please! ");
                legalMove = false;
                continue;
            }
        }
        
        
        Move currentMove = new Move(activePlayer, prevMove.getSmallRow(), prevMove.getSmallColumn(), newSmallRow, newSmallColumn);

        gamePath.add(currentMove);

        takeTurn(currentMove, bigBoard, activePlayer);
        checkWin(bigBoard, currentMove);
        }
    }

    static void Goto(int y, int x) // top left corner is 1,1
	{
		System.out.print("\u001b["+x+";"+y+"H");
	}

    public static void takeTurn (Move move, SmallBoard[][] bigBoard, Player activePlayer){
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
    
    public static void checkWin(SmallBoard[][] bigBoard, Move move){
        int bigColumnTotal = 0;
        int smallRowTotal = 0;
        int smallDiag1Total = 0;
        int smallDiag2Total = 0;

        for (int i = 0; i < 3; i++)
            smallRowTotal += (bigBoard[move.getBigRow() - 1][i]).getNumber();

        //checks column
        for (int i = 0; i < 3; i++)
            bigColumnTotal += (bigBoard[i][move.getSmallColumn() - 1]).getNumber();
            
        //if conditions checks if it is possible a player completed a "\" diagonal on that turn
        if ((move.getSmallColumn() == 1 && move.getSmallRow() == 1) || (move.getSmallColumn() == 2 && move.getSmallRow() == 2) || (move.getSmallColumn() == 3 && move.getSmallRow() == 3)) {
            for (int i = 0; i < 3; i++)
            smallDiag1Total += (bigBoard[i][i]).getNumber();
        }

        //if conditions checks if it is possible a player completed a "/" diagonal on that turn
        if ((move.getSmallColumn() == 1 && move.getSmallRow() == 3) || (move.getSmallColumn() == 2 && move.getSmallRow() == 2) || (move.getSmallColumn() == 3 && move.getSmallRow() == 1)) {
            for (int i = 0; i < 3; i++)
            smallDiag2Total += (bigBoard[i][2-i]).getNumber();
        } 
        
        if (smallRowTotal == 3 || bigColumnTotal == 3 || smallDiag1Total == 3 || smallDiag2Total == 3) {
            printBoard(bigBoard);
            System.out.println(" ██████╗     ██╗    ██╗██╗███╗   ██╗███████╗    ████████╗██╗  ██╗███████╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗");
            System.out.println("██╔═══██╗    ██║    ██║██║████╗  ██║██╔════╝    ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║");
            System.out.println("██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║███████╗       ██║   ███████║█████╗      ██║  ███╗███████║██╔████╔██║█████╗  ██║");
            System.out.println("██║   ██║    ██║███╗██║██║██║╚██╗██║╚════██║       ██║   ██╔══██║██╔══╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝");
            System.out.println("╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║███████║       ██║   ██║  ██║███████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗");
            System.out.println(" ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚══════╝       ╚═╝   ╚═╝  ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝");
            System.exit(0);
        }

        if (smallRowTotal == -3 || bigColumnTotal == -3 || smallDiag1Total == -3 || smallDiag2Total == -3) {
            printBoard(bigBoard);
            System.out.println("██╗  ██╗    ██╗    ██╗██╗███╗   ██╗███████╗    ████████╗██╗  ██╗███████╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗");
            System.out.println("╚██╗██╔╝    ██║    ██║██║████╗  ██║██╔════╝    ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║");
            System.out.println(" ╚███╔╝     ██║ █╗ ██║██║██╔██╗ ██║███████╗       ██║   ███████║█████╗      ██║  ███╗███████║██╔████╔██║█████╗  ██║");
            System.out.println(" ██╔██╗     ██║███╗██║██║██║╚██╗██║╚════██║       ██║   ██╔══██║██╔══╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝");
            System.out.println("██╔╝ ██╗    ╚███╔███╔╝██║██║ ╚████║███████║       ██║   ██║  ██║███████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗");
            System.out.println("╚═╝  ╚═╝     ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚══════╝       ╚═╝   ╚═╝  ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝");
            System.exit(0);
        }
    }
}

