// make the program 
// bouncy ball aka. PONG 

int posX;
int posY;
int movingX;
int movingY;



void setup() 
{
  size(640, 480); // størrelsen på skærmen
  // hvis man gerne vil have bolden i midten af skærmen gør man således:
  posX = width/2;
  posY = height/2;
  movingX= 2;
  movingY= 2;
}

void draw()
{
  background(0);

  posX = posX + movingX;
  posY = posY + movingY;

  if (posX > width)
  {
    movingX = -2;
  }
  if (posX < 0)
  {
    movingX = 2;
    if (posY > mouseY-50 && posY <100+  mouseY+50) // når bolden rammer, så der står ramt. 
    {
      println("RAMT");
    } 
    
    else   // når bolden ikke rammer battet, så står der missed
    
    { 
      println("MISSED");
      posX=width/2;
      posY=height/2;
    }
  }
  if (posY <0)
  {
    movingY = 2;
  }
  if (posY > height)
  {
    movingY =-2;
  }

  ellipse(posX, posY, 50, 50); // bolden
  rect(0, mouseY-50, 20, 100, 7);
  rect(width-20, posY-50, 20, 100, 7);
}
