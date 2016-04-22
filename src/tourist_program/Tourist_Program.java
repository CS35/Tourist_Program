
package tourist_program;
import java.util.Scanner;

public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      String Country;
      String City;
      String Car;
      regions region = new regions();
      Country=region.Country();
      City = region.City(Country);
      
      //print hotels
      
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      
      SubHotels hotel = new SubHotels(City);
      hotel.printcity();
    }

}
