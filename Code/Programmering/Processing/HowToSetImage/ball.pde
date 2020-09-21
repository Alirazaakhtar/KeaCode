class Ball
{
    int x, y;
    int dirX, dirY;
    PImage ballimg;

    void init ()
    {
        x= width/2;
        y= height/2;
        dirX = 1;
        dirY = 1;
        ballimg = loadImage("unicorn.png");
    }

    void update() {
        x = x + dirX;
        y = y + dirY;
    }

    void display()
    {
        image(ballimg, x, y, 80, 60);
    }
}
