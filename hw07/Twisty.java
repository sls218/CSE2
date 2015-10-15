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
public class Twisty {
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        
        //initialize the length value
        int length=0;
        //assign the boolean allowed to false to begin
        boolean allowed=false;
        //ask for the length input
        System.out.print("Input your desired length: ");
            //while the boolean is true
            while (!allowed){   
                //if the next input is an int, accept it as the length
                if (myScanner.hasNextInt()){
                    length = myScanner.nextInt();
                    //and switch the allowed string to true so it wont go through the while loop again
                    allowed = true;
                }
                //otherwise ask for another input because an integer wasnt given
                else {
                    System.out.println("Error: please type in an integer. ");
                    System.out.print("Input your desired length: ");
                    myScanner.next();
                }
                //while the length is less than zero or greater than eighty print that the value is not acceptable
                //and ask for another input
                while (length<0 || length>80){
                    System.out.println("Error: need positve integer [0,80]");
                    System.out.print("Input your desired length: ");
                    //if the next input is acceptable then store it as the length
                    if (myScanner.hasNextInt()){
                        length = myScanner.nextInt();
                        allowed = true;
                    }
                    //otherwise ask for the input again
                    else {
                        myScanner.next();
                    }
                }
            }
        //repeat the same process for width as we did length above 
        int width=0;
        allowed=false;
        System.out.print("Input your desired width: ");
            while (!allowed){   
                if (myScanner.hasNextInt()){
                    width = myScanner.nextInt();
                    allowed = true;
                }
                else {
                    System.out.println("Error: please type in an integer. ");
                    System.out.print("Input your desired width: ");
                    myScanner.next();
                }
                while  (width<0 || width>length){
                    System.out.println("Error: need positive width less than or equal to length");
                    System.out.print("Input your desired width: ");  
                    if (myScanner.hasNextInt()){
                        width = myScanner.nextInt();
                        allowed = true;
                    } 
                    else {
                        myScanner.next();
                    }                    
                }
            }
            //initialize variables a,b,c, and d
            //a determines where the first # goes
            int a=0;
            //b determines where the / goes 
            int b=width-1;
            //c determines where the \ goes
            int c=width;
            //d determines where the last # in the first width goes 
            int d=(2*width)-1;
            //the outer loop tells us how many lines we go down (the width) 
            //and keeps creating lines until the number of lines reaches the width value
            for(int i=1;i<=width;i++){
                //the inner loop tells us how many characters we go across (the length)
                for(int j=0;j<length;j++){
                    //if remainder of the length divided by twice the width is zero
                    if(j%(2*width)==a){
                        //then print a #
                        System.out.print("#");
                    }
                    //if remainder of the length divided by twice the width is the width minus 1      
                    else if(j%(2*width)==b){
                        //then print a /
                        System.out.print("/");
                    }
                    //if remainder of the length divided by twice the width is the width                   
                    else if(j%(2*width)==c){
                        //then print a \
                        System.out.print("\\");
                    }
                    //if remainder of the length divided by twice the width twice the width minus one                    
                     else if(j%(2*width)==d){
                        //then print a #
                        System.out.print("#");
                    } 
                    //otherwise print a space
                    else{
                        System.out.print(" ");
                    }
                }
                //go to a new line
                System.out.print("\n");       
                //afte going to the next line
                //increase the value of a by one
                a++;
                //decrease the value of b by one
                b--;
                //increase the value of c by one
                c++;
                //decrease the value of d by one
                d--;

            }
    }
}