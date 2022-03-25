import java.util.*;

public class ScannerExample{
  public static void main(String[] args){

    Scanner inputReader = new Scanner(System.in);
    String name;

    System.out.println("Enter your name:");
    name = inputReader.nextLine();

    System.out.println("The user's name is: " + name);

    Random randomizer = new Random();
    int randNum = randomizer.nextInt(100);

    System.out.println("Random number generated: " + randNum);

    
  }
}