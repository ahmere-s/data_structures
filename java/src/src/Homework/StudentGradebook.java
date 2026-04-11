package Homework;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class StudentGradebook {
	
	private HashMap<String, Double> studentDict = new HashMap<>();
	
	public void addGrade(String student, double grade){
		studentDict.put(student, grade); //handles duplicates
	}
	
	public double getGrade(String student){
		return studentDict.get(student);
	}
	
	public double getClassAverage(){
		if(studentDict.isEmpty()){return 0;}
		
		double avg = 0;
		for (double d : studentDict.values()){
			avg += d;
		}
		return avg / studentDict.size();
	}
	
	public String getTopStudent(){
		
		if(studentDict.isEmpty()){return null;}
		double highestGrade = 0;
		String student = null;
		
		for (Map.Entry<String, Double> entry : studentDict.entrySet()){
			if (entry.getValue() > highestGrade){
				highestGrade = entry.getValue();
				student = entry.getKey();
			}
		}
		return student;
		
	}
	
	public List<String> getFailingStudents(){
		List<String> failingStudents = new ArrayList<>();
		
		for (Map.Entry<String, Double> entry : studentDict.entrySet()){
			if(entry.getValue() < 60){failingStudents.add(entry.getKey());}
		}
		return failingStudents;
	}
	
	//TEST CASE (Add grades for 5 students, verify average calculation and top student)
	public static void main(String[] args){   
	  StudentGradebook cosc241 = new StudentGradebook();
	  
	  cosc241.addGrade("TJ", 90);
	  cosc241.addGrade("Isiah", 50);
	  cosc241.addGrade("Malakhi", 85);
	  cosc241.addGrade("Jimmy", 59.9);
	  cosc241.addGrade("Perk", 88);
	  
	  System.out.println("The class grade average is " + cosc241.getClassAverage() + "/100");
	  System.out.println("The top student in the class is " + cosc241.getTopStudent() + ".");
	  System.out.println("Here's a list of failing students: " + cosc241.getFailingStudents());
	  
  }
}
