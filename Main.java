import java.util.Scanner;
public class Main{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first player's name?");
        String p1Name = sc.nextLine();
        Player player1 = new Player(p1Name, "x"); //setup first player
        System.out.println("What is the second player's name?");
        String p2Name = sc.nextLine();
        Player player2 = new Player(p2Name, "o"); //setup second player
        System.out.println(p1Name + ", you will be x's. " + p2Name + ", you will be o's.");

        sc.close();
        
        // System.out.println("What is player 1's name?");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + ". How tall are you (cm)?");
        // double height = sc.nextDouble();
        // System.out.println("What is your gpa?");
        // int gpa = sc.nextInt();
        // System.out.println("How many hours have you spent outside in the past month?");
        // int hoursOutside = sc.nextInt();
        // System.out.println("Rate your rizz from 1-10");
        // double rizzRating = sc.nextDouble();
        // Player p1 = new Player(name, height, gpa, hoursOutside, rizzRating );

        // System.out.println("What is player 2's name?");
        // String name2 = sc.nextLine();
        // System.out.println("Hello, " + name2 + ". How tall are you (cm)?");
        // double height2 = sc.nextDouble();
        // System.out.println("What is your gpa?");
        // int gpa2 = sc.nextInt();
        // System.out.println("How many hours have you spent outside in the past month?");
        // int hoursOutside2 = sc.nextInt();
        // System.out.println("Rate your rizz from 1-10");
        // double rizzRating2 = sc.nextDouble();
        // Player p2 = new Player(name2, height2, gpa2, hoursOutside2, rizzRating2 );
    }
}