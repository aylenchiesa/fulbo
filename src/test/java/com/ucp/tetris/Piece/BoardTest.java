package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BoardTest {
  
  @Test
  public void dimensionesCorrectas() {
    Board b = new Board();
    assertEquals(20, b.getFila());
    assertEquals(10, b.getColumna());
  }

 
  }
