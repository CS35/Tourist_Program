
package tourist_program;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      String Country;
      String City;
      String Car,hotels;
      String name,ID;
      int rerun = 1;
      do
              {
      name = JOptionPane.showInputDialog(null,"Please enter your name");
      ID = JOptionPane.showInputDialog(null,"Please enter your ID");
      
      regions region = new regions();
      Country=region.Country();
      region.CityOrZip(Country);
      City = region.City;
      SubHotels hotel = new SubHotels(City);
      hotels = hotel.printcity();
      
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      ArrayList<Customar> Customar = new ArrayList<>();
      Customar.add(new Customar(name,ID,Country,City,Car,hotels));
      JOptionPane.showMessageDialog(null,Customar);
      rerun ++;
              }while(rerun==2);
      
    }

}
