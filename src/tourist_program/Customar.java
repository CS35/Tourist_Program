/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourist_program;

import java.util.ArrayList;

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
        //this.TouristArea = TouristArea;
        SubArea TouristArea = new SubArea(City);
        TouristA = TouristArea.ChooseACity();
        
    }
    @Override
    public String toString()
    {
        return String.format(" ----------------------------------------------- \n Name: %s \n ID: %s \n ----------------------------------------------- \n "
                + "Welcome to our program\n Country: %s\n City: %s\n hotel: %s\n car: %s\n here some Tourist area in your City:\n %s \n "
                + "----------------------------------------------- ",Name,ID,Country,City,Hotel,Car,TouristA);
    }
    
}
