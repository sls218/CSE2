////////
//Steph Stieber
//11-17-15
//section 110
//Transpose java program
//Transpose is a program that takes and input for the dimensions of an array and
//fills it with random numbers. Finally the program takes the transpose of the inputted matrix

//importing the scanner class
import java.util.Scanner; 
//define class Transpose
public class Transpose{
  public static void main(String[] args) {
      //create a string that determines if we are finding height or width\
      String status="height";
      //go through the input method with the staus being height
      int height=input(status);
      status="width"; 
      //go through the input method with the status being width 
      int width=input(status);
      //initialize the matrix as the returned matrix from the randomMatrix method with inputs height and width
      int matrix[][]=randomMatrix(height,width);
      //input the array into the printMatrix 
      printMatrix(matrix);
      //input the array, height, and width into the transpose Matrix and set the retun array equal to transposed 
      int transposed [][]=transposeMatrix(matrix, height, width);
      System.out.println("--------------------------------");
      System.out.println("Transpose:");
      //input the transposed array into the printMatrix
      printMatrix(transposed);
        
  }
    //create a method to print and check for ragged arrays
    public static void printMatrix(int matrix[][]){
        //initialize rectangle
        int rectangle=0; 
        //for all column lengths of the array 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                //set rectangle equal to the length of the column 
                rectangle=matrix[i].length; 
                //if the rectangle value doesn't equal the length of the first column
                if(rectangle!=matrix[0].length){
                    //the array isn't rectangular
                    System.out.println("This is not a rectangular matrix.");
                }
            }
        }
        //for all values of the inputted matrix 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                //print each array value for the row 
                System.out.print(matrix[i][j]+"\t");
            }
            //print a new line after the row is finished printing
            System.out.println(""); 
        }
    }

    //create a method to check for inputs
    public static int input(String status){
    //tell program you want to use scanner constructor 
    Scanner myScanner = new Scanner(System.in);
    //initialize the value
    int value=0;
        //initialize switch component
        boolean allowed=false;
            //while true enter the while loop
            while (!allowed){   
                //ask for an input 
                System.out.print("Enter a "+status+ " for the array: ");
                //if the next value is and integer
                if (myScanner.hasNextInt()){
                    //assign the int to grade
                    value = myScanner.nextInt();
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
                //if input isnt positive
                if  (value<0){
                    //switch allowed to false to continue going through while loop
                    System.out.println("ERROR: need positive value");
                    allowed=false;
                    //go back to beginning of while loop
                    continue;
                }
            }
            //return the height/width value
            return value; 
    }
    //create a method to generate the array filled with random numbers
    public static int [][] randomMatrix(int height,int width){
        //initialize the matrix with dimensions of height and width
        int matrix[][]=new int[height][width];
            //for the length of the matrix (width)
            for(int i=0; i<matrix.length; i++){
                //for the length of the column (length)
                for(int j=0; j<matrix[i].length; j++){
                    //place random numbers -10 to 10 in the array 
                    int number=(int)(Math.random()*21-10);
                    matrix[i][j]=number; 
                }
            }
            //return the matrix
            return matrix; 
    }
   //create a method to transpose the matrix 
   public static int [][] transposeMatrix(int[][] matrix, int height, int width){
       //initialize the transpose matrix as an array that flips the height and width
        int transpose[][]=new int[width][height];
        //for the values of the original matrix columns (transpose rows)
        for(int i=0; i<matrix[0].length; i++){
            //and the values of the original matrix rows (transpose columns)
            for(int j=0; j<matrix.length; j++){
                //make the values of the transpose matrix the flipped rows and columns of the original matrix 
                transpose[i][j]=matrix[j][i];
            }
        }
        //return the transpose
        return transpose; 
    }
}
