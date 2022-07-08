package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part2 extends TextProgram {

  /**
   * It is start method
   */
  public void run() {
    println((Integer.MAX_VALUE - 1) / 3 * 2);
    operation(
            checkInput()
    );
    println("The end.");
  }

  /**
   * Method performs data processing
   * @param num the input number
   */
  private void operation(int num) {
    if (num > 0)
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

  /**
   * Method always return a valid number.
   * If input data is wrong - input repeat.
   * @return int number
   */
  private int checkInput() {
    int num = readInt("Enter a number: ");
    int max;
    if ( num > 0 && num % 2 == 1)
      max = (Integer.MAX_VALUE - 1) / 3;
    else max = (Integer.MAX_VALUE - 1) / 3 * 2;
    if (num < 1 || num > max) {
      println("Your number is wrong. Try again!");
      checkInput();
    }
    return num;
  }
}
