import java.util.*;

public class App{
  public static Calculator myCalc = new Calculator();
  public static boolean proceed = false;
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);

    do{
      displayMenu();
      String choice = myScanner.nextLine();
      operation(choice);
      System.out.println("Would you like to perform another operation?");
      System.out.println("Enter 'y/n'");
      String choice2 = myScanner.nextLine();
      if(choice2 == "y"){
        proceed = true;
      }
    }
    while(proceed);

  }

  public static void displayMenu(){
    System.out.println("CALCULATOR APP");
    System.out.println("Please choose an option by typing the digit next to the menu option and pressing Enter.");
    System.out.println("After you choose an operation, enter the two numbers you would like to perform the operation on.");
    System.out.println("1.) Add");
    System.out.println("2.) Subtract");
    System.out.println("3.) Multiply");
    System.out.println("4.) Divide");
    System.out.println("5.) Exit Program");
  }

  public static void operation(String choice){
    Scanner numScanner = new Scanner(System.in);
    System.out.println("Input first number: ");
    int numOne = Integer.parseInt(numScanner.nextLine());
    System.out.println("Input second number: ");
    int numTwo = Integer.parseInt(numScanner.nextLine());

    switch (choice){
      case "1": System.out.println(myCalc.add(numOne,numTwo));
                break;
      case "2": System.out.println(myCalc.subtract(numOne,numTwo));
                break;
      case "3": System.out.println(myCalc.multiply(numOne,numTwo));
                break;
      case "4": System.out.println(myCalc.divide(numOne,numTwo));
                break;
      case "5": System.out.println("Exiting Program");
                proceed = false;
                break;
      default: System.out.println("Incorrect input");
                break;
    }
  }


}