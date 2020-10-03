import java.util.Random;
public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
      Random dice_roll = new Random();
      int c = 0;
      for(int i = 0; i<10000; i++){
        int numOfSixes = 0;
        for(int a = 0; a<6; a++){
          int output = 0;
          output = dice_roll.nextInt(6) + 1;
          if(output == 6){
            numOfSixes++;
          }
        }
        if (numOfSixes >= 1){
          c++;
        }
      }
      double prob_six = ((double)c/10000)*100;
      return prob_six;
    }
    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    
      public static double probabilityTwoSixes() {
      Random dice_roll = new Random();
      int c = 0;
      for(int i = 0; i<10000; i++){
        int numOfSixes = 0;
        for(int a = 0; a<12; a++){
          int output = 0;
          output = dice_roll.nextInt(6) + 1;
          if(output == 6){
            numOfSixes++;
          }
        }
        if (numOfSixes >= 2){
          c++;
        }
      }
      double prob_six = ((double)c/10000)*100;
      return prob_six;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    
    public static double probabilityThreeSixes() {
      Random dice_roll = new Random();
      int c = 0;
      for(int i = 0; i<10000; i++){
        int numOfSixes = 0;
        for(int a = 0; a<18; a++){
          int output;
          output = dice_roll.nextInt(6) + 1;
          if(output == 6){
            numOfSixes++;
          }
        }
        if (numOfSixes >= 3){
          c++;
        }
      }
      double prob_six = ((double)c/10000)*100;
      return prob_six;
    }

    public static void main(String[] args) {
        System.out.println("Probability for one six (6 dice): " + probabilityOneSix() + " This has the greatest chance of success.");
        System.out.println("Probability for two sixes (12 dice): " + probabilityTwoSixes());
        System.out.println("Probability for three sixes (18 dice): " + probabilityThreeSixes());
    }
}
