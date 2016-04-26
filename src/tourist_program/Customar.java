/*
take customer information and print report
 */
package tourist_program;


public class Customar 
{
    String ID,Name;
    String Country,City,Car,Hotel;
    String TouristA;
    
    public Customar(String name,String ID,String Country,String City,String Car,String Hotel)
    {
        this.ID = ID;
        this.Name = name;
        this.Car = Car;
        this.City = City;
        this.Country = Country;
        this.Hotel = Hotel;
        SubArea TouristArea = new SubArea(City);
        TouristA = TouristArea.ChooseACity();
        
    }//print report
    @Override
    public String toString()
    {
        return String.format(" ----------------------------------------------- \n Name: %s \n ID: %s \n ----------------------------------------------- \n "
                + "Welcome to our program\n Country: %s\n City: %s\n Hotel: %s\n Car: %s\n Here some Tourist area in your City:\n %s \n "
                + "----------------------------------------------- ",Name,ID,Country,City,Hotel,Car,TouristA);
    }
    
}
