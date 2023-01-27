public class Move { // 5 instance variables
    Player activePlayer;
    int smallRow;
    int smallColumn;
    int bigRow;
    int bigColumn;

    public Move(Player p, int sr, int sc, int br, int bc){ //constructor
        activePlayer = p;
        smallRow = sr;
        smallColumn = sc;
        bigRow = br;
        bigColumn = bc;
    }
    public int getBigRow() { //getters
        return bigRow;
    }
    public int getBigColumn() {
        return bigColumn;
    }
    public Player getActivePlayer() {
        return activePlayer;
    }
    public int getSmallRow() {
        return smallRow;
    }
    public int getSmallColumn() {
        return smallColumn;
    }
}
