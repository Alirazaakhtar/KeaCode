public class Bog{

// det kun til GET
int sidetal;
double pris;

//Set metode
void setSidetal(int sidetal){
/*Vi sætter den til "this" så det den øverste variable man henvender til og sætter
den lige med sidetal ind i metoden, så den øverste variable bliver det samme som i metoden, så
man kan return den rigtig værdi.
*/
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