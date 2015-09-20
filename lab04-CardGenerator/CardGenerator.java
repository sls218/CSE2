////////
//Steph Stieber
//9-17-15
//section 110
//Card Generator java program
//print out the name of a randomly generated card out of a 52 card deck

//define class
public class CardGenerator{
    //define main method
    public static void main(String[] args) {
    int number = (int)(Math.random()*52)+1;
    String suit = "suit";
    String identity = "identity";
    int subtract = 0;
    if (number>0 && number<=13){
        suit = "Diamonds";
        subtract = 0;
    }
    else if (number<=26){
        suit = "Clubs";
        subtract = 13;
    }
    else if (number<=39){
        suit = "Hearts";
        subtract = 26;
    }
    else if (number<=52){
        suit = "Spades";
        subtract = 39;
    }
    int cardNumber = number - subtract;
    String faceValue = "faceValue";
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
    System.out.println("You picked the "+faceValue+" of "+suit+".");
    }
}