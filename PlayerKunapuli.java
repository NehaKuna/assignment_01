import java.*;
import java.awt.*;
import java.util.Scanner.*;
import java.awt.event.*;
import javax.GridBagConstraints;

public class PlayerKunapuli //implements ActiveListener
{
   public void PlayerTurn()
   {
      JFrame frame = new JFrame("Player");
      JPanel panel = new JPanel();
      
      panel.setLayout(new GridBagConstraints());
      JLabel label = new JLabel("Please pick one:");
      
      GridBagConstraints gbc = new GridBagConstraints();
      
      JButton button = new JButton();
      button.setText("Rock");
      gbc.fill = GridBagContraints.HORIZONTAL;
      gbc.weightx = 0.0;
      gbc.gridWidth = 2;
      gbc.gridX = 10;
      gbc.gridY = 10;
      panel.add(button);
      button.addActionListener(this);
      button.setActionCommand("Rock");
      
      frame.add(panel);
      frame.setBackground(new Color(0,0,0));
      frame.setSize(500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   /*public void actionPerformed(ActionEvent e)
   {
      Object game = e.getActionCommand();
      if (game.equals("Rock"))
         System.out.println(game);
      else if (game.equals("Scissors"))
         System.out.println(game);
      else
         System.out.println(game);
   }*/