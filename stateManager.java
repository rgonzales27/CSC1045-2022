import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class stateManager
{
   protected stateManager sm;
   public Stack<state> states;
   player p1 = new player(25,25);
   protected stateManager()
   {
   states = new Stack<state>();
   }
   
   
   public void tick()
   {
   p1.tick();
   }
   
   public void draw(Graphics g)
   {
   p1.draw(g);
   }
   
   public void keyPressed(int k)
   {
   p1.keyPressed(k);
   }
   
   public void keyReleased(int k)
   {
   p1.keyPressed(k);
   }
}