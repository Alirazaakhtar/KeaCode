
//viabler vi ikke piller ved.


Ball theBall;
Bat theBat;

void setup ()
{
    size(600, 400);

    theBall = new Ball();
    theBall.init(width/2, height/2);
    //theBall.size = 100;
    
    theBat = new Bat();
    theBat.init(10,height/2);
    
    
}

void draw ()
{
    background(244, 20, 50);
    
    theBall.show();
     theBall.move();
     
     theBat.show();
     theBat.move();
}
