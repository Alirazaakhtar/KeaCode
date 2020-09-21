class Opponent2
{
 float x;
    float y; 

    float dirX;
    //float dirY;
    
    float speed = -2;
    
    float size;



    


    void init ()
    {
        x = random(width, width+300);
        y = 475;
        
        dirX = random(-10,-20);
        //dirY = speed;
        
        size = 60;


        opponent2 = loadImage("1_terrorist_1_Attack1_000.png");
    }

    void move()
    {
        x = x + dirX; 
       // y = y + dirY;
       if (x<0)
       {
       x = 0;
       }
       if (y >475)
       {
       y = 475;
       }

     
    }


    void show ()
    {
        image(opponent2, x, y, 70, 130 );
        //ellipse( x + 40, y + 40, size, size);        
        
    }
}
