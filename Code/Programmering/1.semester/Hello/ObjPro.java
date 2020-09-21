import java.util.Scanner;

public class ObjPro {


public static void main (String[]args){

//Henter klasse og giver den en ny navn

Objekter objekt = new Objekter();

//laver en scanner ved navn lop
Scanner objektS = new Scanner(System.in);

Scanner scannerForLoop = new Scanner(System.in);


// Vi vil gerne have en motode ind
//objekt.loop(); her indsætter vi vores scanner "lop" og fortæller den hvilken datatype det skal være

objekt.loop(scannerForLoop.nextDouble());


int x = 0;
while (x <3){

System.out.println("Hvor mange sider skal du bruge?");

objekt.setSidetal(objektS.nextInt());



objekt.setPris(objekt.getSidetal() * 10); 
System.out.println("Prisen for antal sider bliver " + objekt.getPris() + " kr" );

x++;
}

/*
int x = objektS.nextInt();

System.out.println(x); 
*/
}


}