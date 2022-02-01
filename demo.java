
package part1;

import java.util.*;      // ADITYA KOCHAR E20CSE309

public class moviePrediction {
	public static void main(String args[]) {
		int x1 = 100;
		int y1 = 90;
		
		int x2 = 0;
		int y2 = 100;
							// X values notifies the value of Action Scenes of Train Dataset
		int x3 = 90;		// Y values notifies the value of Comedy Scenes of Train Dataset
		int y3 = 17;
		
		int x4 = 21;
		int y4 = 80;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The value of Action scenes ");
		int a1= sc.nextInt(); 										// A and B are values of Action and Comedy scenes value 
		System.out.println("Enter The value of Comedy scenes ");    // of Validation dataset given by User
		int b1= sc.nextInt(); 										
		
		double d1 = Math.sqrt(Math.pow((x1-a1), 2)+Math.pow((y1-b1), 2));
		double d2 = Math.sqrt(Math.pow((x2-a1), 2)+Math.pow((y2-b1), 2));		// Distance of a1 and b1 from different values of
		double d3 = Math.sqrt(Math.pow((x3-a1), 2)+Math.pow((y3-b1), 2));		// x and y of input Dataset
		double d4 = Math.sqrt(Math.pow((x4-a1), 2)+Math.pow((y4-b1), 2));
		
		System.out.println("The Distance d1 is "+d1);
		System.out.println("The Distance d2 is "+d2);
		System.out.println("The Distance d3 is "+d3);
		System.out.println("The Distance d4 is "+d4);
		
		double minimum = Math.min(Math.min(d1,d2),Math.min(d3,d4));  // Minimum vales of different distances
		
		if(d1==minimum) {
			if(x1>y1) {
				System.out.println("Action Movie");
			}
			else {
				System.out.println("Comedy Movie");
			}
		}
		else if(d2==minimum) {
			if(x2>y2) {
				System.out.println("Action Movie");
			}
			else {
				System.out.println("Comedy Movie");
			}														// In The Minimum value if x value is greater than Action movie 
		}															// and if y value greater than Comedy movie
		else if(d3==minimum) {
			if(x3>y3) {
				System.out.println("Action Movie");
			}
			else {
				System.out.println("Comedy Movie");
			}
		}
		else {
			if(x4>y4) {
				System.out.println("Action Movie");
			}
			else {
				System.out.println("Comedy Movie");
			}
		}
	
	}
	
}
