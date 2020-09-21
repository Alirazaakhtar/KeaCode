PImage background;
PImage unicorn;
PImage moon;

// Vi laver de her variabler så vi ikke helt tiden behover at skrive tal, men istedet sæt disse ind



float moonX = -20;
float moonY = -20; 
float moveMoonX = 1;
float moveMoonY = 1; 

float unicornX = 0;
float unicornY = 150;
float dirX; 
float dirY;
float speed = 3;

void setup() {  


    size(500, 300);
    background = loadImage("background.jpg");
    unicorn = loadImage ("unicorn.png");
    moon = loadImage ("bluemoon.png");
}

void draw() { 

    image(background, 0, 0);

    // for at få unicorn i bevægelse 
   unicornX = unicornX + dirX;
  unicornY = unicornY + dirY;

    // få månen til at bevæge sig
    moonX = moonX + moveMoonX;
    if ( moonX > width)
    {
    moonX = 0;
    }

    image(unicorn, unicornX, unicornY, 80, 40);
    image(moon, moonX, moonY, 150, 150);
}




void keyPressed()
{
    

    if (keyCode == UP) // Up
    {
        dirY = -5.0;
    }

    if (keyCode == DOWN) // Down
    {
        dirY = 1.0;
    }

    if (keyCode == LEFT) // Left
    {
        dirX = -1.0;
    }

    if (keyCode == RIGHT) // right
    {
        dirX = 1.0;
    }

}

void keyReleased()
{
    if (keyCode == UP) // Up
    {
        dirY = 5;
    }

    if (keyCode == DOWN) // Down
    {
        dirY = 0;
    }

    if (keyCode == LEFT) // Left
    {
        dirX = 0;
    }

    if (keyCode == RIGHT) // right
    {
        dirX = 0;
    }
}
