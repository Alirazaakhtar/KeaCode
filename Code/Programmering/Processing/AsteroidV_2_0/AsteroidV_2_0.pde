
ArrayList<Asteroid> asteroidList = new ArrayList <Asteroid>();
ArrayList<Laser> laserList = new ArrayList<Laser>();
MotherShip theShip = new MotherShip();

PImage background;

PImage AS;

PImage gameOver;

PImage asteroid;

int score = 0;

int state = 0;

int newAsteroidsWhenHit = 1;



/*
    Game states : 
 
 0 : Start screen
 1 : Play game
 2 : Game over
 
 */


void setup()
{
    size(600, 400);
    
background = loadImage("SP.jpg");
AS = loadImage("AS.png");
gameOver = loadImage("gameOver.png");
asteroid = loadImage("Asteroid.png");

    theShip.init(width / 2, height / 2 - 100);

 
   
        for (int i = 0; i<10; i= i +1) // 1: begyndelses værdi 2: grænsen for værdi i 3: hvor meget ændre vi i værdien
        {

            Asteroid a_asteroid = new Asteroid();
            a_asteroid.init();
            asteroidList.add(a_asteroid);
        }
   
}


void draw ()
{
    // startscreen
    if (state == 0 ) 
    {
        image(AS, 0, 0, 600, 400);
        textSize(30);
        text(("Press PLay 'p'"), 200, height/2 + 10);
        text("They Are Coming For You", 130, 30) ;
        if (mousePressed)
    {
    state = 1;
    }
    } 
    // Play game 
    else if (state ==1)

    {
        image(background, 0, 0);

        for (int  i = 0; i < asteroidList.size(); i++)
        {
            Asteroid hentet_Asteroid = asteroidList.get(i);

            hentet_Asteroid.show();
            hentet_Asteroid.move();

            // COLLISSION IMMINENT, CAPTAIN
            if ( dist(theShip.x, 
                theShip.y, 
                hentet_Asteroid.x, 
                hentet_Asteroid.y) < hentet_Asteroid.size/2 + theShip.size/2)

            {
                println("BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM");

                theShip.shield = theShip.shield -1;
                if (theShip.shield == 0)
            {
            state = 2;
            }
                
                
                asteroidList.remove(i);
            }

            for ( int l = 0; l <laserList.size(); l++)
            {
                Laser checkLaser = laserList.get(l);

                if (dist(
                    checkLaser.x, 
                    checkLaser.y, 
                    hentet_Asteroid.x, 
                    hentet_Asteroid.y) < hentet_Asteroid.size/2)
                {
                    // DESTORY ASTEROID
                    asteroidList.remove(i);
                    laserList.remove(l);
                    score = score +1;

                    // add asteroid
                    for (int a = 0; a < newAsteroidsWhenHit; a++)
                    {
                        Asteroid newAsteroid = new Asteroid();
                        newAsteroid.init ();
                        asteroidList.add(newAsteroid);
                    }
                }
            }
        }


        theShip.show();
        theShip.move();


        for ( int i = 0; i <laserList.size(); i ++)
        {
            Laser hentet_laser = laserList.get(i);
            hentet_laser.show();
            hentet_laser.move();

            if (hentet_laser.y < 0)
            {
                laserList.remove(i);
            }
        }
        text("score: " + score, width - 150, 30);
    } 

    // game over screen
    else if (state == 2 ) 
    {
        image(gameOver, 0, 0, 600, 400);
        textSize(30);
        text(("Press 'p' To Play Again"), 130, 380);
         text("score: " + score, 250, 40);
    }
}
void keyPressed()
{
    if (key == 'p') {
        if (state == 0 || state == 2)
        {
            theShip.shield = 5;
            score = 0;
            state = 1;
        }
    }

    if (keyCode == UP)
    {
        theShip.dirY = -1;
    }

    if (keyCode == DOWN)
    {
        theShip.dirY= 1;
    }


    if (keyCode == LEFT)
    {

        theShip.dirX = -1;
    }

    if (keyCode == RIGHT)
    {
        theShip.dirX = 1;
    }
    if (key == ' ')
    {
        Laser shootingLaser = new Laser();
        shootingLaser.init (theShip.x, theShip.y);
        laserList.add (shootingLaser);
    }
}

void keyReleased()
{
    if (keyCode == UP) // Up
    {
        theShip.dirY = 0;
    }

    if (keyCode == DOWN) // Down
    {
        theShip.dirY = 0;
    }

    if (keyCode == LEFT) // Left
    {
        theShip.dirX = 0;
    }

    if (keyCode == RIGHT) // right
    {
        theShip.dirX = 0;
    }
}
