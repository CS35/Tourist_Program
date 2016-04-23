/*
here will be the switch statments used to select the city and contry
 */
package tourist_program;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
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
      JOptionPane.showMessageDialog(null,"here is the list of countries for you to Choose from ...");
      input_country = JOptionPane.showInputDialog(new JScrollPane(new JList(country.toArray())));
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
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(France.toArray())));
     }
     else if (Country.equalsIgnoreCase("United Kingdom"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(United_Kingdom.toArray())));
     }
     else if (Country.equalsIgnoreCase("Turkey"))
     {
       JOptionPane.showMessageDialog(null,"here is the list of cities for you to Choose from ...");
       input_city=JOptionPane.showInputDialog(new JScrollPane(new JList(Turkey.toArray())));
     }
     else
     {
       JOptionPane.showMessageDialog(null,"Sorry we don't have that country yet...");
       input_city = "";
       System.exit(0);
     }
      return input_city;
  }
}
