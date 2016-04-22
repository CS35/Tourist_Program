
package tourist_program;

import java.util.Scanner;

public abstract class Hotels 
{
    String city;
    String hotel;
    String input_hotel;
    Scanner input = new Scanner(System.in);
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
    public String printParisHotel(){
        return input_hotel;
    }
     public String printNiceHotel(){
         return input_hotel;
    }
      public String printLyonHotel(){
          return input_hotel;
    }
    //United Kingdom
      public String printLondonHotel(){
          return input_hotel;
    }
      public String printEdinburghHotel(){
          return input_hotel;
    }
      public String printLiverpoolHotel(){
          return input_hotel;
    }
    //Turkey  
      public String printIstanbulHotel(){
          return input_hotel;
    }
      public String printUzungolHotel(){
          return input_hotel;
    }
      public String printTrabzonHotel(){
          return input_hotel;
    }
 
}
