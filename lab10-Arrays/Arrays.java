////////
//Steph Stieber
//9-17-15
//section 110
//Arrays java program
//arrays is a program that 

//importing the scanner class
import java.util.Scanner; 
//define class
public class Arrays {
    //define main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        String[] students; 
        int num_students= (int)(Math.random()*6)+5;
        students=new String[num_students];
        System.out.println("Enter "+num_students+" names: ");
        for(int i=0; i<num_students;i++){
            students[i]=myScanner.nextLine();
        }
        
        System.out.println("Here are the midterm grades for for the "+num_students+" students above");
        int [] midterm;
        midterm=new int[num_students];
        for(int i=0; i<num_students;i++){
            System.out.print(students[i]+": ");
            int grade=(int)(Math.random()*101);
            midterm[i]=grade;
            System.out.println(midterm[i]);
        }
        
    }
}
        
