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

    void init() // er næsten det samme som setup = noget der starter noget
    {
        x = random (0, width ); // får nogle tal inden for width
        y = random (0, height);

        dirX = random(-speed, speed);
        dirY = random(-speed, speed);

        size = random(minSize, maxSize);
    }

    void move()
    {
        x = x + dirX;
        y = y + dirY;

        if (x > width)
        {
            x=0;
        }

        if (x<0)
        {
            x = width;
        }
        if (y > height)
        {
            y = 0;
        }
        if (y < 0)
        {
            y = height;
        }
    }

    void show () // samme som draw
    {
        fill(194);

        noStroke();

        ellipse(x, y, size, size);
    }
}
