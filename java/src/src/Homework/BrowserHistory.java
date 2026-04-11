package Homework;
import java.util.LinkedList;


public class BrowserHistory {
	
  LinkedList<String> backStack = new LinkedList<>();
  String currentPage = null;
  LinkedList<String> forwardStack = new LinkedList<>();
	
  public void visit(String url){
    if (currentPage != null){backStack.push(currentPage);}
    currentPage = url;
    forwardStack.clear();
  }
  
  public String back(){
	if (backStack.isEmpty()){return currentPage;}
	forwardStack.push(currentPage);
	currentPage = backStack.pop();
	return currentPage;
  }
  
  public String forward(){
	if (forwardStack.isEmpty()){return currentPage;}
	backStack.push(currentPage);
	currentPage = forwardStack.pop();
	return currentPage;
  }
  
  public String getCurrentPage(){
	  return currentPage;
  }
  
	
  //Test Case
  public static void main(String[] args){
    BrowserHistory myBH = new BrowserHistory();
    
    //Visit A, B and C
    myBH.visit("SiteA");
    myBH.visit("SiteB");
    myBH.visit("SiteC");
    
    System.out.println("Current Site: " + myBH.getCurrentPage());
    
    //Going back twice
    myBH.back();
    myBH.back();
    System.out.println("After going back twice: " + myBH.getCurrentPage());
    
    myBH.visit("SiteD");
    
    System.out.println("Trying to visit site D...");
    System.out.println("Current site: " + myBH.getCurrentPage());
    
    if (myBH.forwardStack.isEmpty()){System.out.println("Forward Stack is clear.");}
    else {System.out.println("Your forward stack includes: " + myBH.forwardStack);}
    
    
    
    
  }
}
