import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class NinjaFighter_V_1_1 extends PApplet {

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

public void setup()
{
    
    startbackground = loadImage("dead.jpg");
    ninjaBackground = loadImage ("Nbackground.jpg");
    gameOver = loadImage("gameOver.png");

    initGame();
}

public void draw ()

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


public void initGame()
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
public void welcomeScreen()
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
public void gameOverScreen()
{
    image(gameOver, 0, 0, 1200, 700);
    textSize(30);
    fill(255, 0, 0);
    textAlign( CENTER );
    text("Press 'p' To Play Again", width/2, height - 60);
    
    if (key == 'p')
    {
        state = 1;
        initGame();
    }
   
}

// the game
public void playGame ()
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

public void keyPressed ()
{
    if (state == 0)
    {
        state = 1;
    }


    if (keyCode == UP)
    {
        //if (theTerror.y > 300) {
        theNinja.dirY = -10.0f;
        //}
    }
    if (keyCode == LEFT)
    {
        theNinja.dirX = -5.0f;
    }
    if (keyCode == RIGHT)
    {
        theNinja.dirX = 5.0f;
    }
    if (key == ' ')
    {
        //Missile shot
        Missile fireMissile = new Missile();
        fireMissile.init (theNinja.x + collisionMissilex, theNinja.y + collisionMissiley);
        missileList.add (fireMissile);
    }
}


public void keyReleased()
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
class FloatingGround 
{

    float x;
    float y;

  

    public void init(float inX, float inY)
    {
        x = inX;
        y = inY;
        
        floating = loadImage("floating.jpg");
    }

    public void show()
    {

        image (floating, x, y, 5, 30);
    }
}
class Jet 
{
    float x;
    float y;

    float dirX;
    float dirY;

    float speed = -10;

    public void init ()
    {
        x = random(0, width-100);
        y = 50;

        dirX = speed;
        // dirY = speed;
        jet = loadImage("jet.png");
    }

    public void move ()
    {
        x = x + dirX;
        
        if(x<0)
        {
        x= width;
        }
    }

    public void show()
    {
        image(jet, x, y, 120, 60);
    }
}
class Missile
{

    float x; 
    float y; 

    float dirX;
    float dirY;

    float speed = 5;
    float size;



    public void init(float inX, float inY)
    {
        x = inX;
        y = inY;
        
        missile = loadImage("missile.png");
        
        size = 5;
      
    }

    public void move()
    {
        x = x +5 * speed;
    }

    public void show()
    {
      image(missile, x, y, 70, 25);  
        
    }
}
class Ninja 
{
    float x;
    float y; 

    float dirX;
    float dirY;
    
float size;

    float speed = 0;

    int shield = 10;

    public void init (float inX, float inY)
    {
        x = inX;
        y = inY;

        dirX = speed;
        dirY = speed;
        
        size = 60;

        ninja = loadImage("3_terrorist_3_Attack1_000.png");
    }

    public void move()
    {
        x = x + dirX; 
        y = y + dirY;

        if  ( x < 0) // left side screen
        {
            x = 0;
        }

        //&& x < width/2
        if (y > 465 ) // begrænsning på jorden
        {
            y = 465;
        }
        if (y<0)
        {
            y = 0;
        }
        if (y <400)
        {
        y = 400;
        }
    }


    public void show ()
    {
        //strokeWeight(shield);
        image(ninja, x, y, 70, 130);
       // ellipse( x+40, y+60, size, size);
    }
}
class Opponent1
{
    float x;
    float y; 

    float dirX;
    float dirY;

    float size;

    float speed = -3;





    public void init ()
    {
        x = random (width, width + 300);
        y = 460;

        dirX = random(-10,-20);
        //dirY = speed;

        size = 60;


        opponent1 = loadImage("2_terrorist_2_Attack3_001.png");
    }

    public void move()
    {
        x = x + dirX; 
        //y = y + dirY;
        // så de ikke falder ned ud fra skærmen
        if (y>460)
        {
            y = 460;
        }
        // venstre side blokeret for adgang 
        if (x<0)
        {
            x = 0;
        }
    }


    public void show ()
    {
        image(opponent1, x, y, 70, 130 );
        //ellipse( x + 40, y + 60, size, size);  
      
    }
}
class Opponent2
{
 float x;
    float y; 

    float dirX;
    //float dirY;
    
    float speed = -2;
    
    float size;



    


    public void init ()
    {
        x = random(width, width+300);
        y = 475;
        
        dirX = random(-10,-20);
        //dirY = speed;
        
        size = 60;


        opponent2 = loadImage("1_terrorist_1_Attack1_000.png");
    }

    public void move()
    {
        x = x + dirX; 
       // y = y + dirY;
       if (x<0)
       {
       x = 0;
       }
       if (y >475)
       {
       y = 475;
       }

     
    }


    public void show ()
    {
        image(opponent2, x, y, 70, 130 );
        //ellipse( x + 40, y + 40, size, size);        
        
    }
}
    public void settings() {  size(1200, 700); }
    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "--present", "--window-color=#000000", "--hide-stop", "NinjaFighter_V_1_1" };
        if (passedArgs != null) {
          PApplet.main(concat(appletArgs, passedArgs));
        } else {
          PApplet.main(appletArgs);
        }
    }
}
