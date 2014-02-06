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
  } // testSplitAt1 ()

  @Test
  public void
    testSplitAt2 ()
  {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a b c", ' '));
  } // testSplitAt2 ()

  @Test
  public void
    testSplitAt3 ()
  {
    assertArrayEquals (new String[] { "a:b:c" },
                       StringUtils.splitAt ("a:b:c", ' '));
  } // testSplitAt3 ()

  @Test
  public void
    testSplitAt4 ()
  {
    assertArrayEquals ("one field", new String[] { "a" },
                       StringUtils.splitAt ("a", ':'));
  } // testSplitAt4 ()

  @Test
  public void
    testSplitAt5 ()
  {
    assertArrayEquals ("empty inner field", new String[] { "a", "", "c" },
                       StringUtils.splitAt ("a::c", ':'));
  } // testSplitAt5 ()

  @Test
  public void
    testSplitAt6 ()
  {
    assertArrayEquals ("leading empty field", new String[] { "", "a" },
                       StringUtils.splitAt (":a", ':'));
  } // testSplitAt6 ()

  @Test
  public void
    testSplitAt7 ()
  {
    assertArrayEquals ("trailing empty field", new String[] { "a", "" },
                       StringUtils.splitAt ("a:", ':'));
  } // testSplitAt7 ()

  @Test
  public void
    testDeLeet1 ()
  {
    assertEquals ("e", StringUtils.deLeet ("3"));
  } // testDeLeet1 ()
  
  @Test
  public void
  testDeLeet2()
  {
    assertEquals ("leet", StringUtils.deLeet ("133+"));
  } // testDeLeet2()
  
  @Test
  public void
  testDeLeet3()
  {
    assertEquals ("eat banana", StringUtils.deLeet ("3@+ |3@|\\|@|\\|@"));
  } // testDeLeet3()
  
  @Test
  public void
    testSplitCSV1 ()
  {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitCSV("a,b,c"));
  } // testSplitCSV1 ()
 

  @Test
  public void
  testSplitCSV2 ()
  {
    assertArrayEquals (new String[] { "a,b", "c" },
                       StringUtils.splitCSV("\"a,b\",c"));
  } // testSplitCSV2 ()
 
  
  @Test
  public void
  testSplitCSV3 ()
  {
    assertArrayEquals (new String[] { "a", "b,b\"", "c" },
                       StringUtils.splitCSV("a,\"b,b\"\"\",c"));
  } // testSplitCSV3 ()

}
