/*
Steph Stieber
10-2-15
section 110
lab 08
Stats java program
this program uses multiple methods to find the mean and median
*/

//importing the scanner class
import java.util.Scanner; 
//define class
public class Stats {
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        //ask the user to imput the length, width, and height of the block as doubles
        System.out.print("Enter first double: ");
        double first = myScanner.nextDouble();
        
        System.out.print("Enter second double: ");
        double second = myScanner.nextDouble();
            while (second<=first){
                System.out.println("Error: second double must be greater than first.");
                System.out.print("Enter second double: ");
                second=myScanner.nextDouble();
            }
        System.out.print("Enter third double: ");
        double third = myScanner.nextDouble();
            while (third<=second){
                System.out.println("Error: third double must be greater than first two.");
                System.out.print("Enter third double: ");
                third=myScanner.nextDouble();
            }
        System.out.print("Enter fourth double: ");
        double fourth = myScanner.nextDouble();
            while (fourth<=third){
                System.out.println("Error: fourth double must be greater than first three.");
                System.out.print("Enter fourth double: ");
                fourth=myScanner.nextDouble();
            }
        System.out.print("Enter fifth double: ");
        double fifth = myScanner.nextDouble();
            while (fifth<=fourth){
                System.out.println("Error: fifth double must be greater than first four.");
                System.out.print("Enter fifth double: ");
                fifth=myScanner.nextDouble();
            }
            
            double mean = mean(first, second, third, fourth, fifth);
            double median = median(third);
            print(mean, median);
    
    }
    public static double mean(double first, double second, double third, double fourth, double fifth){
        double mean=((first+second+third+fourth+fifth)/5);
        return mean;
    }
    public static double median(double third){
        double median=third;
        return median;
    }
    public static void print(double mean, double median){
        System.out.println("Mean: "+mean);
        System.out.println("Median: "+median);
    }
}
                           