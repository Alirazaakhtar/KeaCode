// Some of the maths 

color C1 = #FF344F;
color C2 = color(255, 180, 0);

void setup ()
{
    
    println(red(C1));
    println(green(C1));
    println(blue(C1));
    
size (600, 400);

}

void draw ()
{
    // Colors range from 0 - 255
    // you can find your color in color selektor
background (C1);

//noStroke(); // fjerner kanterne 
strokeWeight(2); // giver kanterne farver, men man kan ikke når noStroke(); er der
stroke(1); // giver kanter på cirklen

strokeWeight(1);
stroke(0);
fill(40, 230, 20);
ellipse(100, 100, 50, 50);

strokeWeight(2);
stroke(0);
fill(40, 23, 202);
ellipse(200, 100, 50, 50);

ellipse(100, 200, 50, 50);

ellipse(200, 200, 50, 50);

}
