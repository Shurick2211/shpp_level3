package com.shpp.p2p.cs.onimko.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.Color;

public class Assignment3Part4 extends WindowProgram {

  /*
   * The const are width and height of the brick
   */
  private static final double BRICK_HEIGHT = 40;
  private static final double BRICK_WIDTH = 100;
  /* The const is a number of bricks in base */
  private static final int BRICKS_IN_BASE = 7;
  /*
   * The default height of the window's menu.
   */
  private static final double MENU_SIZE = 24;

  /* The default width and height of the window. These constants will tell Java to
   * create a window whose size is *approximately* given by these dimensions. You should
   * not directly use these constants in your program; instead, use getWidth() and
   * getHeight(), which return the *exact* width and height of the window.
   */
  public static final int APPLICATION_WIDTH = (int) ((BRICKS_IN_BASE + 2) * BRICK_WIDTH);
  public static final int APPLICATION_HEIGHT = (int) (MENU_SIZE + BRICK_HEIGHT*BRICKS_IN_BASE);

  /**
   * It is start method
   */
  public void run() {
    drawPyramid();
  }

  /**
   * Method draws pyramid
   */
  private void drawPyramid() {
    for (int i = 0; i < BRICKS_IN_BASE; i++)
      for (int j = BRICKS_IN_BASE - i; j >=1; j--) {
        brick(BRICK_WIDTH * j + BRICK_WIDTH / 2 * i, this.getHeight() - (i + 1) * BRICK_HEIGHT);
      }
  }

  /**
   * Method draws brick
   * @param x start point (up-left) "X"
   * @param y start point (up-left) "Y"
   */
  private void brick (double x, double y) {
    GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
    brick.setColor(Color.BLUE);
    brick.setFilled(true);
    brick.setFillColor(Color.RED);
    add(brick);
  }
}

