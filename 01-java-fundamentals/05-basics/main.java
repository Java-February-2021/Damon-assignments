import java.util.*;

public class main {
     public static void main(String[] args) {

        //Print 1-255

        for (int i = 1; i < 256; i++) {
            System.out.println(i);
          }

        //Print odds
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1 ){
            System.out.println(i);
            }
          }
        //Print Sum
        int sum = 0;
        for ( int i = 1; i < 256; i++) {
            sum = sum + i;
            System.out.println("Number " + i + " Sum: " + sum);
        }


        //Interate through an Array
        int[] numList = {19, 12, 16, 200};
        
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }


        
        //max value of array
        

        //average of array
        double total = 0;
        for( int i = 0; i<numList.length; i++){
            total = total + numList[i];
        }
        double avg = total / numList.length;
        System.out.println("Average is: " + avg);
    
      
        //Array with Odd Numbers

        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 1; i < 256; i++) {
            if( i % 2 ==1 ){
                y.add(i);
            }
        }
            System.out.println(y);
        
    }
        //Greater Than Y
    public static int GreaterThanY(int[] arr, int y) {
	int count = 0;
	for(int num: arr) {
		if(num > y)
			count++;
		}
	System.out.println(count); 
	
        //Square the values
        //Eliminate Negative Numbers
        //Max, Min, and Average
        //Shifting the Values in the Array

    }
}
