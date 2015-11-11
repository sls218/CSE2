////////
//Steph Stieber
//9-17-15
//section 110
//CSE2Linear java program
//CSE2Linear is a program that asks for inputs to an array called grades in ascending order,
//uses a binary search, scrambles, then a linear search. 

//importing the scanner class
import java.util.Scanner; 
//define class CSE2Linear
public class CSE2Linear{
  //create the main string that generate the grades array that contains 15 inputs
  public static void main(String[] args) {
    int[] grades= new int[15];
    //initialize the previous check to be zero
    int previous=0;
    //for the length of the grades array assign a grade to each spot in the arry 
    for (int i=0; i<15; i++){
        //each input must be greater than the previous
        grades[i]=input(previous);
        //the new previous becomes the last input
        previous=grades[i];
    }
    //print the array grades
    printArray(grades); 
    System.out.println("");
    //initialize check to be a number that we check if it is in the grades array
    //we insert 0 as previous and generate a number in teh input arrary
    int check=input(0);
    //input the grade array and the check value into the binary method
    binary(grades,check);
    //scramble the grades array
    scramble(grades);
    System.out.println("Scrambled: ");
    //print the scrambled array
    printArray(grades); 
    System.out.println("");
    //find another check value by going through the input array 
    check=input(0);
    //input the grades arrary and check value into the linear method
    linear(grades,check);
    
  }
    //create a method to check for inputs
    public static int input(int previous){
    //tell program you want to use scanner constructor 
    Scanner myScanner = new Scanner(System.in);
    //initialize grade
    int grade=0;
        //initialize switch component
        boolean allowed=false;
            //while true enter the while loop
            while (!allowed){   
                //ask for an input 
                System.out.print("Enter a grade "+previous+" to 100: ");
                //if the next value is and integer
                if (myScanner.hasNextInt()){
                    //assign the int to grade
                    grade = myScanner.nextInt();
                    //switch allowed to true to accept for the time being
                    allowed = true;
                }
                //if not an integer 
                else {
                    System.out.println("ERROR: need an integer");
                    //accept the next input and go back to the beginning of the while loop
                    myScanner.next();
                    continue;
                }
                //if grade isnt within the range
                if  (grade<0 || grade>100){
                    //switch allowed to false to continue going through while loop
                    System.out.println("ERROR: need value within range");
                    allowed=false;
                    //go back to beginning of while loop
                    continue;
                }
                //if the grade is below the previous entered one
                if (grade<previous){
                    System.out.println("ERROR: grade must be greater than or equal to previous");
                    //switch allowed to false to go back through while loop
                    allowed=false;
                }
            }
            //return the grades array
            return grade; 
    }
    
    //create a method that prints array
    public static void printArray(int[] array){
        //for the length of the array inputted
        for (int i=0; i<array.length; i++){
          //print the value of the entire array 
          System.out.print(array[i]+" ");
        }
    } 
    
    //create a method to do a binary search by bringing in the grades array and the check value
    public static void binary(int[] grade, int check){
        //initialize the low, middle, and high values
        int low=0;
        int middle=0;
        int high=grade.length-1;//(Because we start at zero)
        //initialize count and the boolean found
        int count=0; 
        boolean found=false; 
        //for all values of the array
        while(low<=high){
            //the middle of the array is half way between the high and low
            middle=low+((high-low)/2);
            count++; 
            //if the check number is less than the grade corresponding with the middle value
            if(check<grade[middle]){
                //make the new high the old middle minus one and go through the loop again
                high=middle-1;
            }
            //if the check number is greater than the grade corressponding to the middle value
            else if(check>grade[middle]){
                //make the low value the old middle value plus one and go through the loop again
                low=middle+1;
            }
            //when the check number equals the grade 
            else{
                //found is true and the while loop breaks because we found the number we were looking for
                found=true;
                break;
            }
        }
        //if the number was not found, print results
        if (!found){
            System.out.println(check+" was not found in the list with "+count+ " iterations.");
        }
        //if the number was found, print results 
        else{
            System.out.println(check+" was found in the list with "+count+" iterations. ");
        }
    }
        
//create a method that scrambles the grades values    
  public static void scramble(int[] grades){
    //scramble 100 times
      for (int i=0; i<100; i++){
        //create a new int that generates an index that 
        //selects a random element i of the grade array
        int swap = (int) (grades.length * Math.random());
        //this element is assigned to a new int named value
        int value = grades[swap];
        //the element generated is set equal to the first element in the array
        grades[swap]=grades[0];
        //and the first element in the array is assigned to the newly created string "value"
        grades[0]=value;
      }
    }
    //create a method to do a linear search of the scrambles grades
    public static void linear(int[] grades,int check){
        //initialize found to be false
        boolean found=false;
        int count=0;
        //for the length of the array 
        for(int i=0; i<grades.length; i++){
            count++;
            //if the value of the grade at its corresponding array spot equals the check value
            if(grades[i]==check){
                //you have found what you are looking for
                found=true;
                //so, break the for loop to stop looking
                break;
            }
        }
        //if the value was found in the arrary, print results
        if (!found){
            System.out.println(check+" was not found in the list with "+count+ " iterations.");
        }
        //if the value was not found, print results
        else{
            System.out.println(check+" was found in the list with "+count+" iterations. ");
        }        
    }
    
}
