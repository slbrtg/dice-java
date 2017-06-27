import org.junit.*;
import static org.junit.Assert.*;

public class DiceTest {
  @Test

  public void checkForRandomSingleDiceRoll(){
    Dice dice1 = new Dice();
    boolean expectedOutput = true;
    boolean testEvaluator = true;
    int testedInput = dice1.roll();
    if ( testedInput == 0 || testedInput >= 7 ){
      testEvaluator = false;
    }
    assertEquals(expectedOutput, testEvaluator);
  }

  @Test

  public void checkForRandomDoubleDiceRoll(){
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    boolean expectedOutput = true;
    boolean testEvaluator = true;
    int testedInput = dice1.roll() + dice2.roll();
    if ( testedInput == 0 || testedInput >= 16 ){
      testEvaluator = false;
    }
    assertEquals(expectedOutput, testEvaluator);
  }
}
