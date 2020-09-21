class Jet 
{
    float x;
    float y;

    float dirX;
    float dirY;

    float speed = -10;

    void init ()
    {
        x = random(0, width-100);
        y = 50;

        dirX = speed;
        // dirY = speed;
        jet = loadImage("jet.png");
    }

    void move ()
    {
        x = x + dirX;
        
        if(x<0)
        {
        x= width;
        }
    }

    void show()
    {
        image(jet, x, y, 120, 60);
    }
}
