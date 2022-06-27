package com.shpp.p2p.cs.onimko.assignment3;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

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
  public static final int APPLICATION_WIDTH = 300;
  public static final int APPLICATION_HEIGHT =300;

  /**
   * It is start method, where print result
   */
  public void run() {

    GOval circle = new GOval (120,25,30,30);
    circle.setColor(Color.GREEN);
    circle.setFillColor(Color.BLUE);
    circle.setFilled(true);
    add(circle);
    println(getWidth()-30);
    double sin;
    for (int i = 0; i<98; i++){
      sin = Math.sin(i);
      pause(100);

        circle.move(0 ,(100)*sin);

      //println((int)circle.getY() + " : " + sin );


    }



  }

}
