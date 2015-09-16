////////
//Steph Stieber
//9-15-15
//section 110
//Block java program
//will calculate the volume and surface area of a block
//given a certain length, width, and height

//importing the scanner class
import java.util.Scanner; 
//define class
public class Block {
    //define main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        //ask the user to imput the length, width, and height of the block as doubles
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //declare formula for volume
        double volume = (length * width * height);
        //declare formula for surface area
        double surfaceArea = ((2*length*width)+(2*length*height)+(2*width*height));
        
        //print volume and surface area volume
        System.out.println("The volume of the block of dimensions "+ length + " x " + width + " x " + height + " is " + volume + ' ');
        System.out.println("The surface area of the block is " + surfaceArea + '.');
        }
    }
    
