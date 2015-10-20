/*
Steph Stieber
10-16-15
section 110
hw08 part 2
String Analysis java program
this program determines if all/some components in a string are letters
*/
//import the scanner class
import java.util.Scanner;
//define a class String Analysis
public class StringAnalysis{
    //define main method
    public static void main(String[]args){
        //initialize the integer integer as -1
        int integer=0; 
        //assign the scanner to be myScanner
        Scanner myScanner=new Scanner(System.in);
        //as for a string input
        System.out.print("Enter a string: "); 
        //assign the next inputted string to string
        String string=myScanner.nextLine();
        //initialize length as the number of characters in the entered string
        int length=string.length();
        //ask user if they want to enter an integer
        System.out.print("Enter an integer if you desire. If not, type 'no': ");
            //if user enters integer
            if (myScanner.hasNextInt()){
                //assign integer to the inputted value
                integer=myScanner.nextInt();
            }
            //if they enter anything but an integer, accept and dont assign value
            else{
                myScanner.next(); 
            }
            
         while(integer<0){
                //print that it must be positive
                System.out.print("Error: please enter a positive integer: ");
                    //if the next input is a double 
                    if(myScanner.hasNextInt()){
                        //assign the double to double value 
                        integer=myScanner.nextInt();
                    }
                    //if the input isnt a double 
                    else{
                        //assume next value is "no" and accept 
                        myScanner.next();
                        //set the integer value to zero
                        integer=0;
                        //and break the while loop
                        break;
                    }
            }   
        
        //if the integer entered is less than or equal to the number of characters
        //in the entered string and not equal to 0 (when "no" is entered)
        if (integer<=length&&integer!=0){
            //go to the check method with the string and integer and if
            //the return boolean is false(all letters)
            if (check(string,integer)==false){
                //print that the first blank number of characters ARE letters
                System.out.println("The first "+integer+" character(s) consist(s) of all letters!");
            } 
        }
        //if does not meet first if condition
        else {
            //check the check method with just the string to see if all characters are letters
            if(check(string)==false){
                //if they are all letters (false), print that they are all letters
                System.out.println("The string is all letters!");
            }
        }
        
    }
    //create a method to check the string if an integer is not entered
    public static boolean check(String string){
        //initialize letters as false
        boolean letters=false;
        //initialize notLetters as false 
        boolean notLetters=false;
        //initiailize the length as the number of characters in the entered string
        int length=string.length();
        //initialzie letter as a char
        char letter='a';
        //for values 0 to less than the length 
        for (int value=0;value<length;value++){
            //set the char equal to the value that specific character
            letter=(string.charAt(value));
                //if the char is a-z 
                if (letter>='a' && letter<='z'){
                    //then say that boolean letters is true
                    letters=true;
                }
                //if the char isnt a-z
                else{
                    //print that the string isnt 
                    System.out.println("The string does not consist of only letters.");
                    notLetters=true;
                    break;
                }
        }
        return notLetters; 
        
    }
    //create a method to check the string if an integer was entered
    public static boolean check(String string, int integer){
        //create a boolean letters
        boolean letters=false;
        //create a boolean notLetters
        boolean notLetters=false;
    
        //create a char named letter
        char letter='a';
        //assign the entered integer to an integer named length
        int length=integer;
            // for a value zero to less than the length go through the for loop
            for (int value=0;value<length;value++){
                //assign the current value to letter so that it is a char
                letter=(string.charAt(value));
                    //if the char value assigned is a-z
                    if (letter>='a' && letter<='z'){
                        //the value is a char
                        letters=true;
                    }
                    //if not a-z 
                    else{
                        //print that the integer () doesnt contain all letters
                        System.out.println("The first "+integer+" characters are not all letters");
                        //which means notLetters is true-not all letters
                        notLetters=true;
                        //break the for loop
                        break;
                    }
            }        
        //return the boolean notLetter
        return notLetters; 
        
    }
}

        
    