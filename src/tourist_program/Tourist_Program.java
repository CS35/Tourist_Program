
package tourist_program;
import javax.swing.JOptionPane;
public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      String Country;
      String City;
      String Car,hotels;
      regions region = new regions();
      Country=region.Country();
      region.CityOrZip(Country);
      City = region.City;
      SubHotels hotel = new SubHotels(City);
      hotels = hotel.printcity();
      
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      
      Print print = new Print(Country,City,Car,hotels);
      JOptionPane.showMessageDialog(null,print);
      
    }

}
