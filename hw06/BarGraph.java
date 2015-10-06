/*
Steph Stieber
10-3-15
section 110
hw 06 part 1
Bar Graph java program
this program asks the user to input their spending for
one day for an entire week and prints a bar graph of the spending
and then find the average for one year and then four years
*/

//importing the scanner class
import java.util.Scanner; 
//define class
public class BarGraph {
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        
        //as the user to input their expenses for Monday-Sunday as a double
        System.out.print("Expenses for Monday: \t\t$");
        double Monday = myScanner.nextDouble();
        System.out.print("Expenses for Tuesday: \t\t$");
        double Tuesday = myScanner.nextDouble();
        System.out.print("Expenses for Wednesday: \t$");
        double Wednesday = myScanner.nextDouble();
        System.out.print("Expenses for Thursday: \t\t$");
        double Thursday = myScanner.nextDouble();
        System.out.print("Expenses for Friday: \t\t$");
        double Friday = myScanner.nextDouble();
        System.out.print("Expenses for Saturday: \t\t$");
        double Saturday = myScanner.nextDouble();
        System.out.print("Expenses for Sunday: \t\t$");
        double Sunday = myScanner.nextDouble();
        
        //create a switch statement to change the day to a corresponding number 
        //initialize a double that will check the value of the expense input
        double value=0.0;
        for(int day=1; day<=7; day++){
            switch(day){
                //when day is 1
                case 1: 
                    //print the following statement
                    System.out.print("Mon: \t");
                    //and assign the expenses for monday to value
                    value=Monday; 
                    //now break the switch statement
                    //the swtich statement reads the same all the way down
                    break;
                case 2: 
                    System.out.print("Tues: \t");
                    value=Tuesday; 
                    break;
                case 3: 
                    System.out.print("Wed: \t");
                    value=Wednesday; 
                    break;
                case 4: 
                    System.out.print("Thurs: \t");
                    value=Thursday; 
                    break;
                case 5: 
                    System.out.print("Fri: \t");
                    value=Friday; 
                    break;
                case 6: 
                    System.out.print("Sat: \t");
                    value=Saturday; 
                    break;
                case 7: 
                    System.out.print("Sun: \t");
                    value=Sunday; 
                    break;
                }
            //for all values that the number is less than the value of expenses, print an * for each dollar
            //start for loop at .5 to account for rounding numbers >=.5 up and <.5 down
            for(double number=.5; number<=value; number++){
                System.out.print("*");
            }
            //print new line inbetween days
            System.out.print("\n");
        }
        //determine the average weekly expenses and print
        double average= ((Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/(7));
        System.out.format("Your average weekly expenses are: \t$ %4.2f%n", average);
        
        //assign the first value of the 52 week total to the average we already calculated (the first week)
        double totalWeeks = average; 
        //for the second week through the 208th (4th year)
        for (int week=2; week<=208; week++){
            //generate a value -20 to 20 for the percent fluxuation of the average
            double percent = (int)(Math.random()*41)-20;
            //change the number into a percent (decimal value0)
            double change= 1-(percent/100.00);
            //multiply that percent by the average to find the specific average that week due to the flucuation
            double future = change*average;
            //add the average for the week from above to the total weeks 
            totalWeeks+=future;
            //this will run until we have run for 4 years
        }
        //print the total average due to fluctuations
        System.out.format("Estimated expenditure for 4 years: \t$ %4.2f%n", totalWeeks);
        
    }
}


        
        
 /*   
           
            
                
                if (day<0){
                System.out.print("Please only enter positive numbers. Try again: "+ expenses);
                }
                else{
                System.out.print("Sorry, you did not enter an integer. Try again: "+ expenses);
                }
                day++;


        

        

        }
        

        
    }
}*/