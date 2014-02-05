package edu.grinnell.csc207.bresette.utils;

import java.math.BigInteger;

public class Calculator
{
  public static BigInteger
    eval0 (String input)
  {
    String[] inputArray = input.split (" ");
    BigInteger val = new BigInteger (inputArray[0]);
    for (int i = 1; i < inputArray.length - 1; i++)
      {
        if (inputArray[i].equals ("+"))
          {
            val = val.add (new BigInteger (inputArray[i + 1]));
          }

        if (inputArray[i].equals ("-"))
          {
            val = val.subtract (new BigInteger (inputArray[i + 1]));
          }

        if (inputArray[i].equals ("*"))
          {
            val = val.multiply (new BigInteger (inputArray[i + 1]));
          }

        if (inputArray[i].equals ("/"))
          {
            val = val.divide (new BigInteger (inputArray[i + 1]));
          }

        if (inputArray[i].equals ("^"))
          {
            val = val.pow (Integer.parseInt (inputArray[i + 1]));
          }
      }

    return val;
  }

}
