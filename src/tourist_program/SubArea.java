/*
implementation TouristArea method
*/

package tourist_program;

public class SubArea implements TouristArea 
{
    String City,touristArea;
    public SubArea(String City)
    {
        this.City = City;
    }
    //choose Torist area method by city
    public String ChooseACity()
    {
    switch (City)
    {
    //France
    case "paris":
    case "Paris":
    case "38242": 
    touristArea = printParisTouristArea();
    break;
    case "nice":
    case "Nice":
    case "95464":
    touristArea = printNiceTouristArea();
    break;
    case "lyon":
    case "Lyon": 
    case "69006":
    touristArea = printLyonTouristArea();
    break;
    //United Kingdom
    case "london":
    case "London":
    case "WC2N":
    touristArea = printLondonTouristArea();
    break;
    case "edinburgh":
    case "Edinburgh": 
    case "EH2":
    touristArea = printEdinburghTouristArea();
    break;
    case "liverpool":
    case "Liverpool": 
    case "2170":
    touristArea = printLiverpoolTouristArea(); 
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    case "34000":
    touristArea = printIstanbulTouristArea();
    break;
    case "uzungol": 
    case "Uzungol": 
    case "62610":
    touristArea = printUzungolTouristArea();
    break;
    case "trabzon": 
    case "Trabzon": 
    case "61830":
    touristArea = printTrabzonTouristArea();
    break;     
}
    return touristArea;
    }
    
    //France
    @Override
    public String printParisTouristArea(){
       return "Tourist Area in Paris:\n -Eiffel tower\n -the louvre Museum\n -Paris panorama";
    }
    @Override
    public String printNiceTouristArea(){
       return "Tourist Area in Nice:\n"
               + " -Musee Marc Chagall\n -Cours Saleya\n -Paris panorama";
    }
    @Override
    public String printLyonTouristArea(){
        return "Tourist Area in Lyon:\n"
               + " -Lyon Cathedral\n -Mur des Canuts\n -Rue St-jean";
    }
    //United Kongdom
    @Override
    public String printLondonTouristArea(){
        return "Tourist Area in London:\n"
               + " -Palace of Westminster\n -London Eye\n -British Museum";
    }
    @Override
    public String printEdinburghTouristArea(){
        return "Tourist Area in Edinburgh:\n"
               + " -Loch Lomond\n -Royal Mile\n -Grassmarket";
    }
    @Override
    public String printLiverpoolTouristArea(){
        return "Tourist Area in Liverpool:\n"
               + " -Museum of Liverpool\n -Casbah Coffee  Club\n -Walker Art Gallery";
    }
    //Turkey
    @Override
    public String printIstanbulTouristArea(){
        return "Tourist Area in Istanbul:\n"
               + " -Grand Bazzar\n -Aya sofya\n -Blue Mosque";
    }
    @Override
    public String printUzungolTouristArea(){
        return "Tourist Area in Uzungol:\n"
               + " -Walk round the lake\n -Black lack\n -Fish farms";
    }
    @Override
    public String printTrabzonTouristArea(){
        return "Tourist Area in Trabzon:\n"
               + " -Avrupali Pazari\n -Kaymakli Monastery\n -Boztepe";
    }
    }