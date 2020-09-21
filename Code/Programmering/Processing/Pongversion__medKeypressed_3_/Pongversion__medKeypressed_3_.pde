/* Pong version # 
 With state machine and better design 
 Day 2 */

PImage background;
PImage startside;
PImage win;
PImage loser;

int state = 0; 

int ballX = 0; // position of the ball
int ballY = 0;
int dirX; // direction of the ball
int dirY; 
int ballSpeed = 4; 
int ballSize = 10;
int batWidth = 20;
int batHeight = 100;
double robotY = 0; // betyder kan være en stor float
int score1 = 0;
int score2 = 0;

int bat1Y, bat2Y;
int bat1DirY, bat2DirX;
int batSpeed = 5;


void setup() 
{
    size(500, 300);
    background = loadImage("background.jpg");
    startside = loadImage("SS.jpg");
    win= loadImage("win.jpg");
    loser = loadImage("loser.jpg");
    resetBall();
    dirX = ballSpeed;
    dirY = ballSpeed;
    bat1Y = height/2 - batHeight/2;
    bat1DirY = 0;
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

    updateBat();

    updateBall(); //calculate ball position

    updateCu();  //.- update scores 

    showBall(); // display the bal 

    showScore();  // display the scores 

    showLine(); 

    checkWin();

    //rect(bat1X, bat1Y, 20, 50); 
    // human player 1 
    showBat(0, bat1Y);

    //robot player 2
    robotY = robotY * 0.91 + 0.09 * (ballY-batHeight);
    showBat(width-batWidth, (int)robotY);

    // All our pong code goes here
    // work out who wins and change the state
    // if player 1 wins, then state = 2;
} // end playGame

void showLine()

{
    stroke(255);
    /*
    line(width/2, 0, width/2,10 );
     line(width/2, 20, width/2,30 );
     line(width/2, 40, width/2,50 );
     */
    for (int lineY = 0; lineY < height; lineY = lineY + 20)
    {
        line(width/2, lineY, width/2, lineY+10);
    }
}

void checkWin()
{
    if (score1 == 5 || score2 == -5)
    {
        //player 1 wins
        score1 = 0;
        score2 = 0;
        state = 2;
    }

    if (score2 == 5 || score1 ==-5)
    {
        score1 = 0;
        score2 = 0;
        state = 2;
    }
}

void updateCu() 
{
    // left hand side
    if (ballX< 0 && ballY > bat1Y && ballY < bat1Y + batHeight)
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
    if (ballX > width && ballY > robotY && ballY < robotY + batHeight)
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
    text(score1, batWidth*2, 30);
    text(score2, width-batWidth*2, 30);
}


void showBall()
{
    ellipse(ballX, ballY, ballSize, ballSize);
}

void updateBat()
{
    bat1Y = bat1Y + bat1DirY;
    // same for player 2 = bat2Y
    if (bat1Y < 0) // top of the screen, so it cant get pas the screen
    {
        bat1Y = -0;
    }
    if (bat1Y + batHeight > height)
    {
        bat1Y = height - batHeight; // bottom of the screen
    }
}

void showBat(int x, int y)
{
    fill(200, 50, 100);
    noStroke(); // fjerner de hvide kanter
    rect(x, y, batWidth, batHeight, 10);
}

void updateBall()
{
    ballX = ballX + dirX;
    ballY = ballY + dirY;



// Denne kode er til når man gerne vil have at bolde ikke skal gå ud fra skærmen, hvor den rammer skærm kanten og ændre retning 

    if (ballX > width) // hvis ballx (500,?) bliver længere end skærm længden X (500, 300), så bliver der tilføjet dirY = -1, så den kører den modstatte retning.
    {
        dirX = -1 * ballSpeed; 
    }
    if (ballX < 0) // hvis ballX er mindre end skærm længden (0,0), altså går minus, så bliver dirX brugt til at give den en positiv retning
    {
        dirX = ballSpeed;
    }

    if (ballY > height) // 
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

    // welcome screen,
    image(startside, 0, 0);

    textSize(30);
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
    image(win, -50, 0);
    text("SINDS", 20, 30);

    text("tryk", 20, 50);
    if (mousePressed)
    {
        state=1;
    }
}


void showPlayer2Wins()
{
    image(loser, 0, 0);
    text("SINDS", 20, 20);
    text("Click to continue", 20, 40);
    if (mousePressed)
    {
        state=1;
    }
}

void keyPressed ()

{
    if (keyCode == UP)
    {
        // move player 1 up
        bat1DirY = -1 * batSpeed;
        println("w was pressed");
        println("if any key was pressed");
    }

    if (keyCode == DOWN)
    {
        bat1DirY = +1 * batSpeed;
    }
}

void keyReleased()
{
    if (keyCode == UP || keyCode == DOWN)
    {
        bat1DirY = 0;
    }
}
