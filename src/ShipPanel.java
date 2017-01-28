




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShipPanel extends JPanel
{
  
  private static final long serialVersionUID = 1282524189019878272L;
  private JRadioButton C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12;
  public int CabCost;
  public Integer cab1Cost = new Integer(1000), cab2Cost = new Integer(1200), cab3Cost = new Integer(1200),
    cab4Cost = new Integer(1050), cab5Cost = new Integer(1400), cab6Cost = new Integer(6000), 
    cab7Cost = new Integer(1000),cab8Cost = new Integer(1200), cab9Cost = new Integer(1200), 
    cab10Cost = new Integer(1050), cab11Cost = new Integer(1400), cab12Cost = new Integer(6000);
  
  public ShipPanel()
  { 
    C1 = new JRadioButton("Cabin 11-1");
    C2 = new JRadioButton("Cabin 11-2");
    C3 = new JRadioButton("Cabin 11-3");
    C4 = new JRadioButton("Cabin 11-4");
    C5 = new JRadioButton("Cabin 11-5");
    C6 = new JRadioButton("Cabin 11-S11");
    C7 = new JRadioButton("Cabin 11-6");
    C8 = new JRadioButton("Cabin 11-7");
    C9 = new JRadioButton("Cabin 11-8");
    C10 = new JRadioButton("Cabin 11-9");
    C11 = new JRadioButton("Cabin 11-10");
    C12 = new JRadioButton("Cabin 11-S12");
    
    C1.setForeground(Color.white);
    C2.setForeground(Color.white);
    C3.setForeground(Color.white);
    C4.setForeground(Color.white);
    C5.setForeground(Color.white);
    C6.setForeground(Color.white);
    C7.setForeground(Color.white);
    C8.setForeground(Color.white);
    C9.setForeground(Color.white);
    C10.setForeground(Color.white);
    C11.setForeground(Color.white);
    C12.setForeground(Color.white);
    
    C1.setBackground(Color.blue);
    C2.setBackground(Color.blue);
    C3.setBackground(Color.blue);
    C4.setBackground(Color.blue);
    C5.setBackground(Color.blue);
    C6.setBackground(Color.blue);
    C7.setBackground(Color.blue);
    C8.setBackground(Color.blue);
    C9.setBackground(Color.blue);
    C10.setBackground(Color.blue);
    C11.setBackground(Color.blue);
    C12.setBackground(Color.blue);
    
    ButtonGroup cabin_group = new ButtonGroup();
    cabin_group.add(C1);
    cabin_group.add(C2);
    cabin_group.add(C3);
    cabin_group.add(C4);
    cabin_group.add(C5);
    cabin_group.add(C6);
    cabin_group.add(C7);
    cabin_group.add(C8);
    cabin_group.add(C9);
    cabin_group.add(C10);
    cabin_group.add(C11);
    cabin_group.add(C12);
    
    Seat_Listener the_cabin = new Seat_Listener();
    C1.addActionListener(the_cabin);
    C2.addActionListener(the_cabin);
    C3.addActionListener(the_cabin);
    C4.addActionListener(the_cabin);
    C5.addActionListener(the_cabin);
    C6.addActionListener(the_cabin);
    C7.addActionListener(the_cabin);
    C8.addActionListener(the_cabin);
    C9.addActionListener(the_cabin);
    C10.addActionListener(the_cabin);
    C11.addActionListener(the_cabin);
    C12.addActionListener(the_cabin);
    
    JPanel subPanel1 = new JPanel();
    subPanel1.setPreferredSize(new Dimension(100, 50));
    subPanel1.setBackground(Color.green);
    JLabel label1 = new JLabel("$" + cab1Cost);
    subPanel1.add(C1);
    subPanel1.add(label1);
    
    JPanel subPanel2 = new JPanel();
    subPanel2.setPreferredSize(new Dimension(100, 50));
    subPanel2.setBackground(Color.green);
    JLabel label2 = new JLabel("$" + cab2Cost);
    subPanel2.add(C2);
    subPanel2.add(label2);
    
    JPanel subPanel3 = new JPanel();
    subPanel3.setPreferredSize(new Dimension(100, 50));
    subPanel3.setBackground(Color.green);
    JLabel label3 = new JLabel("$" + cab3Cost);
    subPanel3.add(C3);
    subPanel3.add(label3);
    
    JPanel subPanel4 = new JPanel();
    subPanel4.setPreferredSize(new Dimension(100, 50));
    subPanel4.setBackground(Color.green);
    JLabel label4 = new JLabel("$" + cab4Cost);
    subPanel4.add(C4);
    subPanel4.add(label4);
    
    JPanel subPanel5 = new JPanel();
    subPanel5.setPreferredSize(new Dimension(100, 50));
    subPanel5.setBackground(Color.green);
    JLabel label5 = new JLabel("$" + cab5Cost);
    subPanel5.add(C5);
    subPanel5.add(label5);
    
    JPanel subPanel6 = new JPanel();
    subPanel6.setPreferredSize(new Dimension(100, 50));
    subPanel6.setBackground(Color.green);
    JLabel label6 = new JLabel("$" + cab6Cost);
    subPanel6.add(C6);
    subPanel6.add(label6);
    
    JPanel subPanel7 = new JPanel();
    subPanel7.setPreferredSize(new Dimension(100, 50));
    subPanel7.setBackground(Color.green);
    JLabel label7 = new JLabel("$" + cab7Cost);
    subPanel7.add(C7);
    subPanel7.add(label7);
    
    JPanel subPanel8 = new JPanel();
    subPanel8.setPreferredSize(new Dimension(100, 50));
    subPanel8.setBackground(Color.green);
    JLabel label8 = new JLabel("$" + cab8Cost);
    subPanel8.add(C8);
    subPanel8.add(label8);
    
    JPanel subPanel9 = new JPanel();
    subPanel9.setPreferredSize(new Dimension(100, 50));
    subPanel9.setBackground(Color.green);
    JLabel label9 = new JLabel("$" + cab9Cost);
    subPanel9.add(C9);
    subPanel9.add(label9);
    
    JPanel subPanel10 = new JPanel();
    subPanel10.setPreferredSize(new Dimension(100, 50));
    subPanel10.setBackground(Color.green);
    JLabel label10 = new JLabel("$" + cab10Cost);
    subPanel10.add(C10);
    subPanel10.add(label10);
    
    JPanel subPanel11 = new JPanel();
    subPanel11.setPreferredSize(new Dimension(100, 50));
    subPanel11.setBackground(Color.green);
    JLabel label11 = new JLabel("$" + cab11Cost);
    subPanel11.add(C11);
    subPanel11.add(label11);
    
    JPanel subPanel12 = new JPanel();
    subPanel12.setPreferredSize(new Dimension(100, 50));
    subPanel12.setBackground(Color.green);
    JLabel label12 = new JLabel("$" + cab12Cost);
    subPanel12.add(C12);
    subPanel12.add(label12);
    
    //JPanel primary = new JPanel();
   /* primary.*/setBackground(Color.blue);
    /*primary.*/add(subPanel1);
    /*primary.*/add(subPanel2);
    add(subPanel3);
    add(subPanel4);
    add(subPanel5);
    add(subPanel6);
    add(subPanel7);
    add(subPanel8);
    add(subPanel9);
    add(subPanel10);
    add(subPanel11);
    add(subPanel12);
    
    setBackground(Color.white);
    setPreferredSize(new Dimension(700,120));
    
  }//close panel method
  
  public int getCabCost(){
    return CabCost;
  }//closes method
  
    private class Seat_Listener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        Object source = event.getSource();
        if (source == C1){
          C1.setBackground(Color.red);
          CabCost = cab1Cost;
        }
        else if (source == C2){
          C2.setBackground(Color.red);
          CabCost = cab2Cost;
        }
        else if (source == C3){
          C3.setBackground(Color.red);}
        else if (source == C4){
          C4.setBackground(Color.red);}
        else if (source == C5){
          C5.setBackground(Color.red);}
        else if (source == C6){
          C6.setBackground(Color.red);}
        else if (source == C7){
          C7.setBackground(Color.red);}
        else if (source == C8){
          C8.setBackground(Color.red);}
        else if (source == C9){
          C9.setBackground(Color.red);}
        else if (source == C10){
          C10.setBackground(Color.red);}
        else if (source == C11){
          C11.setBackground(Color.red);}
        else if (source == C12){
          C12.setBackground(Color.red);}
  
      }//closes method
    }//closes private class
}//closes ShipPanel class