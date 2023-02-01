import javax.xml.transform.Source;

public class Space {
    String value;
    int number;

    public Space(String v, int n) { // constructor for space
        value = v;
        number = n;
    }

    public String toString() { // toString method
        return value;
    }

    public String getValue() { // getters
        return value;
    }

    public int getNumber() {
        return number;
    }

    public void setValue(String value) { // setters
        this.value = value;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
