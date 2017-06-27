import java.util.Random;

public class Dice {
  public int numberRolled;

  public int roll(){
    Random randomNumber = new Random();
    numberRolled = randomNumber.nextInt(6) + 1;
    return numberRolled;
  }
}
