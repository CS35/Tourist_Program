
package tourist_program;

public class SubHotels extends Hotels 
{
    public SubHotels(String City)
    {
        super(City);
  
    }
    public String printParisHotel(){
        String[][]parisHotel = {{"hotel name","Select Hotel","Elyees Union","Doisy Etoile"},{"price","787-1356","539-786","1742-3284"}};
        for (int row=0; row<parisHotel.length;row++) {
            for (int col=0;col<parisHotel[row].length;col++)
                System.out.printf("%s  ",parisHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
     public String printNiceHotel(){
        String[][]niceHotel = {{"hotel name","Hotel Negresco","Beau Rivage","Brice Hotel"},{"price","1020-6416","561-1381","336-497"}};
        for (int row=0; row<niceHotel.length;row++) {
            for (int col=0;col<niceHotel[row].length;col++)
                System.out.printf("%s  ",niceHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    @Override
      public String printLyonHotel(){
        String[][]lyonHotel = {{"hotel name","Alexandra","Republik Hotel","Fourviere Hotel"},{"price","361-591","344-400","608-1445"}};
        for (int row=0; row<lyonHotel.length;row++) {
            for (int col=0;col<lyonHotel[row].length;col++)
                System.out.printf("%s  ",lyonHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    //United Kingdom
    @Override
      public String printLondonHotel(){
        String[][]londonHotel = {{"hotel name","The Montclam","Landmarket London","The Capital"},{"price","1735-2255","1478-5889","1392-2034"}};
        for (int row=0; row<londonHotel.length;row++) {
            for (int col=0;col<londonHotel[row].length;col++)
                System.out.printf("%s  ",londonHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
      public String printEdinburghHotel(){
        String[][]edinburghHotel = {{"hotel name","Grassmarket Hotel","Abbey Hotel","The Bonham"},{"price","402-750","268-642","476-739"}};
        for (int row=0; row<edinburghHotel.length;row++) {
            for (int col=0;col<edinburghHotel[row].length;col++)
                System.out.printf("%s  ",edinburghHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
      public String printLiverpoolHotel(){
        String[][]liverpoolHotel = {{"hotel name","Hatters Liverpool","Hanover Hotel","Hotelanfield"},{"price","80-600","405-614","314-542"}};
        for (int row=0; row<liverpoolHotel.length;row++) {
            for (int col=0;col<liverpoolHotel[row].length;col++)
                System.out.printf("%s  ",liverpoolHotel[row][col]);
            
            System.out.println();
        }
        input_hotel =input.nextLine();
        return input_hotel;
    }
    //Turkey  
      public String printIstanbulHotel(){
        String[][]istanbulHotel = {{"hotel name","Overland Residence","Lasagrada Hotel","Midtown Hotel"},{"price","382-2138","237-540","379-652"}};
        for (int row=0; row<istanbulHotel.length;row++) {
            for (int col=0;col<istanbulHotel[row].length;col++)
                System.out.printf("%s  ",istanbulHotel[row][col]);
            
            System.out.println();
    }
          input_hotel =input.nextLine();
          return input_hotel;
    }
      public String printUzungolHotel(){
        String[][]uzungolHotel = {{"hotel name","Kulogu Hotel","Klipa Hotel","Kusva Apart"},{"price","275-424","313-534","148-212"}};
        for (int row=0; row<uzungolHotel.length;row++) {
            for (int col=0;col<uzungolHotel[row].length;col++)
                System.out.printf("%s  ",uzungolHotel[row][col]);
            
            System.out.println();
    }
         input_hotel =input.nextLine();
         return input_hotel;
    }
      public String printTrabzonHotel(){
        String[][]trabzonHotel = {{"hotel name","Nur Hotel","TS Park Hotel","Horon Hotel"},{"price","212-340","271-392","208-339"}};
        for (int row=0; row<trabzonHotel.length;row++) {
            for (int col=0;col<trabzonHotel[row].length;col++)
                System.out.printf("%s  ",trabzonHotel[row][col]);
            
            System.out.println();
    }
         input_hotel =input.nextLine();
         return input_hotel;
    }
 
}

    

