PImage startbackground;
PImage ninja;
PImage opponent1; 
PImage opponent2;
PImage missile; 
PImage jet;
PImage floating;
PImage ninjaBackground;
PImage gameOver;

int state = 0;

int score = 0;

int newOpponet1WhenHit = 2;
int newOpponet2WhenHit = 2;

// mange dobler opponent1
ArrayList<Opponent1> opponent1List ;
//opponent2
ArrayList<Opponent2> opponent2List ;
//flere fly
ArrayList<Jet> jetList;
// rocket skud
ArrayList<Missile> missileList = new ArrayList <Missile>();

Ninja theNinja = new Ninja();
Opponent1 theOpponent1 = new Opponent1();
Opponent2 theOpponent2 = new Opponent2();
Jet theJet = new Jet();
Missile theMissile = new Missile();

int collisionOffsetx = 40;
int collisionOffsety = 80;
int collisionMissilex = 40;
int collisionMissiley = 40;

void setup()
{
    size(1200, 700);
    startbackground = loadImage("dead.jpg");
    ninjaBackground = loadImage ("Nbackground.jpg");
    gameOver = loadImage("gameOver.png");

    initGame();
}

void draw ()

{ 
    if (state == 0)
    {
        // Welcome screen
        welcomeScreen();
    } else if (state == 1)
    {
        // This is where the game is playing
        playGame();
    } 
    else if (state == 2)
    {
        // End game screen
        gameOverScreen();     
    }
}


void initGame()
{

    opponent1List = new ArrayList <Opponent1>();
    opponent2List = new ArrayList <Opponent2>();
    jetList = new ArrayList <Jet>();
    theNinja.init(20, 465);
    //theOpponent1.init(width-170, 420);
    //theOpponent2.init(width-140, 420);
    //theJet.init(width-100, 50);


    // fordobler antallet Opponent1

    for (int i = 0; i < 3; i = i+1)
    {
        Opponent1 newOpponent1 = new Opponent1 ();
        newOpponent1.init();
        opponent1List.add(newOpponent1);
    }

    // mange doble Opponent2
    for (int l = 0; l < 3; l = l+1)
    {
        Opponent2 newOpponent2 = new Opponent2 ();
        newOpponent2.init();
        opponent2List.add(newOpponent2);
    }

    // mange dobler fly
    for (int j = 0; j < 3; j = j+1)
    {
        Jet newJet = new Jet ();
        newJet.init();
        jetList.add(newJet);
    }
}

// intro
void welcomeScreen()
{
    image(ninjaBackground, 0, 0, 1200, 800);
    textSize(100);
    text("NinjaFighter", width/2, height/2+250 );
    textSize(30);
    text("Click to start the game", 50, height/2+200);
    text("Press 'space' to shoot",50, height/2+230);
    text("Headshot for a kill", 50, height/2+260);
    

    if (mousePressed)
    {
        state = 1;
    }
}

//end
void gameOverScreen()
{
    image(gameOver, 0, 0, 1200, 700);
    textSize(30);
    fill(255, 0, 0);
    textAlign( CENTER );
    text("Press 'p' To Play Again", width/2, height - 60);
    
    if (key == 'p')
    {
        state = 0;
        playGame();
      
    }
   
}

// the game
void playGame ()
{
    image(startbackground, 0, 0, 1200, 700);

    theNinja.move();
    theNinja.show();

    if (opponent1List.size() == 0 && opponent2List.size() == 0 )
    {
        state = 2;
    }

    // mange doble fly

    for (int j = 0; j < jetList.size(); j = j+1)
    {
        Jet hentet_Jet = jetList.get(j);

        hentet_Jet.show();
        hentet_Jet.move();
    }

    // her man mange dobler opponent1
    for (int i = 0; i < opponent1List.size(); i = i+1)
    {
        Opponent1 hentet_Opponent1 = opponent1List.get(i);

        hentet_Opponent1.show();
        hentet_Opponent1.move();

        // COLLISSION with Opponent1
        if ( dist(theNinja.x + collisionOffsetx, 
            theNinja.y + collisionOffsety, 
            hentet_Opponent1.x + collisionOffsetx, 
            hentet_Opponent1.y + collisionOffsety) < hentet_Opponent1.size/2 + theNinja.size/2)
        {
            println("hit");
            theNinja.shield = theNinja.shield -1;

            if (theNinja.shield == 0)
            {
                state = 2;
            }
            opponent1List.remove(i);
        }

        for (int m = 0; m <missileList.size(); m++)
        {
            Missile checkMissile = missileList.get(m);

            if (dist(
                checkMissile.x + collisionOffsetx, 
                checkMissile.y + collisionOffsety, 
                hentet_Opponent1.x + collisionOffsetx, 
                hentet_Opponent1.y + collisionOffsety) < hentet_Opponent1.size/2)
            {
                // DESTORY OPPONENT1
                opponent1List.remove(i);
                missileList.remove(m);
                score = score +1;
                
                    // add Opponent
                 for (int a = 0; a < newOpponet1WhenHit; a++)
                 {
                 Opponent1 newOpponent1 = new Opponent1();
                 newOpponent1.init ();
                 opponent1List.add(newOpponent1);
                 }
                 
            }
        }
    }

    // mange dobler Opponent2
    for (int l = 0; l < opponent2List.size(); l = l+1)
    {
        Opponent2 hentet_Opponent2 = opponent2List.get(l);

        hentet_Opponent2.show();
        hentet_Opponent2.move();

        // COLLISSION with Opponent2
        if ( dist(theNinja.x + collisionOffsetx, 
            theNinja.y + collisionOffsety, 
            hentet_Opponent2.x + collisionOffsetx, 
            hentet_Opponent2.y + collisionOffsety) < hentet_Opponent2.size/2 + theNinja.size/2)

        {
            println("hit");
            theNinja.shield = theNinja.shield -1;

            if (theNinja.shield == 0)
            {
                state = 2;
            }

            opponent2List.remove(l);
        }

        for (int m = 0; m <missileList.size(); m++)
        {
            Missile checkMissile = missileList.get(m);

            if (dist(
                checkMissile.x + collisionOffsetx, 
                checkMissile.y + collisionOffsety, 
                hentet_Opponent2.x + collisionOffsetx, 
                hentet_Opponent2.y + collisionOffsety) < hentet_Opponent2.size/2)
            {
                // DESTORY OPPONENT1
                opponent2List.remove(l);
                missileList.remove(m);
                score = score +1;
                
                // add Opponent
                 for (int a = 0; a < newOpponet2WhenHit; a++)
                 {
                 Opponent2 newOpponent2 = new Opponent2();
                 newOpponent2.init ();
                 opponent2List.add(newOpponent2);
                 }
            }
        }
    }



    for ( int m = 0; m <missileList.size(); m ++)
    {
        Missile hentet_Missile = missileList.get(m);
        hentet_Missile.show();
        hentet_Missile.move();

        if (hentet_Missile.y > width)
        {
            missileList.remove(m);
        }
    }
    textAlign( LEFT );
    fill(0);
    text("Kills:" + score, 30, 30);
   
}

void keyPressed ()
{
    if (state == 0)
    {
        state = 1;
    }


    if (keyCode == UP)
    {
        //if (theTerror.y > 300) {
        theNinja.dirY = -10.0;
        //}
    }
    if (keyCode == LEFT)
    {
        theNinja.dirX = -5.0;
    }
    if (keyCode == RIGHT)
    {
        theNinja.dirX = 5.0;
    }
    if (key == ' ')
    {
        //Missile shot
        Missile fireMissile = new Missile();
        fireMissile.init (theNinja.x + collisionMissilex, theNinja.y + collisionMissiley);
        missileList.add (fireMissile);
    }
}


void keyReleased()
{

    if (keyCode == UP)
    {
        theNinja.dirY = 10;
    }

    if (keyCode == LEFT)
    {
        theNinja.dirX = 0;
    }
    if (keyCode == RIGHT)
    {
        theNinja.dirX = 0;
    }
}
