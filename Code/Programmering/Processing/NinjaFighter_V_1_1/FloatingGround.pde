class FloatingGround 
{

    float x;
    float y;

  

    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
        
        floating = loadImage("floating.jpg");
    }

    void show()
    {

        image (floating, x, y, 5, 30);
    }
}
