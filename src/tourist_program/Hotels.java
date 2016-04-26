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
    case "38242":
    hotel = printParisHotel();
    break;
    case "nice":
    case "Nice":
    case "95464":
    hotel = printNiceHotel();
    break;
    case "lyon":
    case "Lyon": 
    case "69006":
    hotel = printLyonHotel();
    break;
    //United Kingdom
    case "london":
    case "London":
    case "WC2N":
    hotel = printLondonHotel();
    break;
    case "edinburgh":
    case "Edinburgh": 
    case "EH2":
    hotel = printEdinburghHotel();
    break;
    case "liverpool":
    case "Liverpool": 
    case "2170":
    hotel = printLiverpoolHotel(); 
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    case "34000":
    hotel = printIstanbulHotel();
    break;
    case "uzungol": 
    case "Uzungol": 
    case "62610":
    hotel = printUzungolHotel();
    break;
    case "trabzon": 
    case "Trabzon": 
    case "61830":
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
