/**
 *
 * @author PAUL PC
 */

public class PlayList {
    private Songs[] songs;
    private int listofSongs;

    //invoke call methods prompts how mang songs to be added to the playlist array
    public PlayList(Integer SizeofList) {
        this.songs = new Songs[SizeofList];
        this.listofSongs = 0;
    } 
   //invoke call methods on the add songs to the list    
    public void addSongs(String title, String artist, String year){            
           this.songs[listofSongs] = new Songs(title, artist, year);
           this.listofSongs++;       
        }
   
    public String toString(){
        String display = new String();
        
        if(this.listofSongs == 0){
            display += ("You currently have an empty playlist, Goodnews - you can add some. Choose option 1 to add a song!! ") + "\n";
        }else{
            for(int i = 0; i < this.listofSongs; i++){
                display += this.songs[i];
            
            }
        }
         return display; //Displays the result / details of the songs added
        }
    }
