public class Player {
    private String name; //name and type are instance variables for player

    private String type;
    public Player(String name, String type) { //constructor
        this.name = name;
 
        this.type = type;
    }
    public String getType() { //getter
        return type;
    }
    public String getName() { 
        return name;
    }
    public void setType(String type) { //setter
        this.type = type;
    }
    

}
