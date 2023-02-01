public class Move { // 5 instance variables
    Player activePlayer;
    int smallRow;
    int smallColumn;
    int bigRow;
    int bigColumn;

    public Move(Player p, int br, int bc, int sr, int sc){ //constructor
        activePlayer = p;
        bigRow = br;
        bigColumn = bc;
        smallRow = sr;
        smallColumn = sc;
    }
    public void setSmallRow(int smallRow) {
        this.smallRow = smallRow;
    }
    public void setSmallColumn(int smallColumn) {
        this.smallColumn = smallColumn;
    }
    public void setBigRow(int bigRow) {
        this.bigRow = bigRow;
    }
    public void setBigColumn(int bigColumn) {
        this.bigColumn = bigColumn;
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
