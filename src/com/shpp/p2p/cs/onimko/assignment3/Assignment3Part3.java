package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part3 extends TextProgram {

  /**
   * It is start method, that print result
   */
  public void run() {
    println(
        "Result = " +
        raiseToPower(
                checkDouble(readLine("Enter base: ")),
                checkInt(readLine("Enter power: ")))
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

  /**
   * Method always return number of int.
   * If input data don't include digits - return 0.
   * @param str input data
   * @return int number
   */
  private int checkInt(String str) {
    String rez = "";
    for (char c:str.toCharArray()) {
      if(!(Character.isDigit(c) || c == '-')) break;
      rez +=c;
    }
    return rez.equals("") ? 0 : Integer.parseInt(rez);
  }

  /**
   * Method always return number of double.
   * If input data don't include digits - return 0.
   * @param str input data
   * @return double number
   */
  private double checkDouble(String str) {
    String rez = "";
    // if number is negative
    if (str.startsWith("-")) {
      rez += "-";
      str = str.substring(1);
    }
    // if user wrote a number, that starts 0
    if (str.startsWith("0.") || str.startsWith("0,")) {
      rez += "0.";
      str = str.substring(2);
    }
    // if user did not writs 0 in start of number
    if (str.startsWith(".") || str.startsWith( "," )) {
      rez += "0.";
      str = str.substring(1);
    }
    // reads digits in the number
    for (char c:str.toCharArray()) {
      if(!Character.isDigit(c)) break;
      rez +=c;
    }
    return rez.equals("") ? 0 : Double.parseDouble(rez);
  }
}
