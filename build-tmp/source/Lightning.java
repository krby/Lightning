import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = (int)(Math.random()*300);
int startY = 150;
int endX; 
int endY;
int fade = 255;

public void setup()
{
	size(300,300);
	strokeWeight (1);
	background(55);
  frameRate(10000);
}
public void draw()
{
  //make fade

  if (startY >= 200)
  {
    fill(0,0,0,10);
    stroke(0,0,0,10);
    rect(0,0,300,300);  
  }
  
	

  if (startY < 300) 
  {
    stroke(0,startX,startX);
    endX = startX + (int)((Math.random()*12)-6);
    endY = startY + (int)(Math.random()*5);
    line (startX, startY, endX, endY);
    startX = endX;
    startY = endY;
  }
}
public void mousePressed()
{
	startX = mouseX;
	startY = 0;
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
