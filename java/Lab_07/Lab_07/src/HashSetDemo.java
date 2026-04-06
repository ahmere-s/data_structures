import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
  public static void main(String[] args){
	  
	  HashSet<String> uniqueNames = new HashSet<>();
	  uniqueNames.add(null);
	  uniqueNames.add(null);
	  uniqueNames.add(null);
	  
	  System.out.println();
	  System.out.println();
	  
	  //use iterator
	  Iterator<String> i = uniqueNames.iterator();
	  
	  while(i.hasNext()){
		  System.out.println(i.next());
	  }
	  
	  
  }
}
