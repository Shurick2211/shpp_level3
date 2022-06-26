package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part5 extends TextProgram {

  /**
   * It is start method, where print result
   */
  public void run() {

  }

  /**
   * Method imitates a coin
   * @return true - eagle; false - coin.
   */
  private boolean eagleAndTails() {
    return Math.random() > 0.5 ? true : false;
  }

}
