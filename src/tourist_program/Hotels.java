
package tourist_program;

import java.util.Scanner;

public abstract class Hotels 
{
    String city;
    String hotel;
    String input_hotel;
    Scanner input = new Scanner(System.in);
    //constructor
    public Hotels(String City)
    {
        this.city = City;
    }
    public String printcity(){
    switch (city)
    {
    //France
    case "paris":
    case "Paris": 
    hotel = printParisHotel();
    break;
    case "nice":
    case "Nice": 
    hotel = printNiceHotel();
    break;
    case "lyon":
    case "Lyon": 
    hotel = printLyonHotel();
    break;
    //United Kingdom
    case "london":
    case "London": 
    hotel = printLondonHotel();
    break;
    case "edinburgh":
    case "Edinburgh": 
    hotel = printEdinburghHotel();
    break;
    case "liverpool":
    case "Liverpool": 
    hotel = printLiverpoolHotel(); 
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    hotel = printIstanbulHotel();
    break;
    case "uzungol": 
    case "Uzungol": 
    hotel = printUzungolHotel();
    break;
    case "trabzon": 
    case "Trabzon": 
    hotel = printTrabzonHotel();
    break;     
}
    return hotel;
    }
    //France
    public abstract String printParisHotel();
     public abstract String printNiceHotel();
      public abstract String printLyonHotel();
    //United Kingdom
      public abstract String printLondonHotel();
      public abstract String printEdinburghHotel();
      public abstract String printLiverpoolHotel();
    //Turkey  
      public abstract String printIstanbulHotel();
      public abstract String printUzungolHotel();
      public abstract String printTrabzonHotel();
 
}
