//////////////
//Steph Stieber
//9-11-15
//lab 03
//section 110
//Check java program
//will calculate how much each person must pay for dinner
//given certain inputs from the user

//importing the scanner class
import java.util.Scanner; 
//must always define class
public class Check {
    //define main method
    public static void main(String[] args) {
        //tell the program you want to input using the scanner constructor
        Scanner myScanner = new Scanner(System.in);
        //ask the user for to input the original check cost
        System.out.print("Enter the original cost of check in the form xx.xx: ");
        //the next statement allows the user to input the double value of the bill
        double checkCost= myScanner.nextDouble();
        //ask the user for the tip percent they would like to charge
        System.out.print("Enter the tip percentage you wish to pay as a whole number (in the form xx): ");
        //user input the tip percentage as a double
        double tipPercent= myScanner.nextDouble();
        //the below statement make the tip percent into a decimal
        tipPercent /=100;
        //ask the user for the number of people who went to dinner
        System.out.print("Enter the number of people who went out to dinner: "); 
        //user input number of people as int
        int numPeople= myScanner.nextInt();
        
        //initialize the total cost of the bill
        //and the cost per person as doubles 
        double totalCost; 
        double costPerPerson;
        //initialize the dollar, dimes, and pennies amount as an integer
        int dollars, dimes, pennies;
        //define total cost as the bill times 1 plus the tip percent
        totalCost= checkCost * (1+tipPercent);
        //define cost per person as the calculation above (total cost)
        //divided amoungst the number of people attending dinner
        costPerPerson= totalCost/numPeople;
        //assign the interger value for cost per person as dollars
        dollars= (int) costPerPerson;
        //find the number of dimes each person owes by multiplying the
        //cost per person by 10 and the remainder of dimes is determined
        dimes=(int)(costPerPerson*10)%10;
        //find the number of pennies each person owes by multiplying the
        //cost per person by 100 the remainder of pennies is determined
        pennies=(int)(costPerPerson*100)%10;
        //print the final statement
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    }  //ends main method
}//ends class