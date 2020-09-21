/* Pong version # 
 With state machine and better design 
 Day 2 */
 
 PImage background;

int state = 0; 

int ballX = 0; // position of the ball
int ballY = 0;
int dirX; // direction of the ball
int dirY; 
int ballSpeed = 5; 
int ballSize = 20;
int batWidth = 20;
int batHeigth = 100;
double robotY = 0; // betyder kan være en stor float
int score1 = 0;
int score2 = 0;

void setup() 
{
    size(500, 300);
    background = loadImage("background.jpg");
    
    resetBall();
    dirX = ballSpeed;
    dirY = ballSpeed;
}

void draw() 
{
    image(background, 0, 0);
    
    if (state== 0)
    {
        showIntro();
    } else if (state == 1)
    {
        playGame();
    } else if (state == 2)
    {
        showPlayer1Wins();
    } else if (state == 3) 
    {
        showPlayer2Wins();
    }
}
void playGame () 
{
    

    
    // calculate the bat 
    //collision detection
  
    // display the bal 
    //display the bats 
   

    updateBall(); //calculate ball position

    updateCu();  //.- update scores 

    showBall(); // display the bal 

    showScore();  // display the scores 

    //rect(bat1X, bat1Y, 20, 50); 
    // human player 1 
    showBat(0, mouseY);

    //robot player 2
    robotY = robotY *0.98 + 0.02 * (ballY-batHeigth);
    showBat(width-batWidth, (int)robotY);

    // All our pong code goes here
    // work out who wins and change the state
    // if player 1 wins, then state = 2;

    checkWin();
} // end playGame

void checkWin()
{
    if (score1 == 3 || score2 == -3)
    {
        //player 1 wins
        score1 = 0;
        score2 = 0;
        state = 2;
    }
    
    if(score2 == 3 || score1 ==-3)
    {
    score1 = 0;
    score2 = 0;
    state = 2;
    }
}

void updateCu() 
{
    // left hand side
    if (ballX< 0 && ballY > mouseY && ballY < mouseY + batHeigth)
    {
        score1 = score1 + 1;
        println("HIT left" + score1);
    } else if (ballX < 0)
    {
        println("ball missed left");
        score1 = score1 - 1;
        resetBall();
    }

    // rigth handside
    if (ballX > width && ballY > robotY && ballY < robotY + batHeigth)
    {
        score2 = score2+1;
    } else if (ballX > width)
    {
        score2 = score2 -1;
        resetBall();
    }
}


void showScore()
{
    text(score1, batWidth*2, 20);
    text(score2, width-batWidth*2, 20);
}


void showBall()
{
    ellipse(ballX, ballY, ballSize, ballSize);
}

void showBat(int x, int y)
{
    rect(x, y, batWidth, batHeigth, 10);
}

void updateBall()
{
    ballX = ballX + dirX;
    ballY = ballY + dirY;





    if (ballX > width)
    {
        dirX = -1 * ballSpeed;
    }
    if (ballX < 0)
    {
        dirX = ballSpeed;
    }

    if (ballY > height)
    {
        dirY = -1 * ballSpeed;
    }
    if (ballY < 0)
    {
        dirY = ballSpeed;
    }
}


void showIntro()
{

    // welcome screen
    background(100, 205, 50);
    text("Welcome to Pong", 20, 50);
    text("tryk for at fortsætte ", 20, 80);
    if (mousePressed)
    {
        state = 1;
    }
}


void resetBall ()
{
    ballX = width /2;
    ballY = height/2;
}


void showPlayer1Wins()
{
   
   // winner text
   background(100, 56, 98);
   text("SINDS", 20,20);
  
  text("tryk", 20, 40);
   if(mousePressed)
   {
   state=1;
   }
}


void showPlayer2Wins()
{
     background(100, 56, 98);
   text("SINDS", 20,20);
   text("tryk", 20, 40);
   if(mousePressed)
   {
   state=1;
   }
}
