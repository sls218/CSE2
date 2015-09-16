////////
//Steph Stieber
//9-15-15
//section 110
//Time java program
//calculates the remaining time until dinner 
//given the current time and dinner time

//import the scanner class
import java.util.Scanner;
//define class
public class Timer{
    //define main method
    public static void main(String[] args){
        //tell the program you want to use the scanner constructor
        Scanner myScanner = new Scanner(System.in);
        //ask user to input the current time (military time HHMM)
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt(); 
        //ask user to input the time they will be eating dinner (military time HHMM)
        System.out.print("Enter the time that you will be eating: ");
        //ask the user to input the current time 
        int dinnerTime = myScanner.nextInt();
        //find the difference between the dinner time current time
        int difference = (dinnerTime-currentTime);
        //to find the total hours between times, divide the difference by 100
        //and get rid of decimals by converting to an int
        int hours = (int) (difference/100);
        //find the number of minutes between the current time and the next highest hour
        int currentMinutes = (60 - (currentTime-((currentTime/100)*100)));
        //find the number of minutes between dinner time and the next lower hour
        int dinnerMinutes = (dinnerTime-((dinnerTime/100)*100));
        //add the current minutes and dinner minutes to find total minutes 
        int minutes = currentMinutes + dinnerMinutes; 
        //if the number of minutes is greater than or equal to 60
        //then we must subtract 60 because that hour is already accounted for in "hours"
        if (minutes >= 60){
            minutes = minutes-60;
        }
        //print the number of hours and minutes until dinner
        System.out.println("You have " + hours +" hours and " + minutes + " minutes until dinner.");
    }
}
