class Ninja 
{
    float x;
    float y; 

    float dirX;
    float dirY;
    
float size;

    float speed = 0;

    int shield = 5;

    void init (float inX, float inY)
    {
        x = inX;
        y = inY;

        dirX = speed;
        dirY = speed;
        
        size = 60;

        ninja = loadImage("3_terrorist_3_Attack1_000.png");
    }

    void move()
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


    void show ()
    {
        //strokeWeight(shield);
        image(ninja, x, y, 70, 130);
       // ellipse( x+40, y+60, size, size);
    }
}
