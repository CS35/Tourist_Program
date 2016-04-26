/*
 cars names and prices in 2D array
 */
package tourist_program;

import java.util.Arrays;
//import java.util.Scanner;
import javax.swing.*;

public class Cars 
{
    public static String cars(){
     //Scanner input = new Scanner(System.in);
     String input_car;   
       JOptionPane.showMessageDialog(null,"choose which car do you wants?");
       String[][]cars = {{"name","size","price",},{"GMC Yukon","7","700$"},{"Toyota Yaris","5","306$"},{"Hyundai","5","326.5$"}};
    //print 2D cars array
    String output = "";
    for (int x = 0; x < cars.length; x++) {
        output += Arrays.toString(cars[x]) + "\n";
    }
    input_car = JOptionPane.showInputDialog(output); 
    //close program if customar choose out of range
    if (!(input_car.equalsIgnoreCase("GMC Yukon") || input_car.equalsIgnoreCase("Toyota Yaris") || (input_car.equalsIgnoreCase("Hyundai"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that car ...");
            System.exit(0);
       }
    return input_car;
}
}
        
    
