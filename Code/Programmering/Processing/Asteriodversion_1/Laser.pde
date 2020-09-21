class Laser

{
    // viabler
    float x;
    float y;

    float dirX; // direction
    float ditY;

    float size; // længden på laser
    float speed; 

    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
        size = 6;
        speed = 5;
    }

void move()
{
y = y -1 * speed;
}

    void show()
    {
        stroke(100,255,80);
        line(x, y, x, y - size);
    }
}
