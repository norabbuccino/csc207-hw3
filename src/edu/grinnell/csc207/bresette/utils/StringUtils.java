package edu.grinnell.csc207.bresette.utils;

import java.util.ArrayList;

public class StringUtils
{

  public static String[]
    splitAt (String str, char separator)
  {
    String space = new String ("");
    ArrayList<String> result = new ArrayList<String> ();
    int start = 0;
    int position = str.indexOf (separator);

    while (position >= start)
      {
        if (position == start)
          {
            result.add (space);
          } // closes if
        if (position > start)
          {
            result.add (str.substring (start, position));
          } // closes if
        if (position == str.length () - 1)
          {
            result.add (space);
          } // closes if
        start = position + 1;
        position = str.indexOf (separator, start);
      } // closes while
    if (start < str.length ())
      {
        result.add (str.substring (start));
      } // closes if
    String[] finalArray = new String[result.size ()];
    finalArray = result.toArray (finalArray);
    return finalArray;
  } // splitAt(String str, char separator)

  public static String[]
    splitCSV (String str)
  {
    String[] finalArray = new String[10]; // temporary definition
    return finalArray;
  }

  public static String
    deLeet (String leetText)
  {
    leetText = leetText.replace ('@', 'a');
    leetText = leetText.replace ("|3", "b");
    leetText = leetText.replace ('3', 'e');
    leetText = leetText.replace ('1', 'l');
    leetText = leetText.replace ("|\\|", "n");
    leetText = leetText.replace ('0', 'o');
    leetText = leetText.replace ('+', 't');

    return leetText;
  } // deLeet(String leetText

  public static boolean
    vowel (char letter)
  {
    if (letter == 'a')
      return true;
    else if (letter == 'e')
      return true;
    else if (letter == 'i')
      return true;
    else if (letter == 'o')
      return true;
    else if (letter == 'u')
      return true;
    else
      return false;
  } // vowel(char letter)

  public static String
    nameGame (String name)
  {
    String nameOrig = "";
    nameOrig = name;
    String nameEdit = "";
    String bName = "";
    String fName = "";
    String mName = "";

    if (vowel (name.charAt (1)) == false)
      {
        name = name.substring (1);
      } // closes if
    nameEdit = name.substring (1);
    bName = "B" + nameEdit;
    fName = "F" + nameEdit;
    mName = "M" + nameEdit;

    String song = "";
    song = nameOrig + ", " + nameOrig + " bo " + bName + " Bonana fanna fo "
           + fName + "\nFee fy mo " + mName + ", " + nameOrig + "!";
    return song;

  } // nameGame(String name)

  public static void
    main (String[] args)
  {

    System.out.println (nameGame ("Lincoln"));

  } // main()

} // class StringUtils
