class Asteroid
{

    float x;
    float y; 

    float dirX;
    float dirY;

    float speed = 2;

    int minSize = 25;
    int maxSize = 40;

    float size;








    void init()
    {
        x = random (0, width);
        y = random (0, height);
        
        dirX = random(-speed, speed);
        dirY = random(-speed, speed);

        size = random(minSize, maxSize);
    }


    void move()
    {
        x = x + dirX ;
        y = y + dirY;

        if ( x > width) 
        {
            x = 0;
        } else if (x < 0)
        {
            x = width;
        }

        if (y > height)
        {
            y = 0;
        } else if (y < 0)
        {
            y = height;
        }
    }

    void show()
    {
        fill(156, 50, 90);
        noStroke();
        image(asteroid, x, y, size, size);
        //ellipse(x, y, size, size);
    }
}
