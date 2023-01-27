import java.util.Arrays;

public class SmallBoard {
    Space[][] values = new Space[3][3];
    Player player1;
    Player player2;

    public SmallBoard(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void addMove (Move move){
        Space oSpace = new Space("o", 1);
        Space xSpace = new Space("x", -1);
        if ((move.getActivePlayer()).getType().equals("x")){
            values[move.getSmallColumn() - 1][move.getSmallRow() - 1] = xSpace;
        }
        
        else {
            values[move.getSmallColumn() - 1][move.getSmallRow() - 1] = oSpace;
        }  
        
        //checks win
        // int smallColumnTotal = 0;
        // int smallRowTotal = 0;
        // int smallDiag1Total = 0;
        // int smallDiag2Total = 0;
        
        // //checks row
        // for (int i = 0; i < 3; i++)
        //     smallRowTotal += (values[move.getSmallColumn() - 1][i]).getNumber();
        // //checks column
        // for (int i = 0; i < 3; i++)
        //     smallColumnTotal += (values[i][move.getSmallRow() - 1]).getNumber();
        // //if conditions checks if it is possible a player completed a "\" diagonal on that turn
        // if ((move.getSmallColumn() == 1 && move.getSmallRow() == 1) || (move.getSmallColumn() == 2 && move.getSmallRow() == 2) || (move.getSmallColumn() == 3 && move.getSmallRow() == 3)) {
        //     for (int i = 0; i < 3; i++)
        //     smallDiag1Total += (values[i][i]).getNumber();
        // } 
        // //if conditions checks if it is possible a player completed a "/" diagonal on that turn
        // if ((move.getSmallColumn() == 1 && move.getSmallRow() == 3) || (move.getSmallColumn() == 2 && move.getSmallRow() == 2) || (move.getSmallColumn() == 3 && move.getSmallRow() == 1)) {
        //     for (int i = 0; i < 3; i++)
        //     smallDiag2Total += (values[i][2-i]).getNumber();
        // } 
        
        // if (smallRowTotal == 3 || smallColumnTotal == 3 || smallDiag1Total == 3 || smallDiag2Total == 3) {
        //     System.out.println("O wins");
        // }
        // if (smallRowTotal == -3 || smallColumnTotal == -3 || smallDiag1Total == -3 || smallDiag2Total == -3) {
        //     System.out.println("X wins");
        // }
    }

    public void fillSpaces(Space basicSpace) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = basicSpace;

            }
        }

    }
    static void Goto(int y, int x) // top left corner is 1,1
	{
		System.out.print("\u001b["+x+";"+y+"H");
	}

    public void printBoard(int y, int x) {
        // for (Space[] a : values) {
        //     Goto(y, x);
        //     for (Space s : a) {
        //         System.out.print("_" + s + "_|");
        //     }
        // }

        for (int i = 0; i < values.length; i++) {
            Goto(y , x + i);
            for (int j = 0; j < values[i].length; j++) {
                if (j == values.length-1) {
                    System.out.print("_" + values[i][j] + "_");
                }
                else {
                    System.out.print("_" + values[i][j] + "_|");
                }
                

            }
        }

        // System.out.println("_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_\n_?_|_?_|_?_ █
        // _?_|_?_|_?_ █ _?_|_?_|_?_ \n ? | ? | ? █ ? | ? | ? █ ? | ? | ? ");

    }

}
