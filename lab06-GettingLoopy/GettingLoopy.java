/*
Steph Stieber
10-2-15
section 110
lab 06
Getting Loopy java program
this program is practicing working with loops
*/

//define class
public class GettingLoopy{
    //define main method
    public static void main(String[] args) {
        int counter=1; 
        System.out.println("Step 1: ");
        while (counter<7){
            System.out.print(counter);
            counter++;
        }
        while (counter>=7 && counter<15){
            System.out.print(7);
            counter++;
        }
        System.out.print("\n");
        
        //Step 2
        //while loop
        counter=10; 
        System.out.println("Step 2: ");
        System.out.print("WHILE LOOP: \t");
        while (counter>=10 && counter<=100){
            if (counter%2!=0 && counter%3!=0 && counter%5!=0 && counter%7!=0){
                System.out.print(counter+" ");
            }
                counter++;
       }
       System.out.print("\n");
       
        //for loop
        counter=10;
        System.out.print("FOR LOOP: \t");
        for (counter=10; counter<=100; counter++){
            if (counter%2!=0 && counter%3!=0 && counter%5!=0 && counter%7!=0){
                System.out.print(counter+" ");
            }
        }
        System.out.print("\n");
           
        //do while loop
        counter=10;
        System.out.print("DO WHILE LOOP: \t");
        do {
            if (counter%2!=0 && counter%3!=0 && counter%5!=0 && counter%7!=0){
                System.out.print(counter+" ");    
            }
            counter++;
        } while(counter>=10 && counter<=100);
         System.out.print("\n");
        
        //step 3
        System.out.println("Step 3: ");
        counter=1; 
        int heart = (int)(Math.random()*196)+5;
        while (counter<=heart && counter<=20){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=40){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=60){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=80){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=100){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=120){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=140){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=160){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=180){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
        while (counter<=heart && counter<=200){
            System.out.print("<3 ");   
            counter++;
        }
        System.out.print("\n");
    }
}