/*
here will be the switch statments used to select the city and contry
 */
package tourist_program;
import java.util.Scanner;
public class regions
{
  // could make cities and contries into a list
  public String regions()
  {
    String input_country;
    String input_city;
    Scanner input = new Scanner(System.in);
    String country[] = new String[3];
    country[0]="China";
    country[1]="United Kingdom";
    country[2]="Turkey";
    for (String x : country)
    {
      System.out.println(x);
    }
    System.out.print("Choose a country:");
    input_country = input.nextLine();
    if (input_country.equalsIgnoreCase("China"))
     {
       return input_country;
     }
     if (input_country.equalsIgnoreCase("United Kingdom"))
     {
       return input_country;
     }
     else
     {
       return input_country;
     }

  }
  public void Display(String[] array)
{
  for (String x : array )
   {

  }

}
}
