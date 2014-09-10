int startX = (int)(Math.random()*300);
int startY = 150;
int endX; 
int endY;
int fade = 255;

void setup()
{
	size(300,300);
	strokeWeight (1);
	background(55);
  frameRate(50000);
}
void draw()
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
    endY = startY + (int)(Math.random()*10);
    line (startX, startY, endX, endY);
    startX = endX;
    startY = endY;
  }
}
void mousePressed()
{
	startX = mouseX;
	startY = 0;
}


