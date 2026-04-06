import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args){
	  
	  HashMap<String, Integer> grades = new HashMap<>();
	  
	  //Submit entries
	  grades.put("Alice", 95);
	  grades.put("Bob", 87);
	  grades.put("Charlie", 92);
	  
	  //Access values
	  int gradeAlice = grades.get("Alice");
	  System.out.println("Alice has a: " + gradeAlice);
	  
	  int gradeDefault = grades.getOrDefault("unknown", 0);
	  System.out.println("Default Grade: " + gradeDefault);
	  
	  //Iterate through entries
	  for (Map.Entry<String, Integer> entry : grades.entrySet()){
		  System.out.println(entry.getKey() + ": " + entry.getValue());
	  }
	  
	  //Check and remove
	  if (grades.containsKey("Bob")){
		  grades.remove("Bob");
	  }
	  
  }
}
