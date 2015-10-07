/*
Steph Stieber
10-3-15
section 110
hw 06 part 2
Check Digit java program
this program is determining if a 10 digit input is a valid ISBN
*/

//importing the scanner class
import java.util.Scanner; 
//define class
public class CheckDigit{
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        
        //enter a ISBN number that is 10 digits
        System.out.print("Enter a 10 digit ISBN number: ");
        //the ISBN is initialized as a string due to the futuere X
        String ISBN = myScanner.next(); 
        //if the number entered isnt 10 digits, ask for another entry
        while (ISBN.length()!=10){
            System.out.print("Invalid input. Try again: ");
            ISBN=myScanner.next();
        }
        //initialize values
        char letter='a';
        int letterInt=0;
        int last=0;
        int multiplier=10;
        int total=0;
        
        //for the first 8 digits of the ISBN code 
        for(int digit=0;digit<9;digit++){
            //change each individual number at a time to a char
            letter=(ISBN.charAt(digit));
            //then convert that specific char to an int
            letterInt=Character.getNumericValue(letter);
            //multiply 10 by the int value and add to the total 
            total+=(multiplier*letterInt);
            //decrease the multiplier each time so that the second digit is being multiplied by 9
            multiplier--;
        }
        //convert the last digit of the ISBN to a char
        letter=ISBN.charAt(9);
        //if the last digit in the ISBN number is an X set the last digit value equal to 10
        if(letter=='X'){
            last=10;
        }
        //if not, conver the char into an int
        else{
            last=Character.getNumericValue(letter);
        }
        //initialize a int that takes the total and finds the remainder after dividing by 11
        int check=(total%11);
        //if that number equals the actual last digit
        if(check==last){
            //the ISBN is valid!
            System.out.println("This is a valid ISBN!");
        }
        //if the check doesn't equal the last digit
        else{
            //and if the check value is 10, the ISBN is incorrect because it should be an X
            if(check==10){
                System.out.println("This is not a valid ISBN. The last digit should be an X");
            }
            //if none of the above options, the ISBN is not valid and print the check 
            else{
                System.out.println("This is not a valid ISBN. The last digit should be "+ check);
            }
        }
    }
}
   