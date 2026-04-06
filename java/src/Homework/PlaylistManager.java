package Homework;
import java.util.ArrayList;
import java.util.Collections;

public class PlaylistManager {
  ArrayList<String> playlist = new ArrayList<>();
	
  public void addSong(String title){
    playlist.add(title);		  
  }
	  
  public void removeSong(String title){
    playlist.remove(title);
  }
	  
  public void shufflePlaylist(){
    Collections.shuffle(playlist);
  }
	  
  public String getSong(int index){
    if (index < 0 || index >= playlist.size()){return "Your number should be between 0 and one less than the total number of songs in the playlist.";}
	
    else {return playlist.get(index);}
  }
	  
  //Test Case	
  public static void main(String[] args){
	 
    PlaylistManager myPM = new PlaylistManager();
    myPM.addSong("songOne");
    myPM.addSong("songTwo");
    myPM.addSong("songThreee");
    myPM.addSong("songFour");
    myPM.addSong("songFive");
    
    
    myPM.shufflePlaylist();
    
    for (int i = 0; i < 5; i++){
      System.out.println(myPM.getSong(i));
    }
    
    
    
  }
}
