import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args){
	  
	  ArrayList<String> students = new ArrayList<>();
	  
	  //Add students to container
	  students.add("Alice");
	  students.add("Bob");
	  students.add("Charlie");
	  
	  //Accessing elements inside
	  System.out.println("First student: " + students.get(0));
	  
	  //Iterating through list of students
	  for(String student : students){
		  System.out.println(student);
	  }
	  
	  //Checking size and removing a student
	  System.out.println("Total: " + students.size());
	  students.remove("Bob");
  }
}
