/***************************************
 *
 * SpaceShip Class
 *
 ***************************************/


class SpaceShip
{
    float x;
    float y;

    float dirX;
    float dirY; 
    
    float speed = 5;
    float size = 30;
    
    int shields = 5; // When this comes to zero we are game over :(
    
    void init(float inX, float inY)
    {
        x = inX;
        y = inY;
    }

    void move()
    {
        x = x + dirX * speed;
        y = y + dirY * speed;
        
        if (x > width) {
            x = 0;    
        }
        
        if (x < 0) {
            x = width;    
        }
        
        if (y > height) {
            y = 0;    
        }
        
        if (y < 0) {
            y = height;    
        }
    }

    void show() 
    {
        rectMode(CENTER);
        
        // Our Spaceship
        noStroke();  // No edge
        fill(255, 140, 0); // Color
        rect( x, y, size * 0.4, size * 0.4 ); // Draw the square 
        
        noFill(); // Ingen fyld på skjold
        stroke(255, 255, 0); // Gul kant på skjold
        strokeWeight(shields); // Kant er alt efter hvor meget skjold vi har tilbage

        ellipse( x, y, size, size ); // Tegn vores skjold
        
        rectMode(CORNER);
    }
}
