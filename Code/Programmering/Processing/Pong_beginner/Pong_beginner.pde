float posX = 100; 
float posY = 150;
float dirX = 2;
float dirY = 2;
float opponentY = 0; 
int score = 0;
int score1 = 0;



void setup() 
{
size(600, 400);

}


void draw()


{
  background(0);
  
  posX = posX +dirX; // lig med tegnet betyder at man tager det på højre sider og putter det ind på venstre.
  
  if(posX > width)
  {
    dirX = -10;
  }
 if(posX < 0)
 {
 
 if(posY > mouseY && posY < mouseY + 100) // within the bat
 {
 println("hit");
 dirX = 10;
 score = score +1;
 }
 else // above or below the bat 
{
println("missed");
posX = width/2;
posY = height/2;
score = score -1;
}
 }


 
 // x axis - ball
 
 {
 posY= posY +dirY;
 if (posY > height)
 {
 dirY = -2;
  }
  if(posY < 0)
  {
   dirY = 2; 
  }
  
  // opponent
  opponentY = opponentY * 0.99 + (posY-50)*0.01;
  rect(width-20,opponentY,20,100);
  text(score1,400,30);
  
  
  
  // Bat
  
  rect(0,mouseY, 20, 100);
  
 }
fill(255);
ellipse(posX, posY, 50, 50);
text(score,200,30);
}
