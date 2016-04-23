
package tourist_program;



public class Print implements TouristArea 
{
    String Country,City,Car,Hotel,touristArea;
    public Print(String Country,String City,String Car, String Hotel)
    {
        this.Country = Country;
        this.City = City;
        this.Car = Car;
        this.Hotel = Hotel;
    }
    switch (city)
    {
    //France
    case "Paris": 
    touristArea = printParisTouristArea();
    break;
    case "Nice": 
    touristArea = printNiceTouristArea();
    break;
    case "Lyon": 
    touristArea = printLyonTouristArea();
    break;
    //United Kingdom
    case "London": 
    touristArea = printLondonTouristArea();
    break;
    case "Edinburgh": 
    touristArea = printEdinburghTouristArea();
    break;
    case "Liverpool": 
    touristArea = printLiverpoolTouristArea(); 
    break;
    //Turkey
    case "Istanbul": 
    touristArea = printIstanbulTouristArea();
    break;
    case "Uzungol": 
    touristArea = printUzungolTouristArea();
    break;
    case "Trabzon": 
    touristArea = printTrabzonTouristArea();
    break;     
}
    //France
    @Override
    public void printParisTouristArea(){
       System.out.println("Tourist Area in Paris:\n"
               + " -Eiffel tower\n -the louvre Museum\n -Paris panorama");
    }
    @Override
    public void printNiceTouristArea(){
        System.out.println("Tourist Area in Nice:\n"
               + " -Musee Marc Chagall\n -Cours Saleya\n -Paris panorama");
    }
    @Override
    public void printLyonTouristArea(){
        System.out.println("Tourist Area in Lyon:\n"
               + " -Lyon Cathedral\n -Mur des Canuts\n -Rue St-jean");
    }
    //United Kongdom
    @Override
    public void printLondonTouristArea(){
        System.out.println("Tourist Area in London:\n"
               + " -Palace of Westminster\n -London Eye\n -British Museum");
    }
    @Override
    public void printEdinburghTouristArea(){
        System.out.println("Tourist Area in Edinburgh:\n"
               + " -Loch Lomond\n -Royal Mile\n -Grassmarket");
    }
    @Override
    public void printLiverpoolTouristArea(){
        System.out.println("Tourist Area in Liverpool:\n"
               + " -Museum of Liverpool\n -Casbah Coffee  Club\n -Walker Art Gallery");
    }
    //Turkey
    @Override
    public void printIstanbulTouristArea(){
        System.out.println("Tourist Area in Istanbul:\n"
               + " -Grand Bazzar\n -Aya sofya\n -Blue Mosque");
    }
    @Override
    public void printUzungolTouristArea(){
        System.out.println("Tourist Area in Uzungol:\n"
               + " -Walk round the lake\n -Black lack\n -Fish farms");
    }
    @Override
    public void printTrabzonTouristArea(){
        System.out.println("Tourist Area in Trabzon:\n"
               + " -Avrupali Pazari\n -Kaymakli Monastery\n -Boztepe");
    }
    @Override
    public String toString()
    {
        return String.format(" Welcome to our ptogram\n Country: %s\n City: %s\n hotel: %s\n car: %s\n here some Touris area in your City:\n %s ",Country,City,Hotel,Car,touristArea);
    }
    }
