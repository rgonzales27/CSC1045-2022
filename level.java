import javax.swing.*;
import java.awt.*;
public class level extends state
{
   private player p1;
   public level(stateManager sm)
   {
   super(sm);
   }

   public void initialize()
   {
   p1 = new player(25,25);
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
   p1.keyReleased(k);
   }

}