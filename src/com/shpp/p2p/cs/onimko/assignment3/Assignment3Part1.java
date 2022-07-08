package com.shpp.p2p.cs.onimko.assignment3;

import com.shpp.cs.a.console.TextProgram;
import java.util.Arrays;

public class Assignment3Part1 extends TextProgram {

  /* number days for cardiovascular health*/
  private final int DAY_FOR_HEALTH = 5;
  /* minutes per day for cardiovascular health*/
  private final int MINUTES_FOR_CARDIOVASCULAR_HEALTH = 30;
  /* number days to keep a low blood pressure*/
  private final int DAY_FOR_BLOOD_PRESSURE = 3;
  /* minutes per day for cardiovascular health*/
  private final int MINUTES_FOR_BLOOD_PRESSURE = 40;
  /* minutes per day for cardiovascular health*/
  private final int MINUTES_PER_DAY = 60 * 24;

  /* Array a week */
  int [] week = new int[7];
  /**
   * It is start method, where print result
   */
  public void run() {
    //ask user's time spends for exercise
    for (int day = 0; day < week.length; day++)
      week[day] = checkInput(day);
    //check Cardiovascular health
    cardiovascularHealth();
    //check Blood pressure
    bloodPressure();
  }

  /**
   * Method checks Cardiovascular health for user,
   * and print result.
   */
  private void cardiovascularHealth() {
    println("Cardiovascular health:");
    int count = dayCounter(MINUTES_FOR_CARDIOVASCULAR_HEALTH);
    if (count >= DAY_FOR_HEALTH)
      println("Great job! You've done enough exercise for cardiovascular health.");
    else println("You needed to train hard for at least "
        + (DAY_FOR_HEALTH-count) + " more day(s) a week!");
  }

  /**
   * Method checks Blood pressures for user,
   * and print result.
   */
  private void bloodPressure() {
    println("Blood pressure:");
    int count = dayCounter(MINUTES_FOR_BLOOD_PRESSURE);
    if (count >= DAY_FOR_BLOOD_PRESSURE)
      println("Great job! You've done enough exercise to keep a low blood pressure.");
    else println("You needed to train hard for at least "
        + (DAY_FOR_BLOOD_PRESSURE-count) + " more day(s) a week!");
  }

  /**
   * Method for counts the number of days,
   * where was spends the number of minutes
   * for exercise.
   * @param minutes spends for exercise.
   * @return the number of days.
   */
  private int dayCounter (int minutes) {
    return Arrays.stream(week).filter(day -> day >= minutes).toArray().length;
  }

  /**
   * Method return number of minutes.
   * If input data is wrong - input repeat.
   * @param  day in the week[]
   * @return int number
   */
  private int checkInput(int day) {
    int rez = -1;
    while (rez < 0 || rez >= MINUTES_PER_DAY)
    rez = readInt("How many minutes did you do on day " + (day+1) + "? ");
    return rez;
  }
}

