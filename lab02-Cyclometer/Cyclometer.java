///////////
//Steph Stieber
//9-4-15
//Lab 02
//Cyclometer Java Program

//  define a class
    public class Cyclometer{
    
//  add main method
    public static void main(String[] args) {
        
        int secsTrip1=480;  // time of trip 1 (seconds)
       	int secsTrip2=3220;  // time of trip 2 (seconds)
		int countsTrip1=1561;  // trip 1 wheel cycles
		int countsTrip2=9037; // trip 2 wheel cycles
		double wheelDiameter=27.0,  // diameter of wheel
  	        PI=3.14159, // value of pi  
  	        feetPerMile=5280,  // feet in 1 mile
  	        inchesPerFoot=12,   // inches in 1 foot
  	        secondsPerMinute=60;  // seconds in 1 minute
	    double distanceTrip1, distanceTrip2,totalDistance;  
	    // the distance of the entire trip (1 plus 2)

        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
       	      //tells us how many minutes and cycles trip 1 took
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      //tells us how many minutes and cycles trip 2 took
       	      
        //run the calculations; store the values. Document your
		//calculation here. 
		//

	    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	    //Above gives distance in inches
    	    //(for each count, a rotation of the wheel travels
    	    //the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; 
	    // Gives trip 1 distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2;
	    //above adds trip 1 and trip 2 in total miles 
	    
	//Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
           //prints the total distance of trip 1 in miles
	       System.out.println("Trip 2 was "+distanceTrip2+" miles");
	       //prints the total distance of trip 2 in miles
           System.out.println("The total distance was "+totalDistance+" miles");
           //prints theh total distance of trip 1 and 2 in miles
 
    }//end of main method
}//end of class