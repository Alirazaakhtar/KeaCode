class SpaceShip
{
    float x;
    float y;

    float dirX;
    float dirY; 

    float speed = 3;

    float size = 50;

    int life = 5; // when this comes to zero we are game over





    void init (float inX, float inY)

    {
        x = inX;
        y = inY;
    }

    void move() // ship movement
    {
        x = x + dirX * speed;
        y = y + dirY * speed;

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

    void show()
    {
        rectMode(CENTER);
        fill(255, 40, 0);
        rect(x, y, size * 0.5, size * 0.5, 8);
        noFill(); /// ingen fyld på skjold
        stroke(255, 255, 0); //gul kant
        strokeWeight(life);
        ellipse(x, y, size, size); // tegn vores skjold
        rectMode(CORNER);
    }
}
