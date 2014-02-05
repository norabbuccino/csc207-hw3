package edu.grinnell.csc207.bresette.utils;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class CalculatorTest
{

  @Test
  public void
    testEval0 ()
  {
    assertEquals (BigInteger.valueOf (0), Calculator.eval0 ("0"));
  }

  @Test
  public void
    testEval01 ()
  {
    assertEquals (BigInteger.valueOf (2), Calculator.eval0 ("1 + 1"));
  }

  @Test
  public void
    testEval02 ()
  {
    assertEquals (BigInteger.valueOf (4), Calculator.eval0 ("1 + 2 + 1"));
  }

  @Test
  public void
    testEval03 ()
  {
    assertEquals (BigInteger.valueOf (9), Calculator.eval0 ("1 + 2 * 3"));
  }

}
