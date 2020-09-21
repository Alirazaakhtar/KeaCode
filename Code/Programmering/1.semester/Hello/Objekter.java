

public class Objekter {



int sidetal;
double pris;
/*
String bog;

public static void loop (double i){
for(double j = i; j <= 10; j++){
System.out.println(j);
}
}
*/
//Set metoder
void setSidetal(int sidetal){
this.sidetal = sidetal;
}

void setPris(double pris){
this.pris = pris;
}

//Get metode
int getSidetal(){
return sidetal;
}
double getPris (){
return pris;
}


}