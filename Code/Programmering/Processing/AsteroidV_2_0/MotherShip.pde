class MotherShip
{

    float x;
    float y;

    float dirX;
    float dirY;

    float speed =5;
    float size = 40; 

    int shield = 5; 


    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
    }


    void move()
    {
        x = x + dirX * speed ; // det dirX_Y som skaber bevægeslen 
        y = y + dirY * speed;

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
        rectMode(CENTER);
        // the mother ship

        noStroke();
        fill(255, 140, 0);
        rect(x, y, size * 0.65, size * 0.65); // vores ship

        noFill(); // ingen fylde på sjold
       stroke(255,255,0);
        strokeWeight(shield); // gør shield tykker
        ellipse(x, y, size, size);

        rectMode(CORNER);
    }
}
