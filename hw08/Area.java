/*
Steph Stieber
10-16-15
section 110
hw08 part 1
area java program
this program asks for a shape input and determines the area
*/

//importing the scanner class
import java.util.Scanner; 
//define class
public class Area {
    //define main method
    public static void main(String[] args) {
        //initialize the area of the shape
        double area=0;
        //go get the returned shape from the shape input method
        String shape=shapeInput();
        //initialize that when the shape entered equals rectangle, create a boolean named rectangle 
        boolean rectangle=shape.equals("rectangle");
        boolean triangle=shape.equals("triangle");
        boolean circle=shape.equals("circle");
            //if the rectangle boolean is true 
            if (rectangle==true){
                //go get the area returned from the rectangle area method and set it equal to area
                area=rectangleArea();
            }
            //if the triangle boolean is true
            else if (triangle==true){
                //go get the area returned from the triangle area method and set it equal to area
                area=triangleArea();
            }
            //if the circle boolean is true
            else if (circle==true){
                //go get the area returned from the circle area method and set it equal to the area
                area=circleArea();
            }
        //print the result of the shape and its specifc area
        System.out.println("The "+shape+" has an area of "+area);
    }    
    //define a method for the area of the rectangle
    public static double rectangleArea(){
        //ask for a length and width inputs as doubles 
        System.out.print("Enter in a length: ");
        double length = dataInput();
        System.out.print("Enter in a width: ");
        double width = dataInput();
        //create a double multiplying length and width to find rectangle area
        double rectangleArea=(length*width);
        //return the rectangle area 
        return rectangleArea;
    }
    //define a method for the area of the triangle
    public static double triangleArea(){
        //ask for a base and height inputs as doubles
        System.out.print("Enter in a base: ");
        double base = dataInput();
        System.out.print("Enter in a height: ");
        double height = dataInput();
        //create a double with the formula for area of a triangle
        double triangleArea=((base*height)/2);
        //return the area of a triangle 
        return triangleArea;
    }
    //define a method for the area of a circle
    public static double circleArea(){
        //initialize pi
        double pi=3.14159;
        //ask for a radius input
        System.out.print("Enter in a radius: ");
        double radius = dataInput();
        //create a double for the area of the circle
        double circleArea=(pi*(radius*radius));
        //return the area of the circle
        return circleArea;
    }    
    //define a method for chosing a shape
    public static String shapeInput(){
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        //create a boolean to swtich later
        boolean allowed=false;
        //initialize shpe as a string
        String shape="shape";
        //while boolean allowed is true
        while(!allowed){
            //ask for a shape input
            System.out.print("Enter rectangle, triangle, or circle: ");
            //declare shape as the next string entered 
            shape = myScanner.nextLine();
            //when the shape entered equals rectangle create the boolean rectangle
            boolean rectangle=shape.equals("rectangle");
            //triangle and circle are same as rectangle
            boolean triangle=shape.equals("triangle");
            boolean circle=shape.equals("circle");
                //if any of the shape booleans are true 
                if (rectangle==true || triangle==true || circle==true){
                    //set the shape equal to the what was inputted
                    shape=shape;
                    //print the shape that was inputted and accepted
                    System.out.println("The shape entered: "+shape);
                    //switch the boolean allowed to true so it won't go
                    //through the while loop again 
                    allowed=true;
                }
                //if all of the booleans are false
                else{
                    //print that the shape is not acceptable 
                    System.out.println("Error: shape invalid.");
                    //code will continue to go through while loop until input is acceptable
                }
        }
        //return the shape to main method
        return shape;
    }
    //define a method for inputting data 
    public static double dataInput(){
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
        //initialize any double entered as 1
        double doubleValue=1;
        //create a boolean allowed to switch later in the while loop
        boolean allowed=false;
        //while the boolean is true
        while (!allowed){
            //if the next input is a double 
            if(myScanner.hasNextDouble()){
                //assign the double to double value 
                doubleValue=myScanner.nextDouble();
                //switch the boolean and accept the entered double
                allowed=true;
            }
            //if not a double
            else {
                //ask for another input 
                System.out.print("Error: please enter a double: ");
                myScanner.next();
                //go back through the while loop to find a valid input
            }
            //while the double entered is less than or equal to zero
            while(doubleValue<=0){
                //print that it must be positive
                System.out.print("Error: please enter a positive double: ");
                    //if the next input is a double 
                    if(myScanner.hasNextDouble()){
                        //assign the double to double value 
                        doubleValue=myScanner.nextDouble();
                        //switch the allowed booelan so it won't enter the while loop again
                        allowed=true;
                    }
                    //
                    else{
                        //accept any value and continue going through the while loop
                        myScanner.next();
                    }
            }
        }
        //retun the acceptable double that passed all the tests
        return doubleValue;
    }
}   