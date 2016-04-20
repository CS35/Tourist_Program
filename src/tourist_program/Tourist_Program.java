
package tourist_program;
import java.util.Scanner;

public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      regions region = new regions();
      region.regions();
      //print hotels
      Print hotels = new Print();
      hotels.printcity();
      //print cars
      Cars cars = new Cars();
      Cars.cars();
    }

}
