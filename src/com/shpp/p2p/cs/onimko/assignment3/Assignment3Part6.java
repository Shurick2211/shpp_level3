package com.shpp.p2p.cs.onimko.assignment3;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.time.LocalDateTime;
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
  private final double FRAME_PER_SECOND = 24;
  private final double FRAME_PAUSE = 1000 / FRAME_PER_SECOND;
  private final int ALL_FRAMES = (int) (TIME_VIDEO * 1000 / FRAME_PAUSE);

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
    // time of starts app
    long startTime = new Date().getTime();
    // Flag
    drawFlag();
    // creates up text
    GLabel upText = label( UP_STR, Color.YELLOW);
    upText.setLocation(getWidth(), getHeight()/6+upText.getHeight()/2);
    add(upText);
    // creates down text
    GLabel dwnText = label( DWN_STR, Color.BLUE);
    dwnText.setLocation(-dwnText.getWidth(),getHeight()/2+getHeight()/6+upText.getHeight()/2);
    add(dwnText);
    // ends positions
    double endXUP = (getWidth() - upText.getWidth())/2;
    double endXDwn = (getWidth() - upText.getWidth())/2;
    // coordinate increment
    double dxUP = (getWidth()-endXUP)/ALL_FRAMES;
    double dxDwn = (getWidth()-endXUP)/ALL_FRAMES;
    // main cycle
    for (int i = 0; i < ALL_FRAMES; i++) {
      if (upText.getX() >= endXUP)
      upText.setLocation(upText.getX()-dxUP,upText.getY());
      if (dwnText.getX() <= endXDwn)
      dwnText.setLocation(dwnText.getX()+dxDwn, dwnText.getY());
      pause(FRAME_PAUSE);
    }
    // prints time of work app
    println("Time work: " + (new Date().getTime()-startTime)/1000 +" sec.");
  }

  /**
   * Method draws flag
   */
  private void drawFlag() {
    GRect upLine = new GRect(0,0, getWidth(),getHeight() /2);
    upLine.setFilled(true);
    upLine.setColor(Color.BLUE);
    GRect downLine = new GRect(0,getHeight() /2, getWidth(), getHeight()/2);
    downLine.setFilled(true);
    downLine.setColor(Color.YELLOW);
    add(upLine);
    add(downLine);
  }

  private GLabel label (String text, Color color) {
    GLabel label = new GLabel(text,getWidth(),getHeight()/6);
    label.setColor(color);
    label.setFont(FONT);
    return label;
  }


}
