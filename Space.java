public class Space {
    String value = "?";
    int number = 0;
    public Space(String v, int n){
        value = v;
        number = n;
    }

    public void setAsO() {
        value = "o";
        number = 1;
    }
    public void setAsX() {
        value = "x";
        number = -1;
    }

    public String toString() {
        return value;
    }



}
