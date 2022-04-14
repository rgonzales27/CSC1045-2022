import java.awt.Rectangle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class player extends Rectangle
{
   private boolean right = false;
   private boolean left = false;
   private boolean jumping = false;
   private boolean falling = false;
   private int jumpspeed = 5;
   private int currentFspeed = 0;
   private int maxFspeed = 9;
   private int currentJspeed = jumpspeed;
   
   int x = 100;
   int y = 100;
   public player(int width, int height)
   {
   setBounds(x, y, width, height);
   }
   
   public void tick()
   {
   if(right)
      {
      x+=5;
      }
   if(left)
      {
      x-=5;
      }
   if(jumping)
      {
      y -= currentJspeed;
      currentJspeed -=1;
         if(currentJspeed <=0)
         {
         currentJspeed = jumpspeed;
         jumping = false;
         falling = true;
         } 
      }
   if(falling)
      {
      y+= currentFspeed;
      if(currentFspeed <maxFspeed)
         {
         currentFspeed+=1;
         }
      }
   }
   
   public void draw(Graphics g)
   {
   g.setColor(Color.BLUE);
   g.fillRect(x, y, width, height);
   }
   
   public void keyPressed(KeyEvent e)
   {
   if(e.getKeyCode() == KeyEvent.VK_D) 
      {
      right = true;
      }
   if(e.getKeyCode() == KeyEvent.VK_A) 
      {
      left = true;
      }
   if(e.getKeyCode() == KeyEvent.VK_W) 
      {
      jumping = true;
      }
   }
   
   public void keyReleased(KeyEvent e)
   {
   if(e.getKeyCode() == KeyEvent.VK_D) right = false;
   if(e.getKeyCode() == KeyEvent.VK_A) left = false;
   }
   
}