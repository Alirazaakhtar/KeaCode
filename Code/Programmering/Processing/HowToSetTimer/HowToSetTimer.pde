// Timer eksempler

import processing.sound.*;

float timePassed;
float timeStamp;
SoundFile soundObj;
void setup()
{
    size(600, 400);
    soundObj = new SoundFile(this, "navn på filen.??");
}

void draw ()

{

    if (timePassed < 5000)
    {
        background(255, 0, 0);
    } else 
    {
        background(0);
    }

    timePassed = millis() -timeStamp/1000.0;
    println("millis;" + millis()+ "timeStamp:" + timeStamp); // viser tiden på programmet når den går igang
    println("timeBetween;" + (millis()-timeStamp));
}

void keyPressed()
{
    if (key == ' ')
    {
        soundObj.stop();
        timeStamp = millis();
    } else // check if we all ready playing
    {
        soundObj.play();
    }
}
