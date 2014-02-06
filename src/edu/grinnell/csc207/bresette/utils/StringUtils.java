package edu.grinnell.csc207.bresette.utils;

import java.util.ArrayList;

public class StringUtils
{

  public static String[] splitAt(String str, char separator)
  {
    String space = new String("");
    ArrayList<String> result = new ArrayList<String>();
    int start = 0;
    int position = str.indexOf(separator);

    while (position >= start)
      {
        if (position == start)
          {
            result.add(space);
          } // if (position >= start)
        if (position > start)
          {
            result.add(str.substring(start, position));
          } // if (position > start)
        if (position == str.length() - 1)
          {
            result.add(space);
          } // if (position == str.length () - 1)
        start = position + 1;
        position = str.indexOf(separator, start);
      } // while (position >= start)
    if (start < str.length())
      {
        result.add(str.substring(start));
      } // if (start < str.length ())
    String[] finalArray = new String[result.size()];
    finalArray = result.toArray(finalArray);
    return finalArray;
  } // splitAt(String str, char separator)

  
  public static String[] splitCSV(String s)
  {
    ArrayList<String> words = new ArrayList<String>();
    boolean notInsideComma = true;
    int start = 0;
    for (int i = 0; i < s.length() - 1; i++)
      {
        if (s.charAt(i) == ',' && notInsideComma)
          {
            words.add(s.substring(start, i));
            start = i + 1;
          } // if (s.charAt(i) == ',' && notInsideComma)
        else if (s.charAt(i) == '"')
          notInsideComma = !notInsideComma;
      } // for (int i = 0; i < s.length() - 1; i++)
    words.add(s.substring(start));

    String[] finalArray = new String[words.size()];
    finalArray = words.toArray(finalArray);

    for (int i = 0; i < finalArray.length; i++)
      {
        if (finalArray[i].contains("\"\""))
          {
            finalArray[i] = finalArray[i].substring(0, finalArray[i].length() - 1);
          } // if(finalArray[i].contains("\"\""))
        if (finalArray[i].contains("\""))
          {
            finalArray[i] =
                finalArray[i].substring(1, finalArray[i].length() - 1);
          } // if(finalArray[i].contains("\"") && !(finalArray[i].contains("\"\"")))
      } // for(int i = 0; i<finalArray.length; i++)
    return finalArray;
  } // splitCSV(String s)

  public static String deLeet(String leetText)
  {
    leetText = leetText.replace('@', 'a');
    leetText = leetText.replace("|3", "b");
    leetText = leetText.replace('3', 'e');
    leetText = leetText.replace('1', 'l');
    leetText = leetText.replace("|\\|", "n");
    leetText = leetText.replace('0', 'o');
    leetText = leetText.replace('+', 't');

    return leetText;
  } // deLeet(String leetText

  public static boolean vowel(char letter)
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

  public static String nameGame(String name)
  {
    String nameOrig = "";
    nameOrig = name;
    String nameEdit = "";
    String bName = "";
    String fName = "";
    String mName = "";

    if (vowel(name.charAt(1)) == false)
      {
        name = name.substring(1);
      } // if (vowel(name.charAt(1)) == false)
    nameEdit = name.substring(1);
    bName = "B" + nameEdit;
    fName = "F" + nameEdit;
    mName = "M" + nameEdit;

    String song = "";
    song =
        nameOrig + ", " + nameOrig + " bo " + bName + " Bonana fanna fo "
            + fName + "\nFee fy mo " + mName + ", " + nameOrig + "!";
    return song;

  } // nameGame(String name)

} // class StringUtils
