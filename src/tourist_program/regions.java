/*
here will be the switch statments used to select the city and contry
 */
package tourist_program;
import java.util.Scanner;
import java.util.ArrayList;
public class regions
{

    String input_city;
  // could make cities and contries into a list
  public void regions()
  {

    String input_country;
    Scanner input = new Scanner(System.in);
    ArrayList<String> country = new ArrayList<>();
    ArrayList<String> France = new ArrayList<>();
    ArrayList<String> United_Kingdom = new ArrayList<>();
    ArrayList<String> Turkey = new ArrayList<>();
    country.add("France");
    country.add("United Kingdom");
    country.add("Turkey");

    France.add("Paris");
    France.add("Nice");
    France.add("Lyon");

    United_Kingdom.add("London");
    United_Kingdom.add("Edinburgh");
    United_Kingdom.add("Liverpool");

    Turkey.add("Istanbul");
    Turkey.add("Uzungol");
    Turkey.add("Trabzon");

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
  public void Display(ArrayList<String> array)
{
  for (String x : array )
   {
    System.out.println(x);
   }
}
}
