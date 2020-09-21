class Ball
{
    float x;
    float y;
    
    float dirX = 2;
     float dirY = 2;
     
     float speed = 3;
    
    float size = 40; 

    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
    }

    void show()
    {
        ellipse(x,y, size, size);
    }
    void move()
    {
    x = x + dirX;
    
    }
}
