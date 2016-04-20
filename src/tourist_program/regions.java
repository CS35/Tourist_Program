/*
here will be the switch statments used to select the city and contry
 */
package tourist_program;
import java.util.Scanner;
public class regions
{
  // could make cities and contries into a list
  public void regions()
  {

    String input_country;
    String input_city;
    Scanner input = new Scanner(System.in);
    String country[] = {"France","United Kingdom","Turkey"};
    String France[] = {"Paris","Nice","Lyon"};
    String United_Kingdom[] = {"London","Edinburgh","Liverpool"};
    String Turkey[]={"Istanbul","Uzungol","Trabzon"};

    System.out.println("here is the list of countries for you to Choose from ...");
    Display(country);
    System.out.print("Choose a country: ");
    input_country = input.nextLine();
    System.out.println("here is the list of cities for you to Choose from ...");

    if (input_country.equalsIgnoreCase("France"))
     {
       Display(France);
       System.out.print("Choose a city: ");
       input_city = input.nextLine();
     }
     else if (input_country.equalsIgnoreCase("United Kingdom"))
     {
       Display(United_Kingdom);
       System.out.print("Choose a city: ");
       input_city = input.nextLine();
     }
     else if (input_country.equalsIgnoreCase("Turkey"))
     {
       Display(Turkey);
       System.out.print("Choose a city: ");
       input_city = input.nextLine();
     }

  }
  public void Display(String[] array)
{
  for (String x : array )
   {
    System.out.println(x);
   }
}
}
