import java.*;
import java.awt.*;
import java.util.Scanner.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayerKunapuli extends JPanel implements ActionListener
{  
   public String pHand;
   public JFrame frame;
   
   public static void main(String [] args)
   {
           
      PlayerKunapuli demo = new PlayerKunapuli();
      demo.chooseHand();
   }
   
   public void chooseHand()
   {
      CompareKunapuli test = new CompareKunapuli();
      frame = new JFrame("Player");
      JPanel panel = new JPanel();
      
      panel.setLayout(new GridBagLayout());
      JLabel label = new JLabel("Please pick one:");
      panel.add(label);
      
      GridBagConstraints gbc = new GridBagConstraints();
      JButton button = new JButton();
      button.setText("ROCK");
      button.setPreferredSize(new Dimension(1000, 50));
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridwidth = 50;
      gbc.gridx = 10;
      gbc.gridy = 10;
      panel.add(button, gbc);
      button.addActionListener(this);
      button.setActionCommand("ROCK");
      
      GridBagConstraints bcg = new GridBagConstraints();
      JButton button2 = new JButton();
      button2.setText("SCISSORS");
      button2.setPreferredSize(new Dimension(1000, 50));
      bcg.fill = GridBagConstraints.HORIZONTAL;
      bcg.gridwidth = 50;
      bcg.gridx = 10;
      bcg.gridy = 70;
      panel.add(button2, bcg);
      button2.addActionListener(this);
      button2.setActionCommand("SCISSORS");
      
      GridBagConstraints cgb = new GridBagConstraints();
      JButton button3 = new JButton();
      button3.setText("PAPER");
      button3.setPreferredSize(new Dimension(1000, 50));
      cgb.fill = GridBagConstraints.HORIZONTAL;
      cgb.gridwidth = 50; 
      cgb.gridx = 10;
      cgb.gridy = 130;
      panel.add(button3, cgb);
      button3.addActionListener(this);
      button3.setActionCommand("PAPER");
      
      frame.add(panel);
      frame.setBackground(new Color(107, 178, 174));
      frame.setSize(1500,1500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }  
   public void actionPerformed(ActionEvent e)
   {
      CompareKunapuli info = new CompareKunapuli();
      
      String pHand = e.getActionCommand();
      if (pHand.equals("ROCK"))
      {
         System.out.println(pHand);
         info.playRCS(pHand);
         frame.setVisible(false);
      }
      else if (pHand.equals("SCISSORS"))
      {
         System.out.println(pHand);
         info.playRCS(pHand);
         frame.setVisible(false);
      }
      else if (pHand.equals("PAPER"))
      {
         System.out.println(pHand);
         info.playRCS(pHand);
         frame.setVisible(false);
      }
      else
      {
         System.out.println(pHand);
         info.playRCS(pHand);
         frame.setVisible(false);
      }
   }
}