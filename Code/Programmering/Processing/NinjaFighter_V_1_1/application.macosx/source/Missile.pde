class Missile
{

    float x; 
    float y; 

    float dirX;
    float dirY;

    float speed = 5;
    float size;



    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
        
        missile = loadImage("missile.png");
        
        size = 5;
      
    }

    void move()
    {
        x = x +5 * speed;
    }

    void show()
    {
      image(missile, x, y, 70, 25);  
        
    }
}
