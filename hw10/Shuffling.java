////////
//Steph Stieber
//9-17-15
//section 110
//Shuffling java program
//Shuffling is a program that prints a deck of cards and shuffles them and then pics a hand of 5

//importing the scanner class
import java.util.Scanner; 
//define class Shuffling
public class Shuffling{
  //create the main string that generate the array cards
  public static void main(String[] args) {
    //assign a new scanner to myScanner
    Scanner scan = new Scanner(System.in);
	      //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};  
        //possible card number values
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        //the array cards is a string array that has a length of 52
        String[] cards = new String[52];
        //the array hand is a string array that has a length of 5
        String[] hand = new String[5];
        //for the length of the array assign each card a value with suit name and number 
        for (int i=0; i<52; i++){
          cards[i]=rankNames[i%13]+suitNames[i/13];        
        }
        
        //go to the method printArray and insert the array cards 
        printArray(cards);
        //go to the shuffle method and insert the cards array
        shuffle(cards);
        //print "shuffled"
        System.out.print("\nShuffled : ");
        //fo to the method printArray and print the shuffled deck of cards
        printArray(cards);
        //print "randomized hand"
        System.out.println("\nRandomized Hand! ");
        //assign hand to equal the return of the array "cards"
        //going into the randomized hand method 
        hand = randomizeHand(cards);
        //go into the printArray method and print the 5 chosen cards from the hand
        printArray(hand);
  }
    //create a method that prints array
    public static void printArray(String[] array){
        //for the length of the array inputted
        for (int i=0; i<array.length; i++){
          //print the value of the entire array 
          System.out.print(array[i]+" ");
        }
    }
            
    //create a method that shuffles the deck of cards by swapping values    
    public static void shuffle(String[] cards){
      //shuffle 100 times
      for (int i=0; i<100; i++){
        //create a new int that generates an index that 
        //selects a random element i of the card array
        int swap = (int) (cards.length * Math.random());
        //this element is assigned to a new string named value
        String value = cards[swap];
        //the element generated is set equal to the first element in the array
        cards[swap]=cards[0];
        //and the first element in the array is assigned to the newly created string "value"
        cards[0]=value;
      }
    }
    //create a method that selcts 5 different cards from the shuffled deck
    public static String[] randomizeHand(String[] cards){
      //reassign the string array hand to have a length of 5
      String[] hand = new String[5];
      //select 5 cards from the shuffled deck
      for (int i=0; i<hand.length; i++){
        //generate the same element as the shuffle array to determine an index
        int swap = (int) (cards.length * Math.random());
        //if the chosen card equals "no" then we take away that selection 
        //(give us another choice) and go back to the beginning of the for loop
        if(cards[swap].equals("no")){
          i--;
          continue;
        }
        //assign the corresponding i value of hand to the randomly generated array value in cards
        hand[i]=cards[swap];
        //assing the chosen card to be named "no"
        //(this helps us check for duplicate card selections)
        cards[swap]="no";
      }
      //return the 5 selected cards in the hand 
      return hand;
    }
    

  
}

