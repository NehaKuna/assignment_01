import java.*;
import java.awt.*;
import java.util.Scanner.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompareKunapuli
{
   public static String player1, player2, answer;
   public JFrame result;
   public JLabel gameresult,choice;
   public JPanel rPanel;
   
   public String compH(String x)
   {
      player1 = x;
      return player1;
   }
   
   public String playH(String x)
   {
      player2 = x;
      System.out.println("test");
      return player2;
   }
   
   public void playRCS(String player1)
   {
      CompGenKunapuli comput = new CompGenKunapuli();
      String player2 = comput.computerC;
      System.out.println(player2);

     if (player1.equals("ROCK") && player2.equals("ROCK"))
     {    
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("It's a tie");
     }
     else if (player1.equals("SCISSORS") && player2.equals("SCISSORS"))
     {    
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("It's a tie");
     }
     else if (player1.equals("PAPER") && player2.equals("PAPER"))
     {    
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("It's a tie");
     }
     else if(player1.equals("ROCK") && player2.equals("PAPER"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("You lost"); 
     }
     else if(player1.equals("PAPER") && player2.equals("ROCK"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("You won");
     }
     else if(player1.equals("ROCK") && player2.equals("SCISSORS"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult= new JLabel("You won");
     }
     else if(player1.equals("SCISSORS") && player2.equals("ROCK"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("You lost");
     }
     else if(player1.equals("PAPER") && player2.equals("SCISSORS"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult = new JLabel("You lost");
     }
     else if(player1.equals("SCISSORS") && player2.equals("PAPER"))
     {
         choice = new JLabel("You chose " + player1 + " and the computer chose " + player2);
         gameresult= new JLabel("You lost");
     }

     result = new JFrame("Result");
     rPanel = new JPanel();
      
     rPanel.setLayout(new BoxLayout(rPanel, BoxLayout.PAGE_AXIS));
     rPanel.add(gameresult);
     rPanel.add(choice);
     result.add(rPanel);
       
     result.setBackground(new Color(253, 153, 255));
     result.setSize(1500,1500);
     result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     result.setLocationRelativeTo(null);
     result.setVisible(true);
     
     //Add option to try again. Refer back to PlayerKunapuli class.
   }
}