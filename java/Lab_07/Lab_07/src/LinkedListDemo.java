import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args){
	  
	  LinkedList<Integer> numbers = new LinkedList<>();
	  
	  //Adding to both ends
	  numbers.addFirst(null);
	  numbers.addLast(null);
	  numbers.add(1, 2); //index, value
	  
	  //Queue ops
	  numbers.offer(4);
	  int first = numbers.poll(); //get num and remove from LL
	  System.out.println("Removing " + first + "...");
	  
	  //Stack ops
	  numbers.push(0);
	  int top = numbers.pop();
	  System.out.println("Removing " + top + "...");
	  
  }
}
