public class Test {
    public static void main(String[] args) {
        Space basicSpace = new Space("?", 0);
        Player player1 = new Player("ABC", "x");
        Player player2 = new Player("DEF", "o");
        SmallBoard defaultBoard = new SmallBoard(player1, player2);
        defaultBoard.fillSpaces(basicSpace);
        // BigBoard b = new BigBoard(player1, player2, defaultBoard);

        // b.fillBoard(defaultBoard);
        // b.printBoard();
        // Move m = new Move(player1, 1, 1, 1, 1);
        // b.takeTurn(m);
        // b.printBoard();
      
    }
}