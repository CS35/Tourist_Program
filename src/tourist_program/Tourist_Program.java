
package tourist_program;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Tourist_Program
{

    public static void main(String[] args)
    {
      //ask abut customar information
      String Country;
      String City;
      String Car,hotels;
      String name,ID;
      int rerun = 1;
      do
              {
      name = JOptionPane.showInputDialog(null,"Please enter your name");
      if ("".equals(name))
           {
           JOptionPane.showMessageDialog(null,"You Did not enter a name");
            System.exit(0);
           }
      ID = JOptionPane.showInputDialog(null,"Please enter your ID");
      if ("".equals(ID))
           {
           JOptionPane.showMessageDialog(null,"You Did not enter your ID");
            System.exit(0);
           }
      //print country and city
      regions region = new regions();
      Country=region.Country();
      region.CityOrZip(Country);
      City = region.City;
      //print hotels
      SubHotels hotel = new SubHotels(City);
      hotels = hotel.printcity();
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      //print report
      ArrayList<Customar> Customar = new ArrayList<>();
      Customar.add(new Customar(name,ID,Country,City,Car,hotels));
      JOptionPane.showMessageDialog(null,Customar);
      rerun ++;
              }while(rerun==2);//run program 2 time
      
    }

}
