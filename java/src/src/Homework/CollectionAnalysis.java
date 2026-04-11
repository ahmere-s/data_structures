package Homework;
import java.util.*;

public class CollectionAnalysis {
	
  public void runAnalysis(){
	/*
	 *Time 10,000 insertions at the beginning for ArrayList vs LinkedList
	 */
	  
	System.out.println("Starting analysis for ArrayList vs LinkedList insertions...");
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    
    long start = System.nanoTime();
    for (int i = 0; i < 10000; i++){arrayList.add(0, i);}
    long end = System.nanoTime();
    long arrayListTime = end - start;
    
    long start2 = System.nanoTime();
    for (int i = 0; i < 10000; i++){linkedList.addFirst(i);}
    long end2 = System.nanoTime();
    long linkedListTime = end2 - start2;
    
    System.out.println("ArrayList insertion time: " + arrayListTime + " ns");
    System.out.println("LinkedList insertion time: " + linkedListTime + " ns");
    
    System.out.println("============================================================");
    System.out.println("Starting analysis for ArrayList vs HashSet lookups...");
    
    ArrayList<Integer> lookupList = new ArrayList<>();
    HashSet<Integer> lookupSet = new HashSet<>();
    
    //Adding the items before I can look them up
    for (int i = 0; i < 10000; i++){lookupList.add(i); lookupSet.add(i);}
    
    long start3 = System.nanoTime();
    for (int i = 0; i < 10000; i++){lookupList.contains(i);}
    long end3 = System.nanoTime();
    long ListTime = end3 - start3;
    
    long start4 = System.nanoTime();
    for (int i = 0; i < 10000; i++){lookupSet.contains(i);}
    long end4 = System.nanoTime();
    long SetTime = end4 - start4;
    
    System.out.println("ArrayList lookup time: " + ListTime + " ns");
    System.out.println("HashSet lookup time: " + SetTime + " ns");
  }
  
  
  public static void main(String[] args){
	  CollectionAnalysis ca = new CollectionAnalysis();
	  
	  ca.runAnalysis();
  }
}
