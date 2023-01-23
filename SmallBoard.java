public class SmallBoard {
    Space[][] values = new Space[3][3];
    Player player1;
    Player player2;
    public SmallBoard(Space[][] v, Player p1, Player p2){
        values = v;
        player1 = p1;
        player2 = p2;
    }


    public void addMove (Move move){
        Space newSpace = null;
        (move.getActivePlayer()).getType();

        values[move.getRow()][move.getColumn()] = newSpace;
    }

    public void printBoard(){
        System.out.println("");

    }
    








}
