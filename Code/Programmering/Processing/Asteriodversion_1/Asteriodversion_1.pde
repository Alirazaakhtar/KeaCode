/** Asteroid The Game v **/

/* game state  
 0: start screen
 1: play game
 2: game over
 **/



int state=0;

int point = 0;

PImage background;
PImage startscreen;

ArrayList<Asteroid> asteroidList = new ArrayList <Asteroid>();
ArrayList <Laser> laserList = new ArrayList<Laser>();

SpaceShip theShip = new SpaceShip();


void setup ()
{
    size(600, 400);
    background = loadImage("SP.jpg");
    startscreen = loadImage("AS.png");

    theShip.init(width/2, height - 100);

    for (int i = 0; i < 15; i = i +1)
    {
        Asteroid tmpasteroid = new Asteroid();
        tmpasteroid.init();

        asteroidList.add(tmpasteroid);
    }
}


void draw () 
{
    if (state == 0)
    {
        welcomeScreen();
    } else if ( state == 1)
    {
        playGame ();
    } else if (state == 2)
    {
        gameOverScreen();
    }
}
void welcomeScreen()
{
    image(startscreen, 0, 0, 600, 400);
    textSize(20);
    text("Press button to play", 200, 200);
}

void gameOverScreen()
{
    background (20, 60, 80);
    textSize(20);
    text("GameOver", width/2, height/2);
      text("Points : " + point, 300, 200 + 40);
}

void playGame ()
{
    image(background, 0, 0, 600, 400);


    theShip.move();

    theShip.show();

    for (int i = 0; i <laserList.size(); i++)
    {
        Laser hentet_Laser = laserList.get(i);

        hentet_Laser.move();
        hentet_Laser.show();
    }



    for (int i = 0; i < asteroidList.size(); i = i +1) // rigtig måder = i ++ og i = i +1
    {
        // asteriodList.get(i).show();
        Asteroid hentet_asteroid = asteroidList.get(i);

        hentet_asteroid.move();
        hentet_asteroid.show();

        for ( int l = 0; l <laserList.size(); l++)
        {
            Laser checkLaser = laserList.get(l);

            if (checkLaser.y < 0)
            {
                laserList.remove(l);
            }

            if (dist(checkLaser.x, checkLaser.y, hentet_asteroid.x, hentet_asteroid.y) <hentet_asteroid.size/2)
            {
                // we hit an asteroid
                asteroidList.remove(i);
                laserList.remove(l);
                point = point + 1;
            }
        }


        // dist = længde
        if (dist( theShip.x, 
            theShip.y, 
            hentet_asteroid.x, 
            hentet_asteroid.y)  - hentet_asteroid.size / 2 < theShip.size / 2)  
        {
            println("BOOOOM");
            theShip.life = theShip.life - 1;

            if (theShip.life == 0)
            {
                state = 2;
            }

            asteroidList.remove(i); // fjener asteroiden fra listen
        }
    }
}

void keyPressed()
{
    if (state == 0)
    {
        state = 1;
    }
    if (key == 'w') // up
    {
        theShip.dirY  = -1; // down
    }
    if (key == 's')
    {
        theShip.dirY = 1; // left
    }
    if (key == 'a')
    {
        theShip.dirX = -1; //right
    }
    if (key == 'd')
    {
        theShip.dirX = 1;
    }
    if (key == ' ')
    {
        Laser shootingLaser = new Laser ();
        shootingLaser. init( theShip.x, theShip.y);
        laserList.add(shootingLaser);
    }
}

void keyReleased()

{
    if (key == 'w')
    {
        theShip.dirY = 0;
    }
    if (key =='s')
    {
        theShip.dirY = 0;
    }
    if (key =='a')
    {
        theShip.dirX = 0;
    }
    if (key =='d')
    {
        theShip.dirX = 0;
    }
}
