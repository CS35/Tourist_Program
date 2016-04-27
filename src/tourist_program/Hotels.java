/*
choose method of print Hotels
*/
package tourist_program;


public abstract class Hotels 
{
    String city;
    String hotel;
    String input_hotel;
    public Hotels(String City)
    {
        this.city = City;
    }
    //print hotel
    public String printcity(){
    switch (city)
    {
    //France
    case "paris":
    case "Paris":
    case "1":
    hotel = printParisHotel();
    break;
    case "nice":
    case "Nice":
    case "2":
    hotel = printNiceHotel();
    break;
    case "lyon":
    case "Lyon": 
    case "3":
    hotel = printLyonHotel();
    break;
    //United Kingdom
    case "london":
    case "London":
    case "01":
    hotel = printLondonHotel();
    break;
    case "edinburgh":
    case "Edinburgh": 
    case "02":
    hotel = printEdinburghHotel();
    break;
    case "liverpool":
    case "Liverpool": 
    case "03":
    hotel = printLiverpoolHotel(); 
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    case "001":
    hotel = printIstanbulHotel();
    break;
    case "uzungol": 
    case "Uzungol": 
    case "002":
    hotel = printUzungolHotel();
    break;
    case "trabzon": 
    case "Trabzon": 
    case "003":
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
