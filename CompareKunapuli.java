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
      return player2;
   }
   
   public ResultsKunapuli playRCS(String player1)
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
         gameresult = new JLabel("You lost");
     }
     
     // Create a new Result
     ResultsKunapuli result = new ResultsKunapuli(gameresult, choice);
     return result;
   }
}