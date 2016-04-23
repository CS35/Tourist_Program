
package tourist_program;

public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      String Country;
      String City;
      String Car,hotels;
      regions region = new regions();
      Country=region.Country();
      City = region.City(Country);
      //print hotels
      SubHotels hotel = new SubHotels(City);
      hotels = hotel.printcity();
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      //print report
      Print print = new Print(Country,City,Car,hotels);
      System.out.println(print);
      
    }

}
