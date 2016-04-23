
package tourist_program;

public class SubHotels extends Hotels 
{
    public SubHotels(String City)
    {
        super(City);
  
    }
    @Override
    public String printParisHotel(){
        String[][]parisHotel = {{"hotel name","Select Hotel","Elyees Union","Doisy Etoile"},{"price","787-1356","539-786","1742-3284"}};
        for (String[] arr:parisHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    @Override
     public String printNiceHotel(){
        String[][]niceHotel = {{"hotel name","Negresco Hotel","Beau Rivage","Brice Hotel"},{"price","1020-6416","561-1381","336-497"}};
        for (String[] arr:niceHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    @Override
      public String printLyonHotel(){
        String[][]lyonHotel = {{"hotel name","Alexandra","Republik Hotel","Fourviere Hotel"},{"price","361-591","344-400","608-1445"}};
        for (String[] arr:lyonHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    //United Kingdom
    @Override
      public String printLondonHotel(){
        String[][]londonHotel = {{"hotel name","The Montclam","Landmarket London","The Capital"},{"price","1735-2255","1478-5889","1392-2034"}};
        for (String[] arr:londonHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    @Override
      public String printEdinburghHotel(){
        String[][]edinburghHotel = {{"hotel name","Grassmarket Hotel","Abbey Hotel","The Bonham"},{"price","402-750","268-642","476-739"}};
        for (String[] arr:edinburghHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    @Override
      public String printLiverpoolHotel(){
        String[][]liverpoolHotel = {{"hotel name","Hatters Liverpool","Hanover Hotel","Hotelanfield"},{"price","80-600","405-614","314-542"}};
        for (String[] arr:liverpoolHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    //Turkey  
    @Override
      public String printIstanbulHotel(){
        String[][]istanbulHotel = {{"hotel name","Overland Residence","Lasagrada Hotel","Midtown Hotel"},{"price","382-2138","237-540","379-652"}};
        for (String[] arr:istanbulHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
    }
          input_hotel =input.nextLine();
          return input_hotel;
    }
    @Override
      public String printUzungolHotel(){
        String[][]uzungolHotel = {{"hotel name","Kulogu Hotel","Klipa Hotel","Kusva Apart"},{"price","275-424","313-534","148-212"}};
        for (String[] arr:uzungolHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
    }
         input_hotel =input.nextLine();
         return input_hotel;
    }
    @Override
      public String printTrabzonHotel(){
        String[][]trabzonHotel = {{"hotel name","Nur Hotel","TS Park Hotel","Horon Hotel"},{"price","212-340","271-392","208-339"}};
        for (String[] arr:trabzonHotel){ 
        for (String i : arr)
                System.out.printf("%s  ",i);
            
            System.out.println();
    }
         input_hotel =input.nextLine();
         return input_hotel;
    }
 
}

    

