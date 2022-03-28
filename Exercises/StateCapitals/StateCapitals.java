import java.util.*;

public class StateCapitals{

	public static HashMap map = new HashMap();

	public static void main(String[] args){
		map.put("Louisiana","Baton Rouge");
		map.put("California","Sacremento");
		map.put("New York","Albany");

		printStates();
		printCapitals();
		printPairs();

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
}