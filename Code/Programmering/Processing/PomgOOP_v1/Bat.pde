class Bat 
{
    float x; 
    float y; 

    float dirX;
    float dirY; 

    float sizeX = 20;
    float sizeY = 100;


    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
    }

    void show()
    {
        rectMode(CENTER);
        rect(x + sizeX/2, y, sizeX, sizeY);
        rectMode(CORNER);
    }

    void move ()
    {

         y = mouseY;

        if (y - sizeY/2 < 0) 
        {
            y = sizeY/2;
        }
        if (y + sizeY/2 > height)
        {
        y = height - sizeY/2;
        }
    }
    
}
