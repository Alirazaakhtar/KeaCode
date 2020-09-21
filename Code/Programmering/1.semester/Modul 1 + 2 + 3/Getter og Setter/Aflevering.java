public class Aflevering extends Bog{

// Da vi anvender extends, så har vi hentet alt hvad der var i bog klassen i denne klasse

int aflevering;





//metoder 

public void aflevering(int aflevering){

this.aflevering = aflevering;
}



@Override
// når man tilføjer noget yderligere til den klasse man har nedarvet fra

   public void showInfo(){
   
      System.out.println("Biblotek " + biblotek +" Info:\nName: " + name + "\nSider: " + sider + "\nPris: " + pris);

   
   }


}