package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part2 extends TextProgram {

  /**
   * It is start method
   */
  public void run() {
    operation(readInt("Enter a number: "));
    println("The end.");
  }

  /**
   * Method performs data processing
   * @param num the input number
   */
  private void operation(int num) {
    while (! (num == 1)) {
      if (num % 2 == 0) num = even(num);
      else num = odd(num);
    }
  }

  /**
   * Method calculates even number
   * @param num input number
   * @return int the number past calculated
   */
  private int even(int num) {
    int result = num >> 1;
    println(num + " is even so I take half: " + result);
    return result;
  }

  /**
   * Method calculates odd number
   * @param num input number
   * @return int the number past calculated
   */
  private int odd(int num) {
    int result = 3*num + 1;
    println(num + " is odd so I make 3n + 1: " + result);
    return result;
  }
}
