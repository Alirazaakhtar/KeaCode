

//This is Pong for noob to a master 
// semi kolan = command 

// vi skal lave en variable, det vi siger er at posX skal indeholde hele tal
int posX;
int posY;
int stepX;
int stepY;




// setup run this once
void setup () 
{
  size(600, 400);
  posX = width/2; 
  posY = height/2; 
  stepX = 2; // for meget den skal bevvæge sig
  stepY = 3;
 
 
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
  stepX = -2;
  }
  if(posX < 0) //left side of the screen
  {
  stepX = 2;
  
  if (mouseY < posY && posY < mouseY+100) //
  {
  println("ball hit");
  }
  else
  {
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
  rect(width-20, posY-30, 20, 100, 7);
 
  /*
print("x:"); 
  
println(posX); // println sætter dem i lodret række og man kan se variablerne. 
*/
}
