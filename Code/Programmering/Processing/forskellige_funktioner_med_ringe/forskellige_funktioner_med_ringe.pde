void setup ()
{
    size(600, 400);

    noStroke(); // uden kant
}

void draw () 
{

    //delay (1000);


    println(frameCount);

    if (frameCount % 60 == 0) // modules 
{


        for (int i = width; i >= 0; i -= 40) // hvor mange ringe der skal laves
        {
            fill(
                random(0, 255), 
                random(0, 255), 
                random(0, 255)
                );

            //println(i);
            //delay(1000); // forsinker tiden 
            ellipse(width / 2, height/2, i, i);
        }
}

    // tal = tal + 20;
    // tal = tal - 9;

    // tal + = 20;
    // tal - = 9;
}
