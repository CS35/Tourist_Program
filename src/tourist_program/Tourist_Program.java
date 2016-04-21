
package tourist_program;


public class Tourist_Program
{

    public static void main(String[] args)
    {//print cuntry and city
      regions region = new regions();
      region.regions();
      //print hotels
      Hotels hotel = new SubHotels();
      hotel.printcity();
      //print cars
      Cars cars = new Cars();
      cars.cars();
      
      
    }

}
