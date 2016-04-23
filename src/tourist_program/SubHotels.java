
package tourist_program;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class SubHotels extends Hotels 
{   
    public SubHotels(String City)
    {
        super(City);
  
    }
    @Override
    public String printParisHotel(){
        String[][]parisHotel = {{"name","price"},{"Select Hotel","787$-1356$"},{"Elyees Union","539$-786$"},{"Doisy Etoile","1742$-3284$"}};
    
        String output = "";
        for (String[] parisHotel1 : parisHotel) {
            output += Arrays.toString(parisHotel1) + "\n";
        }
    input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    @Override
     public String printNiceHotel(){
        String[][]niceHotel = {{"name","price"},{"Negresco Hotel","1020$-6416$"},{"Beau Rivage","561$-1381$"},{"Brice Hotel","336$-497$"}};
        String output = "";
        for (String[] niceHotel1 : niceHotel) {
            output += Arrays.toString(niceHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    @Override
      public String printLyonHotel(){
        String[][]lyonHotel = {{"name","price"},{"Alexandra","361$-591$"},{"Republik Hotel","344$-400$"},{"Fourviere Hotel","608$-1445$"}};
        String output = "";
        for (String[] lyonHotel1 : lyonHotel) {
            output += Arrays.toString(lyonHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    //United Kingdom
    @Override
      public String printLondonHotel(){
        String[][]londonHotel = {{"name","price"},{"The Montclam","1735$-2255$"},{"Landmarket London","1478$-5889$"},{"The Capital","1392$-2034$"}};
        String output = "";
        for (String[] londonHotel1 : londonHotel) {
            output += Arrays.toString(londonHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    @Override
      public String printEdinburghHotel(){
        String[][]edinburghHotel = {{"name","price"},{"Grassmarket Hotel","402$-750$"},{"Abbey Hotel","268$-642$"},{"The Bonham","476$-739$"}};
        String output = "";
        for (String[] edinburghHotel1 : edinburghHotel) {
            output += Arrays.toString(edinburghHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    @Override
      public String printLiverpoolHotel(){
        String[][]liverpoolHotel = {{"hotel name","price"},{"Hatters Liverpool","80$-600$"},{"Hanover Hotel","405$-614$"},{"Hotelanfield","314$-542$"}};
        String output = "";
        for (String[] liverpoolHotel1 : liverpoolHotel) {
            output += Arrays.toString(liverpoolHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
        return input_hotel;
    }
    //Turkey  
    @Override
      public String printIstanbulHotel(){
        String[][]istanbulHotel = {{"hotel name","price"},{"Overland Residence","382$-2138$"},{"Lasagrada Hotel","237$-540$"},{"Midtown Hotel","379$-652$"}};
        String output = "";
        for (String[] tanbulHotel : istanbulHotel) {
            output += Arrays.toString(tanbulHotel) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
          return input_hotel;
    }
    @Override
      public String printUzungolHotel(){
        String[][]uzungolHotel = {{"name","price"},{"Kulogu Hotel","275$-424$"},{"Klipa Hotel","313$-534$"},{"Kusva Apart","148$-212$"}};
        String output = "";
        for (String[] uzungolHotel1 : uzungolHotel) {
            output += Arrays.toString(uzungolHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
         return input_hotel;
    }
    @Override
      public String printTrabzonHotel(){
        String[][]trabzonHotel = {{"name","price"},{"Nur Hotel","212-340"},{"TS Park Hotel","271-392"},{"Horon Hotel","208-339"}};
        String output = "";
        for (String[] trabzonHotel1 : trabzonHotel) {
            output += Arrays.toString(trabzonHotel1) + "\n";
        }
        input_hotel = JOptionPane.showInputDialog(output);
         return input_hotel;
    }
 
}

    

