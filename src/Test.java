
import javax.swing.JFrame;

public class Test{
  public static void main(String[]args){
    JFrame frame = new JFrame("Murracruise Limited");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ShipPanel primary = new ShipPanel();
    frame.getContentPane().add(primary);
    
    frame.pack();
    frame.setVisible(true);
  }
  
}