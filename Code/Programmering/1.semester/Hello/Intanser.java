import java.util.Scanner;

public class Intanser {


public static void main (String[]args){



//navn giv scanner
Scanner myScanner = new Scanner(System.in);



/* når laver et objekt, så sætter vi en Reference og sætter reference lige 
med det objekt(klasse) det skal refererer til
*/
Bog minBog = new Bog();
//så har vi kaldt på klassen


System.out.println("Hvor mange sider skal der købes? ");

minBog.setSidetal(myScanner.nextInt());
minBog.setPris(15.95);

int sider = minBog.getSidetal();
double pris =  minBog.getPris() * sider;

System.out.println("Sider:" + sider );
System.out.println(" Samlet pris for antal sider " + pris + " kr");



}


}