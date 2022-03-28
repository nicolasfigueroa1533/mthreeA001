import java.util.*;
import java.io.*;

public class StateCapitals2{

	public static HashMap map = new HashMap();

	public static void main(String[] args){

		boolean proceed = true;
		Scanner myScanner = new Scanner(System.in);

		try(Scanner sc = new Scanner(new BufferedReader(new FileReader("List.txt")))){
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String[] tokens = str.split(",");
				map.put(tokens[0],tokens[1]);
			}
		}
		catch (IOException e){
			System.out.println("File Read Error");
		}
		while(proceed){
			quiz();
			System.out.println("Would you like to play again? Enter 'y/n'");
			char choice = myScanner.next().charAt(0);
			if(choice == 'n'){
				System.out.println("Exiting Program");
				proceed = false;
			}
		}

	}

	public static void printStates(){
	System.out.println("\n");
	System.out.println("STATES");
	Iterator<String> itr = map.keySet().iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void printCapitals(){
		System.out.println("\n");
		System.out.println("STATE CAPITALS");
		Iterator<String> itr = map.values().iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void printPairs(){
		System.out.println("\n");
		System.out.println("STATES & STATE CAPITALS");
		Iterator<String> itr1 = map.keySet().iterator();
		Iterator<String> itr2 = map.values().iterator();

		while(itr1.hasNext()){
			System.out.println(itr1.next() + " - " + itr2.next());
		}
	}

	public static void quiz(){
		Random randomizer = new Random();
   		int randNum = randomizer.nextInt(49);

   		Set<String> keySet = map.keySet();
   		ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

   		//System.out.println(listOfKeys);
   		String state = listOfKeys.get(randNum);
		System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + state);

		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		if(answer == map.get(state)){
			System.out.println("Correct!");
		}
		else{
			System.out.println("Incorrect! The correct answer is " + map.get(state));
		}
	}
}