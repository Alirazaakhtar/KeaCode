import processing.sound.*; // anvende import for at kunne tilføje lyd
SoundFile soundObj;

void setup()
{
    size(400,300);
    soundObj = new SoundFile(this, "navn på filen.??");
}

void draw () 

{
    background(0);
    text(soundObj.duration(), 20, 20);
}

void keyPressed()
{
    


    if (key == ' ')
    {
        soundObj.stop();
    } else // check if we all ready playing
    {
        soundObj.play();
    }
}
