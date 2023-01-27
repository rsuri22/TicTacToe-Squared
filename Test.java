public class Test {
    public static void main(String[] args) {
        Space basicSpace = new Space("?", 0);
        Player player1 = new Player("ABC", "x");
        Player player2 = new Player("DEF", "o");
        SmallBoard s = new SmallBoard(player1, player2);
        BigBoard b = new BigBoard(player1, player2);
        s.fillSpaces(basicSpace);
        b.fillBoard(s);
        b.printBoard();

        Move m = new Move(player1, 1, 2, 2, 1);
        b.takeTurn(m);
        b.printBoard();
        // System.out.println("_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_\n_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_ \n ? | ? | ?  █  ? | ? | ?  █  ? | ? | ? "); 
        // System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
        // System.out.println("_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_\n_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_ \n ? | ? | ?  █  ? | ? | ?  █  ? | ? | ? ");
        // System.out.println("▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
        // System.out.println("_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_\n_?_|_?_|_?_ █ _?_|_?_|_?_ █ _?_|_?_|_?_ \n ? | ? | ?  █  ? | ? | ?  █  ? | ? | ? "); 
    }
}