/*
here will put all the cars names and prices in 2D array
 */
package tourist_program;

public class Cars 
{
    
    String[][] cars = {{"car name","GMC Yukon","Toyota Yaris","Hyundai"}
           ,{"size","7","5","5"}
           ,{"price","700","306","326.5"}};
    
//print 2D cars array
for(int row=0 ; row < cars.length ; row++){
        for (String car : cars[row]) {
            System.out.print(car);
        }
System.out.println();
}
}
