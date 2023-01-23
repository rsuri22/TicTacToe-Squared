public class Player {
    private String name;
    private double height;
    private int gpa;
    private int hoursOutside;
    private double rizzRating;
    private String type;
    public Player(String name, double height, int gpa, int hoursOutside, double rizzRating, String type) {
        this.name = name;
        this.height = height;
        this.gpa = gpa;
        this.hoursOutside = hoursOutside;
        this.rizzRating = rizzRating;
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getGpa() {
        return gpa;
    }
    public int getHoursOutside() {
        return hoursOutside;
    }
    public double getRizzRating() {
        return rizzRating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void setHoursOutside(int hoursOutside) {
        this.hoursOutside = hoursOutside;
    }
    public void setRizzRating(double rizzRating) {
        this.rizzRating = rizzRating;
    }
    @Override
    public String toString() {
        return "Player [name=" + name + ", height=" + height + ", gpa=" + gpa + ", hoursOutside=" + hoursOutside
                + ", rizzRating=" + rizzRating + "]";
    }
    public void makeMove(Move move){
        
    }


}
