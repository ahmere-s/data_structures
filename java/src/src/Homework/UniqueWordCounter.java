package Homework;
import java.util.Set;
import java.util.HashSet;

public class UniqueWordCounter {
  
  HashSet<String> mySet = new HashSet<>();
  
  public void processText(String text){
	  if (text.equals(null) || text.isEmpty()){return;}
	  
	  String[] parts = text.toLowerCase().split("\\s+");
	  
	  for (String word : parts){mySet.add(word);}
  }
  
  public int getUniqueCount(){
	  return mySet.size();
  }
  
  public boolean contains(String word){
	  if (word == null){return false;}
	  return mySet.contains(word.toLowerCase());
  }
  
  public Set<String> getUniqueWords(){
	return new HashSet<>(mySet);  
  }
  
  //TEST CASE
  public static void main(String[] args){
	  
	  UniqueWordCounter myWC = new UniqueWordCounter();
	  
	  myWC.processText("The the THE cat sat on the mat");
	  
	  System.out.println(myWC.getUniqueCount() + " unique words.");
	  
  }
}
