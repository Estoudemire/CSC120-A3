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

    //ACTIVE CODE
    //First, asking user for the number of rounds they want
    System.out.println("How many rounds would you like?"); 
    numRounds = scanner.nextInt(); 

    //Greeting the user, adding it to the transcript
    System.out.print(starter); 
    transcript.add(starter); 

    //Looping for however many rounds the user wanted
    for (int i = 1; i <= numRounds; i++){
      //Taking the user response
      System.out.println(" "); 
      String userResponse = scanner.nextLine(); 
      transcript.add(userResponse); 

      //Mirroring the response if possible
      if (userResponse.contains("I ")){
        String newString = userResponse.replace("I", "You");
        //Phrases the new String as a question
        newString = newString.concat("?");
        System.out.println(newString); 
        transcript.add(newString);
      } else if (userResponse.contains("me")){
        String newString = userResponse.replace("me", "you");
        //Phrases the new String as a question
        newString = newString.concat("?");
        System.out.println(newString); 
        transcript.add(newString);
      }
      else {
        System.out.println(randResponseOne); 
        transcript.add(randResponseOne);
      }
    }

    //Ending the conversation 
    System.out.println(ending); 
    transcript.add(ending); 

    //Printing out the transcript
    System.out.println(" "); 
    System.out.println("TRANSCRIPT:"); //Formatting
    System.out.println(transcript); 

  }
}