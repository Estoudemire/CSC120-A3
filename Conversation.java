//Importing the scanner, Random, & ArrayList class 
import java.util.Scanner; 
import java.util.ArrayList; 
import java.util.Random; 

class Conversation {
  public static void main(String[] arguments) {
    //Creating a scanner & rand object
    Scanner scanner = new Scanner(System.in); 
    Random rand = new Random(); 

    //Defining variables I'll need
    int numRounds = 0;
    //Defining an array list for the transcript 
    ArrayList<String> transcript = new ArrayList<String>(); 

    //Some basic responses
    String starter = "Hi there! What do you wanna talk about?"; 
    String ending = "I've got to go. See you later! :)"; 
    String randResponseOne = "That's really cool!"; 
    String randResponseTwo = "Can you tell me more about that?"; 
    String randResponseThree = "What else are you thinking about?";
    //Putting the responses in a Static Array
    String[] responseArray = {randResponseOne, randResponseTwo, randResponseThree}; 

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
      } else if (userResponse.contains("am")){
        String newString = userResponse.replace("am", "are");
        System.out.println(newString); 
        transcript.add(newString);
      } else if (userResponse.contains("you")) {
        String newString = userResponse.replace("you", "me");
        System.out.println(newString); 
        transcript.add(newString);
      } else if (userResponse.contains("my")) {
        String newString = userResponse.replace("my", "your");
        System.out.println(newString); 
        transcript.add(newString);
      } else if (userResponse.contains("your")){
        String newString = userResponse.replace("your", "my");
        System.out.println(newString); 
        transcript.add(newString);
      } else {
        //Getting a random response
        int randNumber = rand.nextInt(3); 
        System.out.println(responseArray[randNumber]); 
        transcript.add(responseArray[randNumber]);
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