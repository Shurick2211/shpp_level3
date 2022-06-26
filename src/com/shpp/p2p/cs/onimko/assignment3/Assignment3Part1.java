package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;
import java.util.Arrays;

public class Assignment3Part1 extends TextProgram {

  //Array a week
  int [] week = new int[7];

  /**
   * It is start method, where print result
   */
  public void run() {
    //ask user's time spends for exercise
    for (int day = 0; day < week.length; day++) week[day] = input(day+1);
    //check Cardiovascular health
    cardiovascularHealth();
    //check Blood pressure
    bloodPressure();
  }

  /**
   * Method for user's input on console how many minutes per day
   * was spends for exercise
   * @param dayOnWeek it is day's number
   * @return int how many minutes per day was spends for exercise
   */
  private int input(int dayOnWeek) {
    return readInt("How many minutes did you do on day " + dayOnWeek + "? ");
  }

  /**
   * Method checks Cardiovascular health for user,
   * and print result.
   */
  private void cardiovascularHealth() {
    println("Cardiovascular health:");
    int count = Arrays.stream(week).filter(day -> day > 30).toArray().length;
    if (count >= 3) println("Great job! You've done enough exercise for cardiovascular health.");
    else println("You needed to train hard for at least "+(3-count)+" more day(s) a week!");
  }

  /**
   * Method checks Blood pressures for user,
   * and print result.
   */
  private void bloodPressure() {
    println("Blood pressure:");
    int count = Arrays.stream(week).filter(day -> day > 40).toArray().length;
    if (count >= 3) println("Great job! You've done enough exercise to keep a low blood pressure.");
    else println("You needed to train hard for at least "+(3-count)+" more day(s) a week!");
  }
}
