import java.*;
import java.awt.*;
import java.util.Scanner.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultsKunapuli
{
   public JLabel gameresult, choice;
   
   public ResultsKunapuli(JLabel gr, JLabel c)
   {
      gameresult = gr;
      choice = c;
   }
   
   public JLabel getChoice()
   {
      return choice;
   }
   
   public JLabel getGameResult()
   {
      return gameresult;
   }

}