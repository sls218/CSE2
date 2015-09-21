////////
//Steph Stieber
//9-17-15
//section 110
//Poker Hand java program
//randomly generate 5 cards out of 5 decks of cards (1 card from each deck)
//and identify if there is one pair, two pair, or three of a kind

//define class
public class PokerHandCheck{
    //define main method
    public static void main(String[] args) {
        //generate a random number 1-52
        int number = (int)(Math.random()*52)+1;
    //initialize the string variables suit and identity
    String suit = "suit";
    String identity = "identity";
    //initialize "subtract", the initial number to take away from
    //the generated number to obtain a helpful card number
    int subtract = 0;
    //if numbers are 1-13 they are diamonds
    if (number>0 && number<=13){
        suit = "Diamonds";
        //subtract nothing because numbers are already 1-13
        subtract = 0;
    }
    //if numbers are 14-26 they are clubs
    else if (number<=26){
        suit = "Clubs";
        //subtract 13 to convert numbers to values 1-13
        subtract = 13;
    }
    //if numbers are 17-39 they are hearts
    else if (number<=39){
        suit = "Hearts";
        //subtract 26 to convert numbers to values 1-13
        subtract = 26;
    }
    //if numbers are 40-52 they are spades
    else if (number<=52){
        suit = "Spades";
        //subtract 39 to convert numbers to values 1-13
        subtract = 39;
    }
    //initialize cardNumber which tells us the new 
    //value for each suit after subtraction
    int cardNumber = number - subtract;
    //create a string faceValue storing the updated value of the card
    String faceValue = "faceValue";
    //use a switch statement that converts the number generated to a new face value
    switch(cardNumber){
        case 1:
            faceValue="Ace";
        break;
        case 2:
            faceValue="2";
        break;
        case 3:
            faceValue="3";
        break;
        case 4:
            faceValue="4";
        break;
        case 5:
            faceValue="5";
        break;
        case 6:
            faceValue="6";
        break;
        case 7:
            faceValue="7";
        break;
        case 8:
            faceValue="8";
        break;
        case 9:
            faceValue="9";
        break;
        case 10:
            faceValue="10";
        break;
        case 11:
            faceValue="Jack";
        break;
        case 12:
            faceValue="Queen";
        break;
        case 13:
            faceValue="King";
        break;
    }
    //print the face value and suit of the card generated
    System.out.println("Your random cards were: ");
    System.out.println("the "+faceValue+" of "+suit);
    
    //repeat above code for a second number 
    int number2 = (int)(Math.random()*52)+1;
    if (number2>0 && number2<=13){
        suit = "Diamonds";
        subtract = 0;
    }
    else if (number2<=26){
        suit = "Clubs";
        subtract = 13;
    }
    else if (number2<=39){
        suit = "Hearts";
        subtract = 26;
    }
    else if (number2<=52){
        suit = "Spades";
        subtract = 39;
    }
    int cardNumber2 = number2 - subtract;
    switch(cardNumber2){
        case 1:
            faceValue="Ace";
        break;
        case 2:
            faceValue="2";
        break;
        case 3:
            faceValue="3";
        break;
        case 4:
            faceValue="4";
        break;
        case 5:
            faceValue="5";
        break;
        case 6:
            faceValue="6";
        break;
        case 7:
            faceValue="7";
        break;
        case 8:
            faceValue="8";
        break;
        case 9:
            faceValue="9";
        break;
        case 10:
            faceValue="10";
        break;
        case 11:
            faceValue="Jack";
        break;
        case 12:
            faceValue="Queen";
        break;
        case 13:
            faceValue="King";
        break;
    }
    System.out.println("the "+faceValue+" of "+suit);
    
    //repeat code above for a third number
    int number3 = (int)(Math.random()*52)+1;
    if (number3>0 && number3<=13){
        suit = "Diamonds";
        subtract = 0;
    }
    else if (number3<=26){
        suit = "Clubs";
        subtract = 13;
    }
    else if (number3<=39){
        suit = "Hearts";
        subtract = 26;
    }
    else if (number3<=52){
        suit = "Spades";
        subtract = 39;
    }
    int cardNumber3 = number3 - subtract;
    switch(cardNumber3){
        case 1:
            faceValue="Ace";
        break;
        case 2:
            faceValue="2";
        break;
        case 3:
            faceValue="3";
        break;
        case 4:
            faceValue="4";
        break;
        case 5:
            faceValue="5";
        break;
        case 6:
            faceValue="6";
        break;
        case 7:
            faceValue="7";
        break;
        case 8:
            faceValue="8";
        break;
        case 9:
            faceValue="9";
        break;
        case 10:
            faceValue="10";
        break;
        case 11:
            faceValue="Jack";
        break;
        case 12:
            faceValue="Queen";
        break;
        case 13:
            faceValue="King";
        break;
    }
    System.out.println("the "+faceValue+" of "+suit);
    
    //repeat code above for a fourth number
    int number4 = (int)(Math.random()*52)+1;
    if (number4>0 && number4<=13){
        suit = "Diamonds";
        subtract = 0;
    }
    else if (number4<=26){
        suit = "Clubs";
        subtract = 13;
    }
    else if (number4<=39){
        suit = "Hearts";
        subtract = 26;
    }
    else if (number4<=52){
        suit = "Spades";
        subtract = 39;
    }
    int cardNumber4 = number4 - subtract;
    switch(cardNumber4){
        case 1:
            faceValue="Ace";
        break;
        case 2:
            faceValue="2";
        break;
        case 3:
            faceValue="3";
        break;
        case 4:
            faceValue="4";
        break;
        case 5:
            faceValue="5";
        break;
        case 6:
            faceValue="6";
        break;
        case 7:
            faceValue="7";
        break;
        case 8:
            faceValue="8";
        break;
        case 9:
            faceValue="9";
        break;
        case 10:
            faceValue="10";
        break;
        case 11:
            faceValue="Jack";
        break;
        case 12:
            faceValue="Queen";
        break;
        case 13:
            faceValue="King";
        break;
    }
    System.out.println("the "+faceValue+" of "+suit);
    
    //repeat code above for a fifth number 
    int number5 = (int)(Math.random()*52)+1;
    if (number5>0 && number5<=13){
        suit = "Diamonds";
        subtract = 0;
    }
    else if (number5<=26){
        suit = "Clubs";
        subtract = 13;
    }
    else if (number5<=39){
        suit = "Hearts";
        subtract = 26;
    }
    else if (number5<=52){
        suit = "Spades";
        subtract = 39;
    }
    int cardNumber5 = number5 - subtract;
    switch(cardNumber5){
        case 1:
            faceValue="Ace";
        break;
        case 2:
            faceValue="2";
        break;
        case 3:
            faceValue="3";
        break;
        case 4:
            faceValue="4";
        break;
        case 5:
            faceValue="5";
        break;
        case 6:
            faceValue="6";
        break;
        case 7:
            faceValue="7";
        break;
        case 8:
            faceValue="8";
        break;
        case 9:
            faceValue="9";
        break;
        case 10:
            faceValue="10";
        break;
        case 11:
            faceValue="Jack";
        break;
        case 12:
            faceValue="Queen";
        break;
        case 13:
            faceValue="King";
        break;
    }
    System.out.println("the "+faceValue+" of "+suit);
    
    //initialize a counter for counting pairs of cards
    int pair=0;
    //list all possible combinatinos of pair two cards together
    if (cardNumber==cardNumber2){
        pair = pair+1;
    }
    if (cardNumber==cardNumber3){
        pair = pair+1;
    }
    if (cardNumber==cardNumber4){
        pair = pair+1;
    }
    if (cardNumber==cardNumber5){
        pair = pair+1;
    }
    if (cardNumber2==cardNumber3){
        pair = pair+1;
    }
    if (cardNumber2==cardNumber4){
        pair = pair+1;
    }
    if (cardNumber2==cardNumber5){
        pair = pair+1;
    }
    if (cardNumber3==cardNumber4){
        pair = pair+1;
    }
    if (cardNumber3==cardNumber5){
        pair = pair+1;
    }
    if (cardNumber4==cardNumber5){
        pair = pair+1;
    }
    
    //print specific results of hand
    if (pair == 0){
        System.out.println("You have a high card hand!");
    }
    if (pair == 1){
        System.out.println("You have a pair!");
    }
    if (pair == 2){
        System.out.println("You have two pair!");
    }
    if (pair == 3){
        System.out.println("You have three of a kind!");
    }
    if (pair > 3){
        System.out.println("You have a GREAT hand!!!");
    }
    }
}