public class Move {
    Player activePlayer;
    int row;
    int column;
    public Move(Player p, int r, int c){
        activePlayer = p;
        row = r;
        column = c;
    }
    public Player getActivePlayer() {
        return activePlayer;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
}
