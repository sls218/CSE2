/*
Steph Stieber
10-2-15
section 110
lab 07
encrypted x java program
this program uses loops to hide a secret message "x"
*/

//importing the scanner class
import java.util.Scanner; 
//define class
public class encrypted_x {
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        
        int input=0;
        boolean allowed=false;
        System.out.print("Enter an integer 0-100: ");
            while (!allowed){   
                if (myScanner.hasNextInt()){
                    input = myScanner.nextInt();
                    allowed = true;
                }
                else {
                    System.out.println("ERROR: need an integer");
                    System.out.print("Input your integer: ");
                    myScanner.next();
                }
                if  (input<0 || input>100){
                    System.out.println("ERROR: need positive value");
                    System.out.print("Input positive integer: ");
                    myScanner.next();
                }
                for (int row=0; row<input; row++){
                        for (int column=0; column<input; column++){
                            if(row==column || row+column==input-1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                }
        }
    }
}