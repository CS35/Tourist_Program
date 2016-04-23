/*
here will put all the cars names and prices in 2D array
 */
package tourist_program;

import java.util.Scanner;

public class Cars 
{
    public static String cars(){
        Scanner input = new Scanner(System.in);
        
       System.out.println("--choose which car do you wants?");
    String[][]cars = {{"car name","GMC Yukon","Toyota Yaris","Hyundai"},{"size","7","5","5"},{"price","700","306","326.5"}};
    
        //print 2D cars array
        for (String[] arr:cars ){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        String input_car =input.nextLine();
        
    return input_car;
}
}
        
    
