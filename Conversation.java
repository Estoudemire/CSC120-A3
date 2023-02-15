//Importing the scanner & ArrayList class 
import java.util.Scanner; 
import java.util.ArrayList; 

class Conversation {
  public static void main(String[] arguments) {
    //Creating a scanner object
    Scanner scanner = new Scanner(System.in); 

    //Defining variables I'll need
    int numRounds = 0;
    //Defining an array list for the transcript 
    ArrayList<String> transcript = new ArrayList<String>(); 

    //Some basic responses
    String starter = "Hi there! What do you wanna talk about?"; 
    String ending = "I've got to go. See you later! :)"; 
    String randResponseOne = "That's really cool!"; 
    String randResponseTwo = "Can you tell me more about that?"; 
    //Putting the responses in a Static Array
    String[] responseArray = {starter, ending, randResponseOne, randResponseTwo}; 

    //First, asking user for the number of rounds they want
    System.out.println("How many rounds would you like?"); 
    numRounds = scanner.nextInt(); 
    System.out.println(" "); //Formatting
    //Next, greeting the user
    System.out.println(starter); 
      //Add to transcript
    //A for loop with however many rounds the user requested 
    for (int i = 0; i < numRounds; i++){
       String userResponse = scanner.nextLine();

    }

  }
}
