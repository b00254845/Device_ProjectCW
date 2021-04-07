/**
 *
 * @author PAUL PC
 */
public class Songs {
  /** Declaring the Attributes */
    private String title;
    private String artist;
    private String year;
    
  /**Invoke call Constructor / Methods on the object Songs */
    public Songs (String title, String artist, String year){
        this.title = title;
        this.artist = artist;
        this.year = year;
}
/** Method which returns the state of the songs */
    public String toString(){
        String display = new String();
        return "SONG TITLE: " + this.title + ", " + "ARTIST NAME: " + this.artist + ", " + "SONG RELEASE YEAR: " + this.year  + "\n";
    }
}


