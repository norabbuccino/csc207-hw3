package edu.grinnell.csc207.bresette.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest
{

  @Test
  public void
    testSplitAt1 ()
  {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a:b:c", ':'));
  }

  @Test
  public void
    testSplitAt2 ()
  {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a b c", ' '));
  }

  @Test
  public void
    testSplitAt3 ()
  {
    assertArrayEquals (new String[] { "a:b:c" },
                       StringUtils.splitAt ("a:b:c", ' '));
  }

  @Test
  public void
    testSplitAt4 ()
  {
    assertArrayEquals ("one field", new String[] { "a" },
                       StringUtils.splitAt ("a", ':'));
  }

  @Test
  public void
    testSplitAt5 ()
  {
    assertArrayEquals ("empty inner field", new String[] { "a", "", "c" },
                       StringUtils.splitAt ("a::c", ':'));
  }

  @Test
  public void
    testSplitAt6 ()
  {
    assertArrayEquals ("leading empty field", new String[] { "", "a" },
                       StringUtils.splitAt (":a", ':'));
  }

  @Test
  public void
    testSplitAt7 ()
  {
    assertArrayEquals ("trailing empty field", new String[] { "a", "" },
                       StringUtils.splitAt ("a:", ':'));
  }

  @Test
  public void
    testDeLeet1 ()
  {
    assertEquals ("e", StringUtils.deLeet ("3"));
  }
  
  @Test
  public void
  testDeLeet2()
  {
    assertEquals ("leet", StringUtils.deLeet ("133+"));
  }
  
  @Test
  public void
  testDeLeet3()
  {
    assertEquals ("eat banana", StringUtils.deLeet ("3@+ |3@|\\|@|\\|@"));
  }

}
