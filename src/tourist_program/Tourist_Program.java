
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
      
      //print cars
      Cars cars = new Cars();
      Car = Cars.cars();
      
      SubHotels hotel = new SubHotels(City);
      hotels = hotel.printcity();
      
      Print print = new Print(Country,City,Car,hotels);
      
    }

}
