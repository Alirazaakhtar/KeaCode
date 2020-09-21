class Opponent1
{
    float x;
    float y; 

    float dirX;
    float dirY;

    float size;

    float speed = -3;





    void init ()
    {
        x = random (width, width + 100);
        y = 460;

        dirX = random(speed);
        //dirY = speed;

        size = 60;


        opponent1 = loadImage("2_terrorist_2_Attack3_001.png");
    }

    void move()
    {
        x = x + dirX; 
        //y = y + dirY;
        // så de ikke falder ned ud fra skærmen
        if (y>460)
        {
            y = 460;
        }
        // venstre side blokeret for adgang 
        if (x<0)
        {
            x = 0;
        }
    }


    void show ()
    {
        image(opponent1, x, y, 70, 130 );
        //ellipse( x + 40, y + 60, size, size);  
      
    }
}
