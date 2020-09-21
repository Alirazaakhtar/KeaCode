int posX;
int posY; 
int movingX; 
int movingY; 
int score = 0;
int score1 = 0;

void setup() 
{
size(600, 400);
posX = width/2; 
posY = height/2;
movingX = 2; 
movingY= 2;
}


void draw() 
{

  background(100,200,100);
  
  posX = posX + movingX;
  posY = posY + movingY; 
  
  if(posX > width) 
  {
  movingX = -10;
  }
  if (posX <0)
{
movingX = 10; 
if (posY > mouseY-50 && posY <100+ mouseY+50)
{
println("yallah");
score = score + 1;
}
else
{
println("hjem hjem");
posX = width/2;
posY = height/2;
score = score -1;
}
}
if(posY > height)
{
movingY = -2;
}
if (posY <0)
{
movingY = 2;
}


  
ellipse(posX, posY, 30, 30);
rect(0, mouseY, 20, 100, 10);
text(score,200, 30);
rect(width-20, posY-50, 20, 100, 10);
text(score1,400, 30);
}
