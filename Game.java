import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements Runnable// KeyListener
{
   public static final int width = 850;
   public static final int height = 650;
   private stateManager sm;
   
   public Game()
   {
   setSize(850,650);
   start();
   }
   
   private Thread thread;
   private boolean running = false;
   private int fps = 60;
   private long target = 1000/fps;
   
   private void start()
   {
   running = true;
   thread = new Thread(this);
   thread.start();
   }
   
   public void run()
   {
   long start, elapsed, wait;
   sm = new stateManager();
   while(running)
      {
      start = System.nanoTime();
      
      tick();
      repaint();
      
      elapsed = System.nanoTime() - start;
      wait = target - elapsed/1000000;
      
      if(wait<=0)
         {
         wait = 5;
         }
      
      try
         {
         Thread.sleep(wait);
         }
      catch(Exception e)
         {
         e.printStackTrace();
         }   
      }
   }
   
   public void tick()
   {
   sm.tick();
   }
   
   public void paintComponent(Graphics g)
   {
   super.paintComponent(g);
   //g.fillRect(100,100,25,25);
   g.clearRect(0,0,width,height);
   sm.draw(g);
   }
   
   public void keyPressed(KeyEvent e)
   {
   sm.keyPressed(e.getKeyCode());
   }
   
   public void keyReleased(KeyEvent e)
   {
   sm.keyReleased(e.getKeyCode());
   }
   
   
   
}
