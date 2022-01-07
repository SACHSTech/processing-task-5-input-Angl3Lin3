import processing.core.PApplet;

public class Sketch extends PApplet {

  public float x = 100;
  public float y = 290;
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(97, 195, 237);
  }

  public void draw() {

    stroke(7, 133, 32);
    fill(7, 133, 32);

    rect(0, 300, 400, 100);
	
  	if (mousePressed && (mouseButton == LEFT)) {

      stroke(225);
      fill(225);

      beginShape();
      vertex(mouseX, mouseY + 30);
      vertex(mouseX - 5, mouseY + 20);
      vertex(mouseX, mouseY + 10);
      vertex(mouseX + 5, mouseY + 20);
      endShape();
	  }

    if (keyPressed) {
      if (upPressed) {
        y--;
      }
      if (downPressed) {
        y++;
      }
      if (leftPressed) {
        x--;
      }
      if (rightPressed) {
        x++;
      }
      background(97, 195, 237);

      stroke(7, 133, 32);
      fill(7, 133, 32);
  
      rect(0, 300, 400, 100);
    }

    stroke(0);
    fill(0);

    square(x, y, 25);

	}

    public void mouseWheel() {
  
      background(7, 32, 82);

      stroke(225);
      fill(225);

      ellipse(mouseX, mouseY, 100, 100);

    }

    public void keyPressed() {
      if (keyCode == UP) {
        upPressed = true;
      }
      else if (keyCode == DOWN) {
        downPressed = true;
      }
      else if (keyCode == LEFT) {
        leftPressed = true;
      }
      else if (keyCode == RIGHT) {
        rightPressed = true;
      }
    }

      public void keyReleased() {
        if (keyCode == UP) {
          upPressed = false;
        }
        else if (keyCode == DOWN) {
          downPressed = false;
        }
        else if (keyCode == LEFT) {
          leftPressed = false;
        }
        else if (keyCode == RIGHT) {
          rightPressed = false;
        }
      }

  }
  
 
