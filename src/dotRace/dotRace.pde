int dotX = 0;
Minim minim;
AudioSample sound;
void setup() {
    size(800, 200);
    minim = new Minim(this);
     sound = minim.loadSample("320905__suzenako__the-ding (1).wav");
}

void draw() {
   background (100,0,0);
   ellipse(dotX,100,100,100);
  //3. make it a nice color
    

    //4. if the mouse is pressed...
    if(mousePressed == true){
      dotX=dotX+50;
   }
    if(dotX>700){
    playSound();
    } 
   

    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    //6. Make your dot move really fast so that it can win the race 
       
    //7. Use this method to play a ding when your dot crosses the finish line. 

}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        
        sound.trigger();
        soundPlayed = true;
    }
}