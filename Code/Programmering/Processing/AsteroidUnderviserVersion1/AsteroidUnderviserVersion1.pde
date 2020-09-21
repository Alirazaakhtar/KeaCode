/*************************************
 *
 * Asteroid The Game v. 1
 *
 *************************************/

/*
    Game states : 
 
 0 : Start screen
 1 : Play game
 2 : Game over
 
 */

int state = 0;

int points = 0;

ArrayList<Asteroid> asteroidList = new ArrayList<Asteroid>();
ArrayList<Laser> laserList = new ArrayList<Laser>();

SpaceShip theShip = new SpaceShip();

void setup() {
    size( 600, 400 );

    theShip.init( width / 2, height - 100 );

    for ( int i = 0; i < 25; i = i + 1)  // 1: begyndelses værdi 2: grænsen for værdi i 3: hvor meget ændre vi i værdien
    {
        Asteroid en_asteroid = new Asteroid();
        en_asteroid.init();
        asteroidList.add(en_asteroid);
    }
}

void draw() {
    if (state == 0)
    {
        // Welcome screen
        welcomeScreen();
    } else if (state == 1)
    {
        // This is where the game is playing
        playGame();
    } else if (state == 2)
    {
        // End game screen
        gameOverScreen();
    }
}

/***************************************
 *
 * Screens
 *
 ***************************************/

void welcomeScreen() 
{
    background(0, 100, 0);
    textSize(20);
    text("Press button to start", width/2, height/2);
}

void gameOverScreen()
{
    background(100, 0, 100);
    textSize(20);
    text("Game Over", width / 2, height / 2);
    text("Points : " + points, width / 2, height / 2 + 40);
}

/***************************************
 *
 * T
 *
 ***************************************/


void playGame() {
    background(0);

    theShip.move();
    theShip.show();

    if ( asteroidList.size() == 0) {
        state = 2;
    }

    for ( int i = 0; i < laserList.size(); i++ ) {
        Laser hentet_Laser = laserList.get( i );

        hentet_Laser.move(); 
        hentet_Laser.show();
    }

    for ( int i = 0; i < asteroidList.size(); i++ )
    {
        Asteroid hentet_asteroid = asteroidList.get(i);

        hentet_asteroid.show();
        hentet_asteroid.move();

        for ( int l = 0; l < laserList.size(); l++ )
    
        {
            Laser checkLaser = laserList.get(l);

            if (checkLaser.y < 0) {
                laserList.remove(l);
            }

            if ( dist(
                checkLaser.x, 
                checkLaser.y, 
                hentet_asteroid.x, 
                hentet_asteroid.y ) < hentet_asteroid.size / 2 )
            {
                // We hit an asteroid
                asteroidList.remove(i);
                laserList.remove(l);
                points = points + 1;
            }
        }

        if ( dist(
            theShip.x, 
            theShip.y, 
            hentet_asteroid.x, 
            hentet_asteroid.y ) - hentet_asteroid.size / 2 < theShip.size / 2 )
        {
            println("BOOOOM");
            theShip.shields = theShip.shields - 1;

            if (theShip.shields == 0) {
                state = 2;
            }

            asteroidList.remove(i);
        }
    }
}

/***************************************
 *
 * Handling keys
 *
 ***************************************/

void keyPressed()
{
    if (state == 0) {
        state = 1;
    }

    if (keyCode == UP) // Up
    {
        theShip.dirY = -1.0;
    }

    if (keyCode == DOWN) // Down
    {
        theShip.dirY = 1.0;
    }

    if (keyCode == LEFT) // Left
    {
        theShip.dirX = -1.0;
    }

    if (keyCode == RIGHT) // right
    {
        theShip.dirX = 1.0;
    }

    if (key == ' ')
    {
        Laser shootingLaser = new Laser();
        shootingLaser.init( theShip.x, theShip.y );
        laserList.add(shootingLaser);
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
