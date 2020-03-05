package com.bitplan.grapheditor;

/**
 * generic Graph Editor main class
 *
 */
public class GraphEditor {
  public boolean debug=false;
  public boolean testMode=false;
  /**
   * instance version of main
   * @param args
   */
  public void maininstance(String[] args) {
    System.out.println("This is not a GraphEditor yet");
    if (!testMode)
      System.exit(1);
  }

  /**
   * entry point
   * 
   * @param args
   */
  public static void main(String[] args) {
    GraphEditor ge = new GraphEditor();
    ge.maininstance(args);
  }
}
