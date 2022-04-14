import javax.swing.*;
import java.awt.*;
public abstract class state
{
   protected stateManager sm;
   protected state(stateManager sm)
   {
   this.sm = sm;
   initialize();
   
   }
   
   public abstract void initialize(); 
   public abstract void tick(); 
   public abstract void draw(Graphics g);
   public abstract void keyPressed(int k);
   public abstract void keyReleased(int k);
}