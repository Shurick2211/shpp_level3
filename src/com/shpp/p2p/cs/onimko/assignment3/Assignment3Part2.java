package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part2 extends TextProgram {

  private final int N = 17;

  /**
   * It is start method
   */
  public void run() {
    operation(
            checkInput(readLine("Enter a number: "))
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
   * Method always return number of int.
   * If input data don't include digits - return 0.
   * @param str input data
   * @return int number
   */
  private int checkInput(String str) {
    String rez = "";
    for (char c:str.toCharArray()) {
      if(!Character.isDigit(c)) break;
      rez +=c;
    }
    return rez.equals("") ? 0 : Integer.parseInt(rez);
  }
}
