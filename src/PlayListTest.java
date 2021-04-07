/**
 *
 * @author PAUL PC
 */
public class PlayListTest { 
    public static void main(String args[]){
        /** Displays welcome message to the user */
        System.out.println("            *** WELCOME TO UWS MUSIC ARCHIVES *** " + "\n" 
                + "--- You Can Create Your Own Personalised Songs Play Lists Here - ENJOY!! --- " +"\n");
                
        /** Prompts the user to enter the number of songs to be added to the play list Array */
            Integer SizeofList = Input.getInteger("Enter Number of Song(s) to be Added Playlist: ");
            PlayList playlist = new PlayList(SizeofList);
            
        String title, artist, year;
        Integer option;
        do{
            /** This displays the menu option */
            System.out.println("Input Option 1: Add New Song");
            System.out.println("Input Option 2: Display Details of the Song ");
            System.out.println("Input Option 0: Quit"+"\n");
            option = Input.getInteger("Choose an option: ");  /** Prompts the user select an option from the menu */
            
            switch(option){
                case 1: /** Prompts the user to enter the song details */
                    title = Input.getString("Enter Title: ");
                    artist = Input.getString("Enter Artist : ");
                    year = Input.getString("Enter Year: ");
                    playlist.addSongs(title,  artist,  year);
                    System.out.println(">> Great, new song have now been added to your Play List" + "\n") ;
                    
                    System.out.println("What would you like to do next? " + "\n");
                    break;
                    
                case 2:
                    System.out.println(playlist); /** Displays the songs added to the play list */
                    break;
                case 0:
                    System.out.println("Program is now quitting...GoodBye!!"); /** Displays message to end the program */
                    break;
                    
                default:
                    /** Displays message if an invalid option is selected */
                    System.out.println("Oops, option selected is invalid! Please select a valid option between(0-2)>> " + "\n"); 
               
            }
            
        }while(option !=0);
    }
        
  }
