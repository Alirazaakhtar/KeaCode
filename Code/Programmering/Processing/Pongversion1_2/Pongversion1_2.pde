

//This is Pong for noob to a master 
// semi kolan = command 
// være en god ide og lave nye versioner og fortæl hvad der er ændret,

// vi skal lave en variable, det vi siger er at posX skal indeholde hele tal
int posX;
int posY;
int stepX;
int stepY;
float robotY;
int score1 = 0; // man skriver 0 så man er sikker på at man starter på 0
int score2 = 0;




// setup run this once
void setup () 
{
  size(600, 400);
  posX = width/2; 
  posY = height/2; 
  stepX = 2; // for meget den skal bevvæge sig
  stepY = 3;
  robotY = 0;
 
 
}
// draw den går igennem 60 gange i sek hele tidem og gentager sig = run this each frame 
void draw() 
{
  background(0); // background skal altid være først, ellers vil den dække over for de andre coder. 
  
  posX = posX +stepX; // put det der er på højre side til venstre, det her kører ad sig selv, da posX er 0 og der bliver sat +1
  posY = posY + stepY;
  
  //bounce logic for x - HUSK ikke at sææte semi kolon op if statsment.
  if(posX > width) //rigth side og the screen 
  {
  stepX = -5;
  }
  if(posX < 0) //left side of the screen
  {
  stepX = 5;
  
  if (mouseY < posY && posY < mouseY+100) //
  {
    score1 = score1 + 1;
  println("ball hit" + score1);
  
  }
  else
  {
    score1 = score1 - 1;
  println("missed");
  // hvis bolden rammer under battet så misser man. 
  posX = width/2; 
  posY = height/2;
  }
  }
  
  
  if (posY > height) // bottom of the screen
  {
  stepY = -2;
  }
  if(posY < 0 ) // top of the screen 
  {
  stepY = 2;
  }
 
  
  
  
  
  
  
  ellipse(posX, posY, 30, 30);  //// for at lave en bold, a = x-akse  b=y-akse, c= brede  , d= højde
  rect(0, mouseY, 20, 100, 7);
  
  //robot player = først skriver du om det er float eller int og der efter sætter du en starts værdi på i setup
  robotY = robotY*0.98 + 0.02 * (posY -50); // sætter en hastighed
  rect(width-20, robotY, 20, 100, 7);
  
  text( score1, 200, 30); // hvad der skal stå på skærmen 
  text(score2, width-200, 30); 
 
  /*
print("x:"); 
  
println(posX); // println sætter dem i lodret række og man kan se variablerne. 
*/
}
