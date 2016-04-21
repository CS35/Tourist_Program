
package tourist_program;

import java.util.Scanner;


public abstract class Hotels 
{
    Scanner input = new Scanner(System.in);
    regions region = new regions();
    String city = region.input_city;
    public Hotels(){
       //constractor 
    }
    public void printcity(){
    switch (city.substring(0, 1).toUpperCase())
    {
    //France
    case "Paris": 
    printParisHotel();
    break;
    case "Nice": 
    printNiceHotel();
    break;
    case "Lyon": 
    printLyonHotel();
    break;
    //United Kingdom
    case "London": 
    printLondonHotel();
    break;
    case "Edinburgh": 
    printEdinburghHotel();
    break;
    case "Liverpool": 
    printLiverpoolHotel();
    break;
    //Turkey
    case "Istanbul": 
    printIstanbulHotel();
    break;
    case "Uzungol": 
    printUzungolHotel();
    break;
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
