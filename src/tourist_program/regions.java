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
      country.add("(1) France");
      country.add("(2) United Kingdom");
      country.add("(3) Turkey");
      JOptionPane.showMessageDialog(null,"here is the list of countries for you to Choose from ... \n \n you could enter the country name or number");//display message
      input_country = JOptionPane.showInputDialog(new JScrollPane(new JList(country.toArray())));//here custumer will choose country
      if (!(input_country.equalsIgnoreCase("France") || input_country.equalsIgnoreCase("United Kingdom") || (input_country.equalsIgnoreCase("Turkey"))))
       {
           if (!(input_country.equalsIgnoreCase("1") || input_country.equalsIgnoreCase("2") || (input_country.equalsIgnoreCase("3"))))
           {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
           }
       }
      return input_country;
  }
      public void CityOrZip(String Country)//method to choose between city or zipCode
    {
        String choice;
        choice = JOptionPane.showInputDialog(null ,"Do you want to enter a city name or a number ?");
            if (choice.equalsIgnoreCase("Name")||choice.equalsIgnoreCase("City")||choice.equalsIgnoreCase("City Name"))
        {
            City = City(Country);
        }
        else if (choice.equalsIgnoreCase("a number")||choice.equalsIgnoreCase("number")||choice.equalsIgnoreCase("num"))
        {
            if (Country.equalsIgnoreCase("France")||Country.equals("1"))
            {
                City = City(1);
            }
            else if (Country.equalsIgnoreCase("United Kingdom")||Country.equals("2"))
            {
                City = City(2);
            }
            else if (Country.equalsIgnoreCase("Turkey")||Country.equals("3"))
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
    
    if (Country.equalsIgnoreCase("France")||Country.equals("1"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(France.toArray())));
       //stop the program if the user entered unknown values
       if (!(input_city.equalsIgnoreCase("Paris") || input_city.equalsIgnoreCase("Nice") || (input_city.equalsIgnoreCase("Lyon"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else if (Country.equalsIgnoreCase("United Kingdom")||Country.equals("2"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(United_Kingdom.toArray())));
       //stop the program if the user entered unknown values
       if (!(input_city.equalsIgnoreCase("London") || input_city.equalsIgnoreCase("Edinburgh") || (input_city.equalsIgnoreCase("Liverpool"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else if (Country.equalsIgnoreCase("Turkey")||Country.equals("3"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(Turkey.toArray())));
       //stop the program if the user entered unknown values
       if (!(input_city.equalsIgnoreCase("Istanbul") || input_city.equalsIgnoreCase("Uzungol") || (input_city.equalsIgnoreCase("Trabzon"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
            System.exit(0);
       }
     }
     else
     {
       JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
       input_city = "";
       System.exit(0);
     }
      return input_city;
  }
  //polymorphism
  public String City(int Country)//overload!! method to choose city by number
  { 
    String input_city;
    
    ArrayList<String> France = new ArrayList<>();
    ArrayList<String> United_Kingdom = new ArrayList<>();
    ArrayList<String> Turkey = new ArrayList<>();

   France.add("(1)Paris");
    France.add("(2)Nice");
    France.add("(3)Lyon");

    United_Kingdom.add("(01)London");
    United_Kingdom.add("(02)Edinburgh");
    United_Kingdom.add("(03)Liverpool");

    Turkey.add("(001)Istanbul");
    Turkey.add("(002)Uzungol");
    Turkey.add("(003)Trabzon");
    
        switch (Country) {
            case 1:
                JOptionPane.showMessageDialog(null,"here is the list of numbers for you to Choose from ... \n \n you could only enter the number");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(France.toArray())));
                //stop the program if the user entered unknown values
                 if (!(input_city.equalsIgnoreCase("1") || input_city.equalsIgnoreCase("2") || (input_city.equalsIgnoreCase("3"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that number...");
            System.exit(0);
       }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"here is the list of numbers for you to Choose from ...");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(United_Kingdom.toArray())));
                //stop the program if the user entered unknown values
                if (!(input_city.equalsIgnoreCase("01") || input_city.equalsIgnoreCase("02") || (input_city.equalsIgnoreCase("03"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that number...");
            System.exit(0);
       }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"here is the list of numbers for you to Choose from ...");
                input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(Turkey.toArray())));
                //stop the program if the user entered unknown values
               if (!(input_city.equalsIgnoreCase("001") || input_city.equalsIgnoreCase("002") || (input_city.equalsIgnoreCase("003"))))
       {
           JOptionPane.showMessageDialog(null,"Sorry we don't have a city with that number...");
            System.exit(0);
       }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Sorry we don't have that city yet...");
                input_city = "";
                System.exit(0);
        }
      return input_city;
  }
  
}
