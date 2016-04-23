/*
here will be the switch statments used to select the city and contry
 */
package tourist_program;
import java.util.Scanner;
import java.util.ArrayList;
public class regions
{
    Scanner input = new Scanner(System.in);
    
  public String Country()
  {
      String input_country;
      ArrayList<String> country = new ArrayList<>();
      country.add("France");
      country.add("United Kingdom");
      country.add("Turkey");
      System.out.println("here is the list of countries for you to Choose from ...");
      Display(country);
      System.out.print("--Choose a country: ");
      input_country = input.nextLine();
      return input_country;
  }
  public String City(String Country)
  { 
    String input_city;
    ArrayList<String> France = new ArrayList<>();
    ArrayList<String> United_Kingdom = new ArrayList<>();
    ArrayList<String> Turkey = new ArrayList<>();

    France.add("Paris");
    France.add("Nice");
    France.add("Lyon");

    United_Kingdom.add("London");
    United_Kingdom.add("Edinburgh");
    United_Kingdom.add("Liverpool");

    Turkey.add("Istanbul");
    Turkey.add("Uzungol");
    Turkey.add("Trabzon");
    
    if (Country.equalsIgnoreCase("France"))
     {
       System.out.println("here is the list of cities for you to Choose from ...");
       Display(France);
       System.out.print("--Choose a city: ");
       input_city = input.nextLine();
     }
     else if (Country.equalsIgnoreCase("United Kingdom"))
     {
       System.out.println("here is the list of cities for you to Choose from ...");
       Display(United_Kingdom);
       System.out.print("--Choose a city: ");
       input_city = input.nextLine();
     }
     else if (Country.equalsIgnoreCase("Turkey"))
     {
       System.out.println("here is the list of cities for you to Choose from ...");
       Display(Turkey);
       System.out.print("--Choose a city: ");
       input_city = input.nextLine();
     }
     else
     {
       System.out.println("Sorry we don't have that country yet...");
       input_city = "";
       System.exit(0);
     }
      return input_city;
  }
  public void Display(ArrayList<String> array)
{
  for (String x : array )
   {
    System.out.print(x+"\t");
   }
  System.out.println();
}
}
