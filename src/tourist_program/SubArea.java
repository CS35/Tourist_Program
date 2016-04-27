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
    case "1": 
    touristArea = printParisTouristArea();
    break;
    case "nice":
    case "Nice":
    case "2":
    touristArea = printNiceTouristArea();
    break;
    case "lyon":
    case "Lyon": 
    case "3":
    touristArea = printLyonTouristArea();
    break;
    //United Kingdom
    case "london":
    case "London":
    case "01":
    touristArea = printLondonTouristArea();
    break;
    case "edinburgh":
    case "Edinburgh": 
    case "02":
    touristArea = printEdinburghTouristArea();
    break;
    case "liverpool":
    case "Liverpool": 
    case "03":
    touristArea = printLiverpoolTouristArea(); 
    break;
    //Turkey
    case "istanbul": 
    case "Istanbul": 
    case "001":
    touristArea = printIstanbulTouristArea();
    break;
    case "uzungol": 
    case "Uzungol": 
    case "002":
    touristArea = printUzungolTouristArea();
    break;
    case "trabzon": 
    case "Trabzon": 
    case "003":
    touristArea = printTrabzonTouristArea();
    break;     
}
    return touristArea;
    }
    
    //France
    @Override
    public String printParisTouristArea(){
       return "Tourist Area in Paris:\n "
               + "-Eiffel tower\n -the louvre Museum\n -Paris panorama \n "
               + "Here's a guide number if you need one: +33 1 79 35 01 16";
    }
    @Override
    public String printNiceTouristArea(){
       return "Tourist Area in Nice:\n"
               + " -Musee Marc Chagall\n -Cours Saleya\n -Paris panorama \n"
               + "Here's a guide number if you need one: +33 6 84 87 85 45";
    }
    @Override
    public String printLyonTouristArea(){
        return "Tourist Area in Lyon:\n"
               + " -Lyon Cathedral\n -Mur des Canuts\n -Rue St-jean \n"
                + "Here's a guide number if you need one: +33 06 14 42 84 41";
    }
    //United Kongdom
    @Override
    public String printLondonTouristArea(){
        return "Tourist Area in London:\n"
               + " -Palace of Westminster\n -London Eye\n -British Museum \n"
                + "Here's a guide number if you need one: +44 7941 809534";
    }
    @Override
    public String printEdinburghTouristArea(){
        return "Tourist Area in Edinburgh:\n"
               + " -Loch Lomond\n -Royal Mile\n -Grassmarket \n"
                + "Here's a guide number if you need one: +44 7899 878857";
    }
    @Override
    public String printLiverpoolTouristArea(){
        return "Tourist Area in Liverpool:\n"
               + " -Museum of Liverpool\n -Casbah Coffee  Club\n -Walker Art Gallery \n"
                + "Here's a guide number if you need one: 07918 655113";
    }
    //Turkey
    @Override
    public String printIstanbulTouristArea(){
        return "Tourist Area in Istanbul:\n"
               + " -Grand Bazzar\n -Aya sofya\n -Blue Mosque \n"
                + "Here's a guide number if you need one: +90 212 212 0621";
    }
    @Override
    public String printUzungolTouristArea(){
        return "Tourist Area in Uzungol:\n"
               + " -Walk round the lake\n -Black lack\n -Fish farms \n"
                + "Here's a guide number if you need one: 0462 656 60 21";
    }
    @Override
    public String printTrabzonTouristArea(){
        return "Tourist Area in Trabzon:\n"
               + " -Avrupali Pazari\n -Kaymakli Monastery\n -Boztepe \n"
                + "Here's a guide number if you need one:  05386450537";
    }
    }
