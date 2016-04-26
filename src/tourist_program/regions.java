/*
here select the city and country
 */
package tourist_program;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
public class regions
{
    Scanner input = new Scanner(System.in);
    String City;
    
  public String Country()
  {
      String input_country;
      ArrayList<String> country = new ArrayList<>();//array list of country
      country.add("France");
      country.add("United Kingdom");
      country.add("Turkey");
      JOptionPane.showMessageDialog(null,"here is the list of countries for you to Choose from ...");//display massge
      input_country = JOptionPane.showInputDialog(new JScrollPane(new JList(country.toArray())));//here custumer will choose country
      return input_country;
  }
      public void CityOrZip(String Country)//method to choose between city or zipCode
    {
        String choice;
        choice = JOptionPane.showInputDialog(null ,"Do you want to enter a city name or a zip code ?");
            if (choice.equalsIgnoreCase("Name")||choice.equalsIgnoreCase("City")||choice.equalsIgnoreCase("City Name"))
        {
            City = City(Country);
        }
        else if (choice.equalsIgnoreCase("Zip")||choice.equalsIgnoreCase("zip code")||choice.equalsIgnoreCase("code"))
        {
            if (Country.equalsIgnoreCase("France"))
            {
                City = City(1);
            }
            else if (Country.equalsIgnoreCase("United Kingdom"))
            {
                City = City(2);
            }
            else if (Country.equalsIgnoreCase("Turkey"))
            {
                City = City(3);
            }
        }
    }
    
  public String City(String Country)//method to choose city by name
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
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(France.toArray())));
       if (!(input_city.equalsIgnoreCase("Paris") || input_city.equalsIgnoreCase("Nice") || (input_city.equalsIgnoreCase("Lyon"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else if (Country.equalsIgnoreCase("United Kingdom"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(United_Kingdom.toArray())));
       if (!(input_city.equalsIgnoreCase("London") || input_city.equalsIgnoreCase("Edinburgh") || (input_city.equalsIgnoreCase("Liverpool"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else if (Country.equalsIgnoreCase("Turkey"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(Turkey.toArray())));
       if (!(input_city.equalsIgnoreCase("Istanbul") || input_city.equalsIgnoreCase("Uzungol") || (input_city.equalsIgnoreCase("Trabzon"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else
     {
       JOptionPane.showMessageDialog(null,"Sorry we don't have that country yet...");
       input_city = "";
       System.exit(0);
     }
      return input_city;
  }
  //polymorphism
  public String City(int Country)//method to choose city by zipCode
  { 
    String input_city;
    
    ArrayList<String> France = new ArrayList<>();
    ArrayList<String> United_Kingdom = new ArrayList<>();
    ArrayList<String> Turkey = new ArrayList<>();

    France.add("38242");
    France.add("95464");
    France.add("69006");

    United_Kingdom.add("WC2N");
    United_Kingdom.add("EH2");
    United_Kingdom.add("2170");

    Turkey.add("34000");
    Turkey.add("62610");
    Turkey.add("61830");
    
        switch (Country) {
            case 1:
                JOptionPane.showMessageDialog(null,"here is the list of zip code for you to Choose from ...");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(France.toArray())));
                 if (!(input_city.equalsIgnoreCase("38242") || input_city.equalsIgnoreCase("95464") || (input_city.equalsIgnoreCase("69006"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that zip code...");
            System.exit(0);
       }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"here is the list of zip code for you to Choose from ...");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(United_Kingdom.toArray())));
                if (!(input_city.equalsIgnoreCase("WC2N") || input_city.equalsIgnoreCase("EH2") || (input_city.equalsIgnoreCase("2170"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that zip code...");
            System.exit(0);
       }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"here is the list of zip code for you to Choose from ...");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(Turkey.toArray())));
               if (!(input_city.equalsIgnoreCase("34000") || input_city.equalsIgnoreCase("62610") || (input_city.equalsIgnoreCase("61830"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that zip code...");
            System.exit(0);
       }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Sorry we don't have that country yet...");
                input_city = "";
                System.exit(0);
        }
      return input_city;
  }
  
}
