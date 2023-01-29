// import java.util.Arrays;

// public class BigBoard {
//     SmallBoard board1;
//     SmallBoard board2;
//     SmallBoard board3;
//     SmallBoard board4;
//     SmallBoard board5;
//     SmallBoard board6;
//     SmallBoard board7;
//     SmallBoard board8;
//     SmallBoard board9;
//     // SmallBoard[][] bigBoard = {
//     //     {board1, board2, board3},
//     //     {board4, board5, board6},
//     //     {board7, board8, board9}
//     // };
//     int[][] bigBoard = {
//         {1, 2, 3},
//         {4, 5, 6},
//         {7, 8, 9}
//     };
//     Player player1;
//     Player player2;
//     public BigBoard(Player p1, Player p2, SmallBoard basicBoard){ //constructor
//         player1 = p1;
//         player2 = p2;
//         board1 = basicBoard;
//         board2 = basicBoard;
//         board3 = basicBoard;
//         board4 = basicBoard;
//         board5 = basicBoard;
//         board6 = basicBoard;
//         board7 = basicBoard;
//         board8 = basicBoard;
//         board9 = basicBoard;
        

//     }
//     static void Goto(int y, int x) // top left corner is 1,1
// 	{
// 		System.out.print("\u001b["+x+";"+y+"H");
// 	}


//     public void takeTurn (Move move){
//         //bigBoard[move.getBigColumn()][move.getBigRow()].addMove(move);
//     }

//     public void fillBoard(SmallBoard basicBoard){
//         board1 = basicBoard;
//         board2 = basicBoard;
//         board3 = basicBoard;
//         board4 = basicBoard;
//         board5 = basicBoard;
//         board6 = basicBoard;
//         board7 = basicBoard;
//         board8 = basicBoard;
//         board9 = basicBoard;


//     // //     for (int i = 0; i < board.length; i++){
//     // //         for (int j = 0; j <  board[i].length; j++){
//     // //             board[i][j] = basicBoard;
//     // //         }
//     // //     }
//       }




//     public void printBoard(){
//         System.out.print("\033[H\033[2J");
//         System.out.print("\033[H");
//         System.out.println(bigBoard[1][2]);
//         //bigBoard[1][2].printBoard(1, 1);
//         Goto(12, 1);
//         System.out.print("█");
//         Goto(12, 2);
//         System.out.print("█");
//         Goto(12, 3);
//         System.out.print("█");

//         board2.printBoard(13, 1);
//         Goto(24, 1);
//         System.out.print("█");
//         Goto(24, 2);
//         System.out.print("█");
//         Goto(24, 3);
//         System.out.print("█");

//         board3.printBoard(25, 1);

//         Goto(1, 4);
//         System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

//         board4.printBoard(1, 5);
//         Goto(12, 5);
//         System.out.print("█");
//         Goto(12, 6);
//         System.out.print("█");
//         Goto(12, 7);
//         System.out.print("█");

//         board5.printBoard(13, 5);
//         Goto(24, 5);
//         System.out.print("█");
//         Goto(24, 6);
//         System.out.print("█");
//         Goto(24, 7);
//         System.out.print("█");

//         board6.printBoard(25, 5);

//         Goto(1, 8);
//         System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");

//         board7.printBoard(1, 9);
//         Goto(12, 9);
//         System.out.print("█");
//         Goto(12, 10);
//         System.out.print("█");
//         Goto(12, 11);
//         System.out.print("█");

//         board8.printBoard(13, 9);
//         Goto(24, 9);
//         System.out.print("█");
//         Goto(24, 10);
//         System.out.print("█");
//         Goto(24, 11);
//         System.out.print("█");

//         board9.printBoard(25, 9);
//         System.out.println("\n");

//     }
    








// }
