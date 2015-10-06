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
        
       
        System.out.print("Enter a 10 digit number: ");
        int ISBN = myScanner.nextInt(); 
        
        
       int first =((ISBN/1000000000%10)*10);
       int second =((ISBN/100000000%10)*9);
       int third =((ISBN/10000000%10)*8);
       int fourth =((ISBN/1000000%10)*7);
       int fifth = ((ISBN/100000%10)*6);
       int sixth =((ISBN/10000%10)*5);
       int seventh =((ISBN/1000%10)*4);
       int eighth =((ISBN/100%10)*3);
       int ninth =((ISBN/10%10)*2);
       int checkDigit =(ISBN%10); 
       
       int remainder =((first+second+third+fourth+fifth+sixth+seventh+eighth+ninth)%(11));
       
       if (remainder==checkDigit){
            System.out.println("This is a valid ISBN. ");
       }
       else if (checkDigit==0){
            System.out.println("This is NOT a valid ISBN. Check digit should be X. ");
       }
       
        
        
        
        
        System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
        System.out.println("This is not a valid ISBN. Check digit should be: ");
    }
}