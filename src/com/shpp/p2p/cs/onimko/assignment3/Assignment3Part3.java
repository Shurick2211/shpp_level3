package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part3 extends TextProgram {

  /**
   * It is start method, that print result
   */
  public void run() {
    println(
        "Result = " +
        raiseToPower(readDouble("Enter base: "), readInt("Enter power: "))
    );
  }

  /**
   * Method raises number (base) to power (exponent)
   * @param base the number, that will raise to power
   * @param exponent the number is the power to which the number must be raised
   * @return the result of calculation
   */
  private double raiseToPower(double base, int exponent) {
    if (exponent == 0) return 1;
    if (exponent > 0) return pow(base, exponent);
    return 1/pow(base, -exponent);
  }

  /**
   * Method raises number to power, where power > 0
   * @param base the number, that will raise to power
   * @param exponent the number is the power to which the number must be raised
   * @return the result of calculation
   */
  private double pow(double base, int exponent) {
    double result = 1;
    for (int i = 0; i < exponent; i++) result = result * base;
    return result;
  }
}
