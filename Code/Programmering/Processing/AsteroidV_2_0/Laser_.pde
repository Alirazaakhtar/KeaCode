// LASER SHOOTING

class Laser 
{
    float x; 
    float y; 

    float dirX;
    float dirY;

    float size;
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
        y = y - 1 * speed; 
        
    }

    void show()
    {
          strokeWeight(3);
        stroke(100, 255, 80);
        line(x, y, x, y-size);
    }
}
