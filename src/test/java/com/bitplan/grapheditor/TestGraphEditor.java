package com.bitplan.grapheditor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGraphEditor {

  @Test
  public void testGraphEditor() {
    GraphEditor ge = new GraphEditor();
    String args[]= {};
    ge.testMode=true;
    ge.maininstance(args);
  }

}
