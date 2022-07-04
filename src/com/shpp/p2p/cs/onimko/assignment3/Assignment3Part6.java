package com.shpp.p2p.cs.onimko.assignment3;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.util.Date;

public class Assignment3Part6 extends WindowProgram {

  /*
   * The default height of the window's menu.
   */
  private static final double MENU_SIZE = 24;

  /* The default width and height of the window. These constants will tell Java to
   * create a window whose size is *approximately* given by these dimensions. You should
   * not directly use these constants in your program; instead, use getWidth() and
   * getHeight(), which return the *exact* width and height of the window.
   */
  public static final int APPLICATION_WIDTH = 500;
  public static final int APPLICATION_HEIGHT = (int) (APPLICATION_WIDTH/3*2+MENU_SIZE);

  /*
   * Time of video in seconds
   */
  private final int TIME_VIDEO = 5;

  /*
   * Frame const
   */
  private final int FRAME_PER_SECOND = 24;
  private final int FRAME_PAUSE = 1000 / FRAME_PER_SECOND;
  private final int ALL_FRAMES = TIME_VIDEO * 1000 / FRAME_PAUSE;

  /*
   * String's consts for labels
   */
  private final String UP_STR = "Добрий вечір!";
  private final String DWN_STR = "Ми з України!";


  /*
   * Font of name's country
   */
  public static final Font FONT = new Font("Bold", Font.BOLD, (int) (APPLICATION_HEIGHT-MENU_SIZE)/6);


  /**
   * It is start method, where print result
   */
  public void run() {
    // Flag
    drawFlag();
    // creates up text
    GLabel upText = text(true, UP_STR, Color.YELLOW);
    // creates down text
    GLabel dwnText = text(false, DWN_STR, Color.BLUE);
    // ends positions
    double endXUP =  (getWidth() - upText.getWidth())/2;
    double endXDwn = (getWidth() - dwnText.getWidth())/2;
    // coordinate increment
    double dxUP = (getWidth()-endXUP)/ALL_FRAMES;
    double dxDwn = (getWidth()-endXDwn)/ALL_FRAMES;
    // time of starts anime
    long startTime = new Date().getTime();
    // main cycle
    for (int i = 1; i < ALL_FRAMES; i++) {
      upText.move(-dxUP,0);
      dwnText.move(dxDwn,0);
      pause(FRAME_PAUSE);
    }
    // prints time of work anime
    println("Time work: " + (new Date().getTime()-startTime) +" milli sec.");
  }

  /**
   * Method draws flag
   */
  private void drawFlag() {
    // blue part
    drawLine(0,0, Color.BLUE);
    // yellow part
    drawLine(0,getHeight() /2, Color.YELLOW);
  }


  /**
   * Method draws flag's line
   * @param x coordinate X up-left point
   * @param y coordinate Y up-left point
   */
  private void drawLine(double x, double y, Color color) {
    GRect line = new GRect(x,y, getWidth(),getHeight() /2);
    line.setFilled(true);
    line.setColor(color);
    add(line);
  }

  /**
   * Method creates a label
   * @param isUp true - for up line of flag, false -  for down line of flag
   * @param str that is print
   * @param color of text
   * @return GLabel
   */
  private GLabel text(boolean isUp, String str, Color color) {
    GLabel text = new GLabel(str);
    text.setColor(color);
    text.setFont(FONT);
    //start position x,y
    double x = 0;
    double y = 0;
    if (isUp) x = getWidth();
    else {
      x = -text.getWidth();
      y = getHeight()/2;
    }
    text.setLocation(x, y + getHeight()/6+text.getHeight()/2);
    add(text);
    return text;
  }
}
