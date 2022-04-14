import javax.swing.*;
import java.awt.*;

public class gameFrame extends JFrame
{
   public static void main(String[] args)
   {
   JFrame frame = new JFrame("Platformer");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new BorderLayout());
   frame.add(new Game(), BorderLayout.CENTER);
   frame.pack();
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   frame.setSize(850,650);
   }  
}