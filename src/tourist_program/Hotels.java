
package tourist_program;

import java.util.Scanner;

public abstract class Hotels 
{
    String city;
    Scanner input = new Scanner(System.in);
    public Hotels(String City)
    {
        this.city = City;
    }
    
 
    public void printcity(){
    switch (city)
    {
    //France
    case "paris":
    case "Paris": 
    printParisHotel();
    break;
    case "nice":
    case "Nice": 
    printNiceHotel();
    break;
    case "lyon":
    case "Lyon": 
    printLyonHotel();
    break;
    //United Kingdom
    case "london":
    case "London": 
    printLondonHotel();
    break;
    case "edinburgh":
    case "Edinburgh": 
    printEdinburghHotel();
    break;
    case "liverpool":
    case "Liverpool": 
    printLiverpoolHotel();
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    printIstanbulHotel();
    break;
    case "uzungol": 
    case "Uzungol": 
    printUzungolHotel();
    break;
    case "trabzon": 
    case "Trabzon": 
    printTrabzonHotel();
    break;     
}
    }
    //France
    public void printParisHotel(){
    }
     public void printNiceHotel(){
    }
      public void printLyonHotel(){
    }
    //United Kingdom
      public void printLondonHotel(){
    }
      public void printEdinburghHotel(){
    }
      public void printLiverpoolHotel(){
    }
    //Turkey  
      public void printIstanbulHotel(){
    }
      public void printUzungolHotel(){
    }
      public void printTrabzonHotel(){
    }
 
}
