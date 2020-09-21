
PImage background; 

Ball theBall = new Ball(); // her der laver vi en variable til tab(ball)


void setup ()
{
size(500,300);
background = loadImage("background.jpg");

theBall.init(); // kommer fra tab 2
}

void draw ()
{
image(background, 0, 0, width, height);
theBall.update();
theBall.display(); // kommer fra tab 2 



}
