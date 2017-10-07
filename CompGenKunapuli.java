public class CompGenKunapuli
{  
   public String computerC; //The end result of converting random integer to a string.
   
   public CompGenKunapuli() //Constructor that calls on the constructor getRandom.
   {
      getRandom();
   }

   public String getRandom() //Constructor that stores a random integer value in compHand and then converts to a string in computerC through if/else if/else statements.
   {
      int compHand = (int) (Math.random() * 3.0 + 1); //Stores a random integer between 1 through 3 to variable compHand.
      
      if (compHand == 1)
         {
            computerC = "ROCK";
            return computerC;
         }
       else if (compHand == 2)
         {
            computerC = "SCISSORS";
            return computerC;
         }
         else
            computerC = "PAPER";
            return computerC;
      
   }
}