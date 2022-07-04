package com.shpp.p2p.cs.onimko.assignment3;

import acm.util.RandomGenerator;
import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part5 extends TextProgram {

  //the total winnings
  int total = 0;

  /**
   * It is start method
   */
  public void run() {
    // counter games
    int count = 0;
    // play the game up to $20
    while (total < 20) {
      game();
      println("Your total is $"+total);
      count++;
    }
    println("It took "+count+" games to earn $20");
  }

  /**
   * Method, where plays game
   */
  private void game() {
    // the bet of "sweaty man"
    int sum = 1;
    // the game
    while(eagleAndTails()) sum = sum << 1;
    println("This game, you earned $" + sum);
    total += sum;
  }

  /**
   * Method imitates a coin
   * @return true - the eagle; false - the tails.
   */
  private boolean eagleAndTails() {
    return new RandomGenerator().nextBoolean();
  }

}
