import java.util.Arrays;

public class BigBoard {
    SmallBoard[][] board = new SmallBoard[3][3];
    Player player1;
    Player player2;
    public BigBoard(Player p1, Player p2){ //constructor
        player1 = p1;
        player2 = p2;
    }
    static void Goto(int y, int x) // top left corner is 1,1
	{
		System.out.print("\u001b["+x+";"+y+"H");
	}


    public void takeTurn (Move move){
        SmallBoard activeBoard = new SmallBoard(player1, player2);
        board[move.getBigColumn() - 1][move.getBigRow() - 1] = activeBoard;
        activeBoard.addMove(move);
         
    }

    public void fillBoard(SmallBoard basicBoard){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j <  board[i].length; j++){
                board[i][j] = basicBoard;
            }
        }
    }



    public void printBoard(){
        System.out.print("\033[H\033[2J");
        System.out.print("\033[H");
        board[0][0].printBoard(1, 1);
        Goto(12, 1);
        System.out.print("█");
        Goto(12, 2);
        System.out.print("█");
        Goto(12, 3);
        System.out.print("█");

        board[0][1].printBoard(13, 1);
        Goto(24, 1);
        System.out.print("█");
        Goto(24, 2);
        System.out.print("█");
        Goto(24, 3);
        System.out.print("█");

        board[0][2].printBoard(25, 1);

        Goto(1, 4);
        System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

        board[1][0].printBoard(1, 5);
        Goto(12, 5);
        System.out.print("█");
        Goto(12, 6);
        System.out.print("█");
        Goto(12, 7);
        System.out.print("█");

        board[1][1].printBoard(13, 5);
        Goto(24, 5);
        System.out.print("█");
        Goto(24, 6);
        System.out.print("█");
        Goto(24, 7);
        System.out.print("█");

        board[1][2].printBoard(25, 5);

        Goto(1, 8);
        System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

        board[2][0].printBoard(1, 9);
        Goto(12, 9);
        System.out.print("█");
        Goto(12, 10);
        System.out.print("█");
        Goto(12, 11);
        System.out.print("█");

        board[2][1].printBoard(13, 9);
        Goto(24, 9);
        System.out.print("█");
        Goto(24, 10);
        System.out.print("█");
        Goto(24, 11);
        System.out.print("█");

        board[2][2].printBoard(25, 9);
        System.out.println("\n");

    }
    








}
