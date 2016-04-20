/*
here will put all the cars names and prices in 2D array
 */
package tourist_program;

import java.util.Scanner;

public class Cars 
{
    public static void cars(){
        Scanner input = new Scanner(System.in);
       System.out.println("chose whitch car you want?");
    String[][]cars = {{"car_name","GMC_Yukon","Toyota_Yaris","Hyundai"},{"size","7","5","5"},{"price","700","306","326.5"}};
    
//print 2D cars array
        for (int row=0; row<cars.length;row++) {
            for (int col=0;col<cars[row].length;col++)
                System.out.printf("%s  ",cars[row][col]);
            
            System.out.println();
        }
        String input_car =input.nextLine();
        }
}
